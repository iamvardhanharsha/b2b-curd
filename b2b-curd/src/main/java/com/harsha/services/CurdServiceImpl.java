package com.harsha.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.harsha.dao.CurdDao;

public class CurdServiceImpl implements CurdService {
	@Autowired
	CurdDao curdDao;

	@Override
	public int insertData() {
		int retutnValue = curdDao.insertData();
		return retutnValue;
	}

}
