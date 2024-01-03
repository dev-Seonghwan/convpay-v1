package com.convpay.convpay.dto;

public class payResponse {
    // 결제 결과
    PayResult payResult;


    // 결제 성공 금액
    Integer paidAmount;
    public payResponse(PayResult payResult, Integer paidAmount) {
        this.payResult = payResult;
        this.paidAmount = paidAmount;
    }

    public PayResult getPayResult() {
        return payResult;
    }

    public void setPayResult(PayResult payResult) {
        this.payResult = payResult;
    }

    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }
}

