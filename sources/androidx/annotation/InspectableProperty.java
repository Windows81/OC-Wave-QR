package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.enums.EnumEntriesKt;

@Target
@Retention
@java.lang.annotation.Target({ElementType.METHOD})
@Metadata
@Deprecated
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface InspectableProperty {

    @Target
    @Retention
    @java.lang.annotation.Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface EnumEntry {
    }

    @Target
    @Retention
    @java.lang.annotation.Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface FlagEntry {
    }

    @Metadata
    public enum ValueType {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID;

        static {
            ValueType[] d2;
            H = EnumEntriesKt.a(d2);
        }
    }
}
