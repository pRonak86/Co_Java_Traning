package com.example.Crud.demo.withThymeleaf.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Crud.demo.withThymeleaf.Bean.User;
import com.example.Crud.demo.withThymeleaf.Repository.UserRepository;

@Controller
public class userController {
	
	@Autowired
	private UserRepository userrepository;
	
	@GetMapping("/signup")
	public String showSingUpForm(User user)
	{
		return "add-user";
	}
	
	@PostMapping("/adduser")
	public String addUser(@Valid User user , BindingResult result, Model model )
	{
		if(result.hasErrors())
		{
			return "add-user";
		}
		userrepository.save(user);
		return "redirect:/index";
	}
	@GetMapping("/index")
	public String showUserList(Model model) {
	    model.addAttribute("users", userrepository.findAll());
	    return "index";
	}
	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
	    User user = userrepository.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    
	    model.addAttribute("user", user);
	    return "update-user";
	}
	
	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") long id, @Valid User user, 
	  BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        user.setId(id);
	        return "update-user";
	    }
	        
	    userrepository.save(user);
	    return "redirect:/index";
	}
	    
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
	    User user = userrepository.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    userrepository.delete(user);
	    return "redirect:/index";
	}
	
}
