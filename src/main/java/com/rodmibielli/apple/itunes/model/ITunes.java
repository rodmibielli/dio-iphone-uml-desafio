package com.rodmibielli.apple.itunes.model;

import com.rodmibielli.apple.api.EstrategiaSincronizacao;
import com.rodmibielli.apple.api.SincronizadorDeAudioEVideoGenerico;

/**
 * Modela as funcionalidades do ITunes.
 * @author rodrigo
 * @since 1.0.0-SNAPSHOT
 */
public class ITunes extends SincronizadorDeAudioEVideoGenerico {
	
	/**
	 * Instancia um novo IPhone.
	 * @param sincronizador O sincronizador responsável por sincronizar áudios e vídeos para este ITunes.
	 */
	public ITunes(EstrategiaSincronizacao sincronizador) {
		super(sincronizador);
	}
	
	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void tocarMusica() {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void pausarMusica() {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void selecionarMusica(String musica) {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void tocarVideo() {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void pausarVideo() {
	}

	/**
	 * @TODO: Implementar o método
	 */
	@Override
	public void selecionarVideo(String video) {
	}

}
