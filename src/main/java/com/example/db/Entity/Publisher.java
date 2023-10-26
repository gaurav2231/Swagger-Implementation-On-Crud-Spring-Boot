package com.example.db.Entity;

import javax.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @SequenceGenerator(name = "publisher_id_seq",sequenceName = "publisher_id_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "publisher_id_seq")
    private int id;

    private String name;

    private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Publisher(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Publisher() {
		super();
	}
    
    
}
