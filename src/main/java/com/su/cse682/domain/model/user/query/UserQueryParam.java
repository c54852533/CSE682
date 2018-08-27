package com.su.cse682.domain.model.user.query;

import com.su.cse682.tool.query.PageQueryParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 *
 *  @author yirong.wang
 */
@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserQueryParam extends PageQueryParam {
    /**
     * user_id, auto increment from 0
     */
    private String uuid;

    /**
     * user_name
     */
    private String name;
}
