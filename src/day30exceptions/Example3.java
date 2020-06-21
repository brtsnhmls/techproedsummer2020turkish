package day30exceptions;

public class Example3 {

	public static void main(String[] args) {
	try {
		hop();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
private static void hop() {
	throw new RuntimeException("cannaot hop");
}
}
