package com.itheima.domain;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @Description:
 */
public class Account implements Serializable {

    private String id;
    private String name;
    private String money;

    public Account() {
    }

    public Account(String id, String name, String money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
