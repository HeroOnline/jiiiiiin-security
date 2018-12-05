package cn.jiiiiiin.module.common.dto.mngauth;

import cn.jiiiiiin.module.common.entity.mngauth.Role;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 适配前端`element-ui#table`展开选择属性
 * <p>
 * http://element.eleme.io/#/zh-CN/component/table
 *
 * @author jiiiiiin
 */
@Data
@Accessors
public class RoleDto extends Role {
    private static final long serialVersionUID = 4460132236362989044L;
    private String[] expandedKeys;
    private String[] checkedKeys;
}