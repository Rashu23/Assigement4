import java.util.Scanner;

public class decending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]=new int[5];
		int j,i,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number");
		for(i=0;i<a.length;i++) {
		
		a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		for(i=0;i<a.length;i++) {
			System.out.print("The Decending Orders Are : ");
			System.out.println( a[i]+"");
		}
		}
		}


