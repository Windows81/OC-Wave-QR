package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LifecycleOwnerKt {
    public static final LifecycleCoroutineScope a(LifecycleOwner lifecycleOwner) {
        Intrinsics.i(lifecycleOwner, "<this>");
        return LifecycleKt.a(lifecycleOwner.a());
    }
}
