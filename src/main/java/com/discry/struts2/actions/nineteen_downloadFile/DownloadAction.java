package com.discry.struts2.actions.nineteen_downloadFile;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * Created by Zhoujp1 on 2017-02-05.
 */
public class DownloadAction extends ActionSupport{
    private InputStream is;
    private String fileName;

    public InputStream getIs() {
        return is;
    }

    public void setIs(InputStream is) {
        this.is = is;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String execute() throws UnsupportedEncodingException {
        fileName = "1.png";
        is = ServletActionContext.getServletContext().getResourceAsStream("/images/" + fileName);
        //修正中文名称，下载时产生名称乱码
        byte[] bytes = "中文名称.png".getBytes("UTF-8");
        //修改文件下载时的名称
        fileName = new String(bytes,"ISO-8859-1");
        return SUCCESS;
    }
}
