/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication20;

/**
 *
 * @author Arsalan
 */

import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            System.out.println("UP REGULATED TRANSCRIPTS");
            System.out.println();

            Finder finder = new Finder();
            finder.fileRead();
            finder.bubblesort();
           // finder.print();

            System.out.println("DOWN REGULATED TRANSCRIPTS");
            System.out.println();

            FinderDownReg downreg = new FinderDownReg();
            downreg.fileRead();
            downreg.bubblesort();
         //   downreg.print();
        }
        catch (IOException e1)
        {
            System.out.println(e1.getMessage());
        }
    }

}
