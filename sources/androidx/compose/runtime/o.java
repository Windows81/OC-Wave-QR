package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class o implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MovableContentStateReference f15182z;

    public /* synthetic */ o(MovableContentStateReference movableContentStateReference) {
        this.f15182z = movableContentStateReference;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(NestedContentMap.g(this.f15182z, (NestedMovableContent) obj));
    }
}
