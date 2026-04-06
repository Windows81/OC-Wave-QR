package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.internal.z  reason: case insensitive filesystem */
public final /* synthetic */ class C0152z implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f12462A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TooltipState f12463B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f12464z;

    public /* synthetic */ C0152z(PopupPositionProvider popupPositionProvider, Function2 function2, TooltipState tooltipState, Modifier modifier, Function0 function0, boolean z2, boolean z3, boolean z4, Function2 function22, int i2, int i3) {
        this.f12464z = popupPositionProvider;
        this.f12462A = function2;
        this.f12463B = tooltipState;
        this.C = modifier;
        this.D = function0;
        this.E = z2;
        this.F = z3;
        this.G = z4;
        this.H = function22;
        this.I = i2;
        this.J = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return BasicTooltipKt.k(this.f12464z, this.f12462A, this.f12463B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
