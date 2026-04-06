package androidx.compose.ui.node;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LookaheadPassDelegate$layoutChildren$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LookaheadDelegate f17339A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LookaheadPassDelegate f17340z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookaheadPassDelegate$layoutChildren$1(LookaheadPassDelegate lookaheadPassDelegate, LookaheadDelegate lookaheadDelegate) {
        super(0);
        this.f17340z = lookaheadPassDelegate;
        this.f17339A = lookaheadDelegate;
    }

    public final void invoke() {
        this.f17340z.c1();
        this.f17340z.n0(AnonymousClass1.f17341z);
        LookaheadDelegate Q2 = this.f17340z.M().Q2();
        if (Q2 != null) {
            boolean C1 = Q2.C1();
            List M = this.f17340z.X1().M();
            int size = M.size();
            for (int i2 = 0; i2 < size; i2++) {
                LookaheadDelegate Q22 = ((LayoutNode) M.get(i2)).y0().Q2();
                if (Q22 != null) {
                    Q22.V1(C1);
                }
            }
        }
        this.f17339A.g1().r();
        LookaheadDelegate Q23 = this.f17340z.M().Q2();
        if (Q23 != null) {
            Q23.C1();
            List M2 = this.f17340z.X1().M();
            int size2 = M2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                LookaheadDelegate Q24 = ((LayoutNode) M2.get(i3)).y0().Q2();
                if (Q24 != null) {
                    Q24.V1(false);
                }
            }
        }
        this.f17340z.b1();
        this.f17340z.n0(AnonymousClass4.f17342z);
    }
}
