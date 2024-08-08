/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pessoa;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author igor
 */
public class FuncionarioTest {
    

    @Test
    public void deveCalcularOSalarioAcrescidoDeDezPorCentoQuandoConsultarOSlarioComBonificacao(){
         //arrange
        Funcionario joao = new Gerente("Joao Paulo de Oliveria", "1235", "1234", "1234");
        joao.setSalario(1000);
        double salarioComBonficacaoEsperado = 1100;

        // act

        double salarioCalculadoComBonus = joao.getSalarioComBonus();


        //assert
        Assertions.assertEquals(salarioComBonficacaoEsperado, salarioCalculadoComBonus, 0.01 );
    }

    @Test
    public void deveCalcularSalarioCorretamenteQuandoOBonusForInformado(){
        //arrange
        Funcionario joao = new Vendedor("Joao Paulo de Oliveria", "1235", "1234", "1234");
        joao.setSalario(1000);
        double salarioComBonficacaoEsperado = 1150;

        // act

        double salarioCalculadoComBonus = joao.getSalarioComBonus(15);


        //assert
        Assertions.assertEquals(salarioComBonficacaoEsperado, salarioCalculadoComBonus, 0.01 );
    }
    
}
