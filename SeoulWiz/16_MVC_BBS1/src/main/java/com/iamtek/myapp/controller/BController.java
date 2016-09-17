package com.iamtek.myapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iamtek.myapp.command.BCommand;
import com.iamtek.myapp.command.BContentCommand;
import com.iamtek.myapp.command.BDeleteCommand;
import com.iamtek.myapp.command.BListCommand;
import com.iamtek.myapp.command.BModifyCommand;
import com.iamtek.myapp.command.BReplyCommand;
import com.iamtek.myapp.command.BReplyViewCommand;
import com.iamtek.myapp.command.BWriteCommand;

@Controller
public class BController {
	
	BCommand command;
	
	@RequestMapping("list")		//go to list of posts page
	public String list(Model model) {
		System.out.println("list()");
		command = new BListCommand();
		command.execute(model);
		return "list";
	}
	
	@RequestMapping("write_view")		//go to new post page
	public String write_view(Model model) {
		System.out.println("write_view()");
		return "write_view";
	}
	
	@RequestMapping("write")		//processes new post, go to list
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");
		model.addAttribute("request", request);
		command = new BWriteCommand();
		command.execute(model);
		return "redirect:list";
	}

	@RequestMapping("content_view")		//show content of selected post
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("content_view()");
		model.addAttribute("request", request);
		command = new BContentCommand();
		command.execute(model);
		return "content_view";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="modify")		//modify post, go to list
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("modify()");
		model.addAttribute("request", request);
		command = new BModifyCommand();
		command.execute(model);
		return "redirect:list";
	}

	@RequestMapping("reply_view")		//goto reply
	public String reply_view(HttpServletRequest request, Model model) {
		System.out.println("reply_view()");
		model.addAttribute("request", request);
		command = new BReplyViewCommand();
		command.execute(model);
		return "reply_view";
	}
	
	@RequestMapping("reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply()");
		model.addAttribute("request", request);
		command = new BReplyCommand();
		command.execute(model);
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete()");
		model.addAttribute("request", request);
		command = new BDeleteCommand();
		command.execute(model);
		return "redirect:list";
	}

}
