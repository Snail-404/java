package com.ldu;

public class Employee implements Comparable{
	private String name;
	private MyDate birth;
	
	public Employee(String name, MyDate birth) {
		super();
		this.name = name;
		this.birth = birth;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getBirth() {
		return birth;
	}
	public void setBirth(MyDate birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", birth=" + birth + "]";
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Employee) {
			Employee e=(Employee)o;
			return this.name.compareTo(e.name);
		}
		return 0;
	}
	
	
}
