package com.java.example.ctrl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lu.xu on 2018/3/16.
 * TODO: 测试接口
 */
@Api(description = "测试接口")
@RestController
@RequestMapping("/example")
public class ApplicationController {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);
    
    @ApiOperation(value = "测试接口", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @GetMapping(value = "/test")
    public String test(HttpServletRequest request, HttpServletResponse response) {
        return " microservice-example2";
    }
}
