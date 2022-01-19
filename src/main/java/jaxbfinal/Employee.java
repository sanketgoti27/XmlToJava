package jaxbfinal;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


@XmlRootElement
public class Employee {

	private int empid;
	private int id;
	private List<EmpName> empname;
	private List<Address> address;
	private String salary;
	private String mobile;

	public Employee() {
		super();
	}

	public Employee(int empid, int id, List<EmpName> empname, List<Address> address, String salary, String mobile) {
		super();
		this.empid = empid;
		this.id = id;
		this.empname = empname;
		this.address = address;
		this.salary = salary;
		this.mobile = mobile;
	}

	@XmlAttribute
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public List<EmpName> getEmpname() {

		return empname;
	}

	public void setEmpname(List<EmpName> empname) {
		this.empname = empname;
	}

	@XmlElement
	public List<Address> getAddress() {

		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@XmlElement
	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@XmlElement
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
