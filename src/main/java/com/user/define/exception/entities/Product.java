package com.user.define.exception.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	private long pId ;
	private String pName ;
	private String price ;
	private Date date;

}
