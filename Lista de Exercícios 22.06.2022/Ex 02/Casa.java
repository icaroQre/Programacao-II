public class Casa{
  private String matricula;
  private String endereco;
  private String valor;
  private Proprietario proprietario;

  Casa(){
    
  matricula = "";
  endereco = "";
  valor = "";
  proprietario = new Proprietario();
    
  }

  public String getMatricula(){
    return this.matricula;
  }
  public void setMatricula(String matricula){
    this.matricula = matricula;  
  }
  
  public String getEndereco(){
    return this.endereco;
  }
  public void setEndereco(String endereco){
    this.endereco = endereco;  
  }
  
  public String getValor(){
    return this.valor;
  }
  public void setValor(String valor){
    this.valor = valor;  
  }

  public Proprietario getProprietario(){
    return this.proprietario;
  }
  public void setProprietario(Proprietario proprietario){
  this.proprietario = proprietario;  
  }
  
}
