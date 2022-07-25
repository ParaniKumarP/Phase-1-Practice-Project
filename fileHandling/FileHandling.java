package fileHandling;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandling {
public static void main(String[] args) {


try {			//Program to write to a file
	BufferedWriter a = new BufferedWriter(new FileWriter("Firstwrite.txt"));
	a.write("First file handling program to write a file.");		      
	a.close();
} catch (IOException e) {
	
	e.printStackTrace();
}

try {			
BufferedReader b = new BufferedReader(new FileReader("Firstwrite.txt"));
System.out.println(b.readLine());
b.close();
} catch (Exception e) {

e.printStackTrace();
}

String add = "This line is appended";	
try {
FileWriter c = new FileWriter("Firstwrite.txt", true);
System.out.println("\n");
c.write(add);

System.out.println(add);
c.close();
}catch(Exception e) {
e.printStackTrace();}

try {			
BufferedReader d = new BufferedReader(new FileReader("Firstwrite.txt"));
System.out.println("\n");
System.out.println("Again writing a program to read to a file to know that previous line is appended successfully");
System.out.println(d.readLine());
d.close();
} catch (Exception e) {

e.printStackTrace();
}

try {
	Files.deleteIfExists(Path.of("C:\\Users\\Legion\\eclipse-workspace\\MultithreadingExceptionalHandling\\Firstwrite.txt"));
} catch (Exception e) {

	e.printStackTrace();
}


}}