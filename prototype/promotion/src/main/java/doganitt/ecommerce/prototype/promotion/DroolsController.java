package doganitt.ecommerce.prototype.promotion;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DroolsController {
	@Autowired
	KieContainer kieContainer;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/drools/basic-rule") 
	public RuleEntity basicRule() {
		RuleEntity entity = new RuleEntity();
        KieSession kieSession = kieContainer.newKieSession();
//        kieSession.setGlobal("rideFare", rideFare);
        kieSession.insert(entity);
        kieSession.fireAllRules();
        kieSession.dispose();
		return entity;
	}
}
