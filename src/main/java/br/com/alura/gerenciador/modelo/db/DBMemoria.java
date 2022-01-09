package br.com.alura.gerenciador.modelo.db;

import br.com.alura.gerenciador.modelo.Empresa;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class DBMemoria {

    private static List<Empresa> lista = new ArrayList<>();
    private static Long chaveSequencial = 1L;

    static {
        Empresa xpto_sa = new Empresa("XPTO S/A", new Date());
        xpto_sa.setId(DBMemoria.chaveSequencial++);
        Empresa xpto_ltda = new Empresa("XPTO Ltda", new Date());
        xpto_ltda.setId(DBMemoria.chaveSequencial++);

        lista.add(xpto_sa);
        lista.add(xpto_ltda);
    }

    public void adiciona(Empresa empresa) {
        empresa.setId(DBMemoria.chaveSequencial++);
        lista.add(empresa);
    }

    public List<Empresa> getEmpresas() {
        return DBMemoria.lista;
    }

    public void removeEmpresaUtilizandoIterator(Long id) {

        Iterator<Empresa> empresaIterator = lista.iterator();

        while (empresaIterator.hasNext()) {
            Empresa empresa = empresaIterator.next();

            if (empresa.getId() == id) {
                empresaIterator.remove();
            }
        }
    }

    public void removeEmpresaUtilizandoRemoveIf(Long id) {
        lista.removeIf(empresa -> Objects.equals(empresa.getId(), id));
    }
}

