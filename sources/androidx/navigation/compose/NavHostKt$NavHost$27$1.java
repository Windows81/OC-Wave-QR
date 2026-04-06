package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$27$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ComposeNavigator f22544A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f22545z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$27$1(State state, ComposeNavigator composeNavigator) {
        super(1);
        this.f22545z = state;
        this.f22544A = composeNavigator;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        return new NavHostKt$NavHost$27$1$invoke$$inlined$onDispose$1(this.f22545z, this.f22544A);
    }
}
