package org.commonjava.ldoc.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( { ElementType.METHOD } )
@Retention( RetentionPolicy.RUNTIME )
@Inherited
public @interface ServiceDoc
{
    String shortDesc();

    String longDesc() default "";

    String since() default "";

    ParamDoc[] params() default {};

    String returns() default "java.lang.String";

    ErrorDoc[] errors() default {};

    String[] apiVersions() default {};
}
