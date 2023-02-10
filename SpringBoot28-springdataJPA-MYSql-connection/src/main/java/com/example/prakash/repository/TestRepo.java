package com.example.prakash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prakash.test.Testclass;

public interface TestRepo extends JpaRepository<Testclass, Integer> {

}
