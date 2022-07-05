package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString

@NamedQuery(name="OTTForm.findAll", query="select o from ott_form o")

@Entity(name = "ott_form")
public class OTTForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ott_id")
	private int ottId;
	
	@Column(name = "ott_name")
	private String ottName;
	
	@Column(name = "ott_genre")
	private String ottGenre;
	
	@Column(name = "ott_reason")
	private String ottReason;
	
	@Column(name = "ott_time")
	private String ottTime;
	
}
