package com.chanaka.exceptions;

public class Validate {

	public void validate(int count) throws ComException {

	
			if (count >= 10 && count <= 20) {
				System.out.println("SucessFull");
			} else{
				count = count*-1;
				if (count >= 10 && count <= 20) {
					System.out.println("SucessFull");
				}else {
					throw new ComException("Meka wenna be");
				}
				
			}
	}
}
