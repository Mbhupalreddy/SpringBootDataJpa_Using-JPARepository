package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Politician;
import com.nt.repository.IpoliticianRepository;

@Service
public class PoliticianImplService implements IpoliticianService {
	@Autowired
	 private IpoliticianRepository politicianRepository;

	@Override
	public String deletepoliticianByIdsBatch(List<Integer> ids) {
		//find all ids
		List<Politician> list = politicianRepository.findAllById(ids);
		//delete list of records by ids
		politicianRepository.deleteAllByIdInBatch(ids);
		
		return list.size()+"Records are deleted!!";
	}

}
