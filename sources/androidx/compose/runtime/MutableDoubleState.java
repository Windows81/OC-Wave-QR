package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface MutableDoubleState extends DoubleState, MutableState<Double> {

    @Metadata
    public static final class DefaultImpls {
    }

    double b();

    void q(double d2) {
        r(d2);
    }

    void r(double d2);

    /* bridge */ /* synthetic */ void setValue(Object obj) {
        q(((Number) obj).doubleValue());
    }

    Double getValue() {
        return Double.valueOf(b());
    }
}
