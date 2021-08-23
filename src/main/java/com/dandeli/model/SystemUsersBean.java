package com.dandeli.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="systemUser")
public class SystemUsersBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String contactNo;
	private String address;
	private String email;
	private String password;
	
	public SystemUsersBean() {
		
	}

	public SystemUsersBean(int systemUserId, String name, String contactNo, String address, String email,
			String password) {
		super();
		this.id = systemUserId;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public int getSystemUserId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setSystemUserId(int systemUserId) {
		this.id = systemUserId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SystemUsersBean other = (SystemUsersBean) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SystemUsersBean [systemUserId=" + id + ", name=" + name + ", contactNo=" + contactNo
				+ ", address=" + address + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
