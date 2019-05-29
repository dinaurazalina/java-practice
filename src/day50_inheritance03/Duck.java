package day50_inheritance03;

public class Duck extends Animals{

	public void speak () {
		System.out.println("Duck is saying  qwak qwak");
	}
	public void move(int steps) {
		System.out.println("Duck is moving "+ steps+ " steps");
	}
}
