package com.discry.struts2.actions.eighteen_fileupload;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;

/**
 * Created by Zhoujp1 on 2017-02-03.
 */
public class UploadAction extends ActionSupport{
    private File img;
    private String imgFileName;

    public File getImg() {
        return img;
    }

    public void setImg(File img) {
        this.img = img;
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }

    public String execute() throws IOException {
        System.out.println("***********"+img.length());
        if(img != null ){
            String path = ServletActionContext.getServletContext().getRealPath("/images");
            File file = new File(path, imgFileName);
            FileUtils.copyFile(img, file);
            return SUCCESS;
        }
        return "input";
    }

}
