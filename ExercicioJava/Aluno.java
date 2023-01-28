package ExercicioJava;
//exer03
public class Aluno {
    //criação dos atributos

    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas = new String[3];
    private double[][] notasDisciplina = new double [3][4];

    //criando construtores

    public Aluno() {
    }

    public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notasDisciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notasDisciplina = new double [3][4];
    }

    //criando get and set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotasDisciplina(){
        return notasDisciplina;
    }

    public void setNotasDisciplina(double[][] notasDisciplina){
        this.notasDisciplina = notasDisciplina;
    }

    //criando os métodos para praticar ações dentro da classe

    public void mostrarInfor(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);

        for(int i=0; i < notasDisciplina.length; i++ ){
            System.out.println("Notas da disciplina: " + disciplinas[i]);
            for(int j=0; j < notasDisciplina[i].length; j++ ){
                System.out.print(notasDisciplina[i][j] + " ");
            }
            System.out.println();
        }
    }
    //verificar se foi aprovado
     public boolean verificarAprovado(int indice){
        if(obterMedia(indice) >= 7){
            return true;
        }
        return false;
    }

    private double obterMedia(int indice){
        double soma=0;
        for(int i=0; i<notasDisciplina[indice].length; i++){
            soma += notasDisciplina[indice][i];
        }

        double media = soma/4;
        return media;
    }

    public void setDisciplinasPos(int posicao, String disciplinas){
        this.disciplinas[posicao] = disciplinas;
    }

    public void setNomePosIJ(int posI, int posJ, double nota){
        this.notasDisciplina[posI][posJ] = nota;
    }
}
