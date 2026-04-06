package androidx.compose.ui.viewinterop;

import android.view.WindowInsets;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidViewHolder$layoutNode$1$coreModifier$3 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LayoutNode f19219A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f19220z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.f19220z = androidViewHolder;
        this.f19219A = layoutNode;
    }

    public final void b(LayoutCoordinates layoutCoordinates) {
        WindowInsets w2;
        AndroidViewHolder_androidKt.f(this.f19220z, this.f19219A);
        this.f19220z.C.t(this.f19220z);
        int i2 = this.f19220z.N[0];
        int i3 = this.f19220z.N[1];
        this.f19220z.getView().getLocationOnScreen(this.f19220z.N);
        long s2 = this.f19220z.O;
        this.f19220z.O = layoutCoordinates.a();
        WindowInsetsCompat e2 = this.f19220z.P;
        if (e2 == null) {
            return;
        }
        if ((i2 != this.f19220z.N[0] || i3 != this.f19220z.N[1] || !IntSize.e(s2, this.f19220z.O)) && (w2 = this.f19220z.B(e2).w()) != null) {
            this.f19220z.getView().dispatchApplyWindowInsets(w2);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutCoordinates) obj);
        return Unit.f40552a;
    }
}
