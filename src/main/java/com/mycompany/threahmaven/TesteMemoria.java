package com.mycompany.threahmaven;

public class TesteMemoria {
    
    public static void main(String[] args) {
        
        Runtime rt = Runtime.getRuntime();
        
        System.out.println("Memoria livre..: " + rt.freeMemory());
        
        String as = new String ("Teste de exemplo");
        String es = new String("Teste de exemplo 2");
        
        System.out.println("Memoria livre..: " + rt.freeMemory());
        
        es = as;
        
        System.gc();
        
        System.out.println("Memoria livre..: " + rt.freeMemory());
        
        System.out.println("Teste de memória concluido");
    }
    
}
