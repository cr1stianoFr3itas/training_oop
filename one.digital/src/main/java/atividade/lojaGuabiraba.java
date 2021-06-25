/*
   Dev. Cristiano Freitas
   email: junior.brown.eda@gmail.com
   Data de inicio do projeto: 22/06/2021
   Data de "Final" do projeto: 23/06/2021
   

*/

package atividade;

import java.util.*;
import java.text.*;

    public class lojaGuabiraba {

        public static void main(String[] args){

                //LOJA GUABIRABA PRODUTOS PRIMEIRO SEMESTRE

                primeiroSemestre primeirosemestre = new primeiroSemestre();

                System.out.println(" INICIO PRIMEIRO SEMESTRE...");
                System.out.println("\n");

                // VALORES DOS PRODUTOS QUE FORAM VENDIDOS DURANTE O SEMESTRE

                primeirosemestre.setValorDoProduto(3.50);
                primeirosemestre.setValorDoProduto(3.50);

                // TOTAL ADQUIRIDO NO SEMESTRE

                Double totalPimeiroSemestre = primeirosemestre.getValorDoProduto() + primeirosemestre.getValorDoProduto();

                primeirosemestre.setVendasPrimeiroSemestre(totalPimeiroSemestre);


                System.out.println(" VALOR TOTAL DAS VENDAS DO PRIMEIRO SEMESTRE: R$" + totalPimeiroSemestre);
                System.out.println("\n");


                // LOJA GUABIRABA PRODUTOS SEGUNDO SEMESTRE

                Scanner scn = new Scanner(System.in);
                DecimalFormat dcf = new DecimalFormat("#.###");

                segundoSemestre segundosemestre = new segundoSemestre();

                System.out.println(" INICIO SEGUNDO SEMESTRE...");
                System.out.println("\n");


                // VARIAVEIS PARA O CALCULO USADO DENTRO DO SWITCH

                // TIPO DE PAGAMENTO A VISTA
                double percentualDeDescontoAvista = 0;
                double produtoComDescontoAvista = 0;
                double valorDescontoObtidoAvista = 0;

                // TIPO DE PAGAMENTO A PRAZO
                double produtoComDescontoAprazo = 0;
                double percentualDeDescontoAprazo = 0;
                double valorDescontoObtidoAprazo = 0;

                 // VALORES DOS PRODUTOS QUE FORAM VENDIDOS DURANTE O SEMESTRE

                 segundosemestre.setValorDoProduto(15.5);
                 segundosemestre.setValorDoProduto(15.5);

                 // TOTAL ADQUIRIDO NO SEMESTRE
                 Double totalVendidoNoSemestre = segundosemestre.getValorDoProduto() + segundosemestre.getValorDoProduto();


                segundosemestre.setVendasSegundoSemestre(totalVendidoNoSemestre);
                System.out.println("\n TOTAL DAS VENDAS DO SEGUNDO SEMESTRE: R$" + totalVendidoNoSemestre );


            for(int i = 0; i<2 ; i++) {

                     // SE O PAGAMENTO A VISTA ESCREVER NUMERO "1" E SE O PAGAMENTO FOR A PRAZO ESCREVER NUMERO "2"

                     System.out.print("\n FORMA DE PAGAMENTO: ");
                     String tipoDePagamento = scn.nextLine().toUpperCase();
                     System.out.print("\n");


                     switch (tipoDePagamento) {


                         case "V":
                             // CALCULOS FEITO COM O VALOR TOTAL DA COMPRA
                             percentualDeDescontoAvista = totalVendidoNoSemestre * segundosemestre.getValorDescontoAvista();
                             System.out.println(" VALOR PORCENTAGEM DO DESCONTO: R$" + percentualDeDescontoAvista);

                             produtoComDescontoAvista = totalVendidoNoSemestre - segundosemestre.getValorDescontoAvista();
                             System.out.println(" VALOR LIQUIDO: R$" + produtoComDescontoAvista);

                             valorDescontoObtidoAvista = produtoComDescontoAvista / totalVendidoNoSemestre;
                             System.out.println(" VALOR DO DESCONTO OBTIDO: R$" + dcf.format(valorDescontoObtidoAvista));


                             break;


                         case "P":
                             // CALCULOS FEITO COM O VALOR TOTAL DA COMPRA
                             percentualDeDescontoAprazo = totalVendidoNoSemestre * segundosemestre.getValorDescontoAprazo();
                             System.out.println(" VALOR PORCENTAGEM DO DESCONTO: R$" + dcf.format(percentualDeDescontoAprazo));

                             produtoComDescontoAprazo = totalVendidoNoSemestre - segundosemestre.getValorDescontoAprazo();
                             System.out.println(" VALOR LIQUIDO: R$" + dcf.format(produtoComDescontoAprazo));

                             valorDescontoObtidoAprazo = produtoComDescontoAprazo / totalVendidoNoSemestre;
                             System.out.println(" VALOR DO DESCONTO OBTIDO: R$" + dcf.format(valorDescontoObtidoAprazo));

                             break;

                     }
                 }

                  System.out.println("\n");

                  //TOTAL DE FATURAMENTO NO SEGUNDO SEMESTRE


                  // TOTAL PERCENTUAL DESCONTO A VISTA E A PRAZO
                double valorTotalDesconto = percentualDeDescontoAvista + percentualDeDescontoAprazo;
                System.out.println("TOTAL DOS DESCONTOS: R$" + dcf.format(valorTotalDesconto));

                  // TOTAL LIQUIDO A VISTA E A PRAZO
                double valorTotalLiquido = produtoComDescontoAvista + produtoComDescontoAprazo;
                System.out.println("TOTAL DO LIQUIDO: R$" + valorTotalLiquido);
        }



}
