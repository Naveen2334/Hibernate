package hibbernate_one_to_one_bidirectional.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
	@Id
	@Column(name = "LapId")
	private int laptopId;
	@Column(name ="laptopName")
	private String laptopName;
	@Column(name = "laptopColor")
	private String laptopColor;
	//ask why we are making constructor
	public Laptop(int laptopId, String laptopName, String laptopColor) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopColor = laptopColor;
	}
	//know more about cascade
	@OneToOne(mappedBy = "laptop", cascade = CascadeType.ALL)
   private Employee employee;

}
