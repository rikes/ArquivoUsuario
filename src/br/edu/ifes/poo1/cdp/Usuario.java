/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo1.cdp;

import java.util.ArrayList;

/**
 *
 * @author 20121BSI0473
 */
public class Usuario {
    
    private String nome;
    private String idade;
    private String telefone;
    private ArrayList<Usuario> listaAmigo;
    private Endereco endereco;    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public void adicionarEnd(Endereco end){
        endereco.setBairro(end.getBairro());
        endereco.setLogradouro(end.getLogradouro());
        endereco.setNumero(end.getNumero());
        endereco.setCidade(end.getCidade());
    }
    public void adicionarAmigo(Usuario usuario){
        
    }
    public void listarAmigo(){
                
    }
    public void removeAmigo (String nome){
        
    }
   
    public void pesquisarAmigo(String nome){
        
    }
    
    @Override
    public String toString(){
        return getNome()+ "\n" +
               getIdade()+ "\n" +
               getTelefone()+"\n" + endereco.toString(); 
    }

}
