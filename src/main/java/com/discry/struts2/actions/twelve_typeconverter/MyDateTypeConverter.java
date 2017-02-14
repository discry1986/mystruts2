package com.discry.struts2.actions.twelve_typeconverter;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.conversion.TypeConversionException;
import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by Zhoujp1 on 2017-01-20.
 */
public class MyDateTypeConverter extends DefaultTypeConverter {
    @Override
    //value 待转换的值
    //toType 要转换成的类型
    public Object convertValue(Object value, Class toType) {
        try {
            if(toType == Date.class){
                //由 页面 到 服务端 是由String 到 Date 类型的转换
                System.out.println("由 页面 到 服务端 是由String 到 Date 类型的转换");
                String dateStr = ((String[])value)[0];
                SimpleDateFormat sdf = getSimpleDateFormat(dateStr);
                ActionContext.getContext().getSession().put("sdf",sdf);
                return  sdf.parse(dateStr);
            }else if(toType == String.class){
                //数据回显：由 服务端 到 页面 是由 Date 到 String 的类型转换
                System.out.println("数据回显：由 服务端 到 页面 是由 Date 到 String 的类型转换");
                SimpleDateFormat sdf = (SimpleDateFormat)ActionContext.getContext().getSession().get("sdf");
                return sdf.format((Date)value);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return super.convertValue(value, toType);
    }

    private SimpleDateFormat getSimpleDateFormat(String value){
        SimpleDateFormat sdf = null;
        if(Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$",value)){
            sdf = new SimpleDateFormat("yyyy/MM/dd");
        }else if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$",value)){
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        }else if(Pattern.matches("^\\d{4}\\d{2}\\d{2}$",value)){
            sdf = new SimpleDateFormat("yyyyMMdd");
        }else {
            throw  new TypeConversionException();
        }
        return sdf;
    }
}
