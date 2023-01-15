package funcionario;

public class FuncionarioTest {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Leonardo", 2444.34, true, "1234");
        
        System.out.println("Nome: "+f1.getNome()+"\nSalario: "+f1.getSalario()+"\nAtivo: "+f1.isAtivo()+"\nSenha: "+f1.getSenha());
    }
}
