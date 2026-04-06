package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f184A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f185z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1(Function1 function1, int i2) {
        super(2);
        this.f185z = function1;
        this.f184A = i2;
    }

    public final void b(Composer composer, int i2) {
        ReportDrawnKt.b(this.f185z, composer, RecomposeScopeImplKt.a(this.f184A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
