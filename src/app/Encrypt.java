package app;

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
    if(v >= 48 && v <= 57 || v >= 65 && v <= 90
    || v >= 97 && v <= 122 || v >= 192 && v <= 246
    || v >= 248 && v <= 255) {
      return true;
    }
    return false;
  }

}