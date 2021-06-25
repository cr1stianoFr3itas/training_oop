/*
   Dev. Cristiano Freitas
   email: junior.brown.eda@gmail.com
   Data de inicio do projeto: 18/06/2021
   Data de "Final" do projeto: 18/06/2021
   

*/




package veiculos;



public class intro {



        public static void main (String[] args) {

            quatroporquatro quatroporquatro  = new quatroporquatro("BMW");



            quatroporquatro.setAno("1994");
            quatroporquatro.setVariante("Braco");
            quatroporquatro.setModelo("G3CG");
            quatroporquatro.setTracao("4 RODAS");
            quatroporquatro.setValorVenal(55.0);

            System.out.println(quatroporquatro.getMarca());
            System.out.println(quatroporquatro.getAno());
            System.out.println(quatroporquatro.getModelo());
            System.out.println(quatroporquatro.getVariante());
            System.out.println(quatroporquatro.getTracao());
            System.out.println(quatroporquatro.calculoipva());



        }


}
