public class Lampada {

  boolean ligada;

  Lampada (){
    
    ligada = false;
    
  }

  public void ligar (){
    
    ligada =  true;
    
  }

  public void desligar (){
    
    ligada = false;
    
  }

  public String mostrar (){

    if (ligada == true){
      return ("Lâmpada acesa");
    }

    else {
      return ("Lâmpada desligada");
      
    }
  }
}
