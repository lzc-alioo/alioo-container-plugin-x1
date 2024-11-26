package com.lzc.alioo.container.plugin.x1;


public class HelloOneModel {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HelloModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
