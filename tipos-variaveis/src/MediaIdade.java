import java.util.Scanner;

public class MediaIdade {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int idade1, idade2, idade3, media;
    System.out.print("Informe a idade da primeira pessoa: ");
    idade1 = leitor.nextInt();
    System.out.print("Informe a idade da segunda pessoa: ");
    idade2 = leitor.nextInt();
    System.out.print("Informe a idade da terceira pessoa: ");
    idade3 = leitor.nextInt();

    media = (idade1 + idade2 + idade3) / 3;

    if (media >= 0 && media <= 25) {
      System.out.println("Jovem!");
    } else if (media >= 26 && media <= 60) {
      System.out.println("Adulta!");
    } else {
      System.out.println("Idosa!");
    }
    leitor.close();
  }
}
