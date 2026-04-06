package androidx.lifecycle.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata
public final class LifecycleEffectKt$LifecycleStartEffectImpl$lambda$19$lambda$18$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f22029a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f22030b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f22031c;

    public void d() {
        this.f22029a.a().d(this.f22030b);
        LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) this.f22031c.f40908z;
        if (lifecycleStopOrDisposeEffectResult != null) {
            lifecycleStopOrDisposeEffectResult.a();
        }
    }
}
