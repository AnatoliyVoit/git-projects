package Exercise4;

public class Exercise4 {

	public static void main(String[] args) {
		int x = 1;
		int i = 100;
		int n=0;
		while (n%100 == 0) {
			n=(int) Math.pow(i, x);
			
			if(n%100 == 0){
				x++;
			} else {
				x--;
			}
			
		}

		n=(int) Math.pow(i, x);
		System.out.println("n= " + n);
		System.out.println("Наибольшая степень числа 100, которую можно вычислить, пользуясь типом int = " +x);
	}

}
