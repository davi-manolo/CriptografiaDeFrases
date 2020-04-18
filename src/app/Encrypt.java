package app;

import java.util.List;

//Classe que pega a frase recebida pela digitação do console
//e realiza o processo de criptografia.
public abstract class Encrypt {

  //Realiza o processo de criptografia através da quantidade de pulos.
  public static String encryptString(final String s, int jumps) {
    final char[] result = charList(s);
    return listEncrypt(jumps, result);
  }

  //Separa a frase inteira em um array (vetor) de caracteres.
  private static char[] charList(final String s) {
    final char[] list = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      list[i] = s.charAt(i);
    }
    return list;
  }

  //Converte o array de caracteres para uma frase de string criptografada.
  //Foi utilizado o valor de cada char através do código ASCII.
  private static String listEncrypt(int jumps, final char... c) {
    final StringBuilder sb = new StringBuilder();
    for (int i = 0; i < c.length; i++) {
      int ascii = (int) c[i];
      if(convertIlegalChar(ascii)) {
        ascii += jumps;
      }
      c[i] = (char) ascii;
    }
    for (final char buffer : c) {
      sb.append(buffer);
    }
    return sb.toString();
  }

  //Método para verificar os caracteres que não precisam ser convertidos
  //como por exemplo o espaço e sinais como exclamação, interrogação, ponto, vírgula e entre outros.
  private static boolean convertIlegalChar(int v) {
    if(intCharASCII().contains(v)) {
      return true;
    }
    return false;
  }

  private static List<Integer> intCharASCII() {
    Integer[] i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83,
                   84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107,
                   108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 128,
                   129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144,
                   145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160,
                   161, 162, 163, 164, 165, 181, 182, 198, 199, 209, 210, 211, 212, 224, 225, 226,
                   227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237};
    List<Integer> listIntChar = List.of(i);
    return listIntChar;
  }

}