package com.bawei.hgshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*import com.bawei.hgshop.config.MyConfigProperties;*/

//import com.bawei.hgshop.config.ConfigProperties;
//import com.bawei.hgshop.service.impl.ValidatorFactory;

@Controller 
public class IndexController {
	
	
/*	@Autowired
	MyConfigProperties  cp;
	*/
	
	
	@RequestMapping({"/","index"})
	public String index(){
	//	System.out.println("cp " + cp.getPort());
		return "index";
	}

}
