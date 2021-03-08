package com.github.tsohr.junit.data;

import com.github.tsohr.JSONPropertyIgnore;
import com.github.tsohr.JSONPropertyName;

public interface MyBeanCustomNameInterface {
    @JSONPropertyName("InterfaceField")
    float getSomeFloat();
    @JSONPropertyIgnore
    int getIgnoredInt();
}