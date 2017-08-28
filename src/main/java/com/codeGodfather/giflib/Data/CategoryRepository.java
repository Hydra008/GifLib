package com.codeGodfather.giflib.Data;

import com.codeGodfather.giflib.Model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by godfather on 2017-08-23.
 */
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Other"),
            new Category(2, "Bot"),
            new Category(3, "People")
    );

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }

    public Category findById(int id){
        for(Category category: ALL_CATEGORIES){
            if(category.getId() == (id)){

                return category;
            }
        }
        return null;
    }
}
