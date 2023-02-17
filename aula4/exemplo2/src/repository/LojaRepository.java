package repository;

import model.Loja;
import model.Loja;

import java.util.ArrayList;
import java.util.List;

public class LojaRepository {
    private static List<Loja> listaLoja = new ArrayList<>();
    
    public static void adicionarLoja(Loja Loja){
        listaLoja.add(Loja);
    }

    public static Boolean removerLoja(Loja Loja){
        return listaLoja.remove(Loja);
    }

    public static Loja removerLoja(int id){
        return listaLoja.remove(id);
    }
}
