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
public final class BottomNavigationKt$BottomNavigation$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f7328A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f7329B;
    public final /* synthetic */ float C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f7330z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigation$3(Modifier modifier, long j2, long j3, float f2, Function3 function3, int i2, int i3) {
        super(2);
        this.f7330z = modifier;
        this.f7328A = j2;
        this.f7329B = j3;
        this.C = f2;
        this.D = function3;
        this.E = i2;
        this.F = i3;
    }

    public final void b(Composer composer, int i2) {
        BottomNavigationKt.a(this.f7330z, this.f7328A, this.f7329B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1), this.F);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
