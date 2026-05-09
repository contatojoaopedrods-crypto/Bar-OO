package Applications;

import java.util.Scanner;

import entities.Bill;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Deseja fechar a conta? ");
        System.out.println("   1 para Sim | 2 para Não");
        int awnser = sc.nextInt();

        switch (awnser) {

            case 1:
                Bill b1 = new Bill();

                System.out.println("======Digite os dados do cliente======");

                System.out.println("Digite M para Mulher ou H para homem");
                b1.setGender(sc.next().charAt(0));

                System.out.println("Quantidade de cervejas consumidas: ");
                b1.setBeer(sc.nextInt());

                System.out.println("Quantidades de refrigerantes consumidos: ");
                b1.setSoftDrink(sc.nextInt());

                System.out.println("Quantidade de espetinhos consumidos: ");
                b1.setBarbecue(sc.nextInt());


                System.out.println("============= CONTA =============");

                System.out.println("___________________________________");
                System.out.println("");

                System.out.printf("Ingresso: %.2f %n", b1.ticket());
                System.out.printf("Consumo: %.2f %n", b1.feeding());
                System.out.printf("Couvert: %.2f %n", b1.couver());

                System.out.println("");
                System.out.println("___________________________________");

                System.out.printf("TOTAL: %.2f %n", b1.total());
           break;
                

            case 2:

            System.out.println("Programa encerrado!");

            break;


            default:

            System.out.println("opção inválida!");

        }

       

       sc.close(); 

    }

}
