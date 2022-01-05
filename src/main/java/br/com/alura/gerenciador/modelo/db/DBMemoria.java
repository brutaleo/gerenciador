package br.com.alura.gerenciador.modelo.db;

import br.com.alura.gerenciador.modelo.Empresa;

import java.util.ArrayList;
import java.util.List;

public class DBMemoria {

    private static List<Empresa> lista = new ArrayList<>();

    static {
        Empresa xpto_sa = new Empresa("XPTO S/A");
        Empresa xpto_ltda = new Empresa("XPTO Ltda");

        lista.add(xpto_sa);
        lista.add(xpto_ltda);
    }

    public void adiciona(Empresa empresa) {
        lista.add(empresa);
    }

    public List<Empresa> getEmpresas() {
        return DBMemoria.lista;
    }
}
