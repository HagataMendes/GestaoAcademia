import models.Academia;
import models.Cliente;
import models.Instrutor;

import java.lang.instrument.Instrumentation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Academia academiaSenai = new Academia("Jva Senai Fitnes");

        Cliente clienteSenai = new Cliente("Ronaldo", 44, "Plus++");
        Cliente clienteSenai2 = new Cliente("Marcio", 45, "Basico");
        Cliente clienteSenai3 = new Cliente("Manoel", 74, "Premium");

//        Instrutor InstrutorSenai = new Instrutor("João", 50,"Musculação");
//        Instrutor InstrutorSena2 = new Instrutor("Matheus", 50,"Musculaão");
//        Instrutor InstrutorSena3 = new Instrutor("Maria", 50,"Pilates");
//

        academiaSenai.adicionarPessoa(clienteSenai);
        academiaSenai.adicionarPessoa(clienteSenai2);
        academiaSenai.adicionarPessoa(clienteSenai3);

        System.out.println("________________________________");

    }
}
