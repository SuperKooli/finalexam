package com.sony.entity;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "tbl_employee") // 指定关联的数据库的表名
@Data
public class Employee {
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id; // 主键ID
 
	private String name; // 姓名
 
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthday; // 生日
 
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	// @PrimaryKeyJoinColumn(name = "employee_id", referencedColumnName = "address_id")
	private Address address; // 地址
 
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "department_id")
	private Department department; // 部门
 
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "tbl_employee_role", joinColumns = { @JoinColumn(name = "employee_id") }, inverseJoinColumns = {
			@JoinColumn(name = "role_id") })
	private List<Role> roles; // 角色
 
}
