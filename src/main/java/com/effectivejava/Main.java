package com.effectivejava;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Set<BigDecimal> set = new HashSet<>();
		set.add(new BigDecimal(1.0));
		set.add(new BigDecimal(1.00));
		
		System.out.println(set.size());
	}
}


class NoHash<T>  implements Cloneable , Comparable<NoHash>{
	private final String name;
	private final int id;
	
	NoHash(String name,int id) {
		this.name = name;
		this.id =  id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		NoHash other = (NoHash) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	@Override 
	public NoHash clone() {
		try {
		return (NoHash) super.clone();
		} catch(CloneNotSupportedException e) {
		throw new AssertionError(); // Can't happen
		}
	}

	

	@Override
	public int compareTo(NoHash o) {
		// TODO Auto-generated method stub
		return 0;
	}
}


class EnumVariable {
	public Singleton sig;
	
}