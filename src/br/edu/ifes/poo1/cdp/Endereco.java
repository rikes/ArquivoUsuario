/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo1.cdp;

/**
 *
 * @author 20121BSI0473
 */
public class Endereco {

    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    @Override
    public String toString(){
        return getLogradouro() +"\n"+
               getNumero() + "\n"+ 
               getBairro() + "\n" +
               getCidade();
    }
    
}
