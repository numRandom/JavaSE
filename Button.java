//汽水瓶的问题

import java.util.Scanner;
public class Button{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = drink(n);
			System.out.println(m);
		}
	}
	private static int drink(int n){
		int count = 0;
		while(n>2){
			count=count+n/3;
			n=n/3+n%3;
		}
		if(n==2){
			count++;
		}
		return count;
	}
}