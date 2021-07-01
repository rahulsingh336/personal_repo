package random;

public class Main
{
	public static void main (String[] args)
	{
		int baseNumber = 60;
		int numberOfBuckets = 5;
		int sizeOfEachBucket = 4;
		int reorderAfterCount = 10;
		int howManyToGenerate = 1000;

		long start = System.currentTimeMillis();
		RetryIntervalGenerator generator = new FixedRetryIntervalGenerator(baseNumber, numberOfBuckets, sizeOfEachBucket, reorderAfterCount);
		for (int i=0; i<howManyToGenerate; i++)
		{
			long nextNumber = generator.getNext();
		}
		long end = System.currentTimeMillis();
		System.out.println ("Time for fixed = " + (end-start));

		start = System.currentTimeMillis();
		generator = new BucketRetryIntervalGenerator(baseNumber, numberOfBuckets, sizeOfEachBucket, reorderAfterCount);
		for (int i=0; i<howManyToGenerate; i++)
		{
			if (i % 100 == 0)
			{
				System.out.println (generator);
			}
			long nextNumber = generator.getNext();
			if (i % 10 == 0)
			{
				System.out.println (nextNumber);
			}
		}
		end = System.currentTimeMillis();
		System.out.println ("Time for bucket based = " + (end-start));
	}
}

