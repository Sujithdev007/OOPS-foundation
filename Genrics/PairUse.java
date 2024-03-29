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
        // System.out.println(ps.getFirst()+ " "+ ps.getsecond());

        Pair<Integer> pi = new Pair<Integer>(10, 7);
        // System.out.println(pi.getFirst()+ " "+ pi.getsecond());

        Pair<Double> pd = new Pair<Double>(3.14, 1.83);
        // System.out.println(pd.getFirst()+ " "+ pd.getsecond());


        Pair<Dev> d = new Pair<Dev>(new Dev(), new Dev());
        //   System.out.println(d.getFirst()+ " "+ d.getsecond());


        // multiple types
        PairV2<String, Integer> V2  = new PairV2<String,Integer>("Sujith", 10); 
        // System.out.println(V2.getFirst()+" "+ V2.getsecond());



        // Important -> indepth
        PairV2<String, Integer> pInner = new PairV2<String,Integer>("Sujith", 7);

        PairV2<PairV2<String, Integer>, Integer> pdev = new PairV2<PairV2<String,Integer>,Integer>(pInner, 18);
        System.out.println(pdev.getFirst().getFirst());
        System.out.println(pdev.getFirst().getsecond());
        System.out.println(pdev.getsecond());
          
        
    }
    
}
