package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenuDefaults$TrailingIcon$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f7818A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f7819B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ExposedDropdownMenuDefaults f7820z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuDefaults$TrailingIcon$4(ExposedDropdownMenuDefaults exposedDropdownMenuDefaults, boolean z2, Function0 function0, int i2, int i3) {
        super(2);
        this.f7820z = exposedDropdownMenuDefaults;
        this.f7818A = z2;
        this.f7819B = function0;
        this.C = i2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        this.f7820z.a(this.f7818A, this.f7819B, composer, RecomposeScopeImplKt.a(this.C | 1), this.D);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
