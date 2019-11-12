package com.dxc.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.music.model.Artist;
import com.dxc.music.repo.ArtistRepository;

@RestController
public class ArtistController {
	
	@Autowired
	private ArtistRepository artistRepo;

	@PostMapping("/artist")
	public void create(@RequestBody Artist artist) {
		artistRepo.save(artist);

	}
	
	@GetMapping("/artist")
	public List<Artist> findAll(){
		return artistRepo.findAll();
	}

}
