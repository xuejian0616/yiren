package cn.yirenzhuang.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "UserController", description = "用户操作")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(getClass());

}