package Exersice2_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.sun.org.apache.xpath.internal.operations.Quo;

public class Exersice2_3 {

	public static void main(String[] args) {
		String text = " омически передал слезливую речь предводител€ и как выписаны были лакеи в деревне. "
				+ "—одержани€: неведовский со своим юным, непоколебимым и потому все честное. ѕростые, ровные ко всем отношени€, очень весело. "
				+ "¬ыписаны были лакеи в которой все его превосходительству придетс€. ”важение и €довитым лицом кучу ни к неведовскому: лучше нельз€ было. "
				+ "ƒвенадцатью шарами обедом и землевладельца, которые он сказал, сто€ло. ќтличным обедом перебирались эпизоды выборов так забрало за прекрасным.";
		text = text.toLowerCase();
		String[] array = text.split("\\s\"|\"\\s|\\.\\s|\\.|\\s|,\\s|:\\s");
		int quontity = 1;
		Set<String> iterator = new HashSet<String>();
		Map<String, Integer> dictionary = new HashMap<String, Integer>();
		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
			if (!iterator.add(array[i])){
				quontity++;
			}
			System.out.println(dictionary.hashCode());
		}
//		Set<String> list = new HashSet<String>(Arrays.asList(array));
		System.out.println("Hi!");
	}

}
