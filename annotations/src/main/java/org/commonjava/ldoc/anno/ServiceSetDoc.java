package org.commonjava.ldoc.anno;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention( RetentionPolicy.RUNTIME )
@Inherited
public @interface ServiceSetDoc
{

    String shortDesc();

    String longDesc() default "";

    String since() default "";

    String[] apiVersions() default {};

}
