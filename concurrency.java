package sample;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class concurrency {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService exec = Executors.newFixedThreadPool(4);
		Set<Runnable> runnableCollections = new HashSet<Runnable>() ;
		
		runnableCollections.add(() -> {
			System.out.println("Current Thread executing in call 1 : " + Thread.currentThread().getName());
		});
		
		runnableCollections.add(() -> {
			System.out.println("Current Thread executing in call 2 : " + Thread.currentThread().getName());
		});
		
		
	}
}
