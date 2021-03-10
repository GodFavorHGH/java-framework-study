package com.haugv.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

    private int i = 0;
//    @Scheduled(cron = "0/5 * * * * ?")
    @Scheduled(cron = "0 0/1 0/1 * * ?")
    public void doTaskPer5Seconds(){
        System.out.println("=====定时任务====="+i);
        i++;
    }
//    @Scheduled(fixedRate = 60*1000)
    public void doTaskPerHour(){
        System.out.println("=====定时任务====="+i);
        i++;
    }

}
