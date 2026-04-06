package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface DoubleState extends State<Double> {

    @Metadata
    public static final class DefaultImpls {
    }

    double b();

    Double getValue() {
        return Double.valueOf(b());
    }
}
