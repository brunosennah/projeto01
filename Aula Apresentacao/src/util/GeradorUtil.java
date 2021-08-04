/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author bruno.senna
 */
public class GeradorUtil {

    /**
     * tetorna um valor string conforme a quantidade de número solicitado.
     *
     *
     */
    public String gerarNumero(int qtde) {
        String senha = "";
        int numero;

        for (int i = 0; i < qtde; i++) {
            numero = (int) (Math.random() * 10);
            senha = senha + numero;
        }
        return senha;

    }
    
    public String gerarCpf(){
        return gerarNumero(3)+ "." + gerarNumero(3) + "." + gerarNumero(3) + "-"
                + gerarNumero(2);
        
        
    }

    public String gerarCnpj() {
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3)
                + "/" + gerarNumero(3) + "-" + gerarNumero(2);
    }

 

    public String gerarTelefoneFixo() {
        return "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);
    }
    
    public String gerarCep() {
        return gerarNumero(5) + "-" + gerarNumero(3);
    }

 

    public String gerarCelular() {
        return "(48) 9" + gerarNumero(4) + "-" + gerarNumero(4);
    }

 

    public String gerarNome() {
        String[] nomes = {"Silvio", "João", "Maria", "Pedro", "Lucas", "josé",
            "Marisa", "Tânia", "Sueli", "Tati", "Antônio", "Francisco", "Giogio",
            "Samara", "Hugo", "Mariele", "William", "Suelen", "Otávio", "Ana" , 
            "Claudio , Claudia"};

        int tamanhoLista = nomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        return  nomes[indice] + " " + gerarSobrenome();      
    }
    
    private String gerarSobrenome(){
        String[] sobrenomes = {"Silva", "Motto", "Mota", "Oliveira", "Abravaneu", "Rocha",
            "Pereira" , "Pires", "Percicotte", "Santos", "Souza", "Zen",
            "Stark", "Peixes","Fischer", "Smitch", "Tango", "Carvalho",
            "Peixoto", "Alves", "Almeida" ,"Parker"};
        int indice = (int) (Math.random() * sobrenomes.length);
        return sobrenomes[indice];
    }
  
    public double gerarSalario() {
        int numero = (int) (Math.random() * 100000);
        return numero;
    }

    public static void main(String[] args) {
        GeradorUtil util = new GeradorUtil();
        String cpf = util.gerarCpf();
        System.out.println("CPF: " + cpf);
        String nome = util.gerarNome();
        
        System.out.println("sobrenome: " + nome);
    }

}
