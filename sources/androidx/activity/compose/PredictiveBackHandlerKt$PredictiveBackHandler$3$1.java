package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PredictiveBackHandlerKt$PredictiveBackHandler$3$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f167A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PredictiveBackHandlerCallback f168B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f169z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$3$1(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, PredictiveBackHandlerCallback predictiveBackHandlerCallback) {
        super(1);
        this.f169z = onBackPressedDispatcher;
        this.f167A = lifecycleOwner;
        this.f168B = predictiveBackHandlerCallback;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f169z.i(this.f167A, this.f168B);
        return new PredictiveBackHandlerKt$PredictiveBackHandler$3$1$invoke$$inlined$onDispose$1(this.f168B);
    }
}
