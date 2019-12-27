package com.icloud.mumu.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.icloud.mumu.util.EntityUtilBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yinyanzhen
 * @since 2019-12-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("system_user")
public class User extends EntityUtilBase {

    private static final long serialVersionUID = 1L;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("address")
    private String address;

    @TableField("age")
    private Integer age;

    @TableField("phone_number")
    private Integer phoneNumber;

    @TableField("email")
    private String email;

    @TableField("id_card")
    private String idCard;


}
