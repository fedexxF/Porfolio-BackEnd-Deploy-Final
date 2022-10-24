package Porfolio.BackEnd.service;

import Porfolio.BackEnd.model.Body;
import Porfolio.BackEnd.model.Educacion;
import Porfolio.BackEnd.repository.BodyRepository;
import Porfolio.BackEnd.repository.EduacacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BodyService {
    private final BodyRepository bodyRepository;

    @Autowired
    public BodyService(BodyRepository bodyRepository) {
        this.bodyRepository = bodyRepository;
    }

    public Body addBody (Body body){
        return bodyRepository.save(body);
    }
    public List<Body> buscarBody(){
        return bodyRepository.findAll();
    }
    public Body editarBody (Body body){
        return bodyRepository.save(body);
    }
    public void borrarBody (Long id){
        bodyRepository.deleteById(id);
    }
}


