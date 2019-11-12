package com.dxc.album.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Albums {
	
	@Id
	private String id;
	private String Name;
	
	@DBRef
	private Artist artist;
	
	@DBRef
	private List<Track> tracks;

	public Albums() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Albums(String id, String name, Artist artist, List<Track> tracks) {
		super();
		this.id = id;
		Name = name;
		this.artist = artist;
		this.tracks = tracks;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
	

}
