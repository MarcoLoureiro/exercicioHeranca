public abstract class Desenvolvedor {
    private String nome;
    private Integer idade;


//    public Desenvolvedor(){
//
//    }
    public Desenvolvedor(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }



    public Integer getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public abstract void desenvolverAlgo();

    public abstract void prepararAmbiente();
}
