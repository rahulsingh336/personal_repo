package random;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class TestUUID {

  public static void main(String[] args) {
    System.out.println(
    UUID.fromString(String.valueOf(new AtomicInteger(4))));
  }
}
