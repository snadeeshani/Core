import java.util.ArrayList;
import java.util.List;





public class Application {

	public static void main(String[] args) {
		
		//Inner Class Encapsulation 
	
		List<BusStation.Bus> busses=new BusStation("red",3).busses;
		
		for(BusStation.Bus bus:busses)
		{
			//System.out.println(bus.toString());
			System.out.println("Inner class encapsulation");
			BusStation busStation =new BusStation();
			busStation.addBus(busStation.new Bus ("White"));
			busStation.addBus(busStation.new Bus ("Red"));
			busStation.addBus(busStation.new Bus ("Blue"));
			busStation.getBus();
			
		}

		//Inner Method
		System.out.println("Inner Method");
		BusStation busstation1=new BusStation();
		busstation1.InnerValidateBus();
		
		//Anonymous Class
		System.out.println("Annonymous Class encapsulation");
		BusStation busstation2=new BusStation();
		busstation2.annonymousValidateBus();
		
		//Getters Setters
//		System.out.println("Getters and Setters encapsulation");
//		List<BusStation.Bus> busses1=new ArrayList<>();
//		busses1.add(new Bus("White"));
//		busses1.add(new Bus("Green"));
//		busses1.add(new BusStation.Bus("Red"));
//		
//		for(BusStation.Bus bus: busses1)
//		{
//			System.out.println(bus.toString());
//		}
	}
}
