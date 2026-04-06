package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f6711A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f6712B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f6713z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1(OffsetProvider offsetProvider, boolean z2, boolean z3) {
        super(1);
        this.f6713z = offsetProvider;
        this.f6711A = z2;
        this.f6712B = z3;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        long a2 = this.f6713z.a();
        semanticsPropertyReceiver.e(SelectionHandlesKt.d(), new SelectionHandleInfo(this.f6711A ? Handle.SelectionStart : Handle.SelectionEnd, a2, this.f6712B ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, (9223372034707292159L & a2) != 9205357640488583168L, (DefaultConstructorMarker) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
