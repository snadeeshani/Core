package com.chanaka.exceptions;

public class Store {
	
	public void buy(int count)  {
		Validate v = new Validate();
		try {
		v.validate(count);
		}catch (ComException e) {
			throw new UnCheckException("Meka Uncheck");
		}
	}

}
