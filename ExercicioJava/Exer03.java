package ExercicioJava;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso: ");
        aluno.setCurso(scan.next());

        System.out.println("Entre com a matrícula: ");
        aluno.setMatricula(scan.next());


        for(int i=0; i<aluno.getDisciplinas().length; i++){
            System.out.println("Entre com o nome da disciplina: " + (i+1));
            aluno.setDisciplinasPos(i,scan.next());
        }

        for(int i=0; i<aluno.getNotasDisciplina().length; i++){
            System.out.println("Obtendo notas da disciplina: " + aluno.getDisciplinas()[i]);

            for(int j=0; j<aluno.getNotasDisciplina()[i].length; j++){
                System.out.println("Entre com a nota" + (j+1));
                aluno.setNomePosIJ(i,j,scan.nextDouble());
            }
        }
        aluno.mostrarInfor();

        for(int i=0; i<aluno.getDisciplinas().length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - foi aprovado");
            } else{
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + "- reprovado");
            }
        }
    }

}
