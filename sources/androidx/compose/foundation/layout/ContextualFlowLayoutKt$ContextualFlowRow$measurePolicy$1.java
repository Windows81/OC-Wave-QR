package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1 extends Lambda implements Function4<Integer, FlowLineInfo, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function4 f3847z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1(Function4 function4) {
        super(4);
        this.f3847z = function4;
    }

    public final void b(int i2, FlowLineInfo flowLineInfo, Composer composer, int i3) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1599700159, i3, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:98)");
        }
        this.f3847z.j(new ContextualFlowRowScopeImpl(flowLineInfo.a(), flowLineInfo.d(), flowLineInfo.c(), flowLineInfo.b(), (DefaultConstructorMarker) null), Integer.valueOf(i2), composer, Integer.valueOf((i3 << 3) & 112));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b(((Number) obj).intValue(), (FlowLineInfo) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
