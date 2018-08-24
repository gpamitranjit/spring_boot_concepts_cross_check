package com.amdocs.models;

public class Todo {

	public String id;
	public String title;
	public String description;
	
	public Todo() {
		super();
	}

	public Todo(String id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
