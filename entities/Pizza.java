package entities;

public class Pizza {
    public String nome;
    public double valor;
    public boolean borda;

    public double CalculaPreco(){

        if (borda)
            return valor + 5;
        else
            return valor;

    }

}
