
public class Rational {
	
	private int num;
	private int den;
	
	public Rational() {
		this(1,1);
	}
	
	public Rational(int n,int d) {
		if(d==0) {
			d=1;
			System.out.println("Valor invalido para o denominador");
			System.out.println("Novo valor: 1");
		}
		int g = gcd(n,d);
		
		num=n/g;
		den=d/g;
		
		if(den < 0) {
			num = -num;
			den = -den;
		}
		System.out.printf("%d/%d",num,den);
	}
	
	private static int gcd(int n, int d) {
		if(n<0) n = -n;
		if(d<0) d = -d;
		if(d==0) return n;
		else return gcd(d , n % d);
	}
	
	public static Rational sum(Rational y) {
		
		
	}
	
}