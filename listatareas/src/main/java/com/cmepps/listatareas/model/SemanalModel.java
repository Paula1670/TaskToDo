package com.cmepps.listatareas.model;


import java.time.LocalDate;

public class SemanalModel {
    private String name;
    private String description;
    private LocalDate deadline;
    private int priority;
	public SemanalModel(String name, String description, LocalDate deadline, int priority) {
		super();
		this.name = name;
		this.description = description;
		this.deadline = deadline;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDeadline() {
		return deadline;
	}
	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}

    
}
