package com.vv.vveres.table;


import javax.persistence.*;

@Entity
@Table(name = "TbOrderTable")
public class TbOrderTable {
    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "title")
    private String title;

    @Column(name = "status")
    private boolean status;

    @Column(name = "note")
    private String note;

    @Column(name = "seating")
    private int seating;

    @Column(name = "restaurant_Id")
    private long restaurant_Id;

    public Long getId() {
        return Id;
    }

    public String getNote() {
        return note;
    }

    public String getTitle() {
        return title;
    }

    public boolean isStatus() {
        return status;
    }

    public long getRestaurant_Id() {
        return restaurant_Id;
    }

    public int getSeating() {
        return seating;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setRestaurant_Id(long restaurant_Id) {
        this.restaurant_Id = restaurant_Id;
    }


    public void setId(Long id) {
        Id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
