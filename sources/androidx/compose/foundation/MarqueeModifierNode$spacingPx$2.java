package androidx.compose.foundation;

import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MarqueeModifierNode$spacingPx$2 extends Lambda implements Function0<Integer> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MarqueeModifierNode f3121A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MarqueeSpacing f3122z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$spacingPx$2(MarqueeSpacing marqueeSpacing, MarqueeModifierNode marqueeModifierNode) {
        super(0);
        this.f3122z = marqueeSpacing;
        this.f3121A = marqueeModifierNode;
    }

    public final Integer invoke() {
        MarqueeSpacing marqueeSpacing = this.f3122z;
        MarqueeModifierNode marqueeModifierNode = this.f3121A;
        return Integer.valueOf(marqueeSpacing.a(DelegatableNodeKt.k(marqueeModifierNode), marqueeModifierNode.m3(), marqueeModifierNode.l3()));
    }
}
