package Generics;
import java.util.*;

public class Box <T>{
    List<T> contents;

    public Box(){
         contents = new ArrayList<>();
    }

    public Box(List<T> contents){
        this.contents = contents;
    }

    void add(T item){
        contents.add(item);
    }

    List<T> getContents(){
        return contents;
    }
}
