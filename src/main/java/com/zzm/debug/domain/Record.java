package com.zzm.debug.domain;

/**
 * @ClassName debug domain����pojo����
 * @Descriiption ��ʾeclipse�ϵ㹦��
 * @Author zhanmin.zheng
 * @CreateDate 2016/02/27
 * @Version 1.0
 */
public class Record {
	private Long id;
	
	private String name;

	public Record(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", name=" + name + "]";
	}
	
	
}
