import java.util.Scanner;

public class exercicio2{

   public static void main (String[] args){

    float n = 0 ;
    double perc = 0;

    Scanner in = new Scanner(System.in);
  
    System.out.println("Informe um número real:");
    n = in.nextFloat();

    perc = n + (n*20)/100;

    System.out.println("O valor atualizado com 20% é "+perc);
    
   



    




    }



}