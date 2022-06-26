public class Proprietario{

  private String cpf;
  private String nome;

  Proprietario(){
    cpf ="";
    nome= "";
  }

  Proprietario(String cpf, String nome){

    this.cpf = cpf;
    this.nome = nome;
    
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

    public String getCpf(){
    return this.cpf;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

}
