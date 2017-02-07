package com.alamatcs.faiyaz.lostandfind;

public class LostFindBean {
	private String wroth;

	private String contact_email;

	private String clour;

	private String type;

	private String id;

	private String contact_city;

	private String description;

	private String name;

	private String contact_name;

	private String place;

	private String contact_no;

	private String cashamount;
	private String brand;

	public String getWroth() {
		return wroth;
	}

	public void setWroth(String wroth) {
		this.wroth = wroth;
	}

	public String getContact_email() {
		return contact_email;
	}

	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}

	public String getClour() {
		return clour;
	}

	public void setClour(String clour) {
		this.clour = clour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContact_city() {
		return contact_city;
	}

	public void setContact_city(String contact_city) {
		this.contact_city = contact_city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getCashamount() {
		return cashamount;
	}

	public void setCashamount(String cashamount) {
		this.cashamount = cashamount;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LostFindBean [wroth=");
		builder.append(wroth);
		builder.append(", contact_email=");
		builder.append(contact_email);
		builder.append(", clour=");
		builder.append(clour);
		builder.append(", type=");
		builder.append(type);
		builder.append(", id=");
		builder.append(id);
		builder.append(", contact_city=");
		builder.append(contact_city);
		builder.append(", description=");
		builder.append(description);
		builder.append(", name=");
		builder.append(name);
		builder.append(", contact_name=");
		builder.append(contact_name);
		builder.append(", place=");
		builder.append(place);
		builder.append(", contact_no=");
		builder.append(contact_no);
		builder.append(", cashamount=");
		builder.append(cashamount);
		builder.append(", brand=");
		builder.append(brand);
		builder.append("]");
		return builder.toString();
	}

}
