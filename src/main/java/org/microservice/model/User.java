package org.microservice.model;

public class User {
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String address;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstNAme) {
		this.firstName = firstNAme;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastNAme) {
		this.lastName = lastNAme;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
