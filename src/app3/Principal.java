// Gabriel Sávio
// 10/04/2020
// Conceito de herança
package app3;

public class Principal
{
    public static void main (String[] args)
    {
        Visitante v1 = new Visitante ();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        v1.toString();
        Aluno a1 = new Aluno ();
        a1.setNome("João");
        a1.setMatricula (1111);
        a1.setCurso("Medicina");
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setNome("Lucas");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

    }
}