package com.example.prakash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prakash.entity.Dept;

public interface DeptRepository extends JpaRepository<Dept, Integer> {

}
