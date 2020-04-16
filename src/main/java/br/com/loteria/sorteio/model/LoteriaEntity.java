package br.com.loteria.sorteio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="tb_loteria", schema = "public")
@SequenceGenerator(name = "sq_loteria", sequenceName = "sq_loteria", allocationSize = 1)
public class LoteriaEntity {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "sq_loteria")
	private Integer idLoteria;

	private String nome;
}