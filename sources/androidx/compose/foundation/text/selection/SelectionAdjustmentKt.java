package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata
public final class SelectionAdjustmentKt {
    public static final Selection e(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z2 = selectionLayout.j() == CrossStatus.CROSSED;
        return new Selection(f(selectionLayout.l(), z2, true, selectionLayout.m(), boundaryFunction), f(selectionLayout.i(), z2, false, selectionLayout.h(), boundaryFunction), z2);
    }

    public static final Selection.AnchorInfo f(SelectableInfo selectableInfo, boolean z2, boolean z3, int i2, BoundaryFunction boundaryFunction) {
        int g2 = z3 ? selectableInfo.g() : selectableInfo.e();
        if (i2 != selectableInfo.i()) {
            return selectableInfo.a(g2);
        }
        long a2 = boundaryFunction.a(selectableInfo, g2);
        return selectableInfo.a(z2 ^ z3 ? TextRange.n(a2) : TextRange.i(a2));
    }

    public static final Selection.AnchorInfo g(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i2) {
        return Selection.AnchorInfo.b(anchorInfo, selectableInfo.k().c(i2), i2, 0, 4, (Object) null);
    }

    public static final Selection h(Selection selection, SelectionLayout selectionLayout) {
        if (!SelectionLayoutKt.d(selection, selectionLayout)) {
            return selection;
        }
        return (selectionLayout.e() > 1 || selectionLayout.c() == null || selectionLayout.b().c().length() == 0) ? selection : i(selection, selectionLayout);
    }

    public static final Selection i(Selection selection, SelectionLayout selectionLayout) {
        SelectableInfo b2 = selectionLayout.b();
        String c2 = b2.c();
        int g2 = b2.g();
        int length = c2.length();
        if (g2 == 0) {
            int a2 = StringHelpers_androidKt.a(c2, 0);
            if (selectionLayout.a()) {
                return Selection.b(selection, g(selection.e(), b2, a2), (Selection.AnchorInfo) null, true, 2, (Object) null);
            }
            return Selection.b(selection, (Selection.AnchorInfo) null, g(selection.c(), b2, a2), false, 1, (Object) null);
        } else if (g2 == length) {
            int b3 = StringHelpers_androidKt.b(c2, length);
            if (selectionLayout.a()) {
                return Selection.b(selection, g(selection.e(), b2, b3), (Selection.AnchorInfo) null, false, 2, (Object) null);
            }
            return Selection.b(selection, (Selection.AnchorInfo) null, g(selection.c(), b2, b3), true, 1, (Object) null);
        } else {
            Selection c3 = selectionLayout.c();
            boolean z2 = c3 != null && c3.d();
            int b4 = selectionLayout.a() ^ z2 ? StringHelpers_androidKt.b(c2, g2) : StringHelpers_androidKt.a(c2, g2);
            if (selectionLayout.a()) {
                return Selection.b(selection, g(selection.e(), b2, b4), (Selection.AnchorInfo) null, z2, 2, (Object) null);
            }
            return Selection.b(selection, (Selection.AnchorInfo) null, g(selection.c(), b2, b4), z2, 1, (Object) null);
        }
    }

    public static final boolean j(SelectableInfo selectableInfo, int i2, boolean z2) {
        if (selectableInfo.f() == -1) {
            return true;
        }
        if (i2 == selectableInfo.f()) {
            return false;
        }
        if (z2 ^ (selectableInfo.d() == CrossStatus.CROSSED)) {
            if (i2 < selectableInfo.f()) {
                return true;
            }
        } else if (i2 > selectableInfo.f()) {
            return true;
        }
        return false;
    }

    public static final Selection.AnchorInfo k(SelectableInfo selectableInfo, int i2, int i3, int i4, boolean z2, boolean z3) {
        long C = selectableInfo.k().C(i3);
        int n2 = selectableInfo.k().q(TextRange.n(C)) == i2 ? TextRange.n(C) : i2 >= selectableInfo.k().n() ? selectableInfo.k().u(selectableInfo.k().n() - 1) : selectableInfo.k().u(i2);
        int i5 = selectableInfo.k().q(TextRange.i(C)) == i2 ? TextRange.i(C) : i2 >= selectableInfo.k().n() ? TextLayoutResult.p(selectableInfo.k(), selectableInfo.k().n() - 1, false, 2, (Object) null) : TextLayoutResult.p(selectableInfo.k(), i2, false, 2, (Object) null);
        if (n2 == i4) {
            return selectableInfo.a(i5);
        }
        if (i5 == i4) {
            return selectableInfo.a(n2);
        }
        if (!(z2 ^ z3) ? i3 >= n2 : i3 > i5) {
            n2 = i5;
        }
        return selectableInfo.a(n2);
    }

    public static final Selection.AnchorInfo l(SelectionLayout selectionLayout, SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        int g2 = selectionLayout.a() ? selectableInfo.g() : selectableInfo.e();
        if ((selectionLayout.a() ? selectionLayout.m() : selectionLayout.h()) != selectableInfo.i()) {
            return selectableInfo.a(g2);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = LazyKt.a(lazyThreadSafetyMode, new SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2(selectableInfo, g2));
        Lazy a3 = LazyKt.a(lazyThreadSafetyMode, new SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2(selectableInfo, g2, selectionLayout.a() ? selectableInfo.e() : selectableInfo.g(), selectionLayout, a2));
        if (selectableInfo.h() != anchorInfo.e()) {
            return n(a3);
        }
        int f2 = selectableInfo.f();
        if (g2 == f2) {
            return anchorInfo;
        }
        if (m(a2) != selectableInfo.k().q(f2)) {
            return n(a3);
        }
        int d2 = anchorInfo.d();
        long C = selectableInfo.k().C(d2);
        return !j(selectableInfo, g2, selectionLayout.a()) ? selectableInfo.a(g2) : (d2 == TextRange.n(C) || d2 == TextRange.i(C)) ? n(a3) : selectableInfo.a(g2);
    }

    public static final int m(Lazy lazy) {
        return ((Number) lazy.getValue()).intValue();
    }

    public static final Selection.AnchorInfo n(Lazy lazy) {
        return (Selection.AnchorInfo) lazy.getValue();
    }
}
