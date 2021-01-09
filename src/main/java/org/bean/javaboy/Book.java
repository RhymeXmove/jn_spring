package org.bean.javaboy;

public class Book {
    private Integer id;
    private String name;
    private Double price;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }


    public Book() {
        System.out.println("----------------book init-----------------------");
    }

    public Book(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price =price;

    }
}
