package Genrics;

public class PairV2<T, S> {


    private T first;
    private S second;

    public PairV2(T first, S second){
        this.first=first;
        this.second=second;

    }

    public void setFirst(T f){
        this.first =f;

    }
    public T getFirst(){
        return this.first;
    }

     public void setsecond(S s){
        this.second =s;

    }
    public S getsecond(){
        return this.second;
    }
    
}

    

