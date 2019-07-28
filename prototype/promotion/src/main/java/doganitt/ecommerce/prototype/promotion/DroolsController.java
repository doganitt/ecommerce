package doganitt.ecommerce.prototype.promotion;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import doganitt.ecommerce.prototype.product.ProductEntity;

@RestController
public class DroolsController {
	@Autowired
	KieContainer kieContainer;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/drools/basic-rule") 
	public ProductEntity basicRule() {
		ProductEntity product = new ProductEntity();
		product.setSellingPrice(10000);
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(product);
        kieSession.fireAllRules();
        kieSession.dispose();
		return product;
	}
}
