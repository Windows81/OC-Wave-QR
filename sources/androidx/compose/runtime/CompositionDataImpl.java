package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionInstance;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CompositionDataImpl implements CompositionData, CompositionInstance {

    /* renamed from: z  reason: collision with root package name */
    public final Composition f14621z;

    public CompositionDataImpl(Composition composition) {
        this.f14621z = composition;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompositionDataImpl) && Intrinsics.d(this.f14621z, ((CompositionDataImpl) obj).f14621z);
    }

    public int hashCode() {
        return this.f14621z.hashCode() * 31;
    }
}
