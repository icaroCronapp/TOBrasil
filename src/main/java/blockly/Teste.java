package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Teste {

public static final int TIMEOUT = 300;

/**
 *
 * @author Ícaro Antunes
 * @since 10/05/2024, 15:18:34
 *
 */
public static Var verificaAdmin() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select \n	u \nfrom \n	User u"));
    if (
    cronapi.database.Operations.hasElement(item).getObjectAsBoolean()) {
        System.out.println(
        Var.valueOf("Existe registro, existe usuário").getObjectAsString());
    } else {
        System.out.println(
        Var.valueOf("Não existe.").getObjectAsString());
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

