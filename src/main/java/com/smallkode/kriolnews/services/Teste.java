/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallkode.kriolnews.services;

import com.smallkode.kriolnews.model.News;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author programmer
 */
public class Teste {
    
    /*
     private final String SITE = "https://anacao.cv/category/politica/"; 
    
    public void getNews() throws IOException{
    
       List<News> newList = new ArrayList<>();
        
        Document site = (Document) Jsoup.connect(SITE).get();
        Elements e = site.select("#content h1 a");
        
        for(Element el : e){
            //System.out.println(el.attr("title"));
            newList.add(new News(el.attr("title")));
        }
    } 
    
    public static void main(String[] args) throws IOException {
        
        
new Teste().getNews();
    }
*/
}
