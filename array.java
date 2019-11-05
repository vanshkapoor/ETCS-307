import java.util.*;

class array
{
   public static void main(String args[])
   {
	int arr[];
	arr = new int[100];
	Scanner s = new Scanner(System.in);
	int m = s.nextInt();

	int ar1[] = {1,2,3,4};

	for(int i = 0;i<4;i++)
	{
		ar1[i] = m+i;
		System.out.println(ar1[i]);
	
	}

	for(int i = 0;i<10;i++)
	{
		System.out.println(arr[i]);
	}
	
	
   }

}
