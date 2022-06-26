//2. Crie uma classe Data que tenha três campos: dia, mes e ano. Crie três
//construtores:
//- um vazio
//- um construtor que recebe o ano (neste caso, os campos dia e mes devem ser
//iniciados com 1)
//- um construtor que recebe três parâmetros.
//Crie um método formatarData( ) que recebe como parâmetro o separador e
//retorna a data formatada. Exemplo:
//- se for passado o caractere “/”, o retorno será 1/6/2021
//- se for passado o caractere “-”, o retorno será 1-6-2021
//Crie um método main( ) e mostre:
//- como criar objetos utilizando os construtores criados.
//- como chamar o método e exibir o resultado
//Observação: não utilize nenhuma das classes de data da linguagem Java.

public class Main {
  public static void main(String[] args) {

  Data data = new Data();
    System.out.println(data.formatarData("/"));
    
  Data data2 = new Data(2003);
    System.out.println(data2.formatarData("/"));
    
  Data data3 = new Data(11,11,2003);
    System.out.println(data3.formatarData("/"));

  }
}
