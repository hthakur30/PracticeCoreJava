package com.cdac.demo;

public class Address {

	int houseNo;
	String houseName;
	String village;
	String city;
	String state;
	String country;
	String pincode;
	
	public Address(int hNo, String houseName, String villageName,String cityName,String stateName,String countryName, String pinCodeValue)
	{
		this.houseNo = hNo;
		this.houseName = houseName;
		this.village = villageName;
		this.city = cityName;
		this.state = stateName;
		this.country = countryName;
		this.pincode = pinCodeValue;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", houseName=" + houseName + ", village=" + village + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	
}
