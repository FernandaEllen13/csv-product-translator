package fernandaellen13;

import com.opencsv.bean.CsvToBeanBuilder;
import fernandaellen13.model.Produto;
import fernandaellen13.service.TraduzProdutoService;
import space.dynomake.libretranslate.Translator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) throws FileNotFoundException {
        List<Produto> produtos = new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv"))
                .withType(Produto.class).build().parse();
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        TraduzProdutoService traducaoService = new TraduzProdutoService();
        for (Produto produto : produtos) {
            traducaoService.traduzir(produto);
            System.out.println(produto);
        }
    }
}


