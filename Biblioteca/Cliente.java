package Biblioteca;

public class Cliente {
    private String nome, email;
    private int telefone;

    
    public Cliente(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }


    public int getTelefone() {
        return telefone;
    }

@Override
public String toString(){
    return "Cliente: " + nome + " (" + email + "), Tel: " + telefone;
}

    
}
