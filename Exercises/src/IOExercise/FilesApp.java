package IOExercise;
import java.io.*;
 
public class FilesApp {
 
    public static void main(String[] args) {
    	// �������� ����� ����
        File newFile = new File("D:\\Students\\Anatoliy\\git\\git-projects\\Exercises\\src\\IOExercise\\notes3.txt");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("���� ������");
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
        
        try(FileWriter writer = new FileWriter("D:\\Students\\Anatoliy\\git\\git-projects\\Exercises\\src\\IOExercise\\notes3.txt", false))
        {
           // ������ ���� ������
            String text = "���� ���� ����, ���� ���� ����";
            writer.write(text);
            // ������ �� ��������
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
        try(FileWriter writer = new FileWriter("D:\\Students\\Anatoliy\\git\\git-projects\\Exercises\\src\\IOExercise\\notes3.txt", true))
        {
           // ������ ���� ������ hi
            String text = "���� ���� ����, ���� ���� ����";
            writer.write(text);
            // ������ �� ��������
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}