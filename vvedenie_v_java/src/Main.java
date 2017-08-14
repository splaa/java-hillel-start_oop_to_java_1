public class Main {
//	this is comment to main function(Простой коментарий)
	/*
		this is main function
		where i write my code
		(многострочный комментарий)
	*/
	public static void main(String[] args) {
		
		System.out.println("Возведение 2 в степень 5 = " + Math.pow(2, 5));
		System.out.println("Возведение 2 в степень 5(int) = " + (int)Math.pow(2, 5));
		
		double a = 2, b = 3, c = 5;
		double res1 = (Math.pow(a, 2)+Math.pow(b, 2))/(Math.pow(a, 2)-Math.pow(b, 2));
		System.out.println("(a^2 + b^2)/(a^2 - b^2) = " + res1);
		double res2 = Math.pow(a + b, 2)/(Math.pow(a, 2)-Math.pow(b, 2));
		System.out.println("((a + b)^2)/(a^2 - b^2) = " + res2);
		
		double res3 = Math.abs(Math.cos(a) + 2 * Math.pow(Math.sin(b), 2));
		System.out.println("|cos(x)^2 + 2*sin(x)^2| = " + res3);
		
		System.out.println("Hello First project.");
		System.out.println("Hello Java.");
		
		int number1 = 135;
		int number2 = 4223;
		float res = number1 + number2;
		System.out.println("res = " + res);
		System.out.println("res(short) = " + (short)res);
		
		
		int height; //высота...
		height = 180;
		
		int age = 35;   //years
		
		float averageVelocity = (float) 125.6; //km/h
		double averageVelocityDouble = 125.6;
		//целочисленные типы
		byte b1 = 8;
		short sh1 = 16;
		int in1 = 32;
		long lon1 = 64;
		//типы плавующей точкой
		float fl = 32; // -1.4e-45..3.4e+38
		double doub = 64;   //-4.9e-324 .. 1.7e+308
		System.out.println("Возраст: " + age);
		System.out.println("Средняя скорость(float): " + averageVelocity);
		System.out.println("Средняя скорость(double): " + averageVelocityDouble);
		
		
	}
}
