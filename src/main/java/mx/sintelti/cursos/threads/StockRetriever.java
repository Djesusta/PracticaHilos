package mx.sintelti.cursos.threads;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public class StockRetriever  implements  Runnable{

    private String company;


   public  StockRetriever(String company){

       this.company=company;
   }
    @Override
    public void  run(){
       try {
      getStockRetriever();
       }
       catch ( Exception e){
           System.out.println(e);
       }

    }

    public BigDecimal getStockRetriever()throws IOException {
            Stock stock;
            BigDecimal price;
            stock = YahooFinance.get(company);
            price = stock.getQuote().getPrice();
            stock.print();
            return price;


    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
