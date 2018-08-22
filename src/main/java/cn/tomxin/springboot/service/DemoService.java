package cn.tomxin.springboot.service;


import cn.tomxin.springboot.entity.Demo;
import java.util.List;

public interface DemoService {
    List<Demo> findAll();
}
