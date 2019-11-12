package com.dxc.album.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.album.model.Albums;
import com.dxc.album.repo.AlbumRepository;


@RestController
public class AlbumController {
	
	@Autowired
	private AlbumRepository albumRepo;

	@PostMapping("/album")
	public void create(@RequestBody Albums album) {
		albumRepo.insert(album);

	}
	
	@GetMapping("/album")
	public List<Albums> findAll(){
		return albumRepo.findAll();
	}
	@DeleteMapping("/album/{id}")
	public void deleteByUser(@PathVariable String id) {
		albumRepo.deleteById(id);
	}
	@PutMapping("/album")
	public void update(@RequestBody Albums album) {
		albumRepo.save(album);
	}
}
