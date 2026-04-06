package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class StructuralEqualityPolicy implements SnapshotMutationPolicy<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final StructuralEqualityPolicy f14920a = new StructuralEqualityPolicy();

    public boolean a(Object obj, Object obj2) {
        return Intrinsics.d(obj, obj2);
    }

    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
