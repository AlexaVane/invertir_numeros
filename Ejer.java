
public class Ejer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("\nInvertido = " + invertir(123,0));

	}

	 public static int invertir (int n,int m)

	   {
		       int invertido; 
		       if (n == 0) { 
		          invertido = m; 
		       } else { 
		          invertido = invertir(n / 10, m*10 + n % 10); 
		       } 
		       return invertido; 

	   }


}
