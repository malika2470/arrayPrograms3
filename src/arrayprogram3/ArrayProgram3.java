/*Malika Sharma
 * 18/10/2019
 *Array Program 3
 * 
 */

package arrayprogram3;

import java.util.Scanner;

/**
 *
 * @author masha2470
 */
public class ArrayProgram3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        //introduce variables
        double [ ] marks = {65.8,44.8,88.6};
        double total=0;
        double average;
        
        //Output 
        System.out.println("These are the marks:");
        for (int i = 0; i<=2; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        
        for (int i = 0; i<=2; i= i + 1)
        {
            total = total + marks[i];
        }
        
        average = total/3;
        
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
