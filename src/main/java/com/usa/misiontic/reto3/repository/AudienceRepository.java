package com.usa.misiontic.reto3.repository;

import com.usa.misiontic.reto3.entities.Audience;
import com.usa.misiontic.reto3.entities.Category;
import com.usa.misiontic.reto3.repository.crudRepository.AudienceCrudRepository;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AudienceRepository {

    @Autowired
    private AudienceCrudRepository audienceCrudRepository;

    public List<Audience> getAll(){
        return (List<Audience>) audienceCrudRepository.findAll();
    }

    public Optional<Audience> getAudience(int id){
        return audienceCrudRepository.findById(id);
    }
    public Audience save(Audience c){
        return audienceCrudRepository.save(c);
    }
    public void delete(Audience c){
        audienceCrudRepository.delete(c);
    }
}
