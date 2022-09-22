
public class TablaProcesos {
	private Procesos tabla[] = new Procesos[4];

	private int proceso = 5;

	public int getProceso() {
		return proceso;
	}

	public void setProceso(int proceso) {
		this.proceso = proceso;
	}

	public Procesos[] getTabla() {
		return tabla;
	}

	public void setTabla(Procesos[] tabla) {
		this.tabla = tabla;
	}

	public void agregar(Procesos a, Procesos b, Procesos c, Procesos d) {
		tabla[0] = a;
		tabla[1] = b;
		tabla[2] = c;
		tabla[3] = d;
	}

	public void ordenar(int columna) {

		int uno[] = tabla[0].getProceso();
		int dos[] = tabla[1].getProceso();
		int tres[] = tabla[2].getProceso();
		int cuatro[] = tabla[3].getProceso();

		int a[] = { uno[columna], dos[columna], tres[columna], cuatro[columna] };

		for (int x = 0; x < a.length; x++) {
			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] > a[i + 1]) {
					int tmp = a[i + 1];
					Procesos tmp1 = tabla[i + 1];
					a[i + 1] = a[i];
					tabla[i + 1] = tabla[i];
					a[i] = tmp;
					tabla[i] = tmp1;

				}
			}
		}

	}

	public boolean validarProcesoNuevo(int i) {
		int columna = 1;
		boolean cond = false;

		int uno[] = tabla[0].getProceso();
		int dos[] = tabla[1].getProceso();
		int tres[] = tabla[2].getProceso();
		int cuatro[] = tabla[3].getProceso();

		int a[] = { uno[columna], dos[columna], tres[columna], cuatro[columna] };
		int b[] = { uno[columna + 1], dos[columna + 1], tres[columna + 1], cuatro[columna + 1] };
		int c[] = tabla[this.proceso].getProceso();

		for (int j = 0; j < b.length; j++) {
			for (int j2 = 0; j2 < b.length; j2++) {
				if (a[j2] == i && c[2] > b[j2]) {
					this.proceso = j2;

				}

			}
		}
		if (c[2] == 0) {
			cond = true;
		} else {
			cond = false;
		}
		return cond;

	}

	public void validarProcesoMasCorto(boolean x, int y) {

		int uno[] = tabla[0].getProceso();
		int dos[] = tabla[1].getProceso();
		int tres[] = tabla[2].getProceso();
		int cuatro[] = tabla[3].getProceso();

		int a[] = { uno[1], dos[1], tres[1], cuatro[1] };
		int b[] = { uno[2], dos[2], tres[2], cuatro[2] };

		int procesoCorto = this.proceso;

		if (x == true) {
			procesoCorto = 10000;

			for (int j = 0; j < b.length; j++) {

				if (a[j] < y) {
					if (b[j] > 0) {
						if (b[j] < procesoCorto) {
							procesoCorto = b[j];
							this.proceso = j;

						}
					}
				}
			}

		}

	}

	public void iniciar(int i) {
		int columna = 1;


		int uno[] = tabla[0].getProceso();
		int dos[] = tabla[1].getProceso();
		int tres[] = tabla[2].getProceso();
		int cuatro[] = tabla[3].getProceso();

		int a[] = { uno[columna], dos[columna], tres[columna], cuatro[columna] };
		

		if (a[0] == i) {
			this.proceso = 0;
		}

	}

	public void reducirTiempoCPU(int proceso) {
		int temp[] = tabla[proceso].getProceso();

		temp[2]--;
	}

	public void imprimir(Procesos x[]) {

		for (int j = 0; j < x.length; j++) {
			int y[] = x[j].getProceso();
			System.out.println();
			for (int k = 0; k < y.length; k++) {
				System.out.print("[  " + y[k] + "  ]");
			}
		}

	}
}
