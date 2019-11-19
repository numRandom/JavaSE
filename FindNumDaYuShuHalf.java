//找出一个数组中，出现次数大于等于该数组的一半的；11-12-day06

import java.util.Scanner;

public class FindNumDaYuShuHalf{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			String[] tmp = str.split(" ");
			int[] a = new int[tmp.length];
			int index = 0;
			for(String s:tmp){
				a[index++] = Integer.parseInt(s);
			}
			int num = a[0];
			int count = 0;
			for(int i = 0;i<a.length;i++){
				if(a[i]==num){
					count++;
				}else if(count>0){
					count--;
				}else{
					num = a[i];
				}
			}
		}
	}
}