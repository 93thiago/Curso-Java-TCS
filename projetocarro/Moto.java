package projetocarro;

public class Moto extends ProjetoCarro {

    Moto() {
        this.status = false;

        this.modelo = "Honda";
        this.cor = "Vermelho";
        this.velocidade = 0;
        this.precoCombustivel = 4f;
        this.nivelCombustivel = 20;
        this.capacidadeTanque = 20;
    }

    @Override
    public void abastecer() {
        int qntAbastecido;
        if (this.status == false) {
            qntAbastecido = this.capacidadeTanque - nivelCombustivel;
            System.out.println("Coube " + qntAbastecido + " L" + " Valor total: " + qntAbastecido * this.precoCombustivel);
        } else {
            System.out.println("Moto está ligada, desligue a moto para abastecer!");
        }
    }

    @Override
    public void acelerar() {
        if (this.status == true) {
            this.velocidade = this.velocidade + 10;
            System.out.println("Velocidade: " + this.velocidade + " km/h");
            this.nivelCombustivel = this.nivelCombustivel - 2;
            if (this.nivelCombustivel <= 0) {
                System.out.println("Moto parada, favor abastecer!");
            }
        }
    }

}
