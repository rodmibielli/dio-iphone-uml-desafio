package com.rodmibielli.apple.api;

/**
 * Um SincronizadorDeAudioEVideoGenerico é uma classe abstrata que é um reprodutor musical e de video possuindo uma 
 * funcionalidade básica de sincronização de áudio e vídeo.
 * @author rodrigo
 * @since 1.0.0-SNAPSHOT
 */
public abstract class SincronizadorDeAudioEVideoGenerico implements ReprodutorMusical, ReprodutorVideo {

	private final EstrategiaSincronizacao sincronizador;
	
	public SincronizadorDeAudioEVideoGenerico(EstrategiaSincronizacao sincronizador) {
		
		if (sincronizador == null) {
			throw new IllegalArgumentException("O sincronizador não pode estar nulo!");
		}
		
		this.sincronizador = sincronizador;
	}
	
	/**
	 * Sincroniza as músicas para este reprodutor de áudio.
	 */
	public void sincronizarMusica() {
		this.sincronizador.sincronizarMusica(this);
	}
	
	/**
	 * Sincroniza os vídeos para este reprodutor de vídeo.
	 */
	public void sincronizarVideo() {
		this.sincronizador.sincronizarVideo(this);
	}

}
