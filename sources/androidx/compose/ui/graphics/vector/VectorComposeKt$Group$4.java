package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorComposeKt$Group$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f16634A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f16635B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ List H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f16636z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorComposeKt$Group$4(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, Function2 function2, int i2, int i3) {
        super(2);
        this.f16636z = str;
        this.f16634A = f2;
        this.f16635B = f3;
        this.C = f4;
        this.D = f5;
        this.E = f6;
        this.F = f7;
        this.G = f8;
        this.H = list;
        this.I = function2;
        this.J = i2;
        this.K = i3;
    }

    public final void b(Composer composer, int i2) {
        VectorComposeKt.a(this.f16636z, this.f16634A, this.f16635B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, RecomposeScopeImplKt.a(this.J | 1), this.K);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
