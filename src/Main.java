import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main ( String[] args ) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("eded 1 i daxil edin");
      int eded1=scanner.nextInt();
      Scanner scanner1=new Scanner(System.in);
      System.out.println("eded 2 daxil edin");
      int eded2=scanner.nextInt();
      Calculate addition=new Addition();
      System.out.println(addition.calculate(eded1,eded2));
      Calculate subtraction=new Subtraction();
      System.out.println(subtraction.calculate(eded1,eded2));
      Calculate multiplaction=new Multiplaction();
      System.out.println(multiplaction.calculate(eded1,eded2));
      Calculate division=new Division();
      System.out.println(division.calculate(eded1,eded2));



    }
}