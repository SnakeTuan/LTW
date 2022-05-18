package tacos;

import java.util.*;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
public class Taco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	
	private String name;
	
	private Date createdAt;
	
	@ManyToMany(targetEntity=Ingredient.class)
	private List<Ingredient> ingredients;
	
	@PrePersist
	void createdAt() {
		this.createdAt = new Date();
	}
}
