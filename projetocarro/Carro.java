package projetocarro;

public class Carro extends ProjetoCarro {

    Carro() {
        this.status = false;

        this.modelo = "i30";
        this.cor = "Azul";
        this.velocidade = 0;
        this.precoCombustivel = 4f;
        this.nivelCombustivel = 40;
        this.capacidadeTanque = 40;
    }

    @Override
    public void abastecer() {
        int qntAbastecido;
        if (this.status == false) {
            qntAbastecido = this.capacidadeTanque - nivelCombustivel;
            System.out.println("Coube " + qntAbastecido + " L" + " Valor total: " + qntAbastecido * this.precoCombustivel);
        } else {
            System.out.println("Carro está ligado, desligue o carro para abastecer!");
        }
    }

    @Override
    public void acelerar() {
        if (this.status == true) {
            this.velocidade = this.velocidade + 10;
            System.out.println("Velocidade: " + this.velocidade + " km/h");
            this.nivelCombustivel = this.nivelCombustivel - 4;
            if (this.nivelCombustivel <= 0) {
                System.out.println("Carro parado, favor abastecer!");
            }
        }
    }

}
