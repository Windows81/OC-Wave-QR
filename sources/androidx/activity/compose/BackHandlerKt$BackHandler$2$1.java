package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackHandlerKt$BackHandler$2$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f138A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 f139B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f140z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$2$1(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1) {
        super(1);
        this.f140z = onBackPressedDispatcher;
        this.f138A = lifecycleOwner;
        this.f139B = backHandlerKt$BackHandler$backCallback$1$1;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f140z.i(this.f138A, this.f139B);
        return new BackHandlerKt$BackHandler$2$1$invoke$$inlined$onDispose$1(this.f139B);
    }
}
