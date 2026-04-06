package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidSelectionHandles_androidKt$SelectionHandle$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f6708A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ResolvedTextDirection f6709B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ long D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Modifier F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f6710z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$2(OffsetProvider offsetProvider, boolean z2, ResolvedTextDirection resolvedTextDirection, boolean z3, long j2, float f2, Modifier modifier, int i2, int i3) {
        super(2);
        this.f6710z = offsetProvider;
        this.f6708A = z2;
        this.f6709B = resolvedTextDirection;
        this.C = z3;
        this.D = j2;
        this.E = f2;
        this.F = modifier;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidSelectionHandles_androidKt.b(this.f6710z, this.f6708A, this.f6709B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
