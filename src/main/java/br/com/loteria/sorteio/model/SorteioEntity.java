package br.com.loteria.sorteio.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="tb_sorteio", schema = "public")
@SequenceGenerator(name = "SQ_SORTEIO", sequenceName = "SQ_SORTEIO", allocationSize = 1)
public class SorteioEntity {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SQ_SORTEIO")
	private Integer idSorteio;
	
	private String centena;
	private String milhar;
	private Integer premio;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cdSessao", referencedColumnName = "idSessao")
	private SessaoEntity sessao;
	
	
}
