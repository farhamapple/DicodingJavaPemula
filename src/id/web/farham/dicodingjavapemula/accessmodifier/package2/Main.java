/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.web.farham.dicodingjavapemula.accessmodifier.package2;

import id.web.farham.dicodingjavapemula.accessmodifier.package1.KelasA;



/**
 *
 * @author Farham Harvianto
 */
public class Main {
 public static void main(String[] args) {
 
        // Kode ini pasti akan mengalami kompiler error
 
        KelasA kelasA = new KelasA();
 
        //System.out.println(kelasA.functionB());
 
        //System.out.println(kelasA.memberB);
        //System.out.println(kelasA.memberC);
        
        KelasB kelasB = new KelasB();
        kelasB.methodC();
 
    }
}
