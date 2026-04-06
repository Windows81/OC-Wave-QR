package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.e8  reason: case insensitive filesystem */
public final /* synthetic */ class C0091e8 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f12021A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TooltipState f12022B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f12023z;

    public /* synthetic */ C0091e8(PopupPositionProvider popupPositionProvider, Function3 function3, TooltipState tooltipState, Modifier modifier, Function0 function0, boolean z2, boolean z3, boolean z4, Function2 function2, int i2, int i3) {
        this.f12023z = popupPositionProvider;
        this.f12021A = function3;
        this.f12022B = tooltipState;
        this.C = modifier;
        this.D = function0;
        this.E = z2;
        this.F = z3;
        this.G = z4;
        this.H = function2;
        this.I = i2;
        this.J = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return TooltipKt.l(this.f12023z, this.f12021A, this.f12022B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
