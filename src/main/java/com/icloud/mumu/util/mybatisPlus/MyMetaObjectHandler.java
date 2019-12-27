package com.icloud.mumu.util.mybatisPlus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 字段自动填充
 * @author YINYANZHEN
 * @date 2019/12/20 13:43
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    //private static final Logger LOGGER = LoggerFactory.getLogger(MyMetaObjectHandler.class);
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date() , metaObject);
        this.setFieldValByName("updateTime", new Date() , metaObject);
    }
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date() , metaObject);
    }


}
