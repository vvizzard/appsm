package org.mlp.apps.occurrence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OccurrenceService {
	
//	@Autowired
//	private OccurrenceRepository occurrenceRepository;
	
	@Autowired
	private OccurrenceSaveRepository occurrenceSaveRepository;
	
	@Autowired
	private OccurrenceValidationRepository occurrenceValidationRepository;
	
	@Transactional()
	public Boolean deleteOccurrence(Integer idOccurrence, Integer idUser) {
		Boolean valiny = false;
		Optional<OccurrenceSave> toDelete = occurrenceSaveRepository.findById(idOccurrence);
		if(toDelete.isPresent()) {
			Integer idUp = toDelete.get().getIdUtilisateurUpload(); 
			if(idUp.intValue() == idUser.intValue()) {
				OccurrenceValidation ov = new OccurrenceValidation();
				ov.setIdDarwinCore(idOccurrence);
				List<OccurrenceValidation> tempOv = occurrenceValidationRepository.findAll(Example.of(ov));
				if(tempOv!=null && !tempOv.isEmpty()) {
					occurrenceValidationRepository.delete(tempOv.get(0));
				}
				occurrenceSaveRepository.deleteById(idOccurrence);
				valiny = true;
			}
		}
		return valiny;
	}
}
