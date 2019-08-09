package projetocarro;

public class Caminhao extends ProjetoCarro {

    Caminhao() {
        this.status = false;

        this.modelo = "Merceds";
        this.cor = "Preto";
        this.velocidade = 0;
        this.precoCombustivel = 4f;
        this.nivelCombustivel = 80;
        this.capacidadeTanque = 80;
    }

    @Override
    public void abastecer() {
        int qntAbastecido;
        if (this.status == false) {
            qntAbastecido = this.capacidadeTanque - nivelCombustivel;
            System.out.println("Coube " + qntAbastecido + " L" + " Valor total: " + qntAbastecido * this.precoCombustivel);
        } else {
            System.out.println("Caminhão está ligado, desligue o caminhão para abastecer!");
        }
    }

    @Override
    public void acelerar() {
        if (this.status == true) {
            this.velocidade = this.velocidade + 10;
            System.out.println("Velocidade: " + this.velocidade + " km/h");
            this.nivelCombustivel = this.nivelCombustivel - 8;
            if (this.nivelCombustivel <= 0) {
                System.out.println("Caminhão parado, favor abastecer!");
            }
        }
    }
}
