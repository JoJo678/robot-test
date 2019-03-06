package com.example.robotrestserverapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.robotrestserverapi.model.Robot;


public interface RobotRepository extends JpaRepository<Robot,Integer>{

	

}