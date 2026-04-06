package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CacheDrawScope$onDrawBehind$1 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15702z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$onDrawBehind$1(Function1 function1) {
        super(1);
        this.f15702z = function1;
    }

    public final void b(ContentDrawScope contentDrawScope) {
        this.f15702z.invoke(contentDrawScope);
        contentDrawScope.q2();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContentDrawScope) obj);
        return Unit.f40552a;
    }
}
