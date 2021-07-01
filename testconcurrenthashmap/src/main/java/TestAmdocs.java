import org.junit.platform.commons.function.Try;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestAmdocs {

/*
	-Dkey=value

	@Value("${key: default}")
	private String key;
*/



  public static void main(String[] args) throws InterruptedException {

    CustomTask customTask = new CustomTask();
    //Ask was to use
    CompletableFuture completableFuture = CompletableFuture.supplyAsync(customTask::print);

    List<Object> combined = Stream.of(completableFuture, completableFuture, completableFuture)
            .map(CompletableFuture::join)
            .collect(Collectors.toList());

    CompletableFuture<String> future1
            = CompletableFuture.supplyAsync(() -> "Hello");
    CompletableFuture<String> future2
            = CompletableFuture.supplyAsync(() -> "Beautiful");
    CompletableFuture<String> future3
            = CompletableFuture.supplyAsync(() -> "World");
      boolean test = false;
	  //Optional.of(test).get().
     //Try.of().
	  Predicate predicate = o -> true;
	  Predicate predicate1 = o -> true;
	  predicate.test(true);

	  predicate.and(predicate1);

    /*String combined = Stream.of(future1, future2, future3)
            .map(CompletableFuture::join)
            .collect(Collectors.joining(" "));*/



	  /*List<String> list = new ArrayList();
	  list.add("A");
	  list.add("B");
	  list.add("C");
	  list.add("D");
      list.forEach(print(s));
      list.parallelStream().forEach(print(s));
      list.forEach(s -> {
      	new Thread(() -> print(s)).start();
	  });
	  ExecutorService executorService = Executors.newFixedThreadPool(4);
	  for (String s : list) {
	  	Thread t = new Thread(() -> print(s));
		  executorService.submit(t);
	  }
	  executorService.awaitTermination(5000, TimeUnit.SECONDS);*/

  }

	/*private static void print(String s) {
   			 System.out.println(s);
	}*/
}

class CustomTask{

  public String print(){
    System.out.println("CustomTask - " + " "+ Thread.currentThread().getId());
    return "SUCCESS";
  }
}
