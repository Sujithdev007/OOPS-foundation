this is for learning the foundation of oops in java


# Final for variables
//Final keyword as variable => wont change

# Final for methods
//final method cant be changed , basically the method is frozen which means no child class able to inherit
an cannot be overriden

# Final for classes
//final class wont be able to inherited eg: String class (the developers who developed they are not intersted in chaning the way the string class works)


# Abstract 
abstract class is combination of abstract and non-abstract class

the use of Abstract is to maintain a methods body to used later part of the class which gets interits 

We can create only reference for Abstract class not object

Vechile V ; this is fine 
Vechile V = new Vechile(); this is not fine actually because its incomplete class

# Note -> Child class of abstract class is also incomplete because of the parent abstract class   
# either complete the incomplete the thing or else make the child class as abstract so now u are unble 
# to create objects for this class also 


# INTERFACE 

interfaces are pure abstract class not combination of both

we cannot extend the class as like normal class instead need to implement

only the class which staisfs the interface remaining methods will gets polymorphism applied

# NOTE :Class can be implement one or more interface 
# but 
# class can be extend only one class (multilevel inheritance is accepeted but multi inheritance not allowed)



# Genrics

  # structurly both class are same only types changes (two parameters, different types) 
  Pair p = new Pair(1, 4)
        for only creating types we need to create a class ?
  PairString ps = PairString("aa", "bb"); 
  # string instead int
 PairDouble pd = PairDouble(1.34, 3.45);
 # double instead int

 

 # HERE GENRICS COMES TO PLAY JUST BY ADDING ANGULAR BRACKETS TO THE CLASS NAME <T> ITS DONE NOW ITS A TYPE

  # NOTE: not only normal types we can send our own class itself 

  if we didnot mention the type , bydefault it takes type as OBJECT the super class
   Pair p = new Pair(09, 41)
   p.setFirst("aa");
   p.setSeconf(87);
   # No use refering THE OBJECT

 # for multiple types 
 PairV2<String, Integer> V2  = new PairV2<String,Integer>("Sujith", 10); 

 # default value for non primitive is null
  
