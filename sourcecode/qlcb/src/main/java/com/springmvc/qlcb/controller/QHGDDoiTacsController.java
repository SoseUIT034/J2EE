package com.springmvc.qlcb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springmvc.qlcb.model.CanboGiadinhDoitac;

@Controller
@RequestMapping(value = "QuanheGiaDinhDoiTac")
public class QHGDDoiTacsController {

 
	/*@Autowired
	private DaoTaoChuyenMonService  daoTaoChuyenMonService ;
	*/
	
	@RequestMapping(value = { "create"}, method = RequestMethod.GET)
	public String Create(HttpSession session, HttpServletRequest request,Model model) {
		model.addAttribute("CanboGiadinhDoitac", new CanboGiadinhDoitac());  
		return "/lylich_canbo/QuanHeGDDoiTac/create";
	}
	
	@RequestMapping(value ={"create"}, method = RequestMethod.POST)
	public String doCreate(@Valid @ModelAttribute(value = "CanboGiadinhDoitac")  CanboGiadinhDoitac  data,HttpSession session, HttpServletRequest request,Model model ) 
	{
 
		     // luu xong roi tra ve gia tri
		 
		return "/layout/masterpage";  
	}
	
	
	@RequestMapping(value = {"edit/{id}"}, method = RequestMethod.GET)
	public String Edit(@PathVariable int id,HttpSession session, HttpServletRequest request,Model model) {
		
		CanboGiadinhDoitac d=new CanboGiadinhDoitac();
		d.setId(id);
		model.addAttribute("CanboGiadinhDoitac", d); 
		return "/lylich_canbo/QuanHeGDDoiTac/edit";
	}
	
	@RequestMapping(value ="edit", method = RequestMethod.POST)
	public String doEdit(@Valid @ModelAttribute(value = "CanboGiadinhDoitac")  CanboGiadinhDoitac  data,HttpSession session, HttpServletRequest request,Model model ) 
	{
 
		     // luu xong roi tra ve gia tri
		 
		return "/layout/masterpage";  
	}
	
	
	@RequestMapping(value = { "delete/{id}"}, method = RequestMethod.GET)
	public String Delete(@PathVariable int id,HttpSession session, HttpServletRequest request,Model model) {
		CanboGiadinhDoitac d=new CanboGiadinhDoitac();
		d.setId(id);
		model.addAttribute("CanboGiadinhDoitac", d);  
		return "/lylich_canbo/QuanHeGDDoiTac/delete";
	}
	
	@RequestMapping(value = { "delete/{id}"}, method = RequestMethod.POST)
	public String doDelete(@PathVariable int id,HttpSession session, HttpServletRequest request,Model model) {
		
		return "/layout/masterpage";  
	}
	
	 
}
