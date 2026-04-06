package androidx.compose.runtime.tooling;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class a implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f15420A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CompositionErrorContextImpl f15421z;

    public /* synthetic */ a(CompositionErrorContextImpl compositionErrorContextImpl, Object obj) {
        this.f15421z = compositionErrorContextImpl;
        this.f15420A = obj;
    }

    public final Object invoke() {
        return CompositionErrorContextImpl.i(this.f15421z, this.f15420A);
    }
}
