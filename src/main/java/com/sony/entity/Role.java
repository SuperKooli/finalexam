package com.sony.entity;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tbl_role")
@Data
public class Role {
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id; // 主键ID
 
	private String name; // 角色名称
 
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "tbl_employee_role", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = {
			@JoinColumn(name = "employee_id") })
	private List<Employee> employees;

 
}
