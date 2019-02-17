package com.example.momoni.evenity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class UserEnvity {
    @Id(autoincrement = true)
    @Unique
    Long id;
    String name;
    @Generated(hash = 49312737)
    public UserEnvity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 1173316716)
    public UserEnvity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
