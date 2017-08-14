package com.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cms.dto.CpyinfoVO;
import com.cms.entity.Cpyinfo;
import com.cms.service.ICpyInfoService;

@Controller
public class CpyinfoController {
	@Autowired
	private ICpyInfoService cpyinfoService;
	@RequestMapping("list.do")
	public String listCpyinfo(Model model){
		System.out.println("good");
		System.out.println(cpyinfoService.count());
		List<Cpyinfo> cpyList = cpyinfoService.listCpyinfo();
		model.addAttribute("list", cpyList);
		for(Cpyinfo cpyinfo:cpyList){
			System.out.println(cpyinfo);
		}
		return "list";
	}
	@RequestMapping(value="edit.do",method=RequestMethod.POST)
	public String editCpyinfo(CpyinfoVO cpyinfoVO){
		System.out.println(cpyinfoVO.getCpyinfo());
		cpyinfoService.editCpyinfo(cpyinfoVO.getCpyinfo());
		return "redirect:list.do";
	}
	@RequestMapping("detail.do")
	public String getCpyinfoDetail(@RequestParam(value = "id", required = false, defaultValue = "") String itemId,Model model){
		if(itemId==null || "".equals(itemId)){
			
		}else{
			Cpyinfo cpyinfo = cpyinfoService.getOne(Integer.valueOf(itemId));
			model.addAttribute("item", cpyinfo);
		}
		return "detail";
	}
	@RequestMapping("delete.do")
	public String deleteById(@RequestParam("id") Integer itemId){
		cpyinfoService.deleteById(itemId);
		return "redirect:list.do";
	}
}
