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
public final class BadgeKt$Badge$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f7290A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f7291B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f7292z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeKt$Badge$2(Modifier modifier, long j2, long j3, Function3 function3, int i2, int i3) {
        super(2);
        this.f7292z = modifier;
        this.f7290A = j2;
        this.f7291B = j3;
        this.C = function3;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        BadgeKt.a(this.f7292z, this.f7290A, this.f7291B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
