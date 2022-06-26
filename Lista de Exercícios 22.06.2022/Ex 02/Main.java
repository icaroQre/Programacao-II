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
