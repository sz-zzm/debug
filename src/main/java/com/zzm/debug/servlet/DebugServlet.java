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
 * @Descriiption ��ʾeclipse�ϵ㹦��
 * @Author zhanmin.zheng
 * @CreateDate 2016/02/27
 * @Version 1.0
 */
public class DebugServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 1.����debug
		 */
		int j = 0;
		for (int i = 0; i < 3; i++) {//��һ���ϵ�
			//debug��ͼ��variables������ͼ�п��Թ۲����α���i�ı仯����
			j++;
		}
		/**
		 * 2.����debug
		 */
		Record record = null;
		record = new Record(1L, "zzm");
		/**
		 * 2.����debug
		 */
		TestUtil.test();
		int n = 7;//�ڶ����ϵ�
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
}
