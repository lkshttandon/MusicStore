package com.dxc.album.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.album.model.Albums;

public interface AlbumRepository extends MongoRepository<Albums,String>{

}
