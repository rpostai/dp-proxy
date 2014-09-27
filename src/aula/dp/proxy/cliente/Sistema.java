package aula.dp.proxy.cliente;

import aula.dp.proxy.ContaCorrenteProxy;
import aula.dp.proxy.ContaCorrenteService;

public class Sistema {
	public static void main(String[] args) {
		ContaCorrenteService s = new ContaCorrenteProxy();
		s.sacar(10);
	}
}
