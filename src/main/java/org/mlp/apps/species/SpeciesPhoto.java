package org.mlp.apps.species;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.mlp.apps.photo.Photo;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "photo_taxonomi")
public class SpeciesPhoto {

	@Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
	
	@Column(name = "id_taxonomi")
    private Integer idTaxonomi;

    @Column(name = "id_utilisateur_upload")
    private Integer idUploader;

    @Column(name = "chemin")
    private String chemin;

    @Column(name = "profil")
    private Boolean profil;

    @Column(name = "date_photo")
    private Date datePhoto;

    @Column(name = "date_pris_photo")
    private Date datePrisPhoto;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "id_taxonomi", insertable = false, updatable = false)
    private Species species = null;

	public Integer getId() {
		return id;
	}

	public Integer getIdTaxonomi() {
		return idTaxonomi;
	}

	public Integer getIdUploader() {
		return idUploader;
	}

	public String getChemin() {
		return chemin;
	}

	public Boolean getProfil() {
		return profil;
	}

	public Date getDatePhoto() {
		return datePhoto;
	}

	public Date getDatePrisPhoto() {
		return datePrisPhoto;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setIdTaxonomi(Integer idTaxonomi) {
		this.idTaxonomi = idTaxonomi;
	}

	public void setIdUploader(Integer idUploader) {
		this.idUploader = idUploader;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	public void setProfil(Boolean profil) {
		this.profil = profil;
	}

	public void setDatePhoto(Date datePhoto) {
		this.datePhoto = datePhoto;
	}

	public void setDatePrisPhoto(Date datePrisPhoto) {
		this.datePrisPhoto = datePrisPhoto;
	}

    
}
