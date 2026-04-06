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
public final class TabRowKt$TabRow$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8724A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8725B;
    public final /* synthetic */ long C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f8726z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$3(int i2, Modifier modifier, long j2, long j3, Function3 function3, Function2 function2, Function2 function22, int i3, int i4) {
        super(2);
        this.f8726z = i2;
        this.f8724A = modifier;
        this.f8725B = j2;
        this.C = j3;
        this.D = function3;
        this.E = function2;
        this.F = function22;
        this.G = i3;
        this.H = i4;
    }

    public final void b(Composer composer, int i2) {
        TabRowKt.b(this.f8726z, this.f8724A, this.f8725B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
