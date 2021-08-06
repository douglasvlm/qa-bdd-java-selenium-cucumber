package com.douglas.steps;

import com.douglas.pages.DetalheProdutoPage;
import io.cucumber.java.pt.E;

public class DetalheProdutoSteps {

    //@E("^acessa o produto \"Printed Chiffon Dress"\"$"){
    @E("^aumenta a quantidade produto$")
    public void aumentarQuantidadeProduto() {
        DetalheProdutoPage detalheProdutoPage = new DetalheProdutoPage();
        detalheProdutoPage.aumentarQuantidadeProduto();
    }
}