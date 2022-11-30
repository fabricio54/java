package OrientacaoObjetos.composicao;

public class Main {
    public static void main(String[] args){
        // como se cria uma instância de um objeto (nesse caso com parâmetros por que tem sobrecarga do costrutor ou seja, podemos ou não inicializar com parâmetros)
        Pessoa p1 = new Pessoa("Carla", 33);
        Agenda a = new Agenda();
        a.agendamento(13, 03, "estudos");
        p1.setAgenda(a);

        p1.exibirValor();
        p1.mostrarAgendamento();
    }
}
