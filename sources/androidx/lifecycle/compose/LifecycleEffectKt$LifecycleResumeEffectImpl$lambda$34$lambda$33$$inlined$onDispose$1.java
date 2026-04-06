package androidx.lifecycle.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata
public final class LifecycleEffectKt$LifecycleResumeEffectImpl$lambda$34$lambda$33$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f22026a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f22027b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f22028c;

    public void d() {
        this.f22026a.a().d(this.f22027b);
        LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) this.f22028c.f40908z;
        if (lifecyclePauseOrDisposeEffectResult != null) {
            lifecyclePauseOrDisposeEffectResult.a();
        }
    }
}
