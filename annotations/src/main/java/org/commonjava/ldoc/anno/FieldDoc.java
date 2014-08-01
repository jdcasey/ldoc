package org.commonjava.ldoc.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( ElementType.FIELD )
@Retention( RetentionPolicy.RUNTIME )
@Inherited
public @interface FieldDoc
{

    String shortDesc();

    String longDesc();

    String since() default "";

    String example() default "";

}
