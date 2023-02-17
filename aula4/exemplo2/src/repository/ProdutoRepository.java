package repository;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private static List<Produto> listaProduto = new ArrayList<>();
    
    public static void adicionarProduto(Produto Produto){
        listaProduto.add(Produto);
    }

    public static Boolean removerProduto(Produto Produto){
        return listaProduto.remove(Produto);
    }

    public static Produto removerProduto(int id){
        return listaProduto.remove(id);
    }

    public static Produto retornarProduto(int idProduto) {
        return listaProduto.get(idProduto);
    }
}
