package classes;
import java.io.Serializable;
public class Funcionario implements Serializable {
    public String login;
    public String senha;

    //contrutor
    public Funcionario(String login, String senha) {
        super();
        this.login = login;
        this.senha = senha;
    }
}

