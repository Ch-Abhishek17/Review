import java.util.Scanner;
public class Duplicate{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size ");		
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();		
		}
		//to check duplication
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
					break;
					}
			}
		}
	}
}
