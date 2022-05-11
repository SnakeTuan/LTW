package tacos;

import java.util.*;
import lombok.Data;

@Data
public class Taco {
	
	private Long id;
	private Date createdAt;
	private String name;
	private List<Ingredient> ingredients;
}
