package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Politician;
import com.nt.service.PoliticianImplService;
@Component
public class JpaRepoitoryRunners implements CommandLineRunner {
	@Autowired
	 private PoliticianImplService PoliticianImplService;
	@Override
	public void run(String... args) throws Exception {
		/*
			String res = PoliticianImplService.deletepoliticianByIdsBatch(List.of(107,108,109));
			System.out.println(res);
			*/
		
		Politician politician = new Politician();
		politician.setPConstitency("mulugu");
		PoliticianImplService.showPolitionsList(politician, false, "page").forEach(System.out::println);

	}

}
