package com.lzc.alioo.container.plugin.x1;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

public class HelloOneService {
    public String sayHello() {
        return "Hello from custom class loader:" + this.getClass().getClassLoader();
    }

    public HelloOneModel queryHelloModel(String name) {
        HelloOneModel model = new HelloOneModel();

        name = StringUtils.joinWith("-", "hello", name);
        model.setName(name);
        model.setAge(18);
        return model;
    }

    /**
     * 返回值类型是 jdk自带对象
     *
     * @param name
     * @return
     */
    public Object queryObject(String name) {
        HelloOneModel model = new HelloOneModel();
        model.setName(name);
        model.setAge(20);
        return model;
    }

}

