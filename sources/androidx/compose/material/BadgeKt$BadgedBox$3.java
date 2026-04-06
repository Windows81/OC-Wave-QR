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
public final class BadgeKt$BadgedBox$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7297A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f7298B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f7299z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeKt$BadgedBox$3(Function3 function3, Modifier modifier, Function3 function32, int i2, int i3) {
        super(2);
        this.f7299z = function3;
        this.f7297A = modifier;
        this.f7298B = function32;
        this.C = i2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        BadgeKt.b(this.f7299z, this.f7297A, this.f7298B, composer, RecomposeScopeImplKt.a(this.C | 1), this.D);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
