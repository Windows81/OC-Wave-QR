package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.p3  reason: case insensitive filesystem */
public final /* synthetic */ class C0211p3 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableTransitionState f12573A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f12574B;
    public final /* synthetic */ State C;
    public final /* synthetic */ State D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f12575z;

    public /* synthetic */ C0211p3(boolean z2, MutableTransitionState mutableTransitionState, MutableState mutableState, State state, State state2) {
        this.f12575z = z2;
        this.f12573A = mutableTransitionState;
        this.f12574B = mutableState;
        this.C = state;
        this.D = state2;
    }

    public final Object invoke(Object obj) {
        return MenuKt.g(this.f12575z, this.f12573A, this.f12574B, this.C, this.D, (GraphicsLayerScope) obj);
    }
}
