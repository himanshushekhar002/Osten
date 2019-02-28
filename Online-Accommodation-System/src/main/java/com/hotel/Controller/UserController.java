package com.hotel.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hotel.Service.UserService;
import com.hotel.model.User;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;


	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map) {
		User user = new User();
		map.put("user", user);
		map.put("userList", userService.viewAll());
		return "user";
	}
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1")int i, @RequestParam("t2")int j)
	{
		int k=i+j;
		
		ModelAndView mv =new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		
		return mv;
	}

	@RequestMapping(value = "/user.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute User user, BindingResult result, @RequestParam String action,
			Map<String, Object> map) {

		User userResult = new User();
		if (action.toLowerCase() == "add") {
			userService.add(user);
			userResult = user;
		}
		if (action.toLowerCase() == "edit") {
			userService.update(user.getUid()); 
			userResult = user;
		}
		if (action.toLowerCase() == "search") {
			userService.viewAll();
			userResult = user;
		}
		if (action.toLowerCase() == "delete") {
			userService.remove(user.getUid());
			userResult = user;
		}
		map.put("user", userResult);
		map.put("userList", userService.viewAll());
		return "user";
	}
}
