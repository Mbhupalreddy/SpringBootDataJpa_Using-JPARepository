package com.nt.runners;

import java.util.List;
import com.nt.service.PoliticianImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Politician;
import com.nt.service.IpoliticianService;

@Component
public class JpaRepoitoryRunners implements CommandLineRunner {

    private final PoliticianImplService politicianImplService;
	@Autowired
	 private IpoliticianService ipoliticianService;

    JpaRepoitoryRunners(PoliticianImplService politicianImplService) {
        this.politicianImplService = politicianImplService;
    }
	@Override
	public void run(String... args) throws Exception {
		/*
			String res = PoliticianImplService.deletepoliticianByIdsBatch(List.of(107,108,109));
			System.out.println(res);
			*/
		
	/*	Politician politician = new Politician();
		politician.setPConstitency("mulugu");
		ipoliticianService.showPolitionsList(politician, false, "page").forEach(System.out::println);
		*/
		System.out.println(ipoliticianService.findPoliticianById(106));
	}

}
