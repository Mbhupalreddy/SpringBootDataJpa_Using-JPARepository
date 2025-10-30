package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Politician;
@Repository
public interface IpoliticianRepository extends JpaRepository<Politician, Integer> {

}
