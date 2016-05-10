package Exercise6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
	6) Взять любой русскоязычный текст в котором не меньше трёхсот знаков. 
	Необходимо провести анализ этого текста на: 
	a)	Количество согласных и гласных букв. 
	b)	Вывести каждое предложение этого текста в отдельной строке с указанием количества символов в нём.
	c)	Посчитать количество пробелов и абзацев (абзацем считается переход на новую строку). 
	d)	Создать текст, в котором будут убраны все пробельные символы в исходном тексте, и вывести его. 

 */


public class Exercise6 {
	
	public static void main(String[] args) {		
		//TEXT
		System.out.println("--------------------------------------------------------------------------" + "\n" +
				text + "\n" + "--------------------------------------------------------------------------");
		//a)		
		System.out.println("Количество гласных = "+getTextVowels());		
		System.out.println("Количество согласных = "+getTextConsonants()+"\n--------------------------------------------------------------------------");
		//b)
		getStringSymbols();
		System.out.println("\n--------------------------------------------------------------------------");
		//c
		System.out.println("Количество пробелов = "+getSpaces());		
		System.out.println("Количество абзацев = "+getParagraphs()+"\n--------------------------------------------------------------------------");
		//d
		System.out.println(makeTextWithoutSpaces());
		
	}

	static String text = "На вход программе поступает трёхзначное число (от 100 до 999), которое генерируется случайным образом либо вводиться из консоли (на свое усмотрение). Необходимо определить является ли число счастливым.\n" +
			"Счастливое число, это число у которого все цифры совпадают (например 777), либо число у которого каждая последующая цифра на 1 больше предыдущей (123 или 456). А также счастливыми являются числа 781, 302, 409 и 941 (такие числа будет называть “Магическими”).\n" +
			"Программа должна вывести на экран входное число ( только в случае если оно было сгенерировано) и результат какое число попалось: “Счастливое”, “Несчастливое” или “Магическое”.";
	
	private static int getTextVowels(){
		Pattern pattern = Pattern.compile("[аеёиоуыэюяАЕЁИУЫЭЮЯ]");
		Matcher matcher = pattern.matcher(text);
		int n = 0;
		while (matcher.find()){
			n++;
		}
		return n;
	}
	
	private static int getTextConsonants(){
		Pattern pattern = Pattern.compile("[бвгджзклмнпрстфхцчшщъьБВГДЖЗКЛМНПРСТФХЦЧШЩЪЬ]");
		Matcher matcher = pattern.matcher(text);
		int n = 0;
		while (matcher.find()){
			n++;
		}
		return n;
	}
	
	private static String makeParagraph(){
		Pattern p = Pattern.compile("\\.\\s");
		Matcher m = p.matcher(text);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, "\\.\n");
		}
		m.appendTail(sb);
		return sb.toString();
	}
	
	private static void getStringSymbols(){
		char[]text1 = makeParagraph().toCharArray();
		int n=0;
		for (int i = 0; i < text1.length; i++) {			
			if (text1[i]!='.'){
				System.out.print(text1[i]);
				n++;
			} 
			else {
				System.out.print(text1[i]+" ("+n+" символ(ов) в строке)");	
				n=0;
			}
		}		
	}
	
	private static int getSpaces(){
		Pattern pattern = Pattern.compile("\\s");
		Matcher matcher = pattern.matcher(text);
		int n = 0;
		while (matcher.find()){
			n++;
		}
		return n;
	}
	
	private static int getParagraphs(){
		Pattern pattern = Pattern.compile("\n");
		Matcher matcher = pattern.matcher(text);
		int n = 0;
		while (matcher.find()){
			n++;
		}
		return n;
	}
	

	private static String makeTextWithoutSpaces(){
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher(text);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, "");
		}
		m.appendTail(sb);
		return sb.toString();
	}

}