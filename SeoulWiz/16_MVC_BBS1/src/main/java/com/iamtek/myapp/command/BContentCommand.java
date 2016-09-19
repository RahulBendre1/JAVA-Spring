package com.iamtek.myapp.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.iamtek.myapp.dao.BDao;

//gets contents for selected post
public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int bId = Integer.parseInt(request.getParameter("bId"));
		
		BDao dao = new BDao();
		model.addAttribute("content", dao.content(bId));
		
	}

}
