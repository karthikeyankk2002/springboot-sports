package com.example.sports.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sports.Model.sports;

@Repository
public interface sportsResp extends JpaRepository<sports,Integer>{

}
