package Testanoumous;

public class Testlambda3 {
	public static void main(String[] args) {
		Calculation3 c = (int m , int n)->{
			return m+n;
			};
			int sum = c.add(8, 9);
			System.out.println(sum);
			Calculation3 r = (int m  , int n)->{
				return m-n;
			};	
			int subst = r.add(90, 10);
			System.out.println(subst);
			Calculation3 r1 = (int m  , int n)->{
				return m*n;
			};	
			int multiply = r1.add(90, 10);
			System.out.println(multiply);
			Calculation3 r2 = (int m  , int n)->{
				return m/n;
			};	
			int div = r2.add(90, 9);
			System.out.println(div);
			
			}
		}
			
		


