package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.b8  reason: case insensitive filesystem */
public final /* synthetic */ class C0061b8 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f11878A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Shape f11879B;
    public final /* synthetic */ float C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ float H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TooltipScope f11880z;

    public /* synthetic */ C0061b8(TooltipScope tooltipScope, Modifier modifier, Shape shape, float f2, Shape shape2, long j2, long j3, float f3, float f4, Function2 function2, int i2, int i3) {
        this.f11880z = tooltipScope;
        this.f11878A = modifier;
        this.f11879B = shape;
        this.C = f2;
        this.D = shape2;
        this.E = j2;
        this.F = j3;
        this.G = f3;
        this.H = f4;
        this.I = function2;
        this.J = i2;
        this.K = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return TooltipKt.h(this.f11880z, this.f11878A, this.f11879B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (Composer) obj, ((Integer) obj2).intValue());
    }
}
