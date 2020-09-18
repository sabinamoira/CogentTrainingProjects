package walking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class ProductOption implements  Serializable {
	private static final long serialVersionUID = 5L;
	@Id @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productOptionID;
	@ManyToOne()
	@JoinColumn(name="productID")
	private Product product;
	@OneToOne()
	@JoinColumn(name="optionID")
	private Options option;

}
