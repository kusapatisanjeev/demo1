package practice;

import java.util.Date;

public class Cumstomer {
private Integer cumstomerId;
private String name;
private String emailId;
private String password;
private String phone;
private String status;
private Date dateOfEnquiryd;
private Integer addressId;
public Integer getCumstomerId() {
	return cumstomerId;
}
public void setCumstomerId(Integer cumstomerId) {
	this.cumstomerId = cumstomerId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getDateOfEnquiryd() {
	return dateOfEnquiryd;
}
public void setDateOfEnquiryd(Date dateOfEnquiryd) {
	this.dateOfEnquiryd = dateOfEnquiryd;
}
public Integer getAddressId() {
	return addressId;
}
public void setAddressId(Integer addressId) {
	this.addressId = addressId;
}
public String getSecurityQuestion() {
	return securityQuestion;
}
public void setSecurityQuestion(String securityQuestion) {
	this.securityQuestion = securityQuestion;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
	System.out.println();
}

private String securityQuestion;
private String answer;
}
