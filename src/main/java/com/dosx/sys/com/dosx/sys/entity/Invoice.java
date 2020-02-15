package com.dosx.sys.com.dosx.sys.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "invoice")
@Data
public class Invoice {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "notes")
    private String notes;

    @Column(name = "total")
    private BigDecimal total;


    @Column(name = "drinks_total")
    private BigDecimal drinksTotal;


    @Column(name = "ps_number")
    private int psNumber;


    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;


    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;


    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;


}
