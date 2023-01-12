public class Backend extends Desenvolvedor {

    private String bancoDeDados;

    public Backend(String nome, Integer idade) {
        super(nome, idade);
    }

    public Backend(String nome, Integer idade, String bancoDeDados) {
        super(nome, idade);
        this.bancoDeDados = bancoDeDados;
    }

    public void modelarBanco(String bancoDeDados) {
        setBancoDeDados(bancoDeDados);
        System.out.printf("%s está modelando banco %s !\n", getNome(), getBancoDeDados());
    }

    public String getBancoDeDados() {
        return bancoDeDados;
    }

    public void setBancoDeDados(String bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }


    @Override
    public void desenvolverAlgo() {
        System.out.println("Construindo API!");
    }

    @Override
    public void prepararAmbiente() {
        System.out.println("Realizar modelagem de dados");
    }
}
