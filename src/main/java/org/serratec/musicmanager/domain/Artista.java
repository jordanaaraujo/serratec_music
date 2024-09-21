package org.serratec.musicmanager.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="artista")
public class Artista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Size(min=5, max=100)
	@Column(name="nome", length = 100, nullable = false)
	private String nome;
	@NotNull
	@Column(name="tipo_artista", length =1, nullable=false)
	private String tipoArtista;
	
	
	public Artista(Long id, String nome, String tipoArtista) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipoArtista = tipoArtista;
	}
	
	public Artista() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoArtista() {
		return tipoArtista;
	}
	public void setTipoArtista(String tipoArtista) {
		this.tipoArtista = tipoArtista;
	}

}
