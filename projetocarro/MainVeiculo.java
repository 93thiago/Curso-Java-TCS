package projetocarro;

import java.util.Scanner;

public class MainVeiculo {

    public static void main(String[] args) {

        Carro car = null;
        Caminhao cam = null;
        Moto mot = null;
        int opcao, funcao;

        do {
            System.out.println("Escolha um veículo ou cancele a operação:");
            System.out.println("0- Cancelar | 1- Carro | 2- Moto | 3- Caminhão");
            Scanner ler = new Scanner(System.in);
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:  //***************Carro*****************************
                    car = new Carro();
                    do {
                        System.out.println("Escolha uma função: 1- Ligar | 2- Desligar | 3- Acelerar | 4- Abastecer | 5- Trocar Pneu | 6- Sair");
                        Scanner ler2 = new Scanner(System.in);
                        funcao = ler2.nextInt();
                        switch (funcao) {
                            case 1:
                                car.ligar();
                                break;
                            case 2:
                                car.desligar();
                                break;
                            case 3:
                                car.acelerar();
                                break;
                            case 4:
                                car.abastecer();
                                break;
                            case 5:
                                car.trocarPneu();
                                break;
                        }
                    } while (funcao != 6);
                    break;
                case 2: //************** Moto ***********
                    mot = new Moto();
                    do {
                        System.out.println("Escolha uma função: 1- Ligar 2- Desligar 3- Acelerar 4- Abastecer 5- Trocar Pneu 6- Sair");
                        Scanner ler2 = new Scanner(System.in);
                        funcao = ler2.nextInt();
                        switch (funcao) {
                            case 1:
                                mot.ligar();
                                break;
                            case 2:
                                mot.desligar();
                                break;
                            case 3:
                                mot.acelerar();
                                break;
                            case 4:
                                mot.abastecer();
                                break;
                            case 5:
                                mot.trocarPneu();
                                break;
                        }
                    } while (funcao != 6);
                    break;
                case 3:     // *****************Caminhao**************** 
                    cam = new Caminhao();
                    do {
                        System.out.println("Escolha uma função: 1- Ligar 2- Desligar 3- Acelerar 4- Abastecer 5- Trocar Pneu 6- Sair");
                        Scanner ler2 = new Scanner(System.in);
                        funcao = ler2.nextInt();
                        switch (funcao) {
                            case 1:
                                cam.ligar();
                                break;
                            case 2:
                                cam.desligar();
                                break;
                            case 3:
                                cam.acelerar();
                                break;
                            case 4:
                                cam.abastecer();
                                break;
                            case 5:
                                cam.trocarPneu();
                                break;
                        }
                    } while (funcao != 6);
                    break;
            }
        } while (opcao != 0);
    }
}
