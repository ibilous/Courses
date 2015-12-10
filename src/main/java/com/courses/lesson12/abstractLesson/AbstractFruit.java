package com.courses.lesson12.abstractLesson;

/**
 * Created by ibilous on 12.11.2015.
 */
public abstract class AbstractFruit {

    public String getExtendedFruitName(){
        return "this is fruit name: "+ getFruitName();
    }

    abstract String getFruitName();
}
