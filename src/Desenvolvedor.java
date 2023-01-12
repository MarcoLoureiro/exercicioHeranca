public abstract class Desenvolvedor {
    private String nome;
    private Integer idade;


    public Desenvolvedor() {

    }

    public Desenvolvedor(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }


    public void alterarDadosDesenvolvedor(String nome, Integer idade) {
        setNome(nome);
        setIdade(idade);
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


    public boolean equals(Object nome) {
        System.out.println("Comparando...");

        if (this == nome) {
            return true;
        } else if (nome instanceof String) {
            return nome.equals(getNome());
        } else {
            return false;
        }
    }

}
