package com.discry.struts2.actions.eighteen_fileupload;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;

/**
 * Created by Zhoujp1 on 2017-02-03.
 */
public class MultiUploadAction extends ActionSupport{
    private File[] imgs;
    private String[] imgsFileName;

    public File[] getImgs() {
        return imgs;
    }

    public void setImgs(File[] imgs) {
        this.imgs = imgs;
    }

    public String[] getImgsFileName() {
        return imgsFileName;
    }

    public void setImgsFileName(String[] imgsFileName) {
        this.imgsFileName = imgsFileName;
    }

    public String execute() throws IOException {
        if(imgs != null){
            String path = ServletActionContext.getServletContext().getRealPath("/images");
            for(int i=0;i<imgs.length;i++){
                File file = new File(path,imgsFileName[i]);
                FileUtils.copyFile(imgs[i],file);
            }
            return SUCCESS;
        }
        return "input";
    }
}
