package com.dxc.music.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.music.model.Artist;

public interface ArtistRepository extends MongoRepository<Artist,String>{

}
