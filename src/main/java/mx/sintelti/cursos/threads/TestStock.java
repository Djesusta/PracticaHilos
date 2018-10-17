package mx.sintelti.cursos.threads;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestStock {
    public static  void  main (String[] args) throws IOException {

       /*
        StockRetriever s= new StockRetriever("TSLA");
        System.out.println( s.getStockRetriever());
       */

        String fileName="/Users/jdejesus.SQ/IdeaProjects/threads/src/main/resources/List.txt";

        List<String> lineas = Files.readAllLines(Paths.get(fileName));
        BigDecimal precio= new BigDecimal(0.0);
        long Inicio=System.nanoTime();
        for  (String empresa:lineas){

            StockRetriever stock = new StockRetriever(empresa);
            precio=precio.add(stock.getStockRetriever());
        }

        long fin=System.nanoTime();
        System.out.println(precio);
        System.out.println(fin/1000000000+ " - "+Inicio/1000000000+" : " +  (fin-Inicio) /1000000000);




    }
}
