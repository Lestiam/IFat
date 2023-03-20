package entities;

public class Hamburguer {
    public String nome;
    public double valor;
    public boolean artesanal;

    public double CalculaPreco(){

        if (artesanal)
            return valor + 8;
        else
            return valor;

    }
}
