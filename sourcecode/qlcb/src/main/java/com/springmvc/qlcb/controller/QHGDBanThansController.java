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
import com.springmvc.qlcb.model.CanboGiadinhBanthan;

@Controller
@RequestMapping(value = "QuanheGiaDinhBanThan")
public class QHGDBanThansController {

 
	/*@Autowired
	private DaoTaoChuyenMonService  daoTaoChuyenMonService ;
	*/
	
	@RequestMapping(value = { "create"}, method = RequestMethod.GET)
	public String Create(HttpSession session, HttpServletRequest request,Model model) {
		model.addAttribute("CanboGiadinhBanthan", new CanboGiadinhBanthan());  
		return "/lylich_canbo/QuanHeGDBanThan/create";
	}
	
	@RequestMapping(value ={"create"}, method = RequestMethod.POST)
	public String doCreate(@Valid @ModelAttribute(value = "CanboGiadinhBanthan")  CanboGiadinhBanthan  data,HttpSession session, HttpServletRequest request,Model model ) 
	{
 
		     // luu xong roi tra ve gia tri
		 
		return "/layout/masterpage";  
	}
	
	
	@RequestMapping(value = {"edit/{id}"}, method = RequestMethod.GET)
	public String Edit(@PathVariable int id,HttpSession session, HttpServletRequest request,Model model) {
		
		CanboGiadinhBanthan d=new CanboGiadinhBanthan();
		d.setId(id);
		model.addAttribute("CanboGiadinhBanthan", d); 
		return "/lylich_canbo/QuanHeGDBanThan/edit";
	}
	
	@RequestMapping(value ="edit", method = RequestMethod.POST)
	public String doEdit(@Valid @ModelAttribute(value = "CanboGiadinhBanthan")  CanboGiadinhBanthan  data,HttpSession session, HttpServletRequest request,Model model ) 
	{
 
		     // luu xong roi tra ve gia tri
		 
		return "/layout/masterpage";  
	}
	
	
	@RequestMapping(value = { "delete/{id}"}, method = RequestMethod.GET)
	public String Delete(@PathVariable int id,HttpSession session, HttpServletRequest request,Model model) {
		CanboGiadinhBanthan d=new CanboGiadinhBanthan();
		d.setId(id);
		model.addAttribute("CanboGiadinhBanthan", d);  
		return "/lylich_canbo/QuanHeGDBanThan/delete";
	}
	
	@RequestMapping(value = { "delete/{id}"}, method = RequestMethod.POST)
	public String doDelete(@PathVariable int id,HttpSession session, HttpServletRequest request,Model model) {
		
		return "/layout/masterpage";  
	}
	
	 
}
