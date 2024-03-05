package exercise_instance_methods;

public class Exercicio_metodoComRetorno_RecebeParametro {
    public static String metodoUmComRetorno (String nome){
        return "metodoUmComRetorno"

    }
    public static String metodoDoisComRetorno (String sobrenome);{
        return "metodoDoisComRetorno"
}

    public static String metodoTresComRetorno(String nota) {
        return "metodoTresComRetorno";
    }

    public static String metodoQuatroComRetorno (String sala); {
        return "metodoQuatroComRetorno";
    }

    public static String metodoCincoComRetorno() {
        return "metodoCincoComRetorno";
    }

    public static void main(String[] args) {
       System.out.println(metodoUmComRetorno());
        System.out.println(metodoDoisComRetorno());
        System.out.println(metodoTresComRetorno());
        System.out.println(metodoQuatroComRetorno());
        System.out.println(metodoCincoComRetorno());
    }