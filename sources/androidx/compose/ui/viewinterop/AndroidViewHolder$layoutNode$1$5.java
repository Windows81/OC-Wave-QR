package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidViewHolder$layoutNode$1$5 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f19210a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LayoutNode f19211b;

    public AndroidViewHolder$layoutNode$1$5(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        this.f19210a = androidViewHolder;
        this.f19211b = layoutNode;
    }

    public final int a(int i2) {
        AndroidViewHolder androidViewHolder = this.f19210a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        Intrinsics.f(layoutParams);
        androidViewHolder.measure(androidViewHolder.E(0, i2, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.f19210a.getMeasuredHeight();
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        if (this.f19210a.getChildCount() == 0) {
            return MeasureScope.R1(measureScope, Constraints.n(j2), Constraints.m(j2), (Map) null, AndroidViewHolder$layoutNode$1$5$measure$1.f19212z, 4, (Object) null);
        }
        if (Constraints.n(j2) != 0) {
            this.f19210a.getChildAt(0).setMinimumWidth(Constraints.n(j2));
        }
        if (Constraints.m(j2) != 0) {
            this.f19210a.getChildAt(0).setMinimumHeight(Constraints.m(j2));
        }
        AndroidViewHolder androidViewHolder = this.f19210a;
        int n2 = Constraints.n(j2);
        int l2 = Constraints.l(j2);
        ViewGroup.LayoutParams layoutParams = this.f19210a.getLayoutParams();
        Intrinsics.f(layoutParams);
        int w2 = androidViewHolder.E(n2, l2, layoutParams.width);
        AndroidViewHolder androidViewHolder2 = this.f19210a;
        int m2 = Constraints.m(j2);
        int k2 = Constraints.k(j2);
        ViewGroup.LayoutParams layoutParams2 = this.f19210a.getLayoutParams();
        Intrinsics.f(layoutParams2);
        androidViewHolder.measure(w2, androidViewHolder2.E(m2, k2, layoutParams2.height));
        return MeasureScope.R1(measureScope, this.f19210a.getMeasuredWidth(), this.f19210a.getMeasuredHeight(), (Map) null, new AndroidViewHolder$layoutNode$1$5$measure$2(this.f19210a, this.f19211b), 4, (Object) null);
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return d(i2);
    }

    public final int d(int i2) {
        AndroidViewHolder androidViewHolder = this.f19210a;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AndroidViewHolder androidViewHolder2 = this.f19210a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
        Intrinsics.f(layoutParams);
        androidViewHolder.measure(makeMeasureSpec, androidViewHolder2.E(0, i2, layoutParams.height));
        return this.f19210a.getMeasuredWidth();
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return a(i2);
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return d(i2);
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return a(i2);
    }
}
