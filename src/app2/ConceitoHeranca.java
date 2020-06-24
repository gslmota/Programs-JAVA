package app2;
public class ConceitoHeranca 
{
    public static void main (String[] args)
    {
        Pessoa p1 = new Pessoa ();
        Aluno p2 = new Aluno ();
        Professor p3 = new Professor ();
        Funcionario p4 = new Funcionario ();

        //Testando
        // É possível colocar nomes por causa do conceito de herança
        // Vem da Classe Pessoa
        p1.setNome("João");
        p2.setNome("Maria");
        p3.setNome("Ilda");
        p4.setNome("Elias");
        p1.setSexo("M");
        p2.setSexo("F");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}