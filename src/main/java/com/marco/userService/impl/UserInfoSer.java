/**
 * 
 */
package com.marco.userService.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.marco.userDao.UserData;
import com.marco.userService.UserInfo;

/**
 * @author ayMarco
 * @date 2020年1月10日 上午10:11:31
 * @version 1.0
 * @explain 用户信息服务
 */
@Service
public class UserInfoSer implements UserInfo {
	@Autowired
	UserData userdata;

	@Override
	public List<Map> Snp(Map map) {// 登录校验
		// TODO Auto-generated method stub

		return userdata.Snp(map);
	}

	@Override
	public List<Map> Sncp(Map map) {// 注册前判断
		// TODO Auto-generated method stub
		return userdata.Sncp(map);
	}

	@Override
	public int Sintop(Map map) {// 注册
		// TODO Auto-generated method stub
		return userdata.Sintop(map);
	}

	@Override
	public int Suppwd(Map map) {// 修改密码
		// TODO Auto-generated method stub
		return userdata.Suppwd(map);
	}

	@Override
	public List<Map> selshop(Integer pageNum,Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);//起止和条数
		return userdata.selshop();
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return userdata.count();
	}

}
