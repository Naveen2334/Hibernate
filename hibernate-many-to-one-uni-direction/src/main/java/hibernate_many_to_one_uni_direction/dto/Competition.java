package hibernate_many_to_one_uni_direction.dto;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "indiancompetition")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Competition {
	private int competitionId;
	private  String competitionName;
	private int competitionYear;
	private String sponsorsName;
	@Transient
	private String competitionChairman;

}
