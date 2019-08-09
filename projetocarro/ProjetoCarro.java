package projetocarro;

public abstract class ProjetoCarro implements Veiculo {

    protected String cor;
    protected float precoCombustivel;
    protected int nivelCombustivel;
    protected String modelo;
    protected int velocidade;
    protected boolean status;
    protected int capacidadeTanque;

    public void ligar() {
        if (this.status == true) {
            System.out.println("O veiculo já está ligado");
        } else {
            this.status = true;
            System.out.println("Veiculo ligado");
        }
    }

    public void desligar() {
        if (this.status == false) {
            System.out.println("Veículo já está Desligado");
        } else {
            this.status = false;
            System.out.println("Veiculo Desligado");
        }
    }

    public void trocarPneu() {
        if (this.status == false) {
            System.out.println("Pneu trocado");
        } else {
            System.out.println("Carro está ligado");
        }

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPrecoCombustivel() {
        return precoCombustivel;
    }

    public void setPrecoCombustivel(float precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }

    public int getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(int nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
