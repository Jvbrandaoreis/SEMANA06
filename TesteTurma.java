package lista04;
import javax.swing.*;

public class TesteTurma {
    
    public static void main(String... args){
        String nome = JOptionPane.showInputDialog(null,"Digite o nome");
        String curso = JOptionPane.showInputDialog(null,"Digite o curso");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantidade de Alunos"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantidade a serie"));
                
        Turma turma = new Turma(nome,curso,quantidadeDeAlunos,serie);
        
        String msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuant." + turma.getQuantidadeDeAlunos() + "\nSerie: " + turma.getSerie();
        JOptionPane.showMessageDialog(null, msg);
        
        quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantidade de Alunos"));
        
        turma.setQuantidadeDeAlunos(quantidadeDeAlunos);
        
        msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuant." + turma.getQuantidadeDeAlunos() + "\nSerie: " + turma.getSerie();
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
