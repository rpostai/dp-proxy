package aula.dp.proxy;

import java.util.logging.Logger;

public class ContaCorrenteProxy implements ContaCorrenteService {
	
	private static final Logger log = Logger.getAnonymousLogger();
	
	private RemoteContaCorrenteService service;
	
	public ContaCorrenteProxy() {
		log.info("Iniciando serviço de conta corrente no servidor remoto");
		service = new RemoteContaCorrenteService();
	}

	@Override
	public void sacar(double valor) {
		log.info("Sacando o valor de R$ valor " + valor);
		service.sacar(valor);
	}

}
