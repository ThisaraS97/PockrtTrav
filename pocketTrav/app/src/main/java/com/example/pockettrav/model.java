package com.example.pockettrav;

import android.widget.EditText;

public class model {
    String title;
    String Specification;
    String Conditions;
    String type;
    int PKM;

    model() {

    }

    public model(String title, int PKM, String Specification, String Conditions,String type ) {
        this.title = title;
        this.Specification = Specification;
        this.PKM = PKM;
        this.Conditions = Conditions;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpecification() {
        return Specification;
    }

    public void setSpecification(String specification) {
        Specification = specification;
    }

    public String getConditions() {
        return Conditions;
    }

    public void setConditions(String conditions) {
        Conditions = conditions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPKM() {
        return PKM;
    }

    public void setPKM(int PKM) {
        this.PKM = PKM;
    }
}