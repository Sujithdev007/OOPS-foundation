package Genrics;

public class MethodGenric {
  
    public static<T> void method(T arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main (String args[]){
        Integer arr[] = new Integer[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        method(arr);

        String arrs[] = new String[5];
        for(int i=0;i<arrs.length;i++){
            arrs[i]= "abc";
        }
        method(arrs);

        PairUse p[] = new PairUse[5]; //with  only that will get null
        for(int i=0;i<p.length;i++){
            p[i]= new PairUse();
        } 
        //with this we get object referene
        method(p);

    }
}
