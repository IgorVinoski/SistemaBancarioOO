/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package conta;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pessoa.Pessoa;

/**
 *
 * @author igor
 */

public class ContaTest {
    
@Test
    public void deveAtualizarOSaldoQuandoOcorrerUmSaque(){
        //arrange
        Pessoa igor = new Pessoa("Igor", "123", "123");
        Conta contaIgor = new Conta(123, igor);
        contaIgor.depositar(1000) ;
        double saldoEsperado = 700;

        //act
        contaIgor.sacar(300);

        //assert
        Assertions.assertEquals(saldoEsperado, contaIgor.getSaldo(), 0.01);
    }
    
    
     @Test
    public void deveAtualizarOSaldoQuandoOcorrerUmDeposito(){
        //arrange

        Pessoa igor = new Pessoa("Igor", "123", "123");
        Conta contaIgor = new Conta(123, igor);
        contaIgor.depositar(1000);
        double saldoEsperado = 1500;

        //act
        contaIgor.depositar(500);

        //assert
        Assertions.assertEquals(saldoEsperado, contaIgor.getSaldo(), 0.01);
    }


    @Test
    public  void deveAtualizarOSaldoDaContaDeOrigemQuandoOcorrerUmaTransferencia(){

        //Arrange

        Pessoa igor = new Pessoa("Igor", "123", "123");
        Conta contaIgor = new Conta(123, igor);


        Pessoa paula = new Pessoa("Paula", "123", "123");
        contaIgor.depositar(1000);
        Conta contaPaula = new Conta(456, paula);
        contaPaula.depositar(1000);


        double saldoEsperadoContaOrigem = 400;
        //Act
        contaIgor.transferir(contaPaula, 600);

        //Assert
        Assertions.assertEquals(saldoEsperadoContaOrigem, contaIgor.getSaldo(), 0.01);
    }

    @Test
    public void deveManterOSaldoQuandoOcorrerUmaTentativaDeSaqueSemSaldoFuciente(){

        //Arrange

        Pessoa igor = new Pessoa("Igor", "123", "123");
        Conta contaIgor = new Conta(123, igor);
        contaIgor.depositar(1000);

        double saldoEsperado = 1000;

        //Act
        contaIgor.sacar(1200);

        //Assert

        Assertions.assertEquals(saldoEsperado, contaIgor.getSaldo(), 0.0001);


    }
    @Test
    public  void deveSacarComSucessoQuandoOcorrerUmSaqueComSaldoSuficente(){

        //Arrange

        Pessoa igor = new Pessoa("Igor", "123", "123");
        Conta contaIgor = new Conta(123, igor);
        contaIgor.depositar(1000);


        //Act
        boolean foiPossivelSacar = contaIgor.sacar(300);

        //Assert
        Assertions.assertTrue(foiPossivelSacar);
    }
    @Test
    public  void deveImpedir0Saq8eQuandoOcorrerUmaTentativaDeSaqueSemSaldoSuficente(){

        //Arrange

        Pessoa igor = new Pessoa("Igor", "123", "123");
        Conta contaIgor = new Conta(123, igor);
        contaIgor.depositar(1000);


        //Act
        boolean foiPossivelSacar = contaIgor.sacar(1300);

        //Assert
        Assertions.assertFalse(foiPossivelSacar);
    }

    @Test
    public void exemploEncapsulamento(){

        Pessoa igor = new Pessoa("Igor", "123", "123");
        Conta contaIgor = new Conta(123, igor);
        contaIgor.depositar(1000);



    }
}
