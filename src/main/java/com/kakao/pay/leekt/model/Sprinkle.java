package com.kakao.pay.leekt.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("sprinkle")
public class Sprinkle {

    private int money;
    private int user;

    public Sprinkle() {

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public Sprinkle(int money, int user) {
        this.money = money;
        this.user = user;
    }
}
