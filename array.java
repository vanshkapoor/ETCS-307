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

	for(int i = 0;i<10;i++)
	{
		arr[i] = m+i;
	}

	for(int i = 0;i<10;i++)
	{
		System.out.println(arr[i]);
	}
	
	
   }

}
