package com.chanaka.exceptions;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		System.out.println("Enter Count");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		if(count < 10) {
			throw new UnCheckException("sasasasas");
		}
		Store store = new Store();
		store.buy(count);
		
		
		
		
	}

}
