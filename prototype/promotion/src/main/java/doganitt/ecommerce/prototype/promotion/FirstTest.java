package doganitt.ecommerce.prototype.promotion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class FirstTest {

	@RequestMapping("/wonjin/hello")
	public String test() {
		return "hello wonjin";
	}

}
