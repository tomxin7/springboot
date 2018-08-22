package cn.tomxin.springboot.controller;

import cn.tomxin.springboot.entity.Demo;
import cn.tomxin.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    DemoService userService;
    @RequestMapping("/")
    /**
     * 测试数据库连通后，请务必取消该查询数据库方法，改为返回一个 hello world
     */
    public List<Demo> index() throws Exception {
        List<Demo> userList = userService.findAll();
        return userList;
    }
}
