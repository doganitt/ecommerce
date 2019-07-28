package doganitt.ecommerce.prototype.product;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class ProductApi {

	Map<String, ProductEntity> dataMap = new HashMap<>();
	
	@PostConstruct
	public void init() {
		//TODO data.product.initial.json 으로 부터 기초 데이터 로드 하는 것 구현할 것
	}
	
	public ProductEntity get(String id) {
		if (dataMap.containsKey(id)) {
			throw new NoSuchElementException("id["+id+"]는 존재하지 않습니다.");
		}
		
		return dataMap.get(id);
	}
}
