package edu.karina.estruturaexepicionais;

public class formatadorDeCep {
        
    public static void main(String[] args) { 
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O cep não corresponde com as regras");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
          //throws trata quando não corresponde a regra (neste caso quando não corresponder a 8 numeros)
        
          //simulando um cep formatado
          return "23.765-064";
    }
    
}