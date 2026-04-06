package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f15370A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15371z;

    public /* synthetic */ d(Function1 function1, Function1 function12) {
        this.f15371z = function1;
        this.f15370A = function12;
    }

    public final Object invoke(Object obj) {
        return SnapshotKt.R(this.f15371z, this.f15370A, obj);
    }
}
