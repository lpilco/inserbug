package ec.com.inserbug;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (schema="procesos",name = "INSTITUTO")
public class instituto {
	
	@Id
	@Column (name = "ID_Instituto", unique = true, nullable = false)
	@SequenceGenerator(schema="procesos", name = "instituto_id_generator", sequenceName="procesos.instituto_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "instituto_id_generator")
	private Long idInstituto;
	
	@Column (name = "nombre_Instituto", columnDefinition="character varying(150)",unique = true, nullable = false)
	private String nombreInstituto;
	
	@Column (name = "direccion_Instituto", columnDefinition="character varying(250)",unique = true, nullable = false)
	private String direccionInstituto;
	
	@Column (name = "telefono_Instituto", columnDefinition="character varying(20)",unique = true, nullable = false)
	private String telefonoInstituto;
	
}
