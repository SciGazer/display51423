/*
 * Display 5-1-4-2-3 and vice versa
 */
package display51423;

/**
 *
 * @author scigazer
 */
public class Display51423 {
    public static void main (String[] args){
        int x, y;
        for (x=5; x>=1; x--){
            y = (1+(5-x));
            System.out.print(x + " " + y + " ");
        }
    }
}
