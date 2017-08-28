package com.codeGodfather.giflib.Data;

/**
 * Created by godfather on 2017-08-23.
 */
import com.codeGodfather.giflib.Model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", 2, LocalDate.of(2017,8,1), "Karan Shah", false),
            new Gif("ben-and-mike", 3, LocalDate.of(2017,8,2), "The Legend", true),
            new Gif("book-dominos", 1, LocalDate.of(2017,8,3), "The Godfather", false),
            new Gif("compiler-bot", 2, LocalDate.of(2017,8,4), "The Ironheart", true),
            new Gif("cowboy-coder", 1, LocalDate.of(2017,8,15), "Hydra", false),
            new Gif("infinite-andrew", 3, LocalDate.of(2017,8,6), "Serapius", true)
    );

    public Gif findByName(String name){
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs(){

        return ALL_GIFS;
    }

    public List<Gif> findByCategoryId(int id){
        List<Gif> gifs = new ArrayList<>();
        for (Gif gif : ALL_GIFS){
            if (gif.getCategoryId()==id){
                gifs.add(gif);
            }
        }
        return gifs;
    }

}
