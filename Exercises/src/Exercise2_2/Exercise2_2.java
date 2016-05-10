package Exercise2_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Exercise2_2 {
	public static void main (String[] args){
		Random random = new Random();
		
		List<Integer> marksList = new ArrayList<>();
		ListIterator<Integer> iterator = marksList.listIterator();
		System.out.println("Список оценок:");
		for (int i = 0; i < 10; i++) {
			int x = random.nextInt(10)+1;
			iterator.add(x);	
			System.out.print(marksList.get(i)+ "\t");			
		}
		
		System.out.println("\nСамая высокая оценка:");
		int i = 0;
		while (iterator.hasPrevious()){	
			int x = iterator.previous();
			if (i<x){				
				i = x;
			}			
		}
		System.out.println(i);

	}
}
