package com.dxc.music.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Artist {

	@Id
	private String id;
	private String name;
	
	@DBRef
	private List<Track> tracks;
	
	@DBRef
	private List<Albums> albums;

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artist(String id, String name, List<Track> tracks, List<Albums> albums) {
		super();
		this.id = id;
		this.name = name;
		this.tracks = tracks;
		this.albums = albums;
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

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	public List<Albums> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Albums> albums) {
		this.albums = albums;
	}
	
	
	
}
