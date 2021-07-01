package interval;

import java.lang.Math;

/**
 * This type of generator will distribute the returned number in buckets. In this, the returned number will be from the smallest bucket.
 * Periodically, the smallest bucket will be recalculated, the user of this algorithm can decide how frequently to rebalance.
 *
 * The following are the inputs to this algorithm -
 * - The minimum generated value.
 * - The number of buckets in which to distribute the generated value.
 * - The range of numbers in each bucket.
 * - For performance, we will not balance the count in buckets for each fetch. The reorderAfterCount will define when to switch to the smallest bucket.
 * Implementation details -
 * Internally, we maintain sorted buckets by count, so that the bucket with smallest count is at the head, and the tail is the bucket
 * with largest count.
 */
public class BucketRetryIntervalGenerator implements RetryIntervalGenerator
{
    // head contains the bucket which has smallest count.
    private Bucket head;
    // last contains the bucket which has largest count.
    private Bucket last;

    private int reorderCount = 0;
    private int reorderAfterCount;

    public BucketRetryIntervalGenerator (int baseNumber, int numberOfBuckets, int sizeOfEachBucket, int reorderAfterCount)
    {
        this.reorderAfterCount = reorderAfterCount;

        // Form the linked list of buckets
        // For each bucket, the range of numbers to be returned is given. The bucket will return a random number in this range.
        head = new Bucket(baseNumber, sizeOfEachBucket);
        Bucket prev = head;
        for (int i=1; i<numberOfBuckets; i++)
        {
            Bucket newBucket = new Bucket(baseNumber+(i*sizeOfEachBucket), sizeOfEachBucket);
            prev.next = newBucket;
            prev = newBucket;
            last = newBucket;
        }
        last.next = null;
    }

    public long getNext()
    {
        long returnValue = head.getInterval();
        reorderCount ++;

        if (reorderCount >= reorderAfterCount)
        {
            // System.out.println ("Before reorder = " + head.getStart());
            // do reorder
            // move head to the end of the list; since it is ascending list, we know that the largest should be at end
            Bucket curr = head;
            if (head.next != null)
            {
                head = head.next;
                last.next = curr;
                curr.next = null;
                last = curr;
                reorderCount = 0;
            }
            // System.out.println ("After reorder = " + head.getStart());
        }
        return returnValue;
    }

    public String toString()
    {
        StringBuffer retval = new StringBuffer ("");
        Bucket curr = head;
        while (curr != null)
        {
            retval.append(" " + curr.getCount());
            curr = curr.next;
        }
        return retval.toString();
    }
}

class Bucket
{
    private int count;
    private long start;
    private int interval;
    Bucket next;

    Bucket (int start, int interval)
    {
        // System.out.println (start + " " + interval);
        this.start = start;
        this.interval = interval;
    }

    long getInterval()
    {
        long retval = start + (int)(Math.random() * interval);
        // System.out.println ("getInterval " + retval);
        count ++;
        return retval;
    }

    int getCount()
    {
        return count;
    }

    long getStart()
    {
        return start;
    }
}

