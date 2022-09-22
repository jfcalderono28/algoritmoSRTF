import java.util.Arrays;

public class Procesos {
	private int proceso[] = new int[5];
	private static int id = 1;

	public int[] getProceso() {
		return proceso;
	}

	public void setProceso(int[] proceso) {
		this.proceso = proceso;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Procesos.id = id;
	}

	public Procesos(int llegada, int CPU) {
		proceso[0] = id;
		proceso[1] = llegada;
		proceso[2] = CPU;
		proceso[3] = 0;
		proceso[4] = 0;

		id++;
	}

	// public void imprimir() {
	// for (int i = 0; i < proceso.length; i++) {
	// System.out.print("[ " + proceso[i] + " ]");
	// }
	// System.out.println();
	// }

}
