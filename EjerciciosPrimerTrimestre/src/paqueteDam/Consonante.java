package paqueteDam;
public class Consonante {
public static void main(String args[]) {
    String x = "ahora se quitaran las vocales";
    int s = x.length();
    char k=' ';

        for (int i = 0; i < s; i++) {
            k = x.charAt(i);

            if ((k == 97) || (k == 111) || (k==101) || (k==105) || (k==117)) {

                  System.out.print(k);
            }else{
                  k = ' ';
                  System.out.print(k);
            }

        }
    }
}