package androidx.annotation.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.Retention;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@kotlin.annotation.Target
@Metadata
@Deprecated
@Retention
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface UseExperimental {
}
