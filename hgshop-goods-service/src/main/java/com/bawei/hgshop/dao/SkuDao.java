package com.bawei.hgshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.bawei.hgshop.pojo.Sku;
import com.bawei.hgshop.pojo.SpecOption;

/**
 * 
 * @author zhuzg
 *
 */
public interface SkuDao {
	
	
	List<Sku> list(Sku sku);
	
	Sku get(int id);
	
	// 添加sku
	int addSku(Sku sku);
	//添加对应sku的属性值
	int addSkuSpec(@Param("skuId") int skuId,@Param("so") SpecOption so);
	
	
	
	
}
