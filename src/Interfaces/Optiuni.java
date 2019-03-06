/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Maria&Ion
 */
public enum Optiuni {
    SPECIAL("..."), PRIMA("1) Generare key dintre doua numere random cu 3 cifre fiecare (a + b)"), DOUA("2) Generare key dintre doua numere random cu 4 cifre fiecare (a * b)") , TREIA("3) Generare key dintre doua numere random cu 5 cifre fiecare (a ^ b)");
    ;
        private String value;
        
        private Optiuni(String value){
            this.value = value;
        }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public static Optiuni getEnumByValue(String value)
    {
        for(Optiuni opt : Optiuni.values()){
            if(opt.getValue().equals(value)){
                return opt;
            }
        }
        return null;
    }
}
