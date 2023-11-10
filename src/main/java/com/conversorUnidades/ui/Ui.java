package com.conversorUnidades.ui;

import com.conversorUnidades.constantes.UnidadeMedida;
import com.conversorUnidades.logica.ConversorUnidades;

import java.util.Scanner;

public class Ui {
    public static void main( String[] args )
    {
        ConversorUnidades conversorUnidades = new ConversorUnidades();
        UnidadeMedida tipo = null;
        double valor = 0.0;
        int opcao;
        Scanner input = new Scanner(System.in);

        try{
            exibeMenu();
            opcao = input.nextInt();
            tipo = obterTipoDesejado(opcao);
            System.out.println("Digite o valor a ser convertido: ");
            valor = input.nextDouble();
            System.out.println("Valor convertido: " + conversorUnidades.converterUnidade(tipo,valor));
        } catch (IllegalArgumentException e){
            System.out.println("Tipo inválido");
        } catch (Exception e){
            System.out.println("Valor inválido. Conversão não pode ser realizada");
        } finally {
            input.close();
        }
    }

    private static UnidadeMedida obterTipoDesejado(int opcao) throws IllegalArgumentException {
        switch(opcao) {
            case 1:
                return UnidadeMedida.INCHES_CM;
            case 2:
                return UnidadeMedida.FEET_METER;
            case 3:
                return UnidadeMedida.POUNDS_KG;
            case 4:
                return UnidadeMedida.CM_INCHES;
            case 5:
                return UnidadeMedida.METER_FEET;
            case 6:
                return UnidadeMedida.KG_POUNDS;
            default:
                throw new IllegalArgumentException("Opção inválida!");
        }
    }


    private static void exibeMenu() {
        System.out.println("Selecione a opção de conversão desejada:");
        System.out.println("1. Polegadas para Centímetros");
        System.out.println("2. Pés para Metros");
        System.out.println("3. Libras para Quilogramas");
        System.out.println("4. Centímetros para Polegadas");
        System.out.println("5. Metros para Pés");
        System.out.println("6. Quilogramas para Libras");
    }
}
