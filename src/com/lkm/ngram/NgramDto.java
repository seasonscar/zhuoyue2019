package com.lkm.ngram;

import java.util.List;

public class NgramDto {
    private String prefix;
    private List<String> firstname;

    public String getPrefix() {
        return prefix;
    }

    public List<String> getFirstname() {
        return firstname;
    }

    public void setFirstname(List<String> firstname) {
        this.firstname = firstname;
    }

    public void setPrefix(String prefix) {

        this.prefix = prefix;
    }


}
