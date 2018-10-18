package mx.sintelti.cursos.threads;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class TestStock {
    public static   volatile BigDecimal totalPrice = new BigDecimal(0);

    public static void main(String[] args) {


        String fileName = "/Users/jdejesus.SQ/IdeaProjects/threads/src/main/resources/List.txt";

        try {

            List<String> lineas = Files.readAllLines(Paths.get(fileName));
            Collection<Callable<Object>> tareas =new ArrayList<>();
        } catch (IOException ioe) {
            System.out.println("Error al manipular archivo");


        }
    }
    public  static  synchronized  void addPrice(BigDecimal price ){
        totalPrice=totalPrice.add(price);
    }
}


     /*


        StockRetriever s= new StockRetriever("TSLA");
        System.out.println( s.getStockRetriever());


        String fileName="/Users/jdejesus.SQ/IdeaProjects/threads/src/main/resources/List.txt";

        List<String> lineas = Files.readAllLines(Paths.get(fileName));



        //BigDecimal precio= new BigDecimal(0.0);

        long Inicio=System.nanoTime();

        for  (String empresa:lineas){

            StockRetriever stock = new StockRetriever(empresa);
            precio=precio.add(stock.getStockRetriever());

            new Thread(stock, String.valueOf(lineas)).start();
        }

        long fin=System.nanoTime();
        System.out.println(precio);
        System.out.println(fin/1000000000+ " - "+Inicio/1000000000+" : " +  (fin-Inicio) /1000000000.0);
    }
}*/











