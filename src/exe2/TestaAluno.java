package exe2;
public class TestaAluno{
    public static void main(String[] args) {
        Aluno obj1 = new Aluno("123456", "Julio", 17, 9, 10);

        //obj1.dadosAluno();
        System.out.println(obj1.toString());
        obj1.notaFinal();
        
        Aluno obj2 = new Aluno("12345", "Maria", 0, 3, 0);
        
        System.out.println(obj2.toString());
        obj2.notaFinal();
    }
}
