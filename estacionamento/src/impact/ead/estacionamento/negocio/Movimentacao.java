package impact.ead.estacionamento.negocio;

import java.time.LocalDateTime;

/**
 * Representa o fluxo de entrada e saida do estacionamento. ou seja, 
 * ele representa o fluxo de entrada e saida do veiculo e o valor final pago. 
 * 
 * @author sdias
 * 
 */
public class Movimentacao {
	
	private Veiculo veiculo;
	private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida; 
    private double valor;
}
