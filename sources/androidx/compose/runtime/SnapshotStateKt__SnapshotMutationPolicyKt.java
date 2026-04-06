package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final /* synthetic */ class SnapshotStateKt__SnapshotMutationPolicyKt {
    public static final SnapshotMutationPolicy a() {
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.f14740a;
        Intrinsics.g(neverEqualPolicy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return neverEqualPolicy;
    }

    public static final SnapshotMutationPolicy b() {
        ReferentialEqualityPolicy referentialEqualityPolicy = ReferentialEqualityPolicy.f14829a;
        Intrinsics.g(referentialEqualityPolicy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return referentialEqualityPolicy;
    }

    public static final SnapshotMutationPolicy c() {
        StructuralEqualityPolicy structuralEqualityPolicy = StructuralEqualityPolicy.f14920a;
        Intrinsics.g(structuralEqualityPolicy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return structuralEqualityPolicy;
    }
}
