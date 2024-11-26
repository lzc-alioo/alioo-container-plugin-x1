package com.lzc.alioo.container.plugin.x1;

public class HelloOneService {
    public String sayHello() {
        return "Hello from custom class loader:" + this.getClass().getClassLoader();
    }

    public HelloOneModel queryHelloModel(String name) {
        HelloOneModel model = new HelloOneModel();
        model.setName(name);
        model.setAge(18);
        return model;
    }

    public Object queryObject(String name) {
        HelloOneModel model = new HelloOneModel();
        model.setName(name);
        model.setAge(20);
        return model;
    }
}

