/**
 * 
 */
package com.marco.userDao;

import java.util.List;
import java.util.Map;

/**
 * @author ayMarco
 * @date 2020年1月10日 上午10:12:38
 * @version 1.0
 * @explain 数据
 */

public interface UserData {
	List<Map> Snp(Map map);// 登录校验

	List<Map> Sncp(Map map);// 注册前判断

	int Sintop(Map map);// 注册

	int Suppwd(Map map);// 修改密码

	// 查看信息
	List<Map> selshop();
	int count();
}
