package com.vv.vveres.table;
import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "TbSalaryCode")
public class TbSalaryCode {
    @Id
    @Column(name = "id", nullable = false, unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "salary")
    private  int salary;

    @Column(name = "year")
    private  Date year;

    @Column(name = "departmentId")
    private  long departmentId;


    @Column(name = "restaurantId")
    private  long restaurantId;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

    public void setYear(Date year) {
        this.year= year;
    }
    public Date getYear() {
        return year;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
    public long getDepartmentId() {
        return departmentId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }
    public long getRestaurantId() {
        return restaurantId;
    }





}
