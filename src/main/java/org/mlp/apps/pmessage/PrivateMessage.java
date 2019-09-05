package org.mlp.apps.pmessage;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.mlp.apps.base.BaseEntity;

@Entity
@Table(name="private_message")
public class PrivateMessage extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6254200945655791309L;

	@Column(name="destinataire_id", nullable=false)
	private Integer destinataireId;
	
	@Column(name="sender_id", nullable=false)
	private Integer senderId;
	
	@Column(name="subject", nullable=false)
	private String subject;
	
	@Column(name="body", nullable=false)
	private String body;

	@Column(name="date", nullable=false)
	private Date date;
	
	@Column(name="is_read_by_destinaire", nullable=false)
	private Boolean readByDestinataire = false;

	public Integer getDestinataireId() {
		return destinataireId;
	}

	public void setDestinataireId(Integer destinataireId) {
		this.destinataireId = destinataireId;
	}

	public Integer getSenderId() {
		return senderId;
	}

	public void setSenderId(Integer senderId) {
		this.senderId = senderId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getReadByDestinataire() {
		return readByDestinataire;
	}

	public void setReadByDestinataire(Boolean readByDestinataire) {
		this.readByDestinataire = readByDestinataire;
	}
	
	
}
