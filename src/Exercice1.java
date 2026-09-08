

class Exercice1{
    @FunctionalInterface
    interface Operation{
        double calculer(double a , double b);
    }

    public static double appliquer(double a , double b, Operation op){
        return op.calculer(a , b);
    }
    public static void main(String[] args){
        Operation addition = Double::sum;
        Operation soustraction =  (a , b) ->  (a- b);
        Operation multiplication = ( a , b) ->  (a * b);
        Operation maximum = Math::max;
        Operation division = (a , b) -> {
            if (b == 0) throw new ArithmeticException("Division par 0.");
            return (a/ b);
        };

        int a = 3 , b = 7;
        System.out.println("Addition : "+appliquer(a, b , addition));
        System.out.println("Soustraction : "+appliquer(a , b , soustraction));
        System.out.println("Multiplication : " + appliquer(a , b , multiplication));
        System.out.println("Maximum : " + appliquer(a , b , maximum));
        System.out.println("Division : " + appliquer(a , b , division));
    }
}
