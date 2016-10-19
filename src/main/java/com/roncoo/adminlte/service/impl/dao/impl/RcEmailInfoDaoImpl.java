/*
 * Copyright 2015-2016 RonCoo(http://www.roncoo.com) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.roncoo.adminlte.service.impl.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roncoo.adminlte.bean.entity.RcDataDictionary;
import com.roncoo.adminlte.bean.entity.RcEmailInfo;
import com.roncoo.adminlte.bean.entity.RcEmailInfoExample;
import com.roncoo.adminlte.service.impl.dao.RcEmailInfoDao;
import com.roncoo.adminlte.service.impl.dao.impl.mybatis.RcEmailInfoMapper;

/**
 * @author wujing
 */
@Repository
public class RcEmailInfoDaoImpl implements RcEmailInfoDao {
	
	@Autowired
	private RcEmailInfoMapper mapper;
	
	@Override
	public int countTotal(RcEmailInfoExample example) {
		return mapper.countByExample(example);
	}
	
	/**
	 * 查询邮件
	 */
	@Override
	public List<RcEmailInfo> queryForPage(RcEmailInfoExample example) {
		List<RcEmailInfo> result = mapper.selectByExample(example);
		return result;
	}
	
	public RcDataDictionary selectByPrimaryKey(Long id){
		return null;
		
	}
	
	/**
	 * 添加邮件信息
	 */
	@Override
	public int insertSelective(RcEmailInfo info) {
		return mapper.insert(info);
	}

	
	



}
