package com.dao.demo_greendao.dao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class DemoBean {
    @Id(autoincrement = true)
    public long id;
    @NotNull
    public String name;
    @NotNull
    public String age;
    @NotNull
    public String accunout;
    @NotNull
    public String password;
    @Generated(hash = 558489631)
    public DemoBean(long id, @NotNull String name, @NotNull String age,
            @NotNull String accunout, @NotNull String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.accunout = accunout;
        this.password = password;
    }
    @Generated(hash = 2085635340)
    public DemoBean() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return this.age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAccunout() {
        return this.accunout;
    }
    public void setAccunout(String accunout) {
        this.accunout = accunout;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
