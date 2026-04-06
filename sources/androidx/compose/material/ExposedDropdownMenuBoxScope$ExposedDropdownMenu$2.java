package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f7810A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f7811B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ ScrollState D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ExposedDropdownMenuBoxScope f7812z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z2, Function0 function0, Modifier modifier, ScrollState scrollState, Function3 function3, int i2, int i3) {
        super(2);
        this.f7812z = exposedDropdownMenuBoxScope;
        this.f7810A = z2;
        this.f7811B = function0;
        this.C = modifier;
        this.D = scrollState;
        this.E = function3;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        this.f7812z.a(this.f7810A, this.f7811B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
