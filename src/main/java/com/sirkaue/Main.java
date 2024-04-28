package com.sirkaue;

import com.sirkaue.model.Endereco;
import com.sirkaue.service.ConsultaCepService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultaCepService cepService = new ConsultaCepService();

        System.out.println("Digite seu CEP: ");
        String cep = sc.nextLine();

        try {
            Endereco novoEndereco = cepService.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeraArquivo geraArquivo = new GeraArquivo();
            geraArquivo.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}