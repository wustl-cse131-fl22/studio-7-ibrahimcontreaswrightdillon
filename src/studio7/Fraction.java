package studio7;

public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int numerator;
	private int denominator;


	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}



	public Fraction sum(Fraction fraction2) {
		Fraction answer = new Fraction((this.numerator*fraction2.denominator + fraction2.numerator*this.denominator) , (this.denominator*fraction2.denominator));
		return answer;
	}



	public Fraction product(Fraction fraction2 ) {
		Fraction answer = new Fraction(this.numerator*fraction2.numerator, this.denominator*fraction2.denominator);
		return answer;
	}



	public String reciprocal() {
		return denominator+"/"+ numerator;
	}

	
	public static int getGcd(int p, int q) {
		if (p % q ==0) {
			return q;
		}
		else {
			return getGcd (q,p % q);
			}					
			
	}
	
	
	
	
	public String simplification() {
		int Gcd = getGcd(numerator, denominator);
			return numerator/this.()+ "/"+ denominator/getGcd();
		}
	}


}
