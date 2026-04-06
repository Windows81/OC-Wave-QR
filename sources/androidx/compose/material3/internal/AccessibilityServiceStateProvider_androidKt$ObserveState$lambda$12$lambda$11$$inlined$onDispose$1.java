package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class AccessibilityServiceStateProvider_androidKt$ObserveState$lambda$12$lambda$11$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function0 f12099a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f12100b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f12101c;

    public AccessibilityServiceStateProvider_androidKt$ObserveState$lambda$12$lambda$11$$inlined$onDispose$1(Function0 function0, LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
        this.f12099a = function0;
        this.f12100b = lifecycleOwner;
        this.f12101c = lifecycleEventObserver;
    }

    public void d() {
        this.f12099a.invoke();
        this.f12100b.a().d(this.f12101c);
    }
}
