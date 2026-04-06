package androidx.compose.material.pullrefresh;

import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$1 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$1 f9029z = new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$1();

    public PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$1() {
        super(1);
    }

    public final void b(ContentDrawScope contentDrawScope) {
        int b2 = ClipOp.f15971b.b();
        DrawContext G1 = contentDrawScope.G1();
        long c2 = G1.c();
        G1.j().o();
        try {
            G1.e().b(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, b2);
            contentDrawScope.q2();
        } finally {
            G1.j().t();
            G1.f(c2);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContentDrawScope) obj);
        return Unit.f40552a;
    }
}
