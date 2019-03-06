package com.example.robotrestserverapi.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.robotrestserverapi.model.Robot;
import com.example.robotrestserverapi.repository.RobotRepository;

@Service
public class RobotDAO {
	@Autowired
	RobotRepository robotRepo;
	
	
    public Robot save(Robot rob) {
        return robotRepo.save(rob);
    }
	
    public List<Robot> findAll() {
        return robotRepo.findAll();
    }
    
    public Robot findOne(Integer id) {
    	return robotRepo.getOne(id);
    }
    
    public void delete(Robot rob) {
    	robotRepo.delete(rob);
    }

}
