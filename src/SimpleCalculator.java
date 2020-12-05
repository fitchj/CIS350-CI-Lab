package fitch_350;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}

	public int exp(int a, int b){
		int x = (int) Math.pow(a, b);
		return x;
	}
	public int sqrt(int a){
		int x = (int) Math.sqrt(a);
		return x;
	}
	
	public static final void main(String[] args) {
		System.out.println("Hey there CIS350.");
	}
}

