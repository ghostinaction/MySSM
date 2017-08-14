package com.cms.entity;

public class Cpyinfo {
    private Integer id;

    private String address;

    private String phone;

    private String chuanzheng;

    private String people;

    private String busEmail;

    private String techEmail;

    private String page;

    private String business;

    private String qqchat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getChuanzheng() {
        return chuanzheng;
    }

    public void setChuanzheng(String chuanzheng) {
        this.chuanzheng = chuanzheng == null ? null : chuanzheng.trim();
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    public String getBusEmail() {
        return busEmail;
    }

    public void setBusEmail(String busEmail) {
        this.busEmail = busEmail == null ? null : busEmail.trim();
    }

    public String getTechEmail() {
        return techEmail;
    }

    public void setTechEmail(String techEmail) {
        this.techEmail = techEmail == null ? null : techEmail.trim();
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page == null ? null : page.trim();
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    public String getQqchat() {
        return qqchat;
    }

    public void setQqchat(String qqchat) {
        this.qqchat = qqchat == null ? null : qqchat.trim();
    }

	@Override
	public String toString() {
		return "Cpyinfo [id=" + id + ", address=" + address + ", phone=" + phone + ", chuanzheng=" + chuanzheng
				+ ", people=" + people + ", busEmail=" + busEmail + ", techEmail=" + techEmail + ", page=" + page
				+ ", business=" + business + ", qqchat=" + qqchat + "]";
	}
}