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
public final class AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f2902A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f2903B;
    public final /* synthetic */ float[] C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f2904z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4(Modifier modifier, boolean z2, long j2, float[] fArr, Function1 function1, int i2, int i3) {
        super(2);
        this.f2904z = modifier;
        this.f2902A = z2;
        this.f2903B = j2;
        this.C = fArr;
        this.D = function1;
        this.E = i2;
        this.F = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidExternalSurface_androidKt.a(this.f2904z, this.f2902A, this.f2903B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1), this.F);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
