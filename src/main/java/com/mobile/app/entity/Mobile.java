package com.mobile.app.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mobileId;
	@NotBlank(message = "Name is mandatory")
	private String mobileName;
	@Min(value = 0, message = "Cost cannot be neagtive")
	private Double mobileCost;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate mfd;
	@NotNull
	@NotBlank(message = "Model Number is mandatory")
	private String modelNumber;
	@NotNull
	@NotBlank(message = "Company Name is mandatory")
	@Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name can only contain letters and spaces")
	private String companyName;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mobileId, @NotBlank(message = "Name is mandatory") String mobileName,
			@Min(value = 0, message = "Cost cannot be neagtive") Double mobileCost, @NotNull LocalDate mfd,
			@NotNull @NotBlank(message = "Model Number is mandatory") String modelNumber,
			@NotNull @NotBlank(message = "Company Name is mandatory") @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name can only contain letters and spaces") String companyName) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileCost = mobileCost;
		this.mfd = mfd;
		this.modelNumber = modelNumber;
		this.companyName = companyName;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public Double getMobileCost() {
		return mobileCost;
	}

	public void setMobileCost(Double mobileCost) {
		this.mobileCost = mobileCost;
	}

	public LocalDate getMfd() {
		return mfd;
	}

	public void setMfd(LocalDate mfd) {
		this.mfd = mfd;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
