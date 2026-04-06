package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.PinnableContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusRestorerNode$onEnter$1 extends Lambda implements Function1<FocusEnterExitScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusRestorerNode f15813z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusRestorerNode$onEnter$1(FocusRestorerNode focusRestorerNode) {
        super(1);
        this.f15813z = focusRestorerNode;
    }

    public final void b(FocusEnterExitScope focusEnterExitScope) {
        PinnableContainer.PinnedHandle Z2 = this.f15813z.O;
        if (Z2 != null) {
            Z2.g();
        }
        this.f15813z.O = null;
        if (!FocusRequesterModifierNodeKt.d(this.f15813z)) {
            FocusRequester b3 = this.f15813z.b3();
            FocusRequester.Companion companion = FocusRequester.f15802b;
            if (Intrinsics.d(b3, companion.b())) {
                return;
            }
            if (Intrinsics.d(this.f15813z.b3(), companion.a())) {
                focusEnterExitScope.b();
            } else {
                FocusRequester.i(this.f15813z.b3(), 0, 1, (Object) null);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((FocusEnterExitScope) obj);
        return Unit.f40552a;
    }
}
