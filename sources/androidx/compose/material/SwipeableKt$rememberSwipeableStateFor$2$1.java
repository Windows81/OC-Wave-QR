package androidx.compose.material;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
final class SwipeableKt$rememberSwipeableStateFor$2$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SwipeableState f8569A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f8570B;
    public final /* synthetic */ MutableState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f8571z;

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        if (!Intrinsics.d(this.f8571z, this.f8569A.p())) {
            this.f8570B.invoke(this.f8569A.p());
            MutableState mutableState = this.C;
            mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
        }
        return new SwipeableKt$rememberSwipeableStateFor$2$1$invoke$$inlined$onDispose$1();
    }
}
