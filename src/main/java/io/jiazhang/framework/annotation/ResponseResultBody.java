package io.jiazhang.framework.annotation;

import java.lang.annotation.*;

/**
 * @author George Jia
 * @qq 676002187
 * @wechat linger_zhang
 * @date 2020-06-11 16:38
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseResultBody {
}
