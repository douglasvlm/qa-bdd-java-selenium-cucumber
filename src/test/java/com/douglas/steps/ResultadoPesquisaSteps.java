package com.douglas.steps;

import com.douglas.pages.ResultadoPesquisaPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

public class ResultadoPesquisaSteps {

    @Quando("^adiciona o produto \"(.*)\" ao carrinho$")
    public void adicionarProdutoAoCarrinho(String nomeProduto) {
        ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
        resultadoPesquisaPage.adicionarProdutoAoCarrinho(nomeProduto);
    }
    //@E("^acessa o produto \"Printed Chiffon Dress"\"$"){
    @E("acessa o produto \"(.*)\"$")
    public void acessarProduto(String nomeProduto) {
        ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
        resultadoPesquisaPage.acessarProduto(nomeProduto);
    }


}