package com.virtusa.cake;

import java.util.ArrayList;
import java.util.List;



public class Kitchen {
	public static void main(String[] args) {
		//Getters Setters
		List<Type> ingredient=new ArrayList<>();
		ingredient.add(new Type("chochlate"));
		ingredient.add(new Type("Vanila"));
		ingredient.add(new Type("Strawberry"));
		
		for(Type ingre: ingredient)
		{
				System.out.println(ingre.toString());
		}
		
		
		//Inner Method
		System.out.println("-----Inner Method-----");
		Cake cake1=new Cake();
		cake1.InnerValidateTaste();
				
		//Anonymous Class
		System.out.println("-----Annonymous Class encapsulation----");
		Cake cake2=new Cake();
		cake2.anonymousTaste();
		
		//Inner Class Encapsulation 
		
			List<Cake.Type> cakes=new Cake("CHOCHLATE").type;
			
			for(Cake.Type type:cakes)
			{
				//System.out.println(bus.toString());
				System.out.println("------Inner class encapsulation-----");
				Cake cakess =new Cake();
				cakess.addType(cakess.new Type("Chochlate"));
				cakess.addType(cakess.new Type("Vanila"));
				cakess.addType(cakess.new Type("Strawberry"));
				cakess.getType();
				
			}
	}
	
	
}
