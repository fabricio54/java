package OrientacaoObjetos.composicao;

public class Agenda {
    private int dia;
    private int mes;
    private String tarefa;

    /*
    // construtor 
    public Agenda(){

    }
    
    public Agenda(int dia, int mes, String tarefa){
        this.dia = dia;
        this.mes = mes;
        this.tarefa = tarefa;

        validaData(dia, mes);

    }

    private void validaData(int dia, int mes){
        if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12)){
            System.out.println("Data agendada: dia "+dia+" Mês: "+mes+" Tarefa: "+tarefa);
        }else{
            System.out.println("Data inválida");
        }
    }

    */

    //composição

    public void agendamento(int dia, int mes, String tarefa){
        validaData(dia, mes, tarefa);
    }

    private void validaData(int dia, int mes, String tarefa){
        if((dia >= 1 && dia <= 31) && (mes>=1 && mes <= 12)){
            this.dia = dia;
            this.mes = mes;
            this.tarefa = tarefa;
        }else{
            System.out.println("Data inválida!!!");
        }
    }
    
    public void mostrarAgenda(){
        System.out.println("Dia: "+dia+" Mês: "+mes+" Tarefa: "+tarefa);
    }
}
