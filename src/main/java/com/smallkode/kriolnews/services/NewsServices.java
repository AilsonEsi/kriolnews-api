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
import org.springframework.stereotype.Service;

/**
 *
 * @author programmer
 */
@Service
public class NewsServices {

    Document site = null;
    Elements news = null;
    Elements newsCategory = null;
    List<News> newList;

    private String[] cat = new String[7];
    //private String webpage = "https://anacao.cv/category";

    private NewsServices() {

        cat[0] = "https://anacao.cv/category/politica";
        cat[1] = "https://anacao.cv/category/economia";
        cat[2] = "https://anacao.cv/category/desporto";
        cat[3] = "https://anacao.cv/category/sociedade";
        cat[4] = "https://anacao.cv/category/cultura";
        cat[5] = "https://anacao.cv/category/ambiente";

    }

    public List<News> getNews() throws IOException {
        
        newList = new ArrayList<>();
        
        for (int i = 0; i < this.cat.length; i++) {

            if (cat[i] != null) {

                site = (Document) Jsoup.connect(cat[i]).get();
                news = site.select("#content div.post");
                newsCategory = site.select("#content #crumbs span.current");
            }

            for (Element el : news) {

                String title = el.select("h1 a").attr("title");
                String content = el.select("p").text();
                String image = el.select("div.post_img_box img").attr("src");
                String link = el.select("div.post_img_box a").attr("href");
                String category = newsCategory.text();
                newList.add(new News(title, content, image, category, link));
            }
        }

        return newList;

    }

    public List<News> getAllByCategory(String cat) throws IOException {

        Document site = null;
        Elements news = null;
        Elements newsCategory = null;

        site = (Document) Jsoup.connect("https://anacao.cv/category/" + cat).get();
        news = site.select("#content div.post");
        newsCategory = site.select("#content #crumbs span.current");

        for (Element el : news) {

            String title = el.select("h1 a").attr("title");
            String content = el.select("p").text();
            String image = el.select("div.post_img_box img").attr("src");
            String link = el.select("div.post_img_box a").attr("href");
            String category = newsCategory.text();
            newList.add(new News(title, content, image, category, link));
        }

        return newList;

    }

}
