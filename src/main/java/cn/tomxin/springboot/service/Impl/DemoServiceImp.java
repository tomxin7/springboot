package cn.tomxin.springboot.service.Impl;

import cn.tomxin.springboot.entity.Demo;
import cn.tomxin.springboot.mapper.DemoMapper;
import cn.tomxin.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DemoServiceImp implements DemoService {
    @Autowired
    DemoMapper userMapper;

    @Override
    public List<Demo> findAll() {

        return userMapper.findAll();
    }
}
