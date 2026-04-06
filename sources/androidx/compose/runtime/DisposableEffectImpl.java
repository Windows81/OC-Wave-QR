package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class DisposableEffectImpl implements RememberObserver {

    /* renamed from: A  reason: collision with root package name */
    public DisposableEffectResult f14655A;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f14656z;

    public DisposableEffectImpl(Function1 function1) {
        this.f14656z = function1;
    }

    public void e() {
    }

    public void f() {
        DisposableEffectResult disposableEffectResult = this.f14655A;
        if (disposableEffectResult != null) {
            disposableEffectResult.d();
        }
        this.f14655A = null;
    }

    public void h() {
        this.f14655A = (DisposableEffectResult) this.f14656z.invoke(EffectsKt.f14660a);
    }
}
