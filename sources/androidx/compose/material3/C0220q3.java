package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.q3  reason: case insensitive filesystem */
public final /* synthetic */ class C0220q3 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableTransitionState f12652A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f12653B;
    public final /* synthetic */ ScrollState C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ long E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ BorderStroke H;
    public final /* synthetic */ Function3 I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f12654z;

    public /* synthetic */ C0220q3(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, Function3 function3, int i2) {
        this.f12654z = modifier;
        this.f12652A = mutableTransitionState;
        this.f12653B = mutableState;
        this.C = scrollState;
        this.D = shape;
        this.E = j2;
        this.F = f2;
        this.G = f3;
        this.H = borderStroke;
        this.I = function3;
        this.J = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return MenuKt.h(this.f12654z, this.f12652A, this.f12653B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
