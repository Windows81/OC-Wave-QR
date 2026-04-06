package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidExternalSurface_androidKt$AndroidExternalSurface$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f2911A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f2912B;
    public final /* synthetic */ int C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f2913z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidExternalSurface_androidKt$AndroidExternalSurface$4(Modifier modifier, boolean z2, long j2, int i2, boolean z3, Function1 function1, int i3, int i4) {
        super(2);
        this.f2913z = modifier;
        this.f2911A = z2;
        this.f2912B = j2;
        this.C = i2;
        this.D = z3;
        this.E = function1;
        this.F = i3;
        this.G = i4;
    }

    public final void b(Composer composer, int i2) {
        AndroidExternalSurface_androidKt.b(this.f2913z, this.f2911A, this.f2912B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
