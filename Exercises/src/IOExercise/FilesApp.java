package IOExercise;
import java.io.*;
 
public class FilesApp {
 
    public static void main(String[] args) {
    	// создадим новый файл
        File newFile = new File("D:\\Students\\Anatoliy\\git\\git-projects\\Exercises\\src\\IOExercise\\notes3.txt");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("Файл создан");
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
        
        try(FileWriter writer = new FileWriter("D:\\Students\\Anatoliy\\git\\git-projects\\Exercises\\src\\IOExercise\\notes3.txt", false))
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
        try(FileWriter writer = new FileWriter("D:\\Students\\Anatoliy\\git\\git-projects\\Exercises\\src\\IOExercise\\notes3.txt", true))
        {
           // запись всей строки hi
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
    } 
}