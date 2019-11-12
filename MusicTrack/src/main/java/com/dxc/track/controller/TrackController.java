package com.dxc.track.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.track.model.Track;
import com.dxc.track.repo.TrackRepository;

@RestController
public class TrackController {
	
	@Autowired
	private TrackRepository trackRepo;

	@PostMapping("/track")
	public void create(@RequestBody Track tracks) {
		trackRepo.insert(tracks);

	}
	
	@GetMapping("/track")
	public List<Track> findAll(){
		return trackRepo.findAll();
	}
	
	@DeleteMapping("/track/{id}")
	public void deleteByUser(@PathVariable String id) {
		trackRepo.deleteById(id);
	}
	
	@PutMapping("/track")
	public void update(@RequestBody Track tracks) {
		trackRepo.save(tracks);
	}
}
