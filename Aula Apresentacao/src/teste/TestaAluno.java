/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno.senna
 */
public class TestaAluno {   
    
    public static void main(String[] args) {
       Aluno aluno = new Aluno();
       aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
       
       System.out.print("nome: " + aluno.getNome());
//       
//       aluno.Sobrenome = JOptionPane.showInputDialog("Digite o Sobrenome do aluno");
//       aluno.idade = JOptionPane.showInputDialog("Digite a idade");
//       
//       String salario = JOptionPane.showInputDialog("Digite o salario");
//       aluno.salario = Float.parseFloat(salario);
//       
//       aluno.cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF"));
//       
//       
//       
//       JOptionPane.showMessageDialog(null,"Nome: " + aluno.nome + " " + aluno.Sobrenome
//       + "\nIdade: " + aluno.idade + "\nSalário: R$ " + aluno.salario + "\nCPF: " + aluno.cpf);
//       
//       
    }
    
}
