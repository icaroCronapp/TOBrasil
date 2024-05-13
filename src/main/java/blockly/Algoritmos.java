package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Algoritmos {

public static final int TIMEOUT = 300;

/**
 *
 * @param entrada
 *
 * @author Ícaro Antunes
 * @since 13/05/2024, 15:25:52
 *
 */
public static Var executa(@ParamMetaData(description = "entrada", id = "59222fbb") Var entrada) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf(somaAlgoritmo(entrada)));
    System.out.println(
    Var.valueOf(somaAlgoritmo(entrada)).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Ícaro Antunes
 * @since 13/05/2024, 15:25:52
 *
 */
public static Var helloWorld() throws Exception {
 return new Callable<Var>() {

   private Var entrada = Var.VAR_NULL;

   public Var call() throws Exception {
    return
Var.valueOf("olá");
   }
 }.call();
}

/**
 *
 * @param numeroAlvoParametro
 *
 * @author Ícaro Antunes
 * @since 13/05/2024, 15:25:52
 *
 */
public static Var somaAlgoritmo(@ParamMetaData(description = "numeroAlvoParametro", id = "7b3e6947") Var numeroAlvoParametro) throws Exception {
 return new Callable<Var>() {

   private Var listaNumeros = Var.VAR_NULL;
   private Var numeroAlvoDois = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var j = Var.VAR_NULL;
   private Var j_start = Var.VAR_NULL;
   private Var j_end = Var.VAR_NULL;
   private Var j_inc = Var.VAR_NULL;
   private Var i_start = Var.VAR_NULL;
   private Var i_end = Var.VAR_NULL;
   private Var i_inc = Var.VAR_NULL;

   public Var call() throws Exception {
    listaNumeros =
    cronapi.list.Operations.getListFromText(
    Var.valueOf("2,7,11,15"),
    Var.valueOf(","));
    numeroAlvoDois = numeroAlvoParametro;
    i_start =
    Var.valueOf(1);
    i_end =
    cronapi.math.Operations.subtract(
    cronapi.list.Operations.size(listaNumeros),
    Var.valueOf(1));
    i_inc =
    Var.valueOf(1);
    if (i_start.greaterThan(i_end)) {
        i_inc.multiply(-1);
    }
    for (i = Var.valueOf(i_start);
        i_inc.getObjectAsInt() >= 0 ? i.getObjectAsLong() <= i_end.getObjectAsLong() : i.getObjectAsLong()  >= i_end.getObjectAsLong();
    i.inc(i_inc))  {
        j_start =
        cronapi.math.Operations.sum(i,
        Var.valueOf(1));
        j_end =
        cronapi.list.Operations.size(listaNumeros);
        j_inc =
        Var.valueOf(1);
        if (j_start.greaterThan(j_end)) {
            j_inc.multiply(-1);
        }
        for (j = Var.valueOf(j_start);
            j_inc.getObjectAsInt() >= 0 ? j.getObjectAsLong() <= j_end.getObjectAsLong() : j.getObjectAsLong()  >= j_end.getObjectAsLong();
        j.inc(j_inc))  {
            if (
            Var.valueOf((
            cronapi.math.Operations.sum(
            cronapi.list.Operations.get(listaNumeros, i),
            cronapi.list.Operations.get(listaNumeros, j))).equals(numeroAlvoDois)).getObjectAsBoolean()){
              return
            Var.valueOf(
            Var.valueOf("[").getObjectAsString() +
            cronapi.math.Operations.subtract(i,
            Var.valueOf(1)).getObjectAsString() +
            Var.valueOf(",").getObjectAsString() +
            cronapi.math.Operations.subtract(j,
            Var.valueOf(1)).getObjectAsString() +
            Var.valueOf("]").getObjectAsString());
            }
        } // end for
    } // end for
    return Var.VAR_NULL;
   }
 }.call();
}

}

