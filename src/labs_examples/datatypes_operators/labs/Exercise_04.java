package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        int c = 10;
        float d = 9.88f;
        if (d < c){
            System.out.println("f is less than c");
        }

        int e = 10;
        double f = 10.0000;
        if (e <= f){
            System.out.println("d is less than or equal to e");
        }

        short g = 10;
        short h = 11;
        if (h > g){
            System.out.println("h is greater than g");
        }

        long i = 12312312312l;
        long j = 123123123123l;
        if (j >= i){
            System.out.println("j is greater than or equal to i");

        }

        int k = 19;
        float m = 19.0f;
        if (k == m){
            System.out.println("they are equal to each other");
        }



    }

}

