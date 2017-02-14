package com.discry.struts2.actions.nineteen_downloadFile;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

/**
 * Created by Zhoujp1 on 2017-02-05.
 */
public class DownloadAction2 extends ActionSupport {
    private InputStream inputStream;
    private String fileName;

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String execute() {
        fileName = "2.png";
        inputStream = ServletActionContext.getServletContext().getResourceAsStream("/images/"+fileName);
        return SUCCESS;
    }
}
