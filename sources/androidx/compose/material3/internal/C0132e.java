package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.internal.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0132e implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f12429A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f12430B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f12431z;

    public /* synthetic */ C0132e(LifecycleOwner lifecycleOwner, Function1 function1, Function0 function0) {
        this.f12431z = lifecycleOwner;
        this.f12429A = function1;
        this.f12430B = function0;
    }

    public final Object invoke(Object obj) {
        return AccessibilityServiceStateProvider_androidKt.i(this.f12431z, this.f12429A, this.f12430B, (DisposableEffectScope) obj);
    }
}
