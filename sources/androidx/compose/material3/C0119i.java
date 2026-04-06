package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.PopupProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.i  reason: case insensitive filesystem */
public final /* synthetic */ class C0119i implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f12074A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f12075B;
    public final /* synthetic */ long C;
    public final /* synthetic */ ScrollState D;
    public final /* synthetic */ PopupProperties E;
    public final /* synthetic */ Shape F;
    public final /* synthetic */ long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ float I;
    public final /* synthetic */ BorderStroke J;
    public final /* synthetic */ Function3 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f12076z;

    public /* synthetic */ C0119i(boolean z2, Function0 function0, Modifier modifier, long j2, ScrollState scrollState, PopupProperties popupProperties, Shape shape, long j3, float f2, float f3, BorderStroke borderStroke, Function3 function3, int i2, int i3, int i4) {
        this.f12076z = z2;
        this.f12074A = function0;
        this.f12075B = modifier;
        this.C = j2;
        this.D = scrollState;
        this.E = popupProperties;
        this.F = shape;
        this.G = j3;
        this.H = f2;
        this.I = f3;
        this.J = borderStroke;
        this.K = function3;
        this.L = i2;
        this.M = i3;
        this.N = i4;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return AndroidMenu_androidKt.h(this.f12076z, this.f12074A, this.f12075B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (Composer) obj, intValue);
    }
}
