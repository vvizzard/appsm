package org.mlp.apps.pmessage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivateMessageRepository extends JpaRepository<PrivateMessage, Integer> {

	public List<PrivateMessage> findByDestinataireId(Integer destinataireId);
}
