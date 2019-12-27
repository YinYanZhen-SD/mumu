package com.icloud.mumu.util;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author YINYANZHEN
 * @date 2019/12/18 17:20
 */
@Data
public class EntityUtilBase {

    @TableId(value = "id",type = IdType.UUID)
    private String id;
    @TableField(value = "create_time" ,fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(value = "create_user")
    private String createUser;
    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @TableField(value = "update_user")
    private String updateUser;
    @TableField("del_flag")
    @TableLogic
    private String delFlag;//(0:正常，1:已删除)

}
