package random;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompleteAbleFuture {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
	 /* CompletableFuture<String> completableFuture = new CompletableFuture<String>();


	  CompletableFuture<String> future;
	  Map<String, CompletableFuture<String>> map = new HashMap<>();
	  //completableFuture.complete("Future's Result");
	  future = map.putIfAbsent("key", completableFuture);
    System.out.println("check if this null");
	  //String result = completableFuture.get(); //BLOCKING call*/

	  System.out.println(Boolean.valueOf(null));
  }
}
