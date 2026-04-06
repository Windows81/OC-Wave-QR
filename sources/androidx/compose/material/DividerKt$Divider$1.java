package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DividerKt$Divider$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f7689A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f7690B;
    public final /* synthetic */ float C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f7691z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DividerKt$Divider$1(Modifier modifier, long j2, float f2, float f3, int i2, int i3) {
        super(2);
        this.f7691z = modifier;
        this.f7689A = j2;
        this.f7690B = f2;
        this.C = f3;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        DividerKt.a(this.f7691z, this.f7689A, this.f7690B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
