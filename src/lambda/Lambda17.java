package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lambda17 {

	public static void main(String[] args) throws IOException {
		// How to work with Files by using Lambda
		
		//1)Print the file on the console
		Files.lines(Paths.get("src/FileForLambda01"))
		     .forEach(System.out::println);
		
		System.out.println("====");
		//2)Convert to upper case all letters in the file
		Files.lines(Paths.get("src/FileForLambda01"))
		     .map(t->t.toUpperCase())
		     .forEach(System.out::println);
		
		System.out.println("====");
		//3)Check if a specific word exists in the file 
		System.out.println(Files.lines(Paths.get("src/FileForLambda01"))
				                .anyMatch(t->t.contains("Lambda")));
		
		System.out.println("====");
		//4)Print distinct words on the console in the file 
		Files.lines(Paths.get("src/FileForLambda01"))
		     .map(t->t.split(" "))
		     .flatMap(Arrays::stream)
		     .distinct()
		     .forEach(System.out::println);
		
		System.out.println("====");
		//5)Print words on the console in alphabetical order 
		Files.lines(Paths.get("src/FileForLambda01"))
		     .map(t->t.split(" "))
		     .flatMap(Arrays::stream)
		     .sorted()
		     .forEach(System.out::println);
		
		System.out.println("====");
		//6)Get the words which start with "m" and print them on the console
		Files.lines(Paths.get("src/FileForLambda01"))
		     .map(t->t.split(" "))
		     .flatMap(Arrays::stream)
		     .filter(t->t.startsWith("m"))
		     .forEach(System.out::println);
	}

}
