package Generics;

public class Pair <A,B>{

    A first;
    B second;

    public Pair() {
    }

    public Pair(A first,B second){
        this.first = first;
        this.second = second;
    }

    A getFirst(){
        return first;
    }
    B getSecond(){
        return second;
    }

    void setFirst(A first){
        this.first = first;
    }

    void setSecond(B second){
        this.second = second;
    }
}
