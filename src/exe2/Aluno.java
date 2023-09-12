package exe2;

public class Aluno {
    private String numeroAluno;
    private String nome;
    private int idade;
    private float p1, p2;

    // Construtor
    public Aluno(String numeroAluno, String nome, int idade, float p1, float p2){
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    

    // Setters
    public void setNumeroAluno(String numeroAluno) {
        if (numeroAluno.length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            this.numeroAluno = "";
            System.out.println("Número do aluno inválido");
        }
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            this.nome = "";
            System.out.println("Nome do aluno inválido");
        }
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            this.idade = 0;
            System.out.println("Idade inválida");
        }
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            this.p1 = 0;
            System.out.println("Nota P1 inválida");
        }
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            this.p2 = 0;
            System.out.println("Nota P2 inválidada");
        }
    }

    // Getters
    public String getNumeroAluno() {
        return numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }

    // Expecíficos
    public void notaFinal(){
        float media;

        media = (this.getP1() + this.getP2()) / 2;
        
        System.out.format("Nota final é: %.2f" + "\n", media);
    }

    public void dadosAluno(){
        System.out.format("Número Aluno: %s" + "\n"+ "Nome: %s" + "\n" + "Idade: %d"+ "\n", this.getNumeroAluno(), this.getNome(), this.getIdade());
    }


    @Override
    public String toString() {
        return "Aluno [numeroAluno=" + numeroAluno + ", nome=" + nome + ", idade=" + idade + ", p1=" + p1 + ", p2=" + p2
                + "]";
    }
    
    
}
