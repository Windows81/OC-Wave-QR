package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabRowDefaults$Indicator$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8690A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f8691B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TabRowDefaults f8692z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$Indicator$1(TabRowDefaults tabRowDefaults, Modifier modifier, float f2, long j2, int i2, int i3) {
        super(2);
        this.f8692z = tabRowDefaults;
        this.f8690A = modifier;
        this.f8691B = f2;
        this.C = j2;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        this.f8692z.b(this.f8690A, this.f8691B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
