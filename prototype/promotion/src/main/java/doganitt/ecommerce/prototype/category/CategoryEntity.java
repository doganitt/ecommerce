package doganitt.ecommerce.prototype.category;

import java.util.List;

import doganitt.ecommerce.prototype.product.ProductEntity;

public class CategoryEntity {
	String id;
	String name;
	String fullPath;
	
	List<ProductEntity> producs;
}
