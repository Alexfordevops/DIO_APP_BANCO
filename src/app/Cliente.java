package app;

public class Cliente implements ClienteAdmin{

    //Constantes
    private static int CLIENTEID = 0;
    private static int MUDARNOMETRANSACID = 0;

    //Atributos
    private static String nome;
    private static int id;

    //Métodos ClienteAdmin
    @Override
    public void mudarNome(Cliente cliente, String nome){
        cliente.setNome(nome);
        int transacId = this.MUDARNOMETRANSACID++;
        System.out.print("ALTERAÇÃO NOME TITULAR EFETUADA || ");
        System.out.println(String.format("ID TRANSAÇÃO: %d", transacId));
    };

    //Construtores
    public Cliente() {
        this.nome = null;
        this.id = CLIENTEID++;
    }

    //Getters and Setters
    public static String getNome() {
        return nome;
    }
    public static void setNome(String nome) {
        Cliente.nome = nome;
    }
    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Cliente.id = id;
    }
}
