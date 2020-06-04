package com.vv.vveres.table;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "TbRestaurant")
public class TbRestaurant {
    @Id
    @Column(name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private  String title;

    @Column(name = "address")
    private  String address;

    @Column(name = "note")
    private  String note;

    @Column(name = "website")
    private  String website;

    @Column(name = "phoneNumber")
    private  String phoneNumber;

    @Column(name = "mail")
    private  String mail;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public String getNote() {
        return note;
    }

    public void setWebsite(String website) {
        this.website =  website;
    }
    public String getWebsite() {
        return  website;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }

}
