package com.dosx.sys.com.dosx.sys.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "drink_item")
@Getter
@Setter
public class DrinkItem {

    private Long itemId;
    private String itemName;
    private String itemType;
    private Integer itemQuantity;

}
