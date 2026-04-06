package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
final class NeverEqualPolicy implements SnapshotMutationPolicy<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final NeverEqualPolicy f14740a = new NeverEqualPolicy();

    public boolean a(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        return "NeverEqualPolicy";
    }
}
