public class Main {
    public static void main(String[] args) {
        Desenvolvedor devBackend = new Backend("Fernando",27); // Classes filhas normais
        Desenvolvedor devFrontend = new Frontend("Carlos",37);
        Desenvolvedor devFrontend2 = new Frontend("Fernando", 23);
        Desenvolvedor analistaDados = new Datascience("Alberto",39);

        Desenvolvedor devBackendJr = new BackendJunior("João",22); // Classe final

        System.out.println(devBackend.equals(devFrontend2.getNome())); // Implementação equals na classe abstrata Desenvolvedor

        devBackend.desenvolverAlgo(); // Override de metodos nas classes filhas
        devFrontend.desenvolverAlgo();
        devBackend.prepararAmbiente();
        devFrontend.prepararAmbiente();

    }
}