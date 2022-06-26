public class Data {

  int dia;
  int mes;
  int ano;
  String separador; 

  public Data (){
    dia = 0;
    mes = 0;
    ano = 0;
  } 

  public Data (int ano){

    dia = 19;
    mes = 2;
    this.ano = ano;
    
  }

  public Data(int dia, int mes, int ano){

    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  String formatarData(String separador){

    String data = dia + separador + mes + separador + ano;
    return (data);
    
  }
}
