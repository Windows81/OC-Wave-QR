package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackwardsCompatNodeKt$onDrawCacheReadsChanged$1 extends Lambda implements Function1<BackwardsCompatNode, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final BackwardsCompatNodeKt$onDrawCacheReadsChanged$1 f17217z = new BackwardsCompatNodeKt$onDrawCacheReadsChanged$1();

    public BackwardsCompatNodeKt$onDrawCacheReadsChanged$1() {
        super(1);
    }

    public final void b(BackwardsCompatNode backwardsCompatNode) {
        backwardsCompatNode.d3();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((BackwardsCompatNode) obj);
        return Unit.f40552a;
    }
}
