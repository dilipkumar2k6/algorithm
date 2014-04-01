package numbers.primenumber;

public class DetectPrimeNumber {

	public static void main(String[] args) {
		//Test to check the prime number
		String status=testCheckPrimeNumber()?"PASSED":"FAILED";
		System.out.println(status);
		
		//Test to print first n number of prime numbers
		printPrimeNumber(1000);
	
		
	}
	
	public static boolean testCheckPrimeNumber()
	{
		boolean status=true;
		int [] testData = 		{-4,	-3, 	0,	 	1, 		2, 		3, 		4, 		5413, 	7188, 	7, 		718, 	7919 };
		boolean [] primeCheck=	{false, false,	false,	false,	true, 	true,	false,	true,	false,	true, 	false,	true,};
		for(int i=0; i < testData.length;i++)
		{
			int number= testData[i];
			boolean isPrime= primeCheck[i];
			if(checkPrimeNumber(number) != isPrime)
			{
				status=false;
				System.out.println("Number "+number+" is prime?"+isPrime+", but program detected incorrectly.");
			}
		}
		
		return status;
	}
	
	public static void printPrimeNumber(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(checkPrimeNumber(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	
	
	public static boolean checkPrimeNumber(int n)
	{
		boolean isPrime=true;
		
		//Check if number is less than or equal to 1 then it is not a prime number
		if(n <= 1)
		{
			isPrime=false;
		}
		else
		{
			
			//check if number is even or not
			if(n%2 ==0)
			{
				if(n !=2)
				{
					isPrime=false;
				}				
			}
			else
			{
				//Find out the half of given number
				int half=(int)Math.sqrt(n);
				//Loop till half and check if number is divisible by any number from 2 to half except the number itself
				for(int i=3; i<=half;i+=2)
				{
					if(n%i ==0)
					{
						isPrime=false;
						break;
					}
				}
			}

		}
		
		return isPrime;
	}

}
