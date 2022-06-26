//Crie uma classe para a seguinte situação. De um funcionário horista deve-se
//guardar o valor por hora e a quantidade de horas trabalhadas. Deve haver uma
//operação para calcular (e retornar) o salário a receber, sabendo-se que o valor a
//receber é o valor da hora multiplicado pela quantidade de horas.
//Em uma classe de teste com o método main( ):
//Instancie um objeto do tipo funcionário horista, atribua um valor para o salário hora,
//um valor para horas trabalhadas e chame o método para calcular salário (mostre o
//salário calculado).
  
public class Main {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario;
        funcionario = new Funcionario(5, 3.75);

        System.out.println(funcionario.salario());
    }
}
