package com.example.prakash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prakash.time.TimeStamp;

public interface TimeRepository extends JpaRepository<TimeStamp, Integer>{

}
