package com.sony.entity;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tbl_role")
@Data
public class Role {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 主键ID
 
	private String name; // 角色名称
 

 
}
