/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvconverter;

import java.io.FileNotFoundException;

/**
 *
 * @author Janette
 */
public class CSVConverter {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Parser p = new Parser();
        p.converter();
    }
    
}
