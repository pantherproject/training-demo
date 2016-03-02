package com.panther.demo.exercise2.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * host entity(property information)
 * Created by panther.dongdong on 2016/2/29.
 */
public class Hosts implements Comparator<Hosts>, Serializable {
    private static final long serialVersionUID = -6045178836036044139L;

    public static List<HostInformation> hostInformationList = new ArrayList<HostInformation>();

    public Hosts(Builder builder) {
    }

    public static Builder create() {
        return new Builder();
    }

    public void add(HostInformation hostInformation) {
        hostInformationList.add(hostInformation);
    }

    public float value() {
        float values = 0;
        for (HostInformation hostInformation : hostInformationList) {
            values += hostInformation.getValue();
        }
        return values;
    }

    @Override
    public int compare(Hosts host1, Hosts host2) {
        return host1.value() == host2.value() ? 0 : (host1.value() > host2.value() ? -1 : 1);
    }


    public final static class Builder {
        private Builder() {
        }

        //add hostinformation
        public Builder addHostInformation(HostInformation HostInformation) {
            hostInformationList.add(HostInformation);
            return this;
        }

        //add host informations
        public Builder addHostInformations(Iterable<HostInformation> HostInformations) {
            Iterator<HostInformation> hostIterator = HostInformations.iterator();
            while (hostIterator.hasNext()) {
                hostInformationList.add(hostIterator.next());
            }
            return this;
        }

        public Hosts build() {
            return new Hosts(this);
        }

    }

    public static class  HostInfo {
        private List<HostInformation> stringList = new ArrayList<HostInformation>();

    }


    public static class HostInformation {
        private String name; //主机名称
        private float value; //jvm heap
        private long time; //时间

        public String getName() {
            return name;
        }

        public HostInformation setName(String name) {
            this.name = name;
            return this;
        }

        public long getTime() {
            return time;
        }

        public HostInformation setTime(long time) {
            this.time = time;
            return this;
        }

        public float getValue() {
            return value;
        }

        public HostInformation setValue(float value) {
            this.value = value;
            return this;
        }
    }
}
