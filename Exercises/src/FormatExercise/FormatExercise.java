package FormatExercise;

import java.io.*;
import java.util.Scanner;

public class FormatExercise {

	public static void main(String[] args) {
		File f=new File("D:\\Students\\Anatoliy\\git\\git-projects\\Exercises\\src\\IOExercise\\notes3.txt");
		try(FileReader reader = new FileReader(f))
		{
		    char[] buffer = new char[(int)f.length()];
		    // ������� ���� ���������
		    reader.read(buffer);
		    System.out.println(new String(buffer));
		}
		catch(IOException ex){
		              
		    System.out.println(ex.getMessage());
		}
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���: ");
        String name = in.nextLine();
        System.out.print("������� �������: ");
        int age = in.nextInt();
        System.out.println("���� ���: " + name + "   ��� �������: " + age);

	}

}
