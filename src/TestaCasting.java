public class TestaCasting {
   public static void main(String[] args){

    /*Só podemos fazer essas atribuições se os valores forem ::compatíveis::.
     Compatível é quando um tipo cabe em outros, 
    ou seja, ele só cabe se o ::range:: (alcance) dele for mais amplo que o do outro. */

    /* O CASTING NADA MAIS É, DO QUE FORÇAR ESSA CONVERSÃO */

    //Neste arquivo, iremos introduzir o casting e dominé-lo
    double d = 15.3;                            //char > 
    //int i = d; // nao complia, lembre byte > short  > int > long > float > double  -- Ao contrário não vai
    //perde informação

    //casting - forçando e assumindo o risco    
    int i = (int) d;
    System.out.println(i); // compila

    //exemplo 2
    long l = 151424l;
    //int i2 = l; // nao compila
    int i3 = (int) l; // casting feito, compila (há risco de perder informação)

   } 
}
