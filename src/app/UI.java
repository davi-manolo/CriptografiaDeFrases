package app;

//Classe que representa a interface no console.3
public abstract class UI {

  public static void printUI() {
    System.out.print("Digite a frase: ");
  }

  public static void printNumber() {
    System.out.print("Quantidade de pulos: ");
  }

  public static void printPharse(String s) {
    System.out.println("Frase criptografada: " + s);
  }

}