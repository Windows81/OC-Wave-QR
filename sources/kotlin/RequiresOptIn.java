package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.enums.EnumEntriesKt;

@Target
@Retention
@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE})
@Metadata
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface RequiresOptIn {

    @Metadata
    public enum Level {
        WARNING,
        ERROR;

        static {
            Level[] d2;
            C = EnumEntriesKt.a(d2);
        }
    }
}
