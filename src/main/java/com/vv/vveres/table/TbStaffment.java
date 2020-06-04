package com.vv.vveres.table;
import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "TbStaffment")
public class TbStaffment {
    @Id
    @Column(name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title ;

    @Column(name = "idCard")
    private String idCard ;

    @Column(name = "address")
    private String address ;

    @Column(name = "phone")
    private String phone ;

    @Column(name = "mail")
    private String mail ;

    @Column(name = "note")
    private String note ;

    @Column(name = "startDay")
    private Date startDay ;

    @Column(name = "password")
    private String password ;

    @Column(name = "identityCard")
    private String identityCard ;

    @Column(name = "departmentId")
    private long departmentId ;

    @Column(name = "restaurantId")
    private long restaurantId;

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

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public String getIdCard() {
        return idCard;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public String getNote() {
        return note;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }
    public Date getStartDay() {
        return startDay;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
    public String getIdentityCard() {
        return identityCard;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }
    public long getRestaurantId() {
        return restaurantId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
    public long getDepartmentId() {
        return departmentId;
    }


}
