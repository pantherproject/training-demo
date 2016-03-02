package com.panther.demo.exercise2.main;

import com.panther.demo.exercise2.deal.HostDeal;
import com.panther.demo.exercise2.entity.Hosts;

import java.util.Collections;
import java.util.List;

/**
 * 2. metrics.txt  文件内的监控数据为5分钟（每条数据开头是一个时间戳，单位ms）内每台机器的JVM_heap_memory(JVM堆内存)
 * a. 求这5分钟内，总和最大的TOP3-host，以及平均值最小的BOTTOM3-host。
 * b. 如果满足#VALUE>1023的条件，则会产生报警。判断有哪些host在什么时间点会产生报警（要求结果的时间表示为yyyy-MM-dd HH:mm:ss的格式）
 * Created by panther.dongdong on 2016/2/29.
 */
public class Main {
    private static final String IN_FILE = "./src/main/resources/exercise2/metrics.txt";

    public static void main(String[] args) {
        List<Hosts> hostList = HostDeal.getInstance().deal(IN_FILE);
        Collections.sort(hostList, Hosts.create().build());
        for (Hosts host : hostList) {

        }
    }
}
