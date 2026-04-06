package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;

@Metadata
public final class SelectionLayoutKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6863a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.selection.Direction[] r0 = androidx.compose.foundation.text.selection.Direction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.selection.Direction r1 = androidx.compose.foundation.text.selection.Direction.BEFORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.selection.Direction r1 = androidx.compose.foundation.text.selection.Direction.ON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.selection.Direction r1 = androidx.compose.foundation.text.selection.Direction.AFTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f6863a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionLayoutKt.WhenMappings.<clinit>():void");
        }
    }

    public static final ResolvedTextDirection b(TextLayoutResult textLayoutResult, int i2) {
        return e(textLayoutResult, i2) ? textLayoutResult.y(i2) : textLayoutResult.c(i2);
    }

    public static final SelectionLayout c(TextLayoutResult textLayoutResult, int i2, int i3, int i4, long j2, boolean z2, boolean z3) {
        TextLayoutResult textLayoutResult2 = textLayoutResult;
        return new SingleSelectionLayout(z3, 1, 1, z2 ? null : new Selection(new Selection.AnchorInfo(b(textLayoutResult, TextRange.n(j2)), TextRange.n(j2), 1), new Selection.AnchorInfo(b(textLayoutResult, TextRange.i(j2)), TextRange.i(j2), 1), TextRange.m(j2)), new SelectableInfo(1, 1, i2, i3, i4, textLayoutResult));
    }

    public static final boolean d(Selection selection, SelectionLayout selectionLayout) {
        if (selection == null || selectionLayout == null) {
            return true;
        }
        if (selection.e().e() == selection.c().e()) {
            return selection.e().d() == selection.c().d();
        }
        if ((selection.d() ? selection.e() : selection.c()).d() != 0) {
            return false;
        }
        if (selectionLayout.d().l() != (selection.d() ? selection.c() : selection.e()).d()) {
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f40901z = true;
        selectionLayout.k(new SelectionLayoutKt$isCollapsed$1(booleanRef));
        return booleanRef.f40901z;
    }

    public static final boolean e(TextLayoutResult textLayoutResult, int i2) {
        if (textLayoutResult.l().j().length() == 0) {
            return true;
        }
        int q2 = textLayoutResult.q(i2);
        return (i2 == 0 || q2 != textLayoutResult.q(i2 + -1)) && (i2 == textLayoutResult.l().j().length() || q2 != textLayoutResult.q(i2 + 1));
    }

    public static final Direction f(Direction direction, Direction direction2) {
        int[] iArr = WhenMappings.f6863a;
        int i2 = iArr[direction2.ordinal()];
        if (i2 == 1) {
            return Direction.BEFORE;
        }
        if (i2 == 2) {
            int i3 = iArr[direction.ordinal()];
            if (i3 == 1) {
                return Direction.BEFORE;
            }
            if (i3 == 2) {
                return Direction.ON;
            }
            if (i3 == 3) {
                return Direction.AFTER;
            }
            throw new NoWhenBranchMatchedException();
        } else if (i2 == 3) {
            return Direction.AFTER;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
