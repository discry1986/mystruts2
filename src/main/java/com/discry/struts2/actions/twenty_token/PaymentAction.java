package com.discry.struts2.actions.twenty_token;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Zhoujp1 on 2017-02-05.
 */
public class PaymentAction extends ActionSupport {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
