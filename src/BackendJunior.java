public final class BackendJunior extends Backend {

    private Boolean hasAutorizacao;

    public BackendJunior(String nome, Integer idade){
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

    public void realizarPushNaMaster(Boolean hasAutorizacao) {
        System.out.printf(hasAutorizacao ?
                        "%s Não faz push na master, pois tem autorização: %g!\n"
                        :
                        "%s Faz push na master, pois tem autorização: %g!\n"
                , getNome(), getHasAutorizacao());
    }

    public void autorizarDevBackendJr(Backend backend) {
        setHasAutorizacao(backend.getBancoDeDados().length() > 0 ? true : false);
    }

}
