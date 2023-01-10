package exercicios.questao2;

import java.util.ArrayList;

public class Coqueteis implements BebidasPuras, Adicionais{

    private String bebidaPura = "-";
    private ArrayList <String> adicionais = new ArrayList<String>();

    @Override
    public void adicionalElemento(String adicional) {
        this.adicionais.add(adicional);
        
    }

    @Override
    public String retornaAdicional() {
        // TODO Auto-generated method stub
        String conjunto = "";
        for (String adicional : this.adicionais) {
            conjunto = conjunto + "+" + adicional;
        }
        return conjunto;
    }

    @Override
    public void bebidaPura(String bebida) {
        // TODO Auto-generated method stub
        this.bebidaPura = bebida;
    }

    @Override
    public String retornaBebida() {
        // TODO Auto-generated method stub
        return bebidaPura;
    }

    public void apresentaCoquetel(){
        System.out.print("Nova Bebida: "+bebidaPura);
        for (String adicional : this.adicionais) {
            System.out.print(" + "+adicional);
        }
    }
    

}
