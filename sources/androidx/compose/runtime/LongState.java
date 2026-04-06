package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface LongState extends State<Long> {

    @Metadata
    public static final class DefaultImpls {
    }

    long a();

    Long getValue() {
        return Long.valueOf(a());
    }
}
