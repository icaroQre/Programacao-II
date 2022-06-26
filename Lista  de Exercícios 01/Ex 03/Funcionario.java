public class Funcionario {

    int horas;
    double valor;

    Funcionario(){

        horas = 5;
        valor = 3.75;
    }

    Funcionario(int horas, double valor){
        this.horas = horas;
        this.valor = valor;
    }

    public double salario(){
        return (horas * valor);
    }

}
