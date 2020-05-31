package com.vv.vveres.table;


import javax.persistence.*;

@Entity
@Table(name = "TbInEx")
public class TbInEx {

    @Id
    @Column(name = "Id",nullable=false, unique=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "InEx")
    private String InEx;

    @Column(name = "Title")
    private String Title;

    @Column(name = "Note")
    private String Note;

    @Column(name = "restaurant_Id")
    private long restaurant_Id;

    public Long getId() {
        return Id;
    }

    public long getRestaurant_Id() {
        return restaurant_Id;
    }

    public String getTitle() {
        return Title;
    }

    public String getNote() {
        return Note;
    }

    public String getInEx() {
        return InEx;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setRestaurant_Id(long restaurant_Id) {
        this.restaurant_Id = restaurant_Id;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setNote(String note) {
        Note = note;
    }

    public void setInEx(String inEx) {
        InEx = inEx;
    }
}

