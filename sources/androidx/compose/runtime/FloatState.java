package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface FloatState extends State<Float> {

    @Metadata
    public static final class DefaultImpls {
    }

    float c();

    Float getValue() {
        return Float.valueOf(c());
    }
}
