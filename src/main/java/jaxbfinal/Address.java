package jaxbfinal;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

	private String type;
	private String isHome;
	private String description;
	private String city;
	private String state;
	private String pincode;

	public Address() {
		super();
	}

	public Address(String type, String isHome, String description, String city, String state, String pincode) {
		super();
		this.type = type;
		this.isHome = isHome;
		this.description = description;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	@XmlAttribute
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@XmlAttribute
	public String getisHome() {
		return isHome;
	}

	public void setisHome(String isHome) {
		this.isHome = isHome;
	}

	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@XmlElement
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@XmlElement
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
