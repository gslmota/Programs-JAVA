// Gabriel Sávio
// 10/04/2020
// Conceito de herança
package app3;

public abstract class Pessoa 
{
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    // Métodos
    public void fazerAnivesário ()
    {
        this.idade ++;
    }

    public String getNome () 
    {
        return nome;
    }

    public void setNome (String nome) 
    {
        this.nome = nome;
    }

    public int getIdade () 
    {
        return idade;
    }

    public void setIdade (int idade) 
    {
        this.idade = idade;
    }

    public String getSexo () 
    {
        return sexo;
    }

    public void setSexo (String sexo) 
    {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }
    
}