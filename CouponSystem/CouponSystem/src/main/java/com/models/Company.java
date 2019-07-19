package com.models;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@EntityScan
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(appliesTo="Company")

public class Company {
	
	@Id
	@GeneratedValue	
	private long id;
	
	
	@Basic(optional = false)
	@Column(nullable = false)
	private String companyName;
	
	@Basic(optional = false)
	@Column(nullable = false)
	private String password;
	
	@Basic(optional = false)
	@Column(nullable = false)
	private String email;

}
