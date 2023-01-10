package exercicios;

public class Volkswagen implements ProjetoCarro{

    private String montadora = "Volkswagen";
    private String modelo;
    private double versao;
    private boolean automatico;
    
    
    @Override
    public void modeloCarro(String modelo) {
        // TODO Auto-generated method stub
        this.modelo = modelo;
    }

    @Override
    public void versaoCarro(double versao) {
        // TODO Auto-generated method stub
        this.versao = versao;
    }

    @Override
    public void automaticoCarro(boolean automatico) {
        // TODO Auto-generated method stub
        this.automatico = automatico;
    }

    @Override
    public String retornaMontadora() {
        // TODO Auto-generated method stub
        return montadora;
    }

    @Override
    public String retornaModelo() {
        // TODO Auto-generated method stub
        return modelo;
    }

    @Override
    public double retornaVersao() {
        // TODO Auto-generated method stub
        return versao;
    }

    @Override
    public boolean retornaOpcao() {
        // TODO Auto-generated method stub
        return automatico;
    }
}