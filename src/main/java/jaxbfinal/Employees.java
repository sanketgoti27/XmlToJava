package jaxbfinal;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Employees {

	private List<Employee> employee;

	public Employees() {
		super();
	}

	public Employees(List<Employee> employee) {
		super();
		this.employee = employee;
	}

	@XmlElement
	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}