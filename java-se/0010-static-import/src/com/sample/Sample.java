package com.sample;
//import just one static member
import static java.lang.System.out;
//import all static members
import static java.lang.Math.*;
public class Sample {

    public static void main(String[] args) {



        int numPow = (int) pow(2,3);
        out.println(numPow);

    }
}

/*
note :
Remember, the reason that Java organizes its libraries into packages is to avoid namespace collisions.
When you import static members, you are bringing those members into the current namespace.
Thus, you are increasing the potential for namespace conflicts and inadvertent name hiding.
If you are using a static member once or twice in the program, it’s best not to import it.
Also, some static names, such as System.out, are so recognizable that you might not want to import them.
 Static import is designed for those situations in which you are using a static member repeatedly,
  such as when performing a series of mathematical computations. In essence, you should use, but not abuse, this feature.
 */
