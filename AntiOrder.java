//数组中的逆数对

public class AntiOrder{
	public int Num(int[] a,int n){
		if(n==0 || a==null){
			return 0;
		}
		return mergeSortSplit(a,0,n-1);
	}
	public int mergeSortSplit(int[] a,int left,int right){
		if(left==right){
			return 0;
		}
		int mid = (left+right)/2;
		return mergeSortSplit(a,left,mid)+mergeSortSplit(a,mid+1,right)+merge(a,left,mid,right);
	}
	
	public int merge(int[] a,int left,int mid,int right){
		int index = 0;
		int[] tmp = new int[right-left+1];
		int count = 0;
		int i = left;
		int j = mid+1;
		while(i<=mid && j<=right){
			if(a[i]<=a[j]){
				tmp[index++] = a[i++];
			}else{
				count++;
				tmp[index++] = a[j++];
			}
		}
		while(i<=mid){
			tmp[index++] = a[i++];
		}
		while(j<=right){
			tmp[index] = a[j++];
		}
		for(int k = 0;k<tmp.length;k++){
			a[k] = tmp[k];
		}
		
		return count;
		
		
	}
}