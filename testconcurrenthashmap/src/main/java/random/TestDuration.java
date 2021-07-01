package random;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestDuration {
  public static void main(String[] args) throws InterruptedException {
	  long start = System.nanoTime();
	  Thread.sleep((long) .500);
	  long durationInNanos = System.nanoTime() - start;
    System.out.println(durationInNanos);
    System.out.println(TimeUnit.NANOSECONDS.toNanos(durationInNanos));
    long duration = Duration.ofMillis(200).toNanos();
    System.out.println(duration);
	  System.out.println(TimeUnit.NANOSECONDS.toNanos(duration));
  }
}
