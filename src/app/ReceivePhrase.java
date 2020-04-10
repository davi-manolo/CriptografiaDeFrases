package app;

import java.util.Scanner;

public class ReceivePhrase {

  private Scanner reader;
  private String received;

  //Método que recebe pela digitação do teclado uma frase para criptografia
  //de acordo com a quantidade de caracteres pulados.
  public void receive() {
    UI.printUI();
    reader = new Scanner(System.in);
    received = reader.nextLine();
    UI.printNumber();
    int jumps = reader.nextInt();
    final String result = Encrypt.encryptString(received, jumps);
    UI.printPharse(result);
  }

}