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
public final class SnackbarHostKt$FadeInFadeOutWithScale$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8444A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f8445B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f8446z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$3(SnackbarData snackbarData, Modifier modifier, Function3 function3, int i2, int i3) {
        super(2);
        this.f8446z = snackbarData;
        this.f8444A = modifier;
        this.f8445B = function3;
        this.C = i2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        SnackbarHostKt.a(this.f8446z, this.f8444A, this.f8445B, composer, RecomposeScopeImplKt.a(this.C | 1), this.D);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
