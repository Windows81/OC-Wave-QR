package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface IntState extends State<Integer> {

    @Metadata
    public static final class DefaultImpls {
    }

    int e();

    Integer getValue() {
        return Integer.valueOf(e());
    }
}
