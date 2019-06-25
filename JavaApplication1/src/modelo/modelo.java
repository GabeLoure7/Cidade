/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


)
/**
 *
 * @author Administrador
 */
public class modelo {
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "modelo{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private  String nome;
    
}
