package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        boolean c = true;
        boolean d = true;
        if (c & d){
            System.out.println("c and d are true");
        }

        int e = 3;
        int f = 4;
        if ((e < f) && (e < f)){
            System.out.println("lh is true and rh is true too");
        }

        float g = 12.23f;
        float h = 12.24f;
        if (g > h | g < h){
            System.out.println("either is correct");
        }

        float i = 12.23f;
        float j = 12.24f;
        if (i > j || i < j){
            System.out.println("either is correct");
        }

        if (i < j ^ i > j){
            System.out.println("either is correct");
        }

        if (i < j != i > j){
            System.out.println("both should not be the same boolean");
        }




    }

}

