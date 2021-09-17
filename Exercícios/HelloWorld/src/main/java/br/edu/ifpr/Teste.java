/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr;

/**
 *
 * @author Silvia
 */
public class Teste {
    public static void main(String[] args) {
        Produto arroz = new Produto();
        Produto batata = new Produto(111, "Batata", 54, 4.4);
        
        System.out.println(arroz);
        System.out.println(batata);
    
    }
}
