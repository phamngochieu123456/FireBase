package com.aaa.firebase1;

public class Data
{
    private String str1;
    private String str2;

    public Data()
    {
        this.str1 = "default";
        this.str2 = "default";
    }

    public Data(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}
