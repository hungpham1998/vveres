package com.vv.vveres.table;


import javax.persistence.*;

@Entity
@Table(name = "TbInEx")
public class TbInEx {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "inEx")
    private String inEx;

    @Column(name = "title")
    private String title;

    @Column(name = "note")
    private String note;

    @Column(name = "restaurantId")
    private long restaurantId;

    public Long getId() {
        return Id;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public String getTitle() {
        return title;
    }

    public String getNote() {
        return note;
    }

    public String getInEx() {
        return inEx;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNote(String note) {
        note = note;
    }

    public void setInEx(String inEx) {
        inEx = inEx;
    }
}

