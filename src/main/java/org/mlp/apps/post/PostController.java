package org.mlp.apps.post;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.mlp.apps.photo.Photo;
import org.mlp.apps.photo.PhotoBreakpoint;
import org.mlp.apps.photo.PhotoBreakpointRepository;
import org.mlp.apps.photo.PhotoRepository;
import org.mlp.apps.photo.PhotoService;
import org.mlp.apps.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*")
public class PostController {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PhotoRepository photoRepository;
	
	@Autowired
	private PhotoBreakpointRepository photoBreakpointRepository;
	
	@Autowired
	private PhotoService photoService;

	@GetMapping("/public/posts")
	public List<Post> getAllPosts(@RequestParam(required = false, 
			value = "page") Integer page, @RequestParam(required=false, 
			value="limite") Integer limite) {
		if(page != null && limite != null && page>= 1 && limite > 0) {
			Pageable pageable = PageRequest.of(page - 1, limite);
			return postRepository.findTopPublication(pageable).getContent();
		}
		try {
			Pageable pageable = PageRequest.of(0, 20);
			return postRepository.findTopPublication(pageable).getContent();
		} catch(NullPointerException npe) {
			return null;
		}
		
	}
	
	@GetMapping("/public/responses/{id}")
	public List<Post> getAllResponse(@RequestParam(required = false, 
			value = "page") Integer page, @RequestParam(required=false, 
			value="limite") Integer limite, @PathVariable Integer id) {
		Post temp = new Post();
		temp.setParentId(id);
		Example<Post> example = Example.of(temp);
		
		if(page != null && limite != null && page>= 1 && limite > 0) {
			Pageable pageable = PageRequest.of(page - 1, limite);
			return postRepository.findAll(example, pageable).getContent();
		}
		try {
			Pageable pageable = PageRequest.of(0, 20);
			return postRepository.findAll(example, pageable).getContent();
		} catch(NullPointerException npe) {
			return null;
		}
		
	}
	
	@GetMapping("/public/post/{id}")
	public Optional<Post> findById(@PathVariable Integer id) {
		return postRepository.findById(id);
	}
	
	@PostMapping("/user/post")
	public Boolean postPost(@RequestParam("token") String token, 
			@RequestParam("title") String title, @RequestParam("body") String body,
			@RequestParam("topic") Integer thematiqueId,
			@RequestParam(name = "file", required = false) List<MultipartFile> file) {
		Boolean valiny = false;
		
		Post post = new Post();
		
		try {
			post.setOwnerId(userRepository.findById(Integer.parseInt(
	        		token.substring(token.indexOf(",.5")+3))).get().getId());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		post.setTitle(title);
		post.setBody(body);
		post.setCreationDate(Calendar.getInstance().getTime());
		post.setDeleted(false);
		post.setThematiqueId(thematiqueId);
		
		if (file != null && !file.isEmpty() ) {
			List<Photo> photos = new ArrayList<>();
			
			for (MultipartFile f : file) {
				Photo photo = new Photo();
				photo.setIdUser(Integer.getInteger(token.substring(token.indexOf(",.5")+1)));
				try {
					photoService.preparePhoto(photo, f.getBytes());
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
				photos.add(photo);
			}
			
			post.setPhotos(photos);
			post = postRepository.save(post);
			
			for (Photo p : post.getPhotos()) {
				p.setIdPost(post.getId());
			}
			post.setPhotos(photoRepository.saveAll(post.getPhotos()));
			
			for (Photo p : post.getPhotos()) {
				for (PhotoBreakpoint pb : p.getBreakpoints()) {
					pb.setIdPhoto(p.getId());
				}
				photoBreakpointRepository.saveAll(p.getBreakpoints());
			}
		} else {
			post = postRepository.save(post);
		}
		
		valiny = true;
		
		return valiny;
	}
	
	@PostMapping("/user/answer/{id}")
	public Boolean postResponse(@RequestParam("token") String token, 
			@RequestParam("title") String title, @RequestParam("body") String body,
			@RequestParam("topic") Integer thematiqueId, @PathVariable Integer id,
			@RequestParam(name = "file", required = false) List<MultipartFile> file) {
		Boolean valiny = false;
		
		Post post = new Post();
		
		try {
			post.setOwnerId(userRepository.findById(Integer.parseInt(
	        		token.substring(token.indexOf(",.5")+3))).get().getId());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		post.setTitle(title);
		post.setBody(body);
		post.setParentId(id);
		post.setCreationDate(Calendar.getInstance().getTime());
		post.setDeleted(false);
		post.setThematiqueId(thematiqueId);
		
		if (file != null && !file.isEmpty() ) {
			List<Photo> photos = new ArrayList<>();
			
			for (MultipartFile f : file) {
				Photo photo = new Photo();
				photo.setIdUser(Integer.getInteger(token.substring(token.indexOf(",.5")+1)));
				try {
					photoService.preparePhoto(photo, f.getBytes());
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
				photos.add(photo);
			}
			
			post.setPhotos(photos);
			post = postRepository.save(post);
			
			for (Photo p : post.getPhotos()) {
				p.setIdPost(post.getId());
			}
			post.setPhotos(photoRepository.saveAll(post.getPhotos()));
			
			for (Photo p : post.getPhotos()) {
				for (PhotoBreakpoint pb : p.getBreakpoints()) {
					pb.setIdPhoto(p.getId());
				}
				photoBreakpointRepository.saveAll(p.getBreakpoints());
			}
		} else {
			post = postRepository.save(post);
		}
		
		valiny = true;
		
		return valiny;
	}
}
