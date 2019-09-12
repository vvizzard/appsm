package org.mlp.apps.metadata;

import java.util.List;
import java.util.Optional;

import org.mlp.apps.photo.PhotoBreakpointRepository;
import org.mlp.apps.photo.PhotoRepository;
import org.mlp.apps.photo.PhotoService;
import org.mlp.apps.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class NmetadataController {
	
	@Autowired
	private MetadataRepository metadataRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PhotoService photoService;
	
	@Autowired
	private PhotoRepository photoRepository;
	
	@Autowired
	private PhotoBreakpointRepository photoBreakpointRepository;
	
	@GetMapping("/public/metadatas")
	public List<Metadata> getAllMetadatas(@RequestParam(required = false, 
			value = "page") Integer page, @RequestParam(required=false, 
			value="limite") Integer limite) {
		if(page != null && limite != null && page>= 1 && limite > 0) {
			Pageable pageable = PageRequest.of(page - 1, limite);
			return metadataRepository.findAll(pageable).getContent();
		}
		return metadataRepository.findAll();
	}
	
	@GetMapping("/public/metadata/{id}")
	public Optional<Metadata> findById(@PathVariable Integer id) {
		return metadataRepository.findById(id);
	}
	
	@GetMapping("/public/{filter}")
	public List<Metadata> findById(@PathVariable String filter) {
		if (filter.compareTo("photos")==0) {
			filter = "1";
		} else if (filter.compareTo("videos")==0) {
			filter = "2";
		} else if (filter.compareTo("audios")==0) {
			filter = "3";
		} else if (filter.compareTo("documents")==0) {
			filter = "4";
		}
		return metadataRepository.findByType(filter);
	}
	
	private String getYear(String date) {
		String[] splited = date.split("[,.@?!_'/]");
		for (String s : splited) {
			if (s.length()==4) return s;
		}
		return "";
	}
}
