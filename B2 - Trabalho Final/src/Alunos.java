import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Alunos {
    public static void main (String[] args) {

        ArrayList<String> Alunos = new ArrayList<String>();
        ArrayList Nota1 = new ArrayList();
        ArrayList Nota2 = new ArrayList();
        ArrayList Materia = new  ArrayList();
        ArrayList<Double> Media = new ArrayList();

        String nome;
        double nota1, nota2, media;
        String materia;

        do {

            nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno ou aperte <Enter> com o campo em branco para encerrar o programa: ");
            if(!nome.equals("")) {
                Alunos.add(nome);
                Collections.sort(Alunos);
                //Recebendo primeira nota
                nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota do aluno "+ nome));
                Nota1.add(nota1);
                // Recebendo segunda nota
                nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota do aluno "+nome ));
                Nota2.add(nota2);
                //Recebendo a materia
                materia = new String(JOptionPane.showInputDialog(null, "Informe a materia do aluno " + nome));
                Materia.add(materia);


                media=(nota1+nota2) / 2;
                Media.add(media);

            }

        }while(!nome.equals(""));

        for(int i = 0; i < Alunos.size(); i++){
            JOptionPane.showMessageDialog(null, "Aluno: " + Alunos.get(i) + "\nPrimeira nota: " + Nota1.get(i)+ "\nSegunda nota: "+Nota2.get(i)+ "\nMateria: " + Materia.get(i)+ "\n" + "\nMédia: "+Media.get(i));
        }
    }
}