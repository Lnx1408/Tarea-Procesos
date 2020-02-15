/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesossoftware;
import junit.framework.*;

/**
 *
 * @author Lino
 */
public class CribaTest extends TestCase{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        junit.swingui.TestRunner.main(new String[] {"CribaTest"});
    }
    
    
    public CribaTest(String nombre){
        super(nombre);
    }
    public void testPrimos(){
        int[] nullArray = Criba.generarPrimos(0);
        assertEquals(nullArray.length, 0);
        int[] minArray = Criba.generarPrimos(2);
        assertEquals(minArray.length, 1);      
        assertEquals(minArray[0], 2);
        
        int[] threeArray = Criba.generarPrimos(3);      
        assertEquals(threeArray.length, 2);      
        assertEquals(threeArray[0], 2);      
        assertEquals(threeArray[1], 3);
        
        int[] centArray = Criba.generarPrimos(100);      
        assertEquals(centArray.length, 25);      
        assertEquals(centArray[24], 97);
        
    }
}