package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface MutableIntState extends IntState, MutableState<Integer> {

    @Metadata
    public static final class DefaultImpls {
    }

    int e();

    void k(int i2);

    void o(int i2) {
        k(i2);
    }

    /* bridge */ /* synthetic */ void setValue(Object obj) {
        o(((Number) obj).intValue());
    }

    Integer getValue() {
        return Integer.valueOf(e());
    }
}
