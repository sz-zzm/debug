package com.zzm.debug.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzm.debug.domain.Record;
import com.zzm.debug.util.TestUtil;

/**
 * @ClassName debug servlet
 * @Descriiption 演示eclipse断点功能
 * @Author zhanmin.zheng
 * @CreateDate 2016/02/27
 * @Version 1.0
 */
public class DebugServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 1.变量debug
		 */
		int j = 0;
		for (int i = 0; i < 3; i++) {//第一个断点
			//debug视图的variables变量视图中可以观察整形变量i的变化过程
			j++;
		}
		/**
		 * 2.对象debug
		 */
		Record record = null;
		record = new Record(1L, "zzm");
		/**
		 * 2.方法debug
		 */
		TestUtil.test();
		int n = 7;//第二个断点
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
}
