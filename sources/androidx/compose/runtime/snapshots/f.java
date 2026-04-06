package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class f implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f15372A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15373z;

    public /* synthetic */ f(Function1 function1, Function1 function12) {
        this.f15373z = function1;
        this.f15372A = function12;
    }

    public final Object invoke(Object obj) {
        return SnapshotKt.T(this.f15373z, this.f15372A, obj);
    }
}
