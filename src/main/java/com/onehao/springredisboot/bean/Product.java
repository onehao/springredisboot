package com.onehao.springredisboot.bean;


import java.io.Serializable;

/**
 * Created by michael.wh on 2017/6/2.
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 1435515995276255188L;
    private long id;

    public Product(){}

    public Product(Long id, String name, Long price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    private String name;
    private long price;

}