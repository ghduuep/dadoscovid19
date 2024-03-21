package br.com.ghduep.ProjetoApi.principal;

import br.com.ghduep.ProjetoApi.modelos.Dados;
import br.com.ghduep.ProjetoApi.services.ConsumoApi;
import br.com.ghduep.ProjetoApi.services.ConverteDados;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String URL = "https://disease.sh/v3/covid-19/all";

    public void exibeMenu() {
        System.out.println("Bem-vindo(a) ao Relatório Covid-19");
        var menu = """
                1 - Ver dados COVID
                2 - Sair
                Escolha uma opção:""";
        System.out.println(menu);
        var opcao =leitura.nextInt();

        if (opcao == 1) {
            var json = consumoApi.obterDados(URL);
            var dados = conversor.obterDados(json, Dados.class);
            System.out.println(dados);
        } else if (opcao == 2) {
            System.out.println("Finalizando programa...");
        }else {
            System.out.println("OPS! Parece que você digitou algo errado, tente novamente!");
        }



    }
}
