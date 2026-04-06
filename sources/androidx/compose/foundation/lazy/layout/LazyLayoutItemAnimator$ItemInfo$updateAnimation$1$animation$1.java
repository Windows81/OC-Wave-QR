package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemAnimator f4852z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
        super(0);
        this.f4852z = lazyLayoutItemAnimator;
    }

    public final void invoke() {
        DrawModifierNode c2 = this.f4852z.f4837j;
        if (c2 != null) {
            DrawModifierNodeKt.a(c2);
        }
    }
}
