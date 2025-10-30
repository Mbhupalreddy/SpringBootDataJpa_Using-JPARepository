package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Jpa_Politician")
public class Politician {
	@Column(name="Pid")
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "Pno_SEQ",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer Pid;
	
	@Column(name="pname",length = 30)
	private String pname;
	
	@Column(name="paddrs",length=30)
	private String paddrs;
	
	@Column(name="page")
	private Integer page;
	
	@Column(name="pConstitency",length=30)
	private String pConstitency;
	
	

}
