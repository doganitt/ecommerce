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
		//TODO data.product.initial.json ���� ���� ���� ������ �ε� �ϴ� �� ������ ��
	}
	
	public ProductEntity get(String id) {
		if (dataMap.containsKey(id)) {
			throw new NoSuchElementException("id["+id+"]�� �������� �ʽ��ϴ�.");
		}
		
		return dataMap.get(id);
	}
}
