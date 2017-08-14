import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//1 Задать случайное число от 1 до 10
		//2 спросить у пользователя число
		//3 если отгодал то вывести сообщение
		//4 если не отгодал то перейти к пункту 2
		
		
		Scanner sc = new Scanner(System.in);
		int computerNumber = (int)(Math.random()*10);
		System.out.println("Computer Number: " + computerNumber);
		int userNumber = -1;
		while (userNumber!= computerNumber) {
			System.out.println("Input number from 0 to 9 --> ");
			userNumber = sc.nextInt();
			if (userNumber != computerNumber) {
				System.out.print("You are wrong!!!\n");
			}
		}
		System.out.println("Well done!");
	}
}
