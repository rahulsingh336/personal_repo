package interval;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.round;

public class Main
{
    public static void main (String[] args)
    {
      int baseNumber = 500;
        int numberOfBuckets = 4;
        int sizeOfEachBucket = 2;
        int reorderAfterCount = 2;
        int howManyToGenerate = 10;

       /* long start = System.currentTimeMillis();

        long end = System.currentTimeMillis();
        random.RetryIntervalGenerator generator;
        generator = new random.BucketRetryIntervalGenerator(baseNumber, numberOfBuckets, sizeOfEachBucket, reorderAfterCount);
        for (int i=0; i<howManyToGenerate; i++)
        {
         *//*   if (i % 100 == 0)
            {
                System.out.println (generator);
            }*//*
            long nextNumber = generator.getNext();
            System.out.println (nextNumber);
          *//*  if (i % 10 == 0)
            {
                System.out.println (nextNumber);
            }*//*
        }
        end = System.currentTimeMillis();
        System.out.println ("Time for bucket based = " + (end-start));*/

    /*    random.RetryIntervalGenerator generator = new random.FixedRetryIntervalGenerator(baseNumber, numberOfBuckets, sizeOfEachBucket, reorderAfterCount);
    for (int i=0; i<howManyToGenerate; i++)
    {
        long nextNumber = generator.getNext();
    }
    System.out.println ("Time for fixed = " + (end-start));*/
    /*

        start = System.currentTimeMillis();
            long end = System.currentTimeMillis();
            random.RetryIntervalGenerator generator;
        generator = new random.BucketRetryIntervalGenerator(baseNumber, numberOfBuckets, sizeOfEachBucket, reorderAfterCount);
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
    */
    /*
        for (int i = 0; i < 200; i++) {
            int boundedRandomValue = ThreadLoclRandom.current().nextInt(500, 1000);
          System.out.println(boundedRandomValue);
        }
    */
    /*
     */
    //Long.
    /*for (int i = 0; i < 1000; i++) {
      System.out.println(getNext());
    }*/
    //Math.toIntExact(value);
        populateCache();
        for (int i = 0; i < 100; i++) {
            System.out.print(cacheForRetry[new Random(System.nanoTime()).nextInt() & 999] + ",");
        }

    }

    private static long getNext() {
        return 50 * (round(ThreadLocalRandom.current().nextInt((500 + 50 - 1500)) + 1500)/50);
    }

    private static void populateCache() {
        //populate cache with random values
        for(int i = 0; i < 1000 ; i++) {
            cacheForRetry[i] = 50 * (round(ThreadLocalRandom.current().nextInt((500 + 50 - 1000)) + 1000)/50);
        }
    }

    private static int[] cacheForRetry = new int[1000];
}

