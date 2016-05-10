package Exercise2;

public class Exercise2 {

	public static void main(String[] args) {
		double random = Math.random();
		double i = random*1000;
		int number = (int) i;
		int hundreds = number/100;
		int tens = number/10 - hundreds*10;
		int units = number - hundreds*100 - tens*10;
		int sum = hundreds + tens + units;
		System.out.println("Сумма превых трех цифр дробной части числа " + random + " равна " + sum);

	}

}
