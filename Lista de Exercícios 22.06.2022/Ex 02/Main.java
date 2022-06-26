//Crie uma classe chamada Proprietario com os atributos cpf, nome. Os
//campos devem ser encapsulados (privados com gets e sets). Crie um construtor
//vazio e um construtor que receba os valores. Crie uma classe chamada Casa com
//os atributos matricula, endereco, valor e proprietario (do tipo
//Proprietario). Encapsule os campos. Crie um construtor que inicialize os
//campos adequadamente. Mostre como instanciar um objeto do tipo Casa e atribuir
//valor aos campos do objeto.

class Main {
  public static void main(String[] args) {

    Proprietario proprietario = new Proprietario();
    Casa casa = new Casa();

    casa.setMatricula("40028922");
    casa.setEndereco("Rua Abraão Antônio 1061 - Centro");
    casa.setValor("1.000.000");
    proprietario.setNome("o teu pai aqui");
    proprietario.setCpf("131.644.559-33");
    casa.setProprietario(proprietario);
    
    System.out.println(casa.getMatricula());
    System.out.println(casa.getEndereco());
    System.out.println(casa.getValor());
    System.out.println(casa.getProprietario().getNome());
    System.out.println(casa.getProprietario().getCpf());
  }
}
