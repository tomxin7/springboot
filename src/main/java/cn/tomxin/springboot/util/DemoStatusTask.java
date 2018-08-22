package cn.tomxin.springboot.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoStatusTask {

    /**
     * 定时任务
     */
    @Scheduled(cron="0 0 0/1 * * ?")   //每一个小时执行一次
    public void task() {

    }



}
