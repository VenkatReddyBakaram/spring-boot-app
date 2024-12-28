package com.vtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vtech.dtos.UserDTO;
import com.vtech.service.HomeService;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private HomeService homeService;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}

	/*
	 * @GetMapping("/doLogin") public String doLogin(HttpServletRequest request) {
	 * 
	 * String email = request.getParameter("email"); String password =
	 * request.getParameter("password");
	 * 
	 * return homeService.doLogin(email, password); }
	 */

	/*
	 * @GetMapping("/doLogin") public String doLogin(@RequestParam("email") String
	 * emailId, String password, Model model) {
	 * 
	 * // String email = request.getParameter("email"); // String password =
	 * request.getParameter("password");
	 * 
	 * System.out.println("Email Id :" + emailId); System.out.println("Password :" +
	 * password);
	 * 
	 * model.addAttribute("emailId", emailId);
	 * 
	 * return homeService.doLogin(emailId, password); }
	 */

	/*
	 * @GetMapping("/doLogin") public ModelAndView doLogin(String email, String
	 * password) {
	 * 
	 * ModelAndView modelAndView = new ModelAndView(); String viewName =
	 * homeService.doLogin(email, password); modelAndView.setViewName(viewName);
	 * modelAndView.addObject("emailId", email);
	 * 
	 * return modelAndView; }
	 */

	/*
	 * @GetMapping("/doLogin") public ModelAndView doLogin(String email, String
	 * password, ModelAndView modelAndView) { String viewName =
	 * homeService.doLogin(email, password); modelAndView.setViewName(viewName);
	 * modelAndView.addObject("emailId", email);
	 * 
	 * return modelAndView; }
	 */

	/*
	 * @GetMapping("/doLogin") public ModelAndView doLogin(UserDTO userDTO,
	 * ModelAndView modelAndView) {
	 * 
	 * String email = userDTO.getEmail(); String password = userDTO.getPassword();
	 * 
	 * System.out.println("Email Id :" + email); System.out.println("Password :" +
	 * password);
	 * 
	 * String viewName = homeService.doLogin(email, password);
	 * modelAndView.setViewName(viewName); modelAndView.addObject("emailId", email);
	 * 
	 * return modelAndView; }
	 */

	@GetMapping("/doLogin")
	public ModelAndView doLogin(UserDTO userDTO, ModelAndView modelAndView) {

		String email = userDTO.getEmail();
		String password = userDTO.getPassword();

		System.out.println("Email Id :" + email);
		System.out.println("Password :" + password);

		String viewName = homeService.doLogin(email, password);
		modelAndView.setViewName(viewName);
		modelAndView.addObject("userDTO", userDTO);

		return modelAndView;
	}
}