package com.mobile.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Customer extends User  {


	@NotBlank(message = "Name is mandatory")
	@Pattern(regexp = "^[a-zA-Z\\s]+$", message = "First letter should be capital,Name can only contain letters and spaces")
	private String name;
	@NotBlank(message = "Email is mandatory")
	@Email(message = "Please enter a valid email Id", regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")
	private String email;
	@Pattern(regexp = "[0-9]{10}", message = "Phone number must be 10 digits")
	private String mobileNo;
	
	private String status;
	
	private String address;
	
	@OneToOne
	private Cart cart;

	@OneToMany
	private List<Orders> orders = new ArrayList<>();

	public Customer() {
		super();
	}

	

	public Customer(
			@NotBlank(message = "Name is mandatory") @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "First letter should be capital,Name can only contain letters and spaces") String name,
			@NotBlank(message = "Email is mandatory") @Email(message = "Please enter a valid email Id", regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}") String email,
			@Pattern(regexp = "[0-9]{10}", message = "Phone number must be 10 digits") String mobileNo, String status,
			String address, Cart cart, List<Orders> orders) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.status = status;
		this.address = address;
		this.cart = cart;
		this.orders = orders;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	
	
}