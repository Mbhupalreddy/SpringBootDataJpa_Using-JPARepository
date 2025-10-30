package com.nt.service;

import java.util.List;

import com.nt.entity.Politician;

public interface IpoliticianService {
	public String deletepoliticianByIdsBatch(List<Integer> ids);
	public List<Politician> showPolitionsList(Politician exPolitician,boolean ascOrder,String...prop);

}
