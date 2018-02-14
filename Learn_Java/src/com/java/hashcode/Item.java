package com.java.hashcode;

public class Item {
	private int a;

	public Item(int a) {
		super();
		this.a = a;
	}

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + a;*/
		return 5;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
	
	
}
