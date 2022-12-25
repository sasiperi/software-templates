package com.adp.${{values.java_package_name}}.entity;

import org.meanbean.lang.Factory;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampTestFactory implements Factory<Timestamp> {
    @Override
    public Timestamp create() {
        return new Timestamp(new Date().getTime());
    }
}
