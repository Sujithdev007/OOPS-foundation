package Genrics;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second){
        this.first=first;
        this.second=second;

    }

    public void setFirst(T f){
        this.first =f;

    }
    public T getFirst(){
        return this.first;
    }

     public void setsecond(T s){
        this.second =s;

    }
    public T getsecond(){
        return this.second;
    }
    
}
