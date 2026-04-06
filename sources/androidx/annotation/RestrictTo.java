package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.enums.EnumEntriesKt;

@MustBeDocumented
@Target
@Retention
@Documented
@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Metadata
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface RestrictTo {

    @Metadata
    public enum Scope {
        LIBRARY,
        LIBRARY_GROUP,
        LIBRARY_GROUP_PREFIX,
        GROUP_ID,
        TESTS,
        SUBCLASSES;

        static {
            Scope[] d2;
            G = EnumEntriesKt.a(d2);
        }
    }
}
