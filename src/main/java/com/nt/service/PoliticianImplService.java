package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
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

	@Override
	public List<Politician> showPolitionsList(Politician exPolitician, boolean ascOrder, String... prop) {
		//prepare the Sort object
		Sort sort = Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,prop);
		//create the Example object
		Example<Politician> example = Example.of(exPolitician);
		//use the repo
		List<Politician> list = politicianRepository.findAll(example, sort);
		return list;
	}
	@Override
	public Politician findPoliticianById(Integer id) {
		 return politicianRepository.getReferenceById(id);
		
	}

}
