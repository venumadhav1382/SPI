package com.spi.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private long number;
	private String cname;
	private Date date;
	private int qty;
	private double cost;
	private double amount;

}
//Sale ID (unique identifier)
//Part number
//Customer name
//Sale date
//Quantity sold
//Price per unit
//Total sale amount