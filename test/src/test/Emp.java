package test;

public class Emp {
	
     String first_name,last_name,depName;

	public Emp(String first_name, String last_name, String depName) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.depName = depName;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}


}
