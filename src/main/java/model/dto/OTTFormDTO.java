package model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import model.entity.OTTForm;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString

public class OTTFormDTO {
	
	private int ottId;
	
	private String ottName;
	
	private String ottGenre;
	
	private String ottReason;
	
	private String ottTime;
	
	public OTTForm toEntity() {
		return OTTForm.builder().ottName(ottName).ottGenre(ottGenre).ottReason(ottReason).ottTime(ottTime).build();
	}
		
}
