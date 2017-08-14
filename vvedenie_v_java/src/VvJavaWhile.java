public class VvJavaWhile {
	int counter = 10;
	
	VvJavaWhile() {
		System.out.println("Start...");
		while (counter > 0) {
			System.out.println(counter);
			--counter;
		}
		System.out.println("...Finish");
	}
}
