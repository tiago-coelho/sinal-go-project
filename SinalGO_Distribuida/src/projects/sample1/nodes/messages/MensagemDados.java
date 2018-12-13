package projects.sample1.nodes.messages;

import java.awt.Color;
import java.util.Random;

import projects.sample1.Configuracoes;
import sinalgo.nodes.messages.Message;

//classe que implementa a mensagem de dados
public class MensagemDados extends Message{
	
	protected int idAnterior;
	protected int idOrigem;
	
	Random rand = new Random();
	
	//gera uma temperatura aleat�ria dentro do intervalo configurado
	int temperatura = rand.nextInt(Configuracoes.maxTemperatura-Configuracoes.minTemperatura)+Configuracoes.minTemperatura;
	
	//gera a umidade aleat�ria dentro do intervalo configurado
	int umidade = rand.nextInt(Configuracoes.maxUmidade-Configuracoes.minUmidade)+Configuracoes.minUmidade;

	public int getIdAnterior() {
		return idAnterior;
	}

	public void setIdAnterior(int idAnterior) {
		this.idAnterior = idAnterior;
	}

	public int getIdOrigem() {
		return idOrigem;
	}
	
	public int getTemperatura(){
		return temperatura;
	}
	
	public int getUmidade(){
		return umidade;
	}
	
	@Override
	public Message clone() {
		return new MensagemDados(idOrigem, idAnterior);
	}
	
	//deixa os envelopes de dados na cor amarela
	@Override
	public Color getEnvelopeColor(){
		return Color.YELLOW;
	}

	public MensagemDados(int idOrigem, int idAnterior) {
		super();
		this.idOrigem = idOrigem;
		this.idAnterior = idAnterior;
	}
	
	public MensagemDados(int idOrigem) {
		super();
		this.idAnterior = idOrigem;
		this.idOrigem = idOrigem;
	}

}
