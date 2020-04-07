package lista04;

public class Turma{
    private String nome = "João";
    private String curso = "Engenharia";
    private int quantidadeDeAlunos = 32;
    private int serie = 3;
    
    public Turma(String n, String c, int q, int s){
        nome = n;
        curso = c;
        quantidadeDeAlunos = q;
        serie = s;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public int getQuantidadeDeAlunos(){
        return quantidadeDeAlunos;
    }
    
    public int getSerie(){
        return serie;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public void setCurso(String c){
        curso = c;
    }
    
    public void setQuantidadeDeAlunos(int q){
        quantidadeDeAlunos = q;
    }
    
    public void setSerie(int s){
        serie = s;
    }
}
