/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallkode.kriolnews.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 *
 * @author programmer
 */
public class News {

    private String title;
    private String content;
    private String image;
    private String category;
    private String link;

    public News() {
    }

    public News(String title, String content, String image, String category, String link) {
        this.title = title;
        this.content = content;
        this.image = image;
        this.category = category;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "News{" + "title=" + title + ", content=" + content + ", image=" + image + ", category=" + category + ", link=" + link + '}';
    }
}
