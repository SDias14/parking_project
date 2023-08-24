package impact.ead.estacionamento.utilitario;

import impact.ead.estacionamento.negocio.Movimentacao;


/**
 * Representa um classe de apoio as demais do sistema
 * 
 * @author sdias
 * 
 * 
 */
public class EstacionamentoUtil {
	
	/**
	 * Valida a placa com o padrao nacional : LLL-NNNN
	 * L = LETRA
	 * N = NUMERO
	 * @param placa = Placa do veiculo 
	 * @return true se atender o padrao e false se nao. 
	 */
	public boolean validarPadraoPlaca(String placa) {
		//TODO implementar
		return false;
	}
	/**
	 * Realiza o calculo do valor da estada do veiculo baseado no tarifario
	 * e na hora de entrada e saida do veiculo
	 * 
	 * altera a propria instancia do parametro. 
	 * 
	 * @param movimentacao Instancia da movimentacao 
	 */
	public void calcularPagamento(Movimentacao movimentacao) {
		//TODO implementar
	}

}
