package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {
	
	
	
	public boolean autenticarCursoJava(PermitirAcesso acesso) {
		return acesso.autenticar();
	}

}
