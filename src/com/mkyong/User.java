package com.mkyong;

import java.util.ArrayList;
import java.util.List;

/**
 *  POJO for User Object
 *  
 */
public class User {

    private int age = 29;
    private String name = "mkyong";
    private List<String> messages;

    public User() {
        messages = new ArrayList<String>();
        messages.add("msg-1");
        messages.add("msg-2");
        messages.add("msg-3");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + ", messages=" + messages + "]";
    }

}
