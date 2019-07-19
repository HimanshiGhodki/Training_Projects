package com.cts.Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SnacksBar {
	private List<String> chocolates;
	private Set<String> hotdrinks;
	private Map<Integer,String> bhel;

	

	public Map<Integer, String> getBhel() {
		return bhel;
	}

	public void setBhel(Map<Integer, String> bhel) {
		this.bhel = bhel;
	}

	public SnacksBar(List<String> chocolates, Set<String> hotdrinks, Map<Integer, String> bhel) {
		super();
		this.chocolates = chocolates;
		this.hotdrinks = hotdrinks;
		this.bhel = bhel;
	}

	public SnacksBar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<String> getHotdrinks() {
		return hotdrinks;
	}

	public void setHotdrinks(Set<String> hotdrinks) {
		this.hotdrinks = hotdrinks;
	}

	public List<String> getChocolates() {
		return chocolates;
	}

	public void setChocolates(List<String> chocolates) {
		this.chocolates = chocolates;
	}
	
	

}
