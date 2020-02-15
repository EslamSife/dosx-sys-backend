package com.dosx.sys.com.dosx.sys.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "join_date")
    @CreationTimestamp
    private Date joinDate;

    @Column(name = "leave_date")
    @CreationTimestamp
    private Date leaveDate;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Invoice> invoices;


}
