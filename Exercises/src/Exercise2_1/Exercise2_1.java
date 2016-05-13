package Exercise2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Exercise2_1 {
	public static void main(String[] args) {
		Random random = new Random();

		List<Integer> marksList = new ArrayList<>();
		ListIterator<Integer> iterator = marksList.listIterator();
		System.out.println("Список оценок:");
		for (int i = 0; i < 10; i++) {
			int x = random.nextInt(10) + 1;
			iterator.add(x);
			System.out.print(marksList.get(i) + "\t");
		}

		System.out.println("\nСписок положительных оценок:");
		/*
		 * for (int i = 0; i < marksList.size(); i++) { marksList.get(i); if
		 * (marksList.get(i)<5){ marksList.remove(i); i--; System.out.print("-"
		 * + "\t"); }else { System.out.print(marksList.get(i)+ "\t"); } }
		 */
		iterator = marksList.listIterator();
		while (iterator.hasNext()) {
			int x = iterator.next();
			if (x < 5) {
				iterator.remove();
				System.out.print("-" + "\t");
			} else {
				System.out.print(x + "\t");
			}
		}

	}
}
