package com.util;

import java.util.Date;

public class GenerateIdUtil {
	/**
	  * 随机生成一个最高为8位的字符串作为流水号
	  * 
	  * @return Integer Id
	  */
	 @SuppressWarnings("deprecation")
	public static int GenerateId() {
	  int number = (int)(Math.random()*100);
	  String IdStr = "";
	  Date currentTime = new Date();
	  IdStr = ""+currentTime.getHours()+currentTime.getMinutes()+currentTime.getSeconds()+number;
	  int id = Integer.parseInt(IdStr);
	  return id;
	 }
}
