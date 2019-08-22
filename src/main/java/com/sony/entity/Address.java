package com.sony.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_address")
@Data
public class Address {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 主键ID
 
	private String province; // 省
 
	private String city; // 市
 
	private String district; // 区
 
	private String address; // 详细地址
 
	 
}
