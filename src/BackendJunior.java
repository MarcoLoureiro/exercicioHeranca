public final class BackendJunior extends Backend {

    private Boolean hasAutorizacao;

    public BackendJunior(String nome, Integer idade) {
        super(nome, idade);
    }

    public BackendJunior(String nome, Integer idade, Boolean hasAutorizacao) {
        super(nome, idade);
        this.hasAutorizacao = hasAutorizacao;
    }

    public Boolean getHasAutorizacao() {
        return hasAutorizacao;
    }

    public void setHasAutorizacao(Boolean hasAutorizacao) {
        this.hasAutorizacao = hasAutorizacao;
        System.out.println(hasAutorizacao ? getNome() + " autorizado!" : getNome() + " não autorizado!");
    }

    public void realizarPushNaMaster() {
        if(hasAutorizacao != null) {
            System.out.printf(getHasAutorizacao() ?
                            "%s Não faz push na master, pois tem autorização: %g!\n"
                            :
                            "%s Faz push na master, pois tem autorização: %g!\n"
                    , getNome(), getHasAutorizacao());
        }else{
            System.out.println("Não possui autorização alguma cadastrada!");
        }
    }

    public void solicitarAutorizacao(Backend backend) {
        setHasAutorizacao(backend.getBancoDeDados().length() > 0 ? true : false);
    }

}
