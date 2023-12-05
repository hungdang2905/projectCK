package model;

import java.io.Serializable;

public class Status extends ModelParent implements Serializable {
    private String code;
    private String name;
    private String description;
    private String statusGroup;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatusGroup() {
        return statusGroup;
    }

    public void setStatusGroup(String statusGroup) {
        this.statusGroup = statusGroup;
    }
}
