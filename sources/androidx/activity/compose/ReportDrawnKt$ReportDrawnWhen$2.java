package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ReportDrawnKt$ReportDrawnWhen$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f188A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f189z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnWhen$2(Function0 function0, int i2) {
        super(2);
        this.f189z = function0;
        this.f188A = i2;
    }

    public final void b(Composer composer, int i2) {
        ReportDrawnKt.c(this.f189z, composer, RecomposeScopeImplKt.a(this.f188A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
