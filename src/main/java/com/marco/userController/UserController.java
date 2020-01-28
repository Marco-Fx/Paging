package com.marco.userController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.marco.userService.UserInfo;

/**
 * @author :zlc
 * @version time：2020年1月28日 下午12:08:53 类说明
 */
@RestController
//@RequestMapping("html")
public class UserController {
	@Autowired
	UserInfo userInfo;

	@RequestMapping("/html/zhang")
	public String Test() {
		System.out.println("后悔是");
		return "hello 张连成";
	}

	@RequestMapping("/emp")
	public String getEmpAll(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 在查询之前需要调用StartPage()方法
		// pn:代表从第几页开始查，pageSize:代表每页有5条数据
//		PageHelper.startPage(pn, 5);
//		List<Map> emps = userInfo.selshop();
//		System.out.println(emps.toString());
//		// 调用PageInfo方法将分页的数据进行封装,后面的构造器 5 为页面连续显示的页数
//		PageInfo<Map> page = new PageInfo(emps, 5);
//		// 将封装好的pageInfo封装好，传入页面
//		System.out.println(page.getList());
//		/**page.toString():
//		 * PageInfo{pageNum=1, pageSize=5, size=5, startRow=1, endRow=5, total=13,
//		 * pages=3, list=Page{count=true, pageNum=1, pageSize=5, startRow=0, endRow=5,
//		 * total=13, pages=3, reasonable=false, pageSizeZero=false}, prePage=0,
//		 * nextPage=2, isFirstPage=true, isLastPage=false, hasPreviousPage=false,
//		 * hasNextPage=true, navigatePages=5, navigateFirstPage1, navigateLastPage3,
//		 * navigatepageNums=[1, 2, 3]}
//		 **/
//		System.out.println(page.toString());
		return "list";
	}
	@ResponseBody
	@RequestMapping("/student")
    public String student(@RequestParam("page") Integer pageNum, @RequestParam("limit") Integer pageSize) throws Exception {
        List<Map> students = userInfo.selshop(pageNum, pageSize);
        int count = userInfo.count();
        JSONObject json = new JSONObject();
        json.put("code", 0);
        json.put("count", count);
        json.put("data", students);
        System.out.println(json.toString());
        return json.toString();
    }
}

