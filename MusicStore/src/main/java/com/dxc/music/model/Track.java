package com.dxc.music.model;

import java.util.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Track {
	@Id
	private String id;
	private String name;
	
	@DBRef
	private List<Artist> artists;
	
	public Track(String id, String name, List<Artist> artists) {
		super();
		this.id = id;
		this.name = name;
		this.artists = artists;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
}
