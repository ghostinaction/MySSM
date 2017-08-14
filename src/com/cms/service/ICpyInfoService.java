package com.cms.service;

import java.util.List;

import com.cms.entity.Cpyinfo;

public interface ICpyInfoService {
	int count();
	List<Cpyinfo> listCpyinfo();
	int editCpyinfo(Cpyinfo cpyinfo);
	Cpyinfo getOne(int id);
	int deleteById(int id);
}
