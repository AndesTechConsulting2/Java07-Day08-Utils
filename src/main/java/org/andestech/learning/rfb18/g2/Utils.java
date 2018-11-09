package org.andestech.learning.rfb18.g2;

public class Utils
{

  public static String makeMultString(String s, int N)
  {
      StringBuilder sb = new StringBuilder();
      for (int i =0; i<N; i++) sb.append(s);

      return sb.toString();

  }

  public static void echo(String s, int N)
  {
      System.out.println(makeMultString(s,N));
  }


}
