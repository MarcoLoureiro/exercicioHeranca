import java.util.ArrayList;
import java.util.List;

public class Datascience extends Desenvolvedor {

    private List<String> relatoriosFeitos = new ArrayList<>();

    public Datascience(String nome, Integer idade) {
        super(nome, idade);
    }

    public Datascience(String nome, Integer idade, List<String> relatoriosFeitos) {
        super(nome, idade);
        this.relatoriosFeitos = relatoriosFeitos;
    }

    public void prepararRelatorio(String nomeArquivoCsv) {
        List<String> listaDeRelatoriosTemporaria = new ArrayList<>();
        listaDeRelatoriosTemporaria.add(nomeArquivoCsv);

        setRelatoriosFeitos(listaDeRelatoriosTemporaria);
        System.out.println(getRelatoriosFeitos());
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
