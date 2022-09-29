// import java.util.Timer;
// import java.util.TimerTask;
//
// public class Ejecutar {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
//
// Procesos a = new Procesos(1, 2);
// Procesos b = new Procesos(1, 2);// SE CREAN LOS PROCESOS
// Procesos c = new Procesos(5, 7);
// Procesos d = new Procesos(8, 3);
//
// TablaProcesos tablaProcesos = new TablaProcesos();
//
// tablaProcesos.agregar(a, b, c, d);
// tablaProcesos.ordenar(2); // PRIMERO SE ORDENA POR TIEMPOS DE CPU Y
// // LUEGO POR
// tablaProcesos.ordenar(1); // TIEMPO DE LLEGADA EN CASO DE QUE DOS
// // PROCESOS LLEGUEN A LA VEZ
//
// tablaProcesos.datosCPU();
// TimerTask timerTask = new TimerTask() {
// int i = -1;
//
// public void run() {
// // Aqu� el c�digo que queremos ejecutar.
//
// tablaProcesos.iniciar(i);
// i++;
// boolean cond = false;
// if (tablaProcesos.getProceso() == 5) {
//
// // EL PROCESO ACTUAL NO EXISTE, 5 ES PARA QUE NO REDUZCA
// // NINGUNO,ES UN MECANISMO DE CONTROL MIENTRAS INGRESA EL
// // PRIMER PROCESO
//
// tablaProcesos.imprimir(tablaProcesos.getTabla());
//
// System.out.println();
// System.out.println("i: " + i);
// System.out.println("Proceso Actual: " + tablaProcesos.getProceso());
//
// } else {
// // S� NO ES 5 SIGNIFICA QUE EL PRIMER PROCESO EN LLEGAR Y
// // CON MENOR
// // TIEMPO DE CPU SE HA INICIADO
//
//
// // EL
// // TIEMPO
// // DE
// // CPU
// tablaProcesos.validarProcesoNuevo(i); // DEL
// cond = tablaProcesos.validaCero();
//
// tablaProcesos.validarProcesoMasCorto(cond, i);
// tablaProcesos.reducirTiempoCPU(tablaProcesos.getProceso()); // REDUCE//
// PROCESO
// // ACTUAL
// // VALIDA S�
// // EXISTE UN
// // NUEVO
// // PROCESO O
// // S� EL
// // PROCESO
// // ACTUAL
// // LLEGO A
// // CERO
//
// tablaProcesos.imprimir(tablaProcesos.getTabla()); // IMPRIME
// // EN CASO DE
// boolean x = tablaProcesos.terminar();
// //
// //
// //
// //
// //
// if (x == true) {
// cancel();// QUE validarProcesoNuevo SEA TRUE SIGNIFICA
// // QUE EL
// // PROCESO ACTUAL LLEGO A CERO Y PROCEDE A INICIAR EL
// // PROCESO
// // CON MENOR TIEMPO DE CPU
//
// }
// tablaProcesos.tiempoEspera(i);
// tablaProcesos.tiempoRespuesta();
//
// System.out.println();
// System.out.println("i: " + i);
//
// }
//
// }
// };
//
// // Aqu� se pone en marcha el timer cada segundo.
// Timer timer = new Timer();
// // Dentro de 0 milisegundos av�same cada 1000 milisegundos
// timer.scheduleAtFixedRate(timerTask, 0, 1000);
//
// }
//
// }
