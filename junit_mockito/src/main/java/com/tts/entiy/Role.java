package com.tts.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by mike on 2016/10/31.
 */
@Entity
@Table(name = "roles")
public class Role implements Serializable{
    private static final long serialVersionUID = -3181227830551232697L;
    @Id
    @GeneratedValue
    Integer id;
    String name;

    public Role(){
    }

    public Role(Integer id,String name) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
