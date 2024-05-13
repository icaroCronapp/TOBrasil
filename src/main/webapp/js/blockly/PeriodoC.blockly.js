window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.PeriodoC = window.blockly.js.blockly.PeriodoC || {};

/**
 * @function mostraModal
 *
 *
 *
 *
 * @author Ícaro Antunes
 * @since 13/05/2024, 16:13:18
 *
 */
window.blockly.js.blockly.PeriodoC.mostraModalArgs = [];
window.blockly.js.blockly.PeriodoC.mostraModal = async function() {
 var item;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.PeriodoS:obterPeriodo', async function(sender_item) {
      item = sender_item;
    //
    console.log(item);
    //
    if (!item) {
      //
      this.cronapi.notification.confirmDialogAlert('warning', 'Você não tem período ativo cadastrado', 'Cadastre um agora.', this.cronapi.notification.buttonConfirmDialogAlert('true', 'Ok, entendi.', async function() {
        }.bind(this)));
    }
  }.bind(this));
}
