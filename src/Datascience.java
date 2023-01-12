import java.util.ArrayList;
import java.util.List;

public class Datascience extends Desenvolvedor{

    private List<String> relatoriosFeitos = new ArrayList<>();


    public void prepararRelatorio(String nomeArquivoCsv){

    }

    public Datascience(String nome, Integer idade){
        super(nome,idade);
    }

    public List<String> getRelatoriosFeitos() {
        return relatoriosFeitos;
    }

    public void setRelatoriosFeitos(List<String> relatoriosFeitos) {
        this.relatoriosFeitos = relatoriosFeitos;
    }

    @Override
    public void desenvolverAlgo() {
        System.out.println("Gerar dashboard a partir de análise exploratória");
    }

    @Override
    public void prepararAmbiente() {
        System.out.println("Filtrar dados");
    }
}
