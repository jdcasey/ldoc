package org.commonjava.ldoc.anno;

import org.commonjava.ldoc.model.ParamType;

public @interface ParamDoc
{

    String key();

    String desc();

    String[] values() default {};

    ParamType location() default ParamType.PATH;

    String type() default "java.lang.String";

}
