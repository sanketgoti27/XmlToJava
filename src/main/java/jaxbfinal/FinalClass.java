package jaxbfinal;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class FinalClass {

	public static void main(String[] args) {

		File file = new File("D:/Sanket/Employee.xml");
		
		System.out.println("this is first branch changes. ");

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			Employees emp = (Employees) jaxbUnmarshaller.unmarshal(file);

			List<Employee> empList = emp.getEmployee();

			for (Employee el : empList) {
				System.out
						.println(el.getEmpid() + " " + el.getId() + " " + el.getMobile() + " " + el.getSalary() + " ");

//----------------------------------------------------------------------------------------------------
				List<EmpName> empnameList = el.getEmpname();

				for (EmpName empname : empnameList) {
					System.out
							.println(empname.getFname() + " " + empname.getLname() + " " + empname.getSurname() + " ");
				}

				List<Address> addList = el.getAddress();

				for (Address add : addList) {
					System.out.println(add.getType() + " " + add.getisHome() + " " + add.getDescription() + " "
							+ add.getCity() + " " + add.getCity() + " " + add.getState() + " " + add.getPincode());
				}
			}

System.out.println(" hello sanket !");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
