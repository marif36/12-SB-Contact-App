package in.arifer.bindings;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ContactForm {
   
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private String contactNumber;
	private String activeSw;
	private LocalDate createdDate;
	private LocalDate updatedDate;
}
