package day53_inheritance;

public class TestHiding {

	public static void main(String[] args) {
		City city = new City(42, "London");
		Capital cap = new Capital(21, "Paris", 329043811);
		
		System.out.println(city.count);
		System.out.println(cap.count);
		System.out.println(city.toString());
		System.out.println(cap.toString());
	
		cap.displayCount();
		
		
		//call static methods
		city.buildARoad();
		cap.buildARoad();
		
		City.buildARoad();
		Capital.buildARoad();
		
		City city2 = new City(2332, "Faifax");
		Capital cap2 = new Capital(23,"LA", 23094092L );
		
		city2.letsBuildARoad(); //City
		cap2.letsBuildARoad();//City
		
	}
	
}
