import java.sql.Time;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Procesos a = new Procesos(0, 7);
		Procesos b = new Procesos(2, 4);
		Procesos c = new Procesos(3, 3);
		Procesos d = new Procesos(5, 2);
		TablaProcesos tablaProcesos = new TablaProcesos();

		tablaProcesos.agregar(a, b, c, d);
		tablaProcesos.ordenar(2);
		tablaProcesos.ordenar(1);

		TimerTask timerTask = new TimerTask() {
			int i = -1;

			public void run() {
				// Aquí el código que queremos ejecutar.
				//
				tablaProcesos.iniciar(i);
				i++;
				boolean cond = false;
				if (tablaProcesos.getProceso() == 5) {

					tablaProcesos.imprimir(tablaProcesos.getTabla());

					System.out.println();
					System.out.println("i:  " + i);
					System.out.println("Proceso Actual:   " + tablaProcesos.getProceso());

				} else {
					int procesoActual = tablaProcesos.getProceso();
					tablaProcesos.reducirTiempoCPU(tablaProcesos.getProceso());
					cond = tablaProcesos.validarProcesoNuevo(i);
					tablaProcesos.imprimir(tablaProcesos.getTabla());
					tablaProcesos.validarProcesoMasCorto(cond, i);

					System.out.println();
					System.out.println("i:  " + i);
					System.out.println("Proceso Actual:   " + procesoActual);

				}

			}
		};

		// Aquí se pone en marcha el timer cada segundo.
		Timer timer = new Timer();
		// Dentro de 0 milisegundos avísame cada 1000 milisegundos
		timer.scheduleAtFixedRate(timerTask, 0, 1000);

	}

}
