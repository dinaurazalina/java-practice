package PracticeGroupStudy;

public class person12 {

	public static void main(String[] args) {
		Person person = new Person();

		System.out.println(person.getFirstName()); //"undefined"
		System.out.println(person.getLastName());  //"undefined"
		System.out.println(person.getAge());       // -1
		System.out.println(person.toString());     //"undefined | undefined | -1"

	}
}
