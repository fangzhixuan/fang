package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Employeeid entity. @author MyEclipse Persistence Tools
 */

public class Employeeid implements java.io.Serializable {

	// Fields

	private Integer employeeid;
	private String name;
	private String password;
	private Set checks = new HashSet(0);

	// Constructors

	/** default constructor */
	public Employeeid() {
	}

	/** full constructor */
	public Employeeid(String name, String password, Set checks) {
		this.name = name;
		this.password = password;
		this.checks = checks;
	}

	// Property accessors

	public Integer getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getChecks() {
		return this.checks;
	}

	public void setChecks(Set checks) {
		this.checks = checks;
	}

}