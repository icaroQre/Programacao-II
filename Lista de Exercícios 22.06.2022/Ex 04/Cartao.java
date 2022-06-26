public class Cartao {

  
        private int saldo;
      
        Cartao(int saldo){
          this.saldo = saldo;
        }
      
        public int getSaldo(){
          return this.saldo;
        }
      
        public int pegarCafe(){
            if(saldo < 1){
                System.out.println("Saldo insuficiente");
                return 1;
            }
            saldo = saldo - 1;  
            System.out.println("Aproveito o café :)");
            return -1;
        }
      
        public void recarregar(int recarga){
      
          saldo = saldo + recarga;
          System.out.println("Recarga de: " + recarga +" realizada com sucesso!");

        }
      
      }
