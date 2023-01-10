public class TestDoc {
    public static void main(String[] args){
      Doc cachorro = new Doc();
      Doc cachorro2 = new Doc();
      
      cachorro.tamanho = 50;
      cachorro.raca = "Puddow";
      cachorro.latir();

      cachorro2.tamanho = 60;
      cachorro2.raca = "Pitbull";
      cachorro2.latir();
    }
}
