package com.java.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.hadoop.hbase.HbaseTemplate;

/**
 * @author xulu
 * @date 2019/7/4 10:00
 * @description: TODO
 */
@Configuration
public class HBaseConfig {

  @Value("${hbase.zookeeper.quorum}")
  private String zookeeperQuorum;

  @Value("${hbase.zookeeper.property.clientPort}")
  private String clientPort;


  @Bean
  public HbaseTemplate hbaseTemplate() {
    org.apache.hadoop.conf.Configuration conf = new org.apache.hadoop.conf.Configuration();
    conf.set("hbase.zookeeper.quorum", zookeeperQuorum);
    conf.set("hbase.zookeeper.property.clientPort", clientPort);
    return new HbaseTemplate(conf);
  }
}
