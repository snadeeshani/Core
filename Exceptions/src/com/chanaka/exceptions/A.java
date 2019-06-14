package com.chanaka.exceptions;

public class A {

	public void bb() throws ComException {
		Validate validate = new Validate();
		try {
		validate.validate(10);
		}catch (ComException e) {
			e.printStackTrace();
		}
		}
}
