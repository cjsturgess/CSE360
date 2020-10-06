package cse360assignment02;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddingMachine calc = new AddingMachine();
		
		calc.add(4);
		calc.subtract(2);
		calc.add(5);
		
		System.out.println(calc.toString() + ": " + calc.getTotal());
		
		calc.clear();
		
		System.out.println(calc.toString() + ": " + calc.getTotal());
	}

}
