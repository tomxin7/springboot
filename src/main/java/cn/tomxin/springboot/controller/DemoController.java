package cn.tomxin.springboot.controller;

import cn.tomxin.springboot.entity.Demo;
import cn.tomxin.springboot.mapper.DemoMapper;
import cn.tomxin.springboot.service.DemoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DemoController {

    @Autowired
    DemoService userService;
    /**
     * 测试数据库连通后，请务必取消该查询数据库方法，改为返回一个 hello world
     */
    @RequestMapping("/")
    public List<Demo> index() throws Exception {
        List<Demo> demoList = userService.findAll();
        return demoList;
    }

    /**
     * 分页查询，pageNum传0和传1是一样的
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/demo/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public List<Demo> findByPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Demo> demoList = userService.findAll();
        return demoList;
    }
}
