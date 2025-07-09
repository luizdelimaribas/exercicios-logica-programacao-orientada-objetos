//-  uma classe Contato que represente um contato da agenda do celular,
// com nome, telefone e e-mail.


public class Contato {
  private String nome, email;
  private Integer telefone;

  public Contato(String nome, String email, int telefone){
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public String getEmail(){
    return email;
  }
  public void setEmail(String email){
    this.email = email;
  }

  public int getTelefone(){
    return telefone;
  }
  public void setTelefone(Integer telefone){
    this.telefone = telefone;
  }

  public void informoesContato(){
    System.out.println("nome: " + nome + " Email: " + email + " Telefone: " + telefone);
  }
    
}
