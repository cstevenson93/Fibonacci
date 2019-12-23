/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author csteve
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    
    /*
    0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
                                   20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,
                                    38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,
                                    54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,
                                    71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,
                                    89,90,91,92
    */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Object[] numArray = new Object[93];
        
        for(int i = 0; i < numArray.length; i++)
        {
        numArray[i] = i;
        }
        JFrame frame = new JFrame("Input Dialog");
        
        int s = (int)JOptionPane.showInputDialog(frame,
                    "How many terms would you like the sequence to run, up to 92?",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE, null,
                    numArray,
                    0);
        
        int sequenceNum = s;
        
        if (sequenceNum > 92)
        {
        sequenceNum = 92;
        }
        
        long[] fibonacci = new long[sequenceNum + 1];
        
        fibonacci[0] = 0;
        
        fibonacci[1] = 1;
        
        
        for( int i = 2; i <= sequenceNum; i++)
        {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        
        String output = "";
        for(int i = 0; i < fibonacci.length; i++)
        {
        output += "Term " + (i+1) + ": " + fibonacci[i] + " | ";
        if ((i+1) % 5 == 0)
        {
        output += "\n";
        }
        }
        
        JOptionPane.showMessageDialog(null,output, "Results", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
