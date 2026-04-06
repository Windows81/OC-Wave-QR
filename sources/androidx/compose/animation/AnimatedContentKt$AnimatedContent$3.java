package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentKt$AnimatedContent$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f2025A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f2026B;
    public final /* synthetic */ Alignment C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Function4 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f2027z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$3(Object obj, Modifier modifier, Function1 function1, Alignment alignment, String str, Function1 function12, Function4 function4, int i2, int i3) {
        super(2);
        this.f2027z = obj;
        this.f2025A = modifier;
        this.f2026B = function1;
        this.C = alignment;
        this.D = str;
        this.E = function12;
        this.F = function4;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        AnimatedContentKt.b(this.f2027z, this.f2025A, this.f2026B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
