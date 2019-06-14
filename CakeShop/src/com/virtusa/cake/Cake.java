package com.virtusa.cake;


import java.util.ArrayList;
import java.util.List;

public class Cake {
	
		public Cake()
		{
			
		}

		List<Type> type;
		{
			type=new ArrayList<>();
		}
		
		public Cake(String types)
		{
				type.add(new Type(types));
				
			
		}
		public void addType(Type types)
		{
			type.add(types);
		}
		public void getType()
		{
			for(Type types:type)
			{
				System.out.println(types.toString());
			}
		}
		
		//Anonymous class
		public void anonymousTaste()
		{
			new Object()
			{
				public void taste(String type)
				{
					if("CHOCHOLATE".equalsIgnoreCase(type))
					{
						System.out.println("Tasty....");
					}
					else
					{
						System.out.println("Not much Tasty");
					}
				}
				
			}.taste("VANILA");
		}
		// Inner Method
				public void InnerValidateTaste()
				{
					class CakeValidator
					{
						public void validate(String type)
						{
							if("CHOCHOLATE".equalsIgnoreCase(type))
							{
								System.out.println("Tasty....");
							}
							else
							{
								System.out.println("Not much Tasty");
							}
						}
					}
					new CakeValidator().validate("CHOCHOLATE");
					
				}
		
		
	//Local Member Class
		public class Type {

			private String type;

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			@Override
			public String toString() {
				return type + "Cake";
			}

			public Type(String type) {
				
				this.type = type;
			}
			
}
}