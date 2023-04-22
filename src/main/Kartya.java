/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Szabrina
 */
public class Kartya {

    private String kerdes, valasz;

    public Kartya(String kerdes, String valasz) {
        this.kerdes = kerdes;
        this.valasz = valasz;
    }

    public String getKerdes() {
        return kerdes;
    }

    public String getValasz() {
        return valasz;
    }

    public void setKerdes(String kerdes) {
        this.kerdes = kerdes;
    }

    public void setValasz(String valasz) {
        this.valasz = valasz;
    }

    @Override
    public String toString() {
        return "Kartya{" + "kerdes=" + kerdes + ", valasz=" + valasz + '}';
    }

    
    
//    public static void main(String[] args) {
//       
//    }
    
}
