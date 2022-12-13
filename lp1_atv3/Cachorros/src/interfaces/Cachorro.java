/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package interfaces;

import javax.swing.JOptionPane;
/**
 *
 * @author Felipe Bispo
 */
public class Cachorro {

    private String nome;
    private String raca;
    private String sexo;
    private String cor;
    private int idade;
    
    
    //MÉTODO CONSTRUTOR
    public Cachorro() {}


    public Cachorro(String nome, String raca, String sexo, String cor, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.cor = cor;
        this.idade = idade;
     
    }

    
    //MÉTODOS DE ACESSO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


       
    public void dlatir (String latir){
        if((idade) > 10){
            System.out.println("Au!, au!");
            JOptionPane.showMessageDialog(null,
                "Au!, au!",
                "Ação do cachorro:",
                JOptionPane.INFORMATION_MESSAGE);
        
        } 
        else if((idade) > 5){
            System.out.println(idade);
            JOptionPane.showMessageDialog(null,
                "Woof, Woof!",
                "Ação do cachorro:",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            System.out.println(idade);
            JOptionPane.showMessageDialog(null,
                "Ruff!, Ruff!",
                "Ação do cachorro:",
                JOptionPane.INFORMATION_MESSAGE);             
                }

    }
   
    public void dcomer (String comer){
        System.out.println(comer);
        JOptionPane.showMessageDialog(null,
                "O cachorro comeu!",
                "Ação do cachorro:",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void dcorrer (String correr){
        System.out.println(correr);
        JOptionPane.showMessageDialog(null,
                "O cachorro correu!",
                "Ação do cachorro:",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void acao(boolean acao){
        if (acao == true){
            System.out.println("O cachorro está acordado!");
            JOptionPane.showMessageDialog(null,
                "O cachorro está acordado!",
                "Ação do cachorro:",
                JOptionPane.INFORMATION_MESSAGE);
            
        } else{
            System.out.println("Você está sendo descalçado !!");
             System.out.println("Você está calçado");
             JOptionPane.showMessageDialog(null,
                "O cachorro comeu!",
                "Ação do cachorro:",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }


}

