package br.com.loteria.model;

import java.util.Date;

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
@Table(name="tb_sessao", schema = "public")
@SequenceGenerator(name = "sq_sessao", sequenceName = "sq_sessao", allocationSize = 1)
public class SessaoEntity {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "sq_sessao")
	private Integer idSessao;

	private Date data;
	private Integer ordem;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "loteria", referencedColumnName = "idLoteria")
	private LoteriaEntity loteria;
}