package atividade;

import java.util.*;

    public class lojaGuabiraba {

        public static void main(String[] args){

                //LOJA GUABIRABA PRODUTOS PRIMEIRO SEMESTRE

                primeiroSemestre primeirosemestre = new primeiroSemestre();

                System.out.println("INICIO PRIMEIRO SEMESTRE...");
                System.out.println("\n");

                // VALORES DOS PRODUTOS QUE FORAM VENDIDOS

                primeirosemestre.setValorDoProduto(3.50);
                primeirosemestre.setValorDoProduto(3.50);

                Double totalPimeiroSemestre = primeirosemestre.getValorDoProduto() + primeirosemestre.getValorDoProduto();

                primeirosemestre.setVendasPrimeiroSemestre(totalPimeiroSemestre);


                System.out.println("VALOR TOTAL DAS VENDAS DO PRIMEIRO SEMESTRE: R$" + totalPimeiroSemestre);
                System.out.println("\n");


                // LOJA GUABIRABA PRODUTOS SEGUNDO SEMESTRE

                Scanner scn = new Scanner(System.in);

                segundoSemestre segundosemestre = new segundoSemestre();

                System.out.println("INICIO SEGUNDO SEMESTRE...");
                System.out.println("\n");


                // VARIAVEIS PARA O CALCULO USADO DENTRO DO SWITCH

                // TIPO DE PAGAMENTO A VISTA
                double percentualDeDescontoAvista = 0;
                double produtoComDescontoAvista = 0;

                // TIPO DE PAGAMENTO A PRAZO
                double produtoComDescontoAprazo = 0;
                double percentualDeDescontoAprazo = 0;

                 // VALORES DOS PRODUTOS QUE FORAM VENDIDOS

                 segundosemestre.setValorDoProduto(15.5);
                 segundosemestre.setValorDoProduto(16.5);

                 Double totalVendidoNoSemestre = segundosemestre.getValorDoProduto() + segundosemestre.getValorDoProduto();

                 // TOTAL VENDIDO
                segundosemestre.setVendasSegundoSemestre(totalVendidoNoSemestre);
                System.out.println("\nTOTAL DAS VENDAS DO SEGUNDO SEMESTRE: R$" + totalVendidoNoSemestre );


            for(int i = 0; i<2 ; i++) {

                     // SE O PAGAMENTO A VISTA ESCREVER NUMERO "1" E SE O PAGAMENTO FOR A PRAZO ESCREVER NUMERO "2"

                     System.out.print("\nFORMA DE PAGAMENTO: ");
                     String tipoDePagamento = scn.nextLine().toUpperCase();
                     System.out.print("\n");


                     switch (tipoDePagamento) {


                         case "V":
                             percentualDeDescontoAvista = totalVendidoNoSemestre * segundosemestre.getValorDescontoAvista();
                             System.out.println("PERCENTUAL DE DESCONTO: R$" + percentualDeDescontoAvista);

                             System.out.println("VALOR DO DESCONTO %" + segundosemestre.getValorDescontoAvista());

                             produtoComDescontoAvista = totalVendidoNoSemestre - percentualDeDescontoAvista;
                             System.out.println("VALOR LIQUIDO: R$" + produtoComDescontoAvista);

                             break;


                         case "P":
                             percentualDeDescontoAprazo = totalVendidoNoSemestre * segundosemestre.getValorDescontoAprazo();
                             System.out.println("PERCENTUAL DE DESCONTO: R$" + percentualDeDescontoAprazo);

                             System.out.println("VALOR DO DESCONTO %" + segundosemestre.getValorDescontoAprazo());

                             produtoComDescontoAprazo = totalVendidoNoSemestre - percentualDeDescontoAprazo;
                             System.out.println("VALOR LIQUIDO: R$" + produtoComDescontoAprazo);

                             break;

                     }
                 }

                  System.out.println("\n");

                  //TOTAL DE FATURAMENTO NO SEGUNDO SEMESTRE


                  // TOTAL PERCENTUAL DESCONTO A VISTA E A PRAZO
                double valorTotalDesconto = percentualDeDescontoAvista + percentualDeDescontoAprazo;
                System.out.println("TOTAL DOS DESCONTOS: R$" + valorTotalDesconto);

                  // TOTAL LIQUIDO A VISTA E A PRAZO
                double valorTotalLiquido = produtoComDescontoAvista + produtoComDescontoAprazo;
                System.out.println("TOTAL DO LIQUIDO: R$" + valorTotalLiquido);
        }



}
