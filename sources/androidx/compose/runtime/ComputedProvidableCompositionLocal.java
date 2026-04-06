package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ComputedProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {

    /* renamed from: b  reason: collision with root package name */
    public final ComputedValueHolder f14635b;

    public ComputedProvidableCompositionLocal(Function1 function1) {
        super(new l());
        this.f14635b = new ComputedValueHolder(function1);
    }

    public static final Object h() {
        ComposerKt.w("Unexpected call to default provider");
        throw new KotlinNothingValueException();
    }

    public ProvidedValue c(Object obj) {
        return new ProvidedValue(this, obj, obj == null, (SnapshotMutationPolicy) null, (MutableState) null, (Function1) null, true);
    }

    /* renamed from: i */
    public ComputedValueHolder a() {
        return this.f14635b;
    }
}
