package interval;

public class FixedRetryIntervalGenerator implements RetryIntervalGenerator
{
    private int baseNumber;

    public FixedRetryIntervalGenerator (int baseNumber, int numberOfBuckets, int sizeOfEachBucket, int reorderAfterCount)
    {
        this.baseNumber = baseNumber;
    }

    public long getNext()
    {
        return baseNumber;
    }
}

