package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface MutableFloatState extends FloatState, MutableState<Float> {

    @Metadata
    public static final class DefaultImpls {
    }

    float c();

    void j(float f2);

    void p(float f2) {
        j(f2);
    }

    /* bridge */ /* synthetic */ void setValue(Object obj) {
        p(((Number) obj).floatValue());
    }

    Float getValue() {
        return Float.valueOf(c());
    }
}
