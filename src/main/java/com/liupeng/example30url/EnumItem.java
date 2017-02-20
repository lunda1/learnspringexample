package com.liupeng.example30url;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liupeng on 2017/1/19.
 */
@Data
public class EnumItem implements Serializable{
    public String nodeName;
    public int isSelected;
    public String optionCode;
    public String parentID;
    public int isHaveChild;
    public List<EnumItem> childList;

    public boolean equals(EnumItem enumItem){
        return enumItem.getOptionCode().equals(this.optionCode) && enumItem.getParentID().equals(this.parentID);
    }
}
