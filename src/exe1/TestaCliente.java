package exe1;
public class TestaCliente {
    public static void main(String[] args) throws Exception {
        Cliente obj1 = new Cliente("123456-7", "1234-5", "Fulano", 0);
        obj1.depositar(1000f);
        obj1.sacar(500);
        System.out.println(obj1.toString());

        Cliente obj2 = new Cliente("123456-78", "124-5", "Beltrano", 0);
        obj2.depositar(1000f);
        obj2.sacar(1500);
        System.out.println(obj2.toString());
    }
}
