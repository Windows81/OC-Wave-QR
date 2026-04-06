package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface MutableLongState extends LongState, MutableState<Long> {

    @Metadata
    public static final class DefaultImpls {
    }

    long a();

    void l(long j2);

    void n(long j2) {
        l(j2);
    }

    /* bridge */ /* synthetic */ void setValue(Object obj) {
        n(((Number) obj).longValue());
    }

    Long getValue() {
        return Long.valueOf(a());
    }
}
