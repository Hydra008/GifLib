package com.codeGodfather.giflib.Controller;

import com.codeGodfather.giflib.Data.GifRepository;
import com.codeGodfather.giflib.Model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by godfather on 2017-08-23.
 */
//this indicates that this class is a controler class which is used for handling requests
@Controller
public class GifController {
    /* autowired annotation will auto assign instance field gifRepository. this annotation will construct
     GifRepository object and create its instance so to auto assign gifRepository field
    which will enable to use methods such as findByName */
    @Autowired
    private GifRepository gifRepository;

    // uri path you want to map to this method. / indicates home
    @RequestMapping(value = "/")
    //@ResponseBody //this indicates the response we want to give to the request made.
    //we remove response body to indicate the controller that it requires further processing and thymeleaf view resolver can handle the request
    public String listGifs(ModelMap modelMap){
        //make a new list of gif objects, store into it what comes back from the get all gifs method
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";
    }

    @RequestMapping(value = "/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}