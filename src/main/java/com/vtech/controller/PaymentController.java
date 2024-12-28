package com.vtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vtech.dtos.UserDTO;
import com.vtech.service.HomeService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private HomeService homeService;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/doLogin")
	public ModelAndView doLogin(UserDTO userDTO, ModelAndView modelAndView, HttpSession session) {

		String email = userDTO.getEmail();
		String password = userDTO.getPassword();

		session.setAttribute("email", email);

		System.out.println("Email Id :" + email);
		System.out.println("Password :" + password);

		String viewName = homeService.doLogin(email, password);
		if (viewName.equals("success"))
			modelAndView.setViewName("electronics");

		modelAndView.addObject("userDTO", userDTO);

		return modelAndView;
	}

	@GetMapping("/electronics")
	public ModelAndView electronics(ModelAndView modelAndView, HttpSession session) {
		modelAndView.setViewName("electronics");
		String email = (String) session.getAttribute("email");
		modelAndView.addObject("email", email);
		return modelAndView;
	}

	@GetMapping("/furniture")
	public ModelAndView furniture(ModelAndView modelAndView, HttpSession session) {
		modelAndView.setViewName("furniture");
		String email = (String) session.getAttribute("email");
		modelAndView.addObject("email", email);
		return modelAndView;
	}

	@GetMapping("/payment")
	public ModelAndView payment(ModelAndView modelAndView, HttpSession session) {
		modelAndView.setViewName("payment");
		String email = (String) session.getAttribute("email");
		modelAndView.addObject("email", email);
		return modelAndView;
	}
}
