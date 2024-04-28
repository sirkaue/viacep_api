package com.sirkaue;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sirkaue.model.Endereco;

import java.io.FileWriter;
import java.io.IOException;

public class GeraArquivo {

    public void salvaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter(endereco.getCep() + ".json");
        fileWriter.write(gson.toJson(endereco));
        fileWriter.close();
    }
}
