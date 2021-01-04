package Tutorial;

public class Count0and1 {
	
	static void generate0sand1s ( int arr[], int n){
		int count =0;
		
		for (int i=0;i<n;i++){
			if (arr[i]==0)
				count ++;
			
		}
		
		for (int i=0;i<count;i++){
			
			arr[i]=0;
		}
		
		for (int i=count;i<n;i++){
			
			arr[i]=1;
		}
		
		
	}
	
	static void printarr(int arr[], int n){
		
		for (int i=0; i< n; i++){
			
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [] {0, 1, 0, 1, 1, 1};
		
		int len = arr.length;
		
		generate0sand1s(arr,len);
		printarr(arr,len);
	}

}
