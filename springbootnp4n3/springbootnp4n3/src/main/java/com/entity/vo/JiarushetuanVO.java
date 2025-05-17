package com.entity.vo;

import com.entity.JiarushetuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 加入集体
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 
 */
public class JiarushetuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 集体分类
	 */
	
	private String shetuanfenlei;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 加入理由
	 */
	
	private String jiaruliyou;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * c'n
	 */
	
	private String xuehao;
		
	/**
	 * 用户姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 具体标签
	 */
	
	private String banji;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：集体分类
	 */
	 
	public void setShetuanfenlei(String shetuanfenlei) {
		this.shetuanfenlei = shetuanfenlei;
	}
	
	/**
	 * 获取：集体分类
	 */
	public String getShetuanfenlei() {
		return shetuanfenlei;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：加入理由
	 */
	 
	public void setJiaruliyou(String jiaruliyou) {
		this.jiaruliyou = jiaruliyou;
	}
	
	/**
	 * 获取：加入理由
	 */
	public String getJiaruliyou() {
		return jiaruliyou;
	}
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
				
	
	/**
	 * 设置：c'n
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：c'n
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：具体标签
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：具体标签
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
