package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Brush;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorComposeKt$Path$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f16652A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f16653B;
    public final /* synthetic */ Brush C;
    public final /* synthetic */ float D;
    public final /* synthetic */ Brush E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ float J;
    public final /* synthetic */ float K;
    public final /* synthetic */ float L;
    public final /* synthetic */ float M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f16654z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorComposeKt$Path$3(List list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, int i5, int i6, int i7) {
        super(2);
        this.f16654z = list;
        this.f16652A = i2;
        this.f16653B = str;
        this.C = brush;
        this.D = f2;
        this.E = brush2;
        this.F = f3;
        this.G = f4;
        this.H = i3;
        this.I = i4;
        this.J = f5;
        this.K = f6;
        this.L = f7;
        this.M = f8;
        this.N = i5;
        this.O = i6;
        this.P = i7;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        List list = this.f16654z;
        List list2 = list;
        VectorComposeKt.b(list2, this.f16652A, this.f16653B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, composer2, RecomposeScopeImplKt.a(this.N | 1), RecomposeScopeImplKt.a(this.O), this.P);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
