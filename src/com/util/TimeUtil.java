package com.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil{
	/**
	  * ��ȡ��ǰϵͳʱ��
	  * 
	  * @return ���ض�ʱ���ַ�����ʽyyyy-MM-dd
	  */
	 public static String getStringDateShort() {
	  Date currentTime = new Date();
	  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	  String dateString = formatter.format(currentTime);
	  return dateString;
	 }
	 
	 /**
	  * ��ȡ��ǰϵͳʱ��
	  * 
	  * @return���ض�ʱ���ʽ yyyy-MM-dd
	  */
	 public static Date getNowDateShort() {
	  Date currentTime = new Date();
	  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	  String dateString = formatter.format(currentTime);
	  ParsePosition pos = new ParsePosition(8);
	  Date currentTime_2 = formatter.parse(dateString, pos);
	  return currentTime_2;
	 }
}
