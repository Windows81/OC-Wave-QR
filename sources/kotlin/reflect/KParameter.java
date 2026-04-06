package kotlin.reflect;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public interface KParameter extends KAnnotatedElement {

    @Metadata
    public static final class DefaultImpls {
    }

    @Metadata
    public enum Kind {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE;

        static {
            Kind[] d2;
            D = EnumEntriesKt.a(d2);
        }
    }
}
