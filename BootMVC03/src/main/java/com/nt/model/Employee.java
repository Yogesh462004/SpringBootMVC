package com.nt.model;

import lombok.Data;

@Data
public class Employee {
private Integer sal;
private String name;

public Employee(Integer sal,String name) {
	this.sal=sal;
	this.name=name;
}
}
