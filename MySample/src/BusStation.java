import java.util.ArrayList;
import java.util.List;

public class BusStation {
	
	  List<Bus> busses;
	  {
		  busses=new ArrayList<>();
	  }
	  
		public BusStation(String color,int nob)
		{
			for(int i=0; i<nob; i++ )
			{
				busses.add(new Bus(color));
			}
		}	
		public BusStation()
		{
			
		}
		public BusStation(Bus buss)
		{
			busses.add(buss);
		}
		public void addBus(Bus bus)
		{
			busses.add(bus);
		}
		public void getBus()
		{
			for(Bus bus:busses)
			{
				System.out.println(bus.toString());
			}
		}
		
		//Anonymous class Encapsulation
		public void annonymousValidateBus()
		{
			new Object()
			{
				public void validate(String color)
				{
					if("RED".equalsIgnoreCase(color))
					{
						System.out.println("Valid Color");
					}
					else
					{
						System.out.println("Not valid Color");
					}
				}
				
			}.validate("Green");
		}
		// Inner Method
		public void InnerValidateBus()
		{
			class BusValidator
			{
				public void validate(String color)
				{
					if("RED".equalsIgnoreCase(color))
					{
						System.out.println("Valid Color");
					}
					else
					{
						System.out.println("Not valid Color");
					}
				}
			}
			new BusValidator().validate("Green");
			
		}
		
		//Inner Class
		public class Bus {

			private String color;

			public Bus(String color) {
				
				this.color = color;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			@Override
			public String toString() {
				return color + "bus";
			}
		}
}

