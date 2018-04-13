/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinity;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class Infinity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=Integer.parseUnsignedInt(sc.next(),16);
        b=Integer.parseInt(sc.next(),16);
        if (a> 0x3f3f3f3f || b> 0x3f3f3f3f || a+b> 0x3f3f3f3f) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
