public class Usuario{

    private String email;
    private String senha;
    Perfil perfil;

    public Usuario(String email, String senha, Perfil perfil){
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

    public void imprimeDados(){
        this.perfil.imprimeDados();
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
}