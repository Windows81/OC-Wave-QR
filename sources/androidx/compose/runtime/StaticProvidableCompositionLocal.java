package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public StaticProvidableCompositionLocal(Function0 function0) {
        super(function0);
    }

    public ProvidedValue c(Object obj) {
        return new ProvidedValue(this, obj, obj == null, (SnapshotMutationPolicy) null, (MutableState) null, (Function1) null, false);
    }
}
