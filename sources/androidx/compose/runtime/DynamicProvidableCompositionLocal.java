package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class DynamicProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {

    /* renamed from: b  reason: collision with root package name */
    public final SnapshotMutationPolicy f14658b;

    public DynamicProvidableCompositionLocal(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0) {
        super(function0);
        this.f14658b = snapshotMutationPolicy;
    }

    public ProvidedValue c(Object obj) {
        return new ProvidedValue(this, obj, obj == null, this.f14658b, (MutableState) null, (Function1) null, true);
    }
}
