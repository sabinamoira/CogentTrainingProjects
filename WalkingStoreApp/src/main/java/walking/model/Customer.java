package walking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Customer implements  Serializable {
	private static final long serialVersionUID = 6L;
	@Id @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerID;
	@Column
	private String customerEmail;
	@Column
	private String password;
	@Column
	private String firstName;
	@Column
	private String lastName;
	
	
	

}
