import java.util.*;
public class Fib{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the range for the Fibonachi series");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print(fib(i) +" ");
		}
	}
	public static int fib(int n){
		if(n==1 || n==0 )return n;
		return fib(n-1)+fib(n-2);
	}
}
