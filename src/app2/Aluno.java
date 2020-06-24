package app2;
public class Aluno extends Pessoa
{
    private int mat;
    private String curso;

    public void cancelarMatrícula ()
    {
        System.out.println("Matrícula Cancelada!");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}   