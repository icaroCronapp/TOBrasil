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
 * @since 13/05/2024, 16:01:51
 *
 */
public static Var verificaAdmin() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    cronapi.database.Operations.query(Var.valueOf("app.entity.UserRole"),Var.valueOf("select \n	u \nfrom \n	UserRole u  \nwhere \n	u.user.normalizedUserName = :userNormalizedUserName AND \n	u.role.builtIn = true"),Var.valueOf("userNormalizedUserName",
    cronapi.text.Operations.normalize(
    cronapi.util.Operations.getCurrentUserName())));
    if (
    cronapi.database.Operations.hasElement(item).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction(Var.valueOf("blockly.js.blockly.PeriodoC.mostraModal"));
    } else {
      {}
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

