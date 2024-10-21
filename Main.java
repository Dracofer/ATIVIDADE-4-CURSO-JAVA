import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int funcionario;
    double horas;
    double vPH;
    double salario;

    funcionario = sc.nextInt();
    horas = sc.nextDouble();
    vPH = sc.nextDouble();
    salario = (horas * vPH);

    System.out.printf("NUMBER = %d %nSALARY = U$ %.2f%n", funcionario, salario);

    sc.close();
  }
}