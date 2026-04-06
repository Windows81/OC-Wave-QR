package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabRowKt$ScrollableTabRow$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8709A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8710B;
    public final /* synthetic */ long C;
    public final /* synthetic */ float D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f8711z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$3(int i2, Modifier modifier, long j2, long j3, float f2, Function3 function3, Function2 function2, Function2 function22, int i3, int i4) {
        super(2);
        this.f8711z = i2;
        this.f8709A = modifier;
        this.f8710B = j2;
        this.C = j3;
        this.D = f2;
        this.E = function3;
        this.F = function2;
        this.G = function22;
        this.H = i3;
        this.I = i4;
    }

    public final void b(Composer composer, int i2) {
        TabRowKt.a(this.f8711z, this.f8709A, this.f8710B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
