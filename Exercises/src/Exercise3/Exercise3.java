package Exercise3;

public class Exercise3 {

	public static void main(String[] args) {
		double a = Math.random()*10;
		double b = Math.random()*10;
		double c = Math.random()*10;
		double d = Math.random()*10;
		System.out.println ("a = " + a + ";\tb = " + b + ";\tc = " + c + ";\td = " + d + ";");
		if (a<=b && b<=c && c<=d) {
			a=b=c=d;
		}
		else if (a>b && b>c && c>d){
			
		}
		else {
			a=Math.pow(a, 2);
			b=Math.pow(b, 2);
			c=Math.pow(c, 2);
			d=Math.pow(d, 2);
		}
		System.out.println ("a = " + a + ";\tb = " + b + ";\tc = " + c + ";\td = " + d + ";");

	}

}
