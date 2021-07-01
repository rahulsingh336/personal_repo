package java8.locksAndFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestCompletableFuture {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
	  Runnable runnable = () -> {
	  	System.out.println("Threading saying Hello - " + Thread.currentThread().getId());
	  };

	  System.out.println("Starting new Thread from Main - " + Thread.currentThread().getId());

	  CompletableFuture<Void> cFuture = CompletableFuture.runAsync(runnable);
	  //USE supplyAsync if want to use return some value
	  //cFuture.get();  // BLOCKING CALL

	  System.out.println("Main Doing something else - " + Thread.currentThread().getId());

	  System.out.println("Main completed - " + Thread.currentThread().getId());
  }
}
