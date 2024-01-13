package Genrics;

public class PairUse {

    public static void main(String []args){
        // Pair p = new Pair(1, 4);
        // System.out.print(p.getFirst()+ " "+ p.getsecond());

        // here structurly both class are same only types changes (two parameters, different types) 
        // for only creating types we need to create a class ?
        // PairString ps = PairString("aa", "bb"); //string instead int
        // PairDouble pd = PairDouble(1.34, 3.45); //double instead int

        // #-> HERE genrics comes to play

        Pair<String> ps = new Pair<String>("Sujith", "Developer");
        System.out.println(ps.getFirst()+ " "+ ps.getsecond());

        Pair<Integer> pi = new Pair<Integer>(10, 7);
        System.out.println(pi.getFirst()+ " "+ pi.getsecond());

        Pair<Double> pd = new Pair<Double>(3.14, 1.83);
        System.out.println(pd.getFirst()+ " "+ pd.getsecond());


        Pair<Dev> d = new Pair<Dev>(new Dev(), new Dev());
          System.out.println(d.getFirst()+ " "+ d.getsecond());
          
        
    }
    
}
