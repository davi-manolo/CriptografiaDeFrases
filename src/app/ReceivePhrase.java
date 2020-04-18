package app;

import java.util.Locale;
import java.util.Scanner;

public class ReceivePhrase {

  private String received;

  //Método que recebe pela digitação do teclado uma frase para criptografia
  //de acordo com a quantidade de caracteres a serem pulados.
  public void receive() {
    UI.printUI();
    try (Scanner reader = new Scanner(System.in)) {
      reader.useLocale(new Locale("pt", "BR"));
      received = reader.nextLine();
      System.out.println("Digitado:" + received);
      UI.printNumber();
      int jumps = reader.nextInt();
      final String result = Encrypt.encryptString(received, jumps);
      UI.printPharse(result);
    }
    
  }

}