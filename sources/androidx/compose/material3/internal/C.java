package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class C implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TooltipState f12183A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f12184B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Modifier D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f12185z;

    public /* synthetic */ C(boolean z2, TooltipState tooltipState, MutableState mutableState, boolean z3, Modifier modifier, Function2 function2, int i2, int i3) {
        this.f12185z = z2;
        this.f12183A = tooltipState;
        this.f12184B = mutableState;
        this.C = z3;
        this.D = modifier;
        this.E = function2;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return BasicTooltipKt.p(this.f12185z, this.f12183A, this.f12184B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
