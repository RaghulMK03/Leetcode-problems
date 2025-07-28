package leetcode;

import java.math.BigInteger;

	public class solution {
		 public String multiply(String num1, String num2) {
		        BigInteger n1 = new BigInteger(num1);
		        BigInteger n2 = new BigInteger(num2);
		        BigInteger prod = n1.multiply(n2);
		        return prod.toString();
		        
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution sol = new solution();
        String result = sol.multiply("123456789", "987654321");
        System.out.println("Product: " + result);


	}

}
