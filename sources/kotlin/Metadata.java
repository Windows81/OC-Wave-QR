package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Target
@Retention
@java.lang.annotation.Target({ElementType.TYPE})
@Metadata
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
public @interface Metadata {

    @Metadata
    public static final class DefaultImpls {
    }
}
