package com.dxc.track.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.track.model.Track;

public interface TrackRepository extends MongoRepository<Track,String>{

}
