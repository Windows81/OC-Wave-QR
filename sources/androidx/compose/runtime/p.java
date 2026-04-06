package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class p implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f15183A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableObjectIntMap f15184B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RecomposeScopeImpl f15185z;

    public /* synthetic */ p(RecomposeScopeImpl recomposeScopeImpl, int i2, MutableObjectIntMap mutableObjectIntMap) {
        this.f15185z = recomposeScopeImpl;
        this.f15183A = i2;
        this.f15184B = mutableObjectIntMap;
    }

    public final Object invoke(Object obj) {
        return RecomposeScopeImpl.g(this.f15185z, this.f15183A, this.f15184B, (Composition) obj);
    }
}
