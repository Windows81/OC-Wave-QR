package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
final class ReferentialEqualityPolicy implements SnapshotMutationPolicy<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final ReferentialEqualityPolicy f14829a = new ReferentialEqualityPolicy();

    public boolean a(Object obj, Object obj2) {
        return obj == obj2;
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
