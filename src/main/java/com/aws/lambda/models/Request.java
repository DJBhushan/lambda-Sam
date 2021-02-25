package com.aws.lambda.models;

public class Request {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Request() {
    }

    public Request(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
