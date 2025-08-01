package com.sia.order.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.sia.common.utils.User;
import com.sia.order.utils.UserContextUtil;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
class MyMetaObjectHandler implements MetaObjectHandler {
    @Autowired
    private UserContextUtil<User> userContextUtil;
    @Override
    public void insertFill(MetaObject metaObject) {
        
        // 强制填充，无论字段是否为空
        strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
        strictInsertFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
        
        // 填充创建者和更新者ID（这里可以根据实际需求获取当前用户ID）
        Long currentUserId = getCurrentUserId();
        strictInsertFill(metaObject, "createBy", Long.class, currentUserId);
        strictInsertFill(metaObject, "updateBy", Long.class, currentUserId);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
        
        // 填充更新者ID
        Long currentUserId = getCurrentUserId();
        strictUpdateFill(metaObject, "updateBy", Long.class, currentUserId);
    }
    
    /**
     * 获取当前用户ID
     * 这里可以根据实际需求实现，比如从SecurityContext、Session等获取
     * 暂时返回默认值1，实际使用时需要根据你的用户认证系统进行修改
     */
    private Long getCurrentUserId() {

        return userContextUtil.getUser().getId();
    }
}