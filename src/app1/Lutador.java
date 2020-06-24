package app1;
public class Lutador
{
    // Atributos 
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métodos Públicos 
    public void apresentar ()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Chegou a hora!!!");
        System.out.println( "Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " m");
        System.out.println("Pesando " + this.getPeso() + " kg");  
        System.out.println(" " + this.getVitorias () + " vitórias");
        System.out.println(" " + this.getDerrotas () + " derrotas");
        System.out.println(" " + this.getEmpates () + " empates");
    }
    public void status ()
    {
        System.out.println(" " + this.getNome() + " é um peso " + this.getCategoria());
        System.out.println(" Ganhou " + this.getVitorias() + " vezes");
        System.out.println(" Perdeu " + this.getDerrotas() + " vezes");
        System.out.println(" Empatou " + this.getEmpates() + " vezes");
    }
    public void ganharluta ()
    {
        this.setVitorias(getVitorias() + 1);
    }
    public void perderluta ()
    {
        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarluta ()
    {   
        this.setEmpates(getEmpates() + 1);
    }
    // Métodos Especiais
    //Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, 
    float p, int vitorias, int derrotas, int empates)
    {
        this.nome = nome;
        this.nacionalidade  = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(p);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    public String getNome ()
    {
        return nome;
    }
    public void setNome (String nome)
    {
        this.nome = nome;
    }
    public String getNacionalidade ()
    {
        return nacionalidade;
    }
    public void setNacionalidade (String nacionalidade)
    {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade ()
    {
        return idade;
    }
    public void setIdade (int idade)
    {
        this.idade = idade;
    }
    public float getAltura ()
    {
        return altura;
    }
    public void setAltura (float altura)
    {
        this.altura = altura;
    }
    public float getPeso ()
    {
        return peso;
    }
    public void setPeso (float pe)
    {
        this.peso = pe;
        this.setCategoria ();
    }
    public String getCategoria ()
    {
        return categoria;
    }
    private void setCategoria ()
    {
        if(this.peso < 52.2)
        {
            this.categoria = "Inválido";
        }else
        {
            if(this.peso <= 70.3)
            {
                this.categoria = "Leve";
            }
            else
            {
                if(this.peso <= 83.9)
                {
                    this.categoria = "Médio";
                }
                else
                {
                    if(this.peso <= 120.2)
                    {
                        this.categoria = "Pesado";
                    }
                    else
                    {
                        this.categoria = "Inválido";
                    }
                }
            }
        } 
         
    }
    public int getVitorias ()
    {
        return vitorias;
    }
    public void setVitorias(int  vitorias)
    {
        this.vitorias = vitorias;
    }
    public int  getDerrotas ()
    {
        return derrotas;
    }
    public void setDerrotas (int  derrotas)
    {
        this.derrotas = derrotas;
    }
    public int  getEmpates ()
    {
        return empates;
    }
    public void setEmpates (int empates)
    {
        this.empates = empates;
    }
}
