package application;

import entities.Hamburguer;
import entities.Pizza;

import javax.swing.*;
import java.util.Locale;

public class Restaurant {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int menu = 3;
        String verifica = "";

        Pizza pizza = new Pizza();
        Hamburguer hamburguer = new Hamburguer();

        menu = Integer.parseInt(JOptionPane.showInputDialog(null,"1.Hamburguer \n2.Pizza \n3.Sair", "Informe o pedido", JOptionPane.PLAIN_MESSAGE));

        switch (menu){
            case 1:
                hamburguer.nome = JOptionPane.showInputDialog("Digite o nome do pedido:");

                verifica = JOptionPane.showInputDialog("Artesanal? s/n");

                if (verifica.equals("s")) {
                    hamburguer.artesanal = true;
                }
                else
                    hamburguer.artesanal = false;

                hamburguer.valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do pedido: "));
                JOptionPane.showMessageDialog(null, "O seu pedido " + hamburguer.nome+ " ficou no valor de: "
                        +hamburguer.CalculaPreco(), "Valor",JOptionPane.INFORMATION_MESSAGE);
                break;

            case 2:
                pizza.nome = JOptionPane.showInputDialog("Digite o nome do pedido:");
                verifica = JOptionPane.showInputDialog("Com borda? s/n");
                if (verifica.equals("s"))
                    pizza.borda = true;
                else
                    pizza.borda = false;

                pizza.valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do pedido: "));
                JOptionPane.showMessageDialog(null,"O seu pedido " + pizza.nome +" ficou no valor de : "
                        + pizza.CalculaPreco(), "Valor" , JOptionPane.INFORMATION_MESSAGE);
                break;

            case 3 :
                JOptionPane.showMessageDialog(null,"Saindo...");
                break;

            default:JOptionPane.showMessageDialog(null,"Opção inválida");

        }


    }
}
