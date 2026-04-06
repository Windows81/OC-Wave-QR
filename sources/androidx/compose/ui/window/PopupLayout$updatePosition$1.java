package androidx.compose.ui.window;

import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class PopupLayout$updatePosition$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f19330A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ IntRect f19331B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f19332z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupLayout$updatePosition$1(Ref.LongRef longRef, PopupLayout popupLayout, IntRect intRect, long j2, long j3) {
        super(0);
        this.f19332z = longRef;
        this.f19330A = popupLayout;
        this.f19331B = intRect;
        this.C = j2;
        this.D = j3;
    }

    public final void invoke() {
        this.f19332z.f40907z = this.f19330A.getPositionProvider().a(this.f19331B, this.C, this.f19330A.getParentLayoutDirection(), this.D);
    }
}
