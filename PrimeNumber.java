import java.util.*;
import java.lang.*;
public class PrimeNumber {
	public static boolean primecheck(int a){
		int count=0;
		for(int i=2;i<a;i++){
			if(a%i==0){
				count=1;
				break;
			}
		}
		if(count==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num;
		num=sc.nextInt();
		for(int i=2;i<=num;i++){
			if(primecheck(i)){
				System.out.println(i);
			}
		}
	}

}
