package Porfolio.BackEnd.service;

import Porfolio.BackEnd.model.Home;
import Porfolio.BackEnd.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HomeService {
    private final HomeRepository homeRepository;

   @Autowired
    public HomeService(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }
    public Home addHome (Home home){
        return homeRepository.save(home);
    }
    public List<Home> buscarHome(){
        return homeRepository.findAll();
    }
    public Home editarHome (Home home){
        return homeRepository.save(home);
    }
    public void borrarHome (Long id){
        homeRepository.deleteById(id);
    }
}

