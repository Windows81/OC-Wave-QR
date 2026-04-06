package androidx.lifecycle;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class f implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f22043A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Lifecycle f22044z;

    public /* synthetic */ f(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        this.f22044z = lifecycle;
        this.f22043A = lifecycleEventObserver;
    }

    public final Object invoke() {
        return LifecycleKt$eventFlow$1.E(this.f22044z, this.f22043A);
    }
}
