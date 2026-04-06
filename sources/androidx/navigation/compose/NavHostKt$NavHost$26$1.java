package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$26$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f22542A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavHostController f22543z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$26$1(NavHostController navHostController, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f22543z = navHostController;
        this.f22542A = lifecycleOwner;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f22543z.t0(this.f22542A);
        return new NavHostKt$NavHost$26$1$invoke$$inlined$onDispose$1();
    }
}
