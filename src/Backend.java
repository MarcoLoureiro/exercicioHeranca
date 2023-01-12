public class Backend extends Desenvolvedor{

    private String bancoDeDados;

    public Backend(String nome, Integer idade){
        super(nome,idade);
    }

    private void modelaBanco(){

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
