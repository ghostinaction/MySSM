package com.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.CpyinfoMapper;
import com.cms.entity.Cpyinfo;
import com.cms.service.ICpyInfoService;

@Service
public class CpyinfoService implements ICpyInfoService {
	@Autowired
	private CpyinfoMapper cpyinfoMapper;
	@Override
	public int count() {
		return cpyinfoMapper.countByExample(null);
	}
	@Override
	public List<Cpyinfo> listCpyinfo() {
		return cpyinfoMapper.selectByExample(null);
	}
	@Override
	public int editCpyinfo(Cpyinfo cpyinfo) {
		if(cpyinfo.getId() == null){
			return cpyinfoMapper.insertSelective(cpyinfo);
		}
		return cpyinfoMapper.updateByPrimaryKeySelective(cpyinfo);
	}
	@Override
	public Cpyinfo getOne(int id) {
		return cpyinfoMapper.selectByPrimaryKey(id);
	}
	@Override
	public int deleteById(int id) {
		return cpyinfoMapper.deleteByPrimaryKey(id);
	}
	
}
