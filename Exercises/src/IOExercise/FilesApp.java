package IOExercise;
import java.io.*;
import java.util.Random;
 
public class FilesApp {
	static int generateRandomNumber(){
		Random random = new Random();
		int number = random.nextInt();
		return number;
	}
	
	static int generateRandomNumber(int range){
		Random random = new Random();
		int number = random.nextInt(range);
		return number;
	}
	
	static char[] makeSymbolsArray() {
		String letters = "abcdefghijklmnopqrstuvwxyz";
	    String numbers = "0123456789";
	    char[] symbols = new char[2*letters.length() + numbers.length()];
	    int i = 0;
	    for (char letter : letters.toCharArray()) {
	        symbols[i] = letter;
	        i++;
	    }
	    for (char letter : letters.toUpperCase().toCharArray()) {
	        symbols[i] = letter;
	        i++;
	    }
	    for (char number : numbers.toCharArray()) {
	        symbols[i] = number;
	        i++;
	    }
	    return symbols;
	}
	
	static String generateType(){
		int type = generateRandomNumber(3);
		String s = null;
		if (type == 0){
			s = generateDouble();
		}
		if (type == 1){
			s = generateInt();
		}
		if (type == 2){
			s = generateEmail();
		}		
		return s;
	}
	
	static String generateDouble(){
		double number = Math.random()*100;
		String s = Double.toString(number);
		return s;
	}
	
	static String generateInt(){
		int number = generateRandomNumber();
		String s = Integer.toString(number);
		return s;
	}
	
	static String generateEmail(){
		char[] symbols = makeSymbolsArray();
		int length = generateRandomNumber(7)+4;
		char[] account = new char[length];
		for (int i = 0; i < account.length; i++) {
			account[i] = symbols[generateRandomNumber(symbols.length-1)];
		}
		String[] direct = new String [] {"mail.ru", "gmail.com", "tut.by", "yahoo.com", "bk.ru"};
		String acc = new String(account);
		String email = acc + "@" + direct[generateRandomNumber(direct.length-1)];
		return email;
	}
 
    public static void main(String[] args) {
    	// создадим новый файл
        File newFile = new File("D:\\Java\\git final\\git-projects\\Exercises\\src\\IOExercise\\notes3.txt");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("Файл создан");
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }        
        
        try(FileWriter writer = new FileWriter("D:\\Java\\git final\\git-projects\\Exercises\\src\\IOExercise\\notes3.txt", false))
        {
           // запись всей строки
            String text = "Мама мыла раму, раму мыла мама";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
        
        for (int i = 0; i < 50; i++) {			
	        try(FileWriter writer = new FileWriter("D:\\Java\\git final\\git-projects\\Exercises\\src\\IOExercise\\notes3.txt", true))
	        {
	        	
	           // запись всей строки
	        	String s = generateType();	
	            writer.write(s);
	            System.out.println(s);
	            // запись по символам
	            writer.append(' ');
	             
	            writer.flush();
	        }
	        catch(IOException ex){
	             
	            System.out.println(ex.getMessage());
	        } 
        }    
    } 
}