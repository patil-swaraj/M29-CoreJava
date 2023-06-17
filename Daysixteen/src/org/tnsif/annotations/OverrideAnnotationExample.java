package org.tnsif.annotations;

class Car{
	public void speed(int speed) {
		System.out.println("Speed is: "+speed+"km/hr");
	}
}

//Child class
class Lamborghini extends Car{
	@Override
	public void speed(int speed) {
		System.out.println("Speed is: "+speed+"km/hr");
	}
}

public class OverrideAnnotationExample {

	public static void main(String[] args) {
		
		Lamborghini l=new Lamborghini();
		l.speed(90);

	}

}
