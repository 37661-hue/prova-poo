
package app;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class TesteLocadora {

    public static void main(String[] args) {

        // Não podemos criar um Veiculo diretamente,
        // porque ele é uma classe abstrata.
        // Veiculo v = new Veiculo("ABC1234", "Genérico", 100);

        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("ABC1234", "Onix", 150));
        veiculos.add(new Moto("DEF5678", "Honda CG", 80));
        veiculos.add(new Moto("GHI9012", "Yamaha", 80));

        CarroEletrico eletrico = new CarroEletrico(
            "JKL3456", "BYD Dolphin", 200, 10
        );

        veiculos.add(eletrico);

        int[] dias = {3, 4, 5, 3};

        System.out.println("=== LOCADORA ESTRADA LIVRE ===");

        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo v = veiculos.get(i);

            v.imprimirResumo();

            System.out.println("Valor do aluguel: R$ "
                + v.calcularAluguel(dias[i]));

            System.out.println();
        }

        System.out.println("=== RECARGA ===");

        List<Eletrico> eletricos = new ArrayList<>();
        eletricos.add(eletrico);

        for (Eletrico e : eletricos) {
            System.out.println("Custo da recarga: R$ "
                + e.calcularRecarga(3));
        }
    }
}
