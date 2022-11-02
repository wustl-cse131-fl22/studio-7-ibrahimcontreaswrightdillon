package studio7;

public class Die {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Die test = new Die (6);
System.out.print(test.returned());
	}
private int n;
public Die(int n) {
	this.n = n;
}
public int returned() {
	int range = this.n-1+1;
	return(int) (Math.random()* range)+1;
}

}
