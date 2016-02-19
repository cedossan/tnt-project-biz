package com.app5.tnt.ws.login.jaxb.input;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "email",
    "userId"
})
@XmlRootElement(name="")
public class ValidateUserReqInfo implements Serializable {
	
	private static final long serialVersionUID = 5028942651663831659L;
	
	public ValidateUserReqInfo() {
		
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getidUser() {
		return idUser;
	}
	public void setidUser(Long idUser) {
		this.idUser = idUser;
	}

	private String email;
	private Long idUser;
}
