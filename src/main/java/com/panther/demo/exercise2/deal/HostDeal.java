package com.panther.demo.exercise2.deal;

import com.panther.demo.exercise2.entity.Hosts;
import com.panther.demo.util.MessageIterator;
import com.panther.demo.util.MessageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * deal file
 * Created by panther.dongdong on 2016/2/29.
 */
public class HostDeal {
    private static final HostDeal instance = new HostDeal();

    public static HostDeal getInstance() {
        return instance;
    }


    private List<Hosts> hostList = new ArrayList<Hosts>();

    public List<Hosts> deal(String file) {
        MessageLoader messageLoader = new MessageLoader(file); //设置按行读取文件
        MessageIterator messageIterator = messageLoader.loadMessage();
        int cur = 0;
        Hosts host1 = Hosts.create().build();
        Hosts host2 = Hosts.create().build();
        Hosts host3 = Hosts.create().build();
        Hosts host4 = Hosts.create().build();
        Hosts host5 = Hosts.create().build();
        long time = 0;
        while (messageIterator.hasNext()) {
            ++cur;
            String info = messageIterator.next();
            String[] sp = info.split("      ");
            if (cur % 6 == 1) {
                time = Long.parseLong(info);
            } else if (cur % 6 == 2) {
                host1.add(new Hosts.HostInformation().setTime(time).setName(sp[0]).setValue(Float.parseFloat(sp[1])));
            } else if (cur % 6 == 3) {
                host2.add(new Hosts.HostInformation().setTime(time).setName(sp[0]).setValue(Float.parseFloat(sp[1])));
            } else if (cur % 6 == 4) {
                host3.add(new Hosts.HostInformation().setTime(time).setName(sp[0]).setValue(Float.parseFloat(sp[1])));
            } else if (cur % 6 == 5) {
                host4.add(new Hosts.HostInformation().setTime(time).setName(sp[0]).setValue(Float.parseFloat(sp[1])));
            } else {
                host5.add(new Hosts.HostInformation().setTime(time).setName(sp[0]).setValue(Float.parseFloat(sp[1])));
            }
        }
        hostList.add(host1);
        hostList.add(host2);
        hostList.add(host3);
        hostList.add(host4);
        hostList.add(host5);
        return hostList;
    }
}
