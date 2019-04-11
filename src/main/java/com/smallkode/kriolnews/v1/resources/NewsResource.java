/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smallkode.kriolnews.v1.resources;

import com.smallkode.kriolnews.services.NewsServices;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author programmer
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/v1/news")
public class NewsResource {

    private final NewsServices newsServices;

    @Autowired
    public NewsResource(NewsServices newsServices) {
        this.newsServices = newsServices;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getAllNewsFromWebSite() throws IOException {

        return new ResponseEntity(newsServices.getNews(), HttpStatus.OK);
    }
}
