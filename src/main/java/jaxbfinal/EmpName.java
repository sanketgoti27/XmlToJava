package jaxbfinal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class EmpName {

	private String fname;
	private String lname;
	private String surname;

	public EmpName() {
		super();
	}

	public EmpName(String fname, String lname, String surname) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.surname = surname;
	}

	@XmlElement
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@XmlElement
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@XmlElement
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
