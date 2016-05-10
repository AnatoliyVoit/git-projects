package Exercise5;

public class Exercise5 {

	public static void main(String[] args) {
		double random = Math.random()*1000;
		int number = (int) random;
		while (number < 100){
			number *= 10;
		}
		int hundreds = number/100;
		int tens = number/10-hundreds*10;
		int units = number - tens*10 - hundreds*100;
		if (hundreds == tens & tens == units){
			System.out.println("Число " + number + " счастливое");
		}
		else if (hundreds == tens-1 & tens == units-1){
			System.out.println("Число " + number + " счастливое");
		}
		else if (number == 781 | number == 302 | number == 409 | number == 941){
			System.out.println("Число " + number + " магическое");
		}
		else {
			System.out.println("Число " + number + " несчастливое");
		}
	}

}
