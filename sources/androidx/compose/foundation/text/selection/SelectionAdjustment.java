package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface SelectionAdjustment {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f6782a = Companion.f6783a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f6783a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final SelectionAdjustment f6784b = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final SelectionAdjustment f6785c = new b();

        /* renamed from: d  reason: collision with root package name */
        public static final SelectionAdjustment f6786d = new c();

        /* renamed from: e  reason: collision with root package name */
        public static final SelectionAdjustment f6787e = new d();

        /* renamed from: f  reason: collision with root package name */
        public static final SelectionAdjustment f6788f = new e();

        public static final Selection f(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.h(f6784b.a(selectionLayout), selectionLayout);
        }

        public static final Selection g(SelectionLayout selectionLayout) {
            Selection.AnchorInfo anchorInfo;
            Selection.AnchorInfo anchorInfo2;
            Selection.AnchorInfo anchorInfo3;
            Selection.AnchorInfo anchorInfo4;
            Selection c2 = selectionLayout.c();
            if (c2 == null) {
                return f6786d.a(selectionLayout);
            }
            if (selectionLayout.a()) {
                anchorInfo4 = c2.e();
                anchorInfo3 = SelectionAdjustmentKt.l(selectionLayout, selectionLayout.l(), anchorInfo4);
                anchorInfo = c2.c();
                anchorInfo2 = anchorInfo3;
            } else {
                anchorInfo4 = c2.c();
                anchorInfo3 = SelectionAdjustmentKt.l(selectionLayout, selectionLayout.i(), anchorInfo4);
                anchorInfo2 = c2.e();
                anchorInfo = anchorInfo3;
            }
            if (Intrinsics.d(anchorInfo3, anchorInfo4)) {
                return c2;
            }
            return SelectionAdjustmentKt.h(new Selection(anchorInfo2, anchorInfo, selectionLayout.j() == CrossStatus.CROSSED || (selectionLayout.j() == CrossStatus.COLLAPSED && anchorInfo2.d() > anchorInfo.d())), selectionLayout);
        }

        public static final Selection h(SelectionLayout selectionLayout) {
            return new Selection(selectionLayout.l().a(selectionLayout.l().g()), selectionLayout.i().a(selectionLayout.i().e()), selectionLayout.j() == CrossStatus.CROSSED);
        }

        public static final Selection i(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.e(selectionLayout, SelectionAdjustment$Companion$Paragraph$1$1.f6789a);
        }

        public static final Selection j(SelectionLayout selectionLayout) {
            return SelectionAdjustmentKt.e(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f6790a);
        }

        public final SelectionAdjustment k() {
            return f6785c;
        }

        public final SelectionAdjustment l() {
            return f6788f;
        }

        public final SelectionAdjustment m() {
            return f6784b;
        }

        public final SelectionAdjustment n() {
            return f6787e;
        }

        public final SelectionAdjustment o() {
            return f6786d;
        }
    }

    Selection a(SelectionLayout selectionLayout);
}
