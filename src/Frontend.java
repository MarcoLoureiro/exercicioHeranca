public class Frontend extends Desenvolvedor {

    private Boolean isDesenvolveTelasResponsivas;


    private String ferramentaTesteFrontend;

    public Frontend(String nome, Integer idade){
        super(nome,idade);
    }

    public Boolean getDesenvolveTelasResponsivas() {
        return isDesenvolveTelasResponsivas;
    }

    public void setDesenvolveTelasResponsivas(Boolean desenvolveTelasResponsivas) {
        isDesenvolveTelasResponsivas = desenvolveTelasResponsivas;
    }

    public String getFerramentaTesteFrontend() {
        return ferramentaTesteFrontend;
    }

    public void setFerramentaTesteFrontend(String ferramentaTesteFrontend) {
        this.ferramentaTesteFrontend = ferramentaTesteFrontend;
    }

    @Override
    public void desenvolverAlgo() {
        System.out.println("Constrói landing page!");
    }

    @Override
    public void prepararAmbiente() {
        System.out.println("Projeta layout no Figma");
    }
}
