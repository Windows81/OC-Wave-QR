package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;

@Metadata
public final class HandwritingGestureApi34 {

    /* renamed from: a  reason: collision with root package name */
    public static final HandwritingGestureApi34 f6190a = new HandwritingGestureApi34();

    public static final void F(TransformedTextFieldState transformedTextFieldState) {
        TextFieldState e2 = transformedTextFieldState.f6397a;
        InputTransformation c2 = transformedTextFieldState.f6398b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        e2.g().e().e();
        TextFieldBuffer g2 = e2.g();
        g2.c();
        transformedTextFieldState.G(g2);
        e2.e(c2, true, textFieldEditUndoBehavior);
    }

    public static final void G(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.p();
        }
    }

    public final void A(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        e(transformedTextFieldState, HandwritingGesture_androidKt.w(textLayoutState, RectHelper_androidKt.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), TextInclusionStrategy.f18459a.h()), TextHighlightType.f6084b.a());
    }

    public final void B(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.e0(HandwritingGesture_androidKt.x(legacyTextFieldState, RectHelper_androidKt.f(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), TextInclusionStrategy.f18459a.h()));
        }
    }

    public final void C(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        e(transformedTextFieldState, HandwritingGesture_androidKt.y(textLayoutState, RectHelper_androidKt.f(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), TextInclusionStrategy.f18459a.h()), TextHighlightType.f6084b.a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r2 = (r2 = r2.f()).l();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D(androidx.compose.foundation.text.LegacyTextFieldState r4, android.view.inputmethod.PreviewableHandwritingGesture r5, androidx.compose.foundation.text.selection.TextFieldSelectionManager r6, android.os.CancellationSignal r7) {
        /*
            r3 = this;
            androidx.compose.ui.text.AnnotatedString r0 = r4.y()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.compose.foundation.text.TextLayoutResultProxy r2 = r4.l()
            if (r2 == 0) goto L_0x001f
            androidx.compose.ui.text.TextLayoutResult r2 = r2.f()
            if (r2 == 0) goto L_0x001f
            androidx.compose.ui.text.TextLayoutInput r2 = r2.l()
            if (r2 == 0) goto L_0x001f
            androidx.compose.ui.text.AnnotatedString r2 = r2.j()
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r2)
            if (r0 != 0) goto L_0x0027
            return r1
        L_0x0027:
            boolean r0 = androidx.compose.foundation.text.input.internal.C0034x.a(r5)
            if (r0 == 0) goto L_0x0035
            android.view.inputmethod.SelectGesture r5 = androidx.compose.foundation.text.input.internal.I.a(r5)
            r3.H(r4, r5, r6)
            goto L_0x005e
        L_0x0035:
            boolean r0 = androidx.compose.foundation.text.input.internal.U.a(r5)
            if (r0 == 0) goto L_0x0043
            android.view.inputmethod.DeleteGesture r5 = androidx.compose.foundation.text.input.internal.W.a(r5)
            r3.z(r4, r5, r6)
            goto L_0x005e
        L_0x0043:
            boolean r0 = androidx.compose.foundation.text.input.internal.X.a(r5)
            if (r0 == 0) goto L_0x0051
            android.view.inputmethod.SelectRangeGesture r5 = androidx.compose.foundation.text.input.internal.Y.a(r5)
            r3.J(r4, r5, r6)
            goto L_0x005e
        L_0x0051:
            boolean r0 = androidx.compose.foundation.text.input.internal.Z.a(r5)
            if (r0 == 0) goto L_0x006a
            android.view.inputmethod.DeleteRangeGesture r5 = androidx.compose.foundation.text.input.internal.a0.a(r5)
            r3.B(r4, r5, r6)
        L_0x005e:
            if (r7 == 0) goto L_0x0068
            androidx.compose.foundation.text.input.internal.d0 r4 = new androidx.compose.foundation.text.input.internal.d0
            r4.<init>(r6)
            r7.setOnCancelListener(r4)
        L_0x0068:
            r4 = 1
            return r4
        L_0x006a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.D(androidx.compose.foundation.text.LegacyTextFieldState, android.view.inputmethod.PreviewableHandwritingGesture, androidx.compose.foundation.text.selection.TextFieldSelectionManager, android.os.CancellationSignal):boolean");
    }

    public final boolean E(TransformedTextFieldState transformedTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextLayoutState textLayoutState, CancellationSignal cancellationSignal) {
        if (C0034x.a(previewableHandwritingGesture)) {
            I(transformedTextFieldState, I.a(previewableHandwritingGesture), textLayoutState);
        } else if (U.a(previewableHandwritingGesture)) {
            A(transformedTextFieldState, W.a(previewableHandwritingGesture), textLayoutState);
        } else if (X.a(previewableHandwritingGesture)) {
            K(transformedTextFieldState, Y.a(previewableHandwritingGesture), textLayoutState);
        } else if (!Z.a(previewableHandwritingGesture)) {
            return false;
        } else {
            C(transformedTextFieldState, a0.a(previewableHandwritingGesture), textLayoutState);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new e0(transformedTextFieldState));
        return true;
    }

    public final void H(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.o0(HandwritingGesture_androidKt.v(legacyTextFieldState, RectHelper_androidKt.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), TextInclusionStrategy.f18459a.h()));
        }
    }

    public final void I(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        e(transformedTextFieldState, HandwritingGesture_androidKt.w(textLayoutState, RectHelper_androidKt.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), TextInclusionStrategy.f18459a.h()), TextHighlightType.f6084b.b());
    }

    public final void J(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.o0(HandwritingGesture_androidKt.x(legacyTextFieldState, RectHelper_androidKt.f(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), TextInclusionStrategy.f18459a.h()));
        }
    }

    public final void K(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        e(transformedTextFieldState, HandwritingGesture_androidKt.y(textLayoutState, RectHelper_androidKt.f(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), TextInclusionStrategy.f18459a.h()), TextHighlightType.f6084b.b());
    }

    public final int L(int i2) {
        return i2 != 1 ? i2 != 2 ? TextGranularity.f18455b.a() : TextGranularity.f18455b.a() : TextGranularity.f18455b.b();
    }

    public final int c(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture) {
        TextFieldState e2 = transformedTextFieldState.f6397a;
        InputTransformation c2 = transformedTextFieldState.f6398b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        e2.g().e().e();
        TextFieldBuffer g2 = e2.g();
        g2.c();
        transformedTextFieldState.G(g2);
        e2.e(c2, true, textFieldEditUndoBehavior);
        String a2 = handwritingGesture.getFallbackText();
        if (a2 == null) {
            return 3;
        }
        TransformedTextFieldState.x(transformedTextFieldState, a2, true, (TextFieldEditUndoBehavior) null, false, 12, (Object) null);
        return 5;
    }

    public final int d(HandwritingGesture handwritingGesture, Function1 function1) {
        String a2 = handwritingGesture.getFallbackText();
        if (a2 == null) {
            return 3;
        }
        function1.invoke(new CommitTextCommand(a2, 1));
        return 5;
    }

    public final void e(TransformedTextFieldState transformedTextFieldState, long j2, int i2) {
        if (TextRange.h(j2)) {
            TextFieldState e2 = transformedTextFieldState.f6397a;
            InputTransformation c2 = transformedTextFieldState.f6398b;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            e2.g().e().e();
            TextFieldBuffer g2 = e2.g();
            g2.c();
            transformedTextFieldState.G(g2);
            e2.e(c2, true, textFieldEditUndoBehavior);
            return;
        }
        transformedTextFieldState.p(i2, j2);
    }

    public final int f(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, Function1 function1) {
        int L = L(deleteGesture.getGranularity());
        long f2 = HandwritingGesture_androidKt.v(legacyTextFieldState, RectHelper_androidKt.f(deleteGesture.getDeletionArea()), L, TextInclusionStrategy.f18459a.h());
        if (TextRange.h(f2)) {
            return f6190a.d(N.a(deleteGesture), function1);
        }
        k(f2, annotatedString, TextGranularity.e(L, TextGranularity.f18455b.b()), function1);
        return 1;
    }

    public final int g(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        int L = L(deleteGesture.getGranularity());
        long g2 = HandwritingGesture_androidKt.w(textLayoutState, RectHelper_androidKt.f(deleteGesture.getDeletionArea()), L, TextInclusionStrategy.f18459a.h());
        if (TextRange.h(g2)) {
            return f6190a.c(transformedTextFieldState, N.a(deleteGesture));
        }
        j(transformedTextFieldState, g2, TextGranularity.e(L, TextGranularity.f18455b.b()));
        return 1;
    }

    public final int h(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, Function1 function1) {
        int L = L(deleteRangeGesture.getGranularity());
        long h2 = HandwritingGesture_androidKt.x(legacyTextFieldState, RectHelper_androidKt.f(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.f(deleteRangeGesture.getDeletionEndArea()), L, TextInclusionStrategy.f18459a.h());
        if (TextRange.h(h2)) {
            return f6190a.d(N.a(deleteRangeGesture), function1);
        }
        k(h2, annotatedString, TextGranularity.e(L, TextGranularity.f18455b.b()), function1);
        return 1;
    }

    public final int i(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        int L = L(deleteRangeGesture.getGranularity());
        long i2 = HandwritingGesture_androidKt.y(textLayoutState, RectHelper_androidKt.f(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.f(deleteRangeGesture.getDeletionEndArea()), L, TextInclusionStrategy.f18459a.h());
        if (TextRange.h(i2)) {
            return f6190a.c(transformedTextFieldState, N.a(deleteRangeGesture));
        }
        j(transformedTextFieldState, i2, TextGranularity.e(L, TextGranularity.f18455b.b()));
        return 1;
    }

    public final void j(TransformedTextFieldState transformedTextFieldState, long j2, boolean z2) {
        if (z2) {
            j2 = HandwritingGesture_androidKt.m(j2, transformedTextFieldState.o());
        }
        TransformedTextFieldState.z(transformedTextFieldState, "", j2, (TextFieldEditUndoBehavior) null, false, 12, (Object) null);
    }

    public final void k(long j2, AnnotatedString annotatedString, boolean z2, Function1 function1) {
        if (z2) {
            j2 = HandwritingGesture_androidKt.m(j2, annotatedString);
        }
        function1.invoke(HandwritingGesture_androidKt.n(new SetSelectionCommand(TextRange.i(j2), TextRange.i(j2)), new DeleteSurroundingTextCommand(TextRange.j(j2), 0)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r1 = (r1 = r1.f()).l();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int l(androidx.compose.foundation.text.LegacyTextFieldState r7, android.view.inputmethod.HandwritingGesture r8, androidx.compose.foundation.text.selection.TextFieldSelectionManager r9, androidx.compose.ui.platform.ViewConfiguration r10, kotlin.jvm.functions.Function1 r11) {
        /*
            r6 = this;
            androidx.compose.ui.text.AnnotatedString r3 = r7.y()
            r0 = 3
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            androidx.compose.foundation.text.TextLayoutResultProxy r1 = r7.l()
            if (r1 == 0) goto L_0x001f
            androidx.compose.ui.text.TextLayoutResult r1 = r1.f()
            if (r1 == 0) goto L_0x001f
            androidx.compose.ui.text.TextLayoutInput r1 = r1.l()
            if (r1 == 0) goto L_0x001f
            androidx.compose.ui.text.AnnotatedString r1 = r1.j()
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r3, r1)
            if (r1 != 0) goto L_0x0027
            return r0
        L_0x0027:
            boolean r0 = androidx.compose.foundation.text.input.internal.C0034x.a(r8)
            if (r0 == 0) goto L_0x0037
            android.view.inputmethod.SelectGesture r8 = androidx.compose.foundation.text.input.internal.I.a(r8)
            int r7 = r6.u(r7, r8, r9, r11)
            goto L_0x009a
        L_0x0037:
            boolean r0 = androidx.compose.foundation.text.input.internal.U.a(r8)
            if (r0 == 0) goto L_0x0046
            android.view.inputmethod.DeleteGesture r8 = androidx.compose.foundation.text.input.internal.W.a(r8)
            int r7 = r6.f(r7, r8, r3, r11)
            goto L_0x009a
        L_0x0046:
            boolean r0 = androidx.compose.foundation.text.input.internal.X.a(r8)
            if (r0 == 0) goto L_0x0055
            android.view.inputmethod.SelectRangeGesture r8 = androidx.compose.foundation.text.input.internal.Y.a(r8)
            int r7 = r6.w(r7, r8, r9, r11)
            goto L_0x009a
        L_0x0055:
            boolean r9 = androidx.compose.foundation.text.input.internal.Z.a(r8)
            if (r9 == 0) goto L_0x0064
            android.view.inputmethod.DeleteRangeGesture r8 = androidx.compose.foundation.text.input.internal.a0.a(r8)
            int r7 = r6.h(r7, r8, r3, r11)
            goto L_0x009a
        L_0x0064:
            boolean r9 = androidx.compose.foundation.text.input.internal.L.a(r8)
            if (r9 == 0) goto L_0x0077
            android.view.inputmethod.JoinOrSplitGesture r2 = androidx.compose.foundation.text.input.internal.M.a(r8)
            r0 = r6
            r1 = r7
            r4 = r10
            r5 = r11
            int r7 = r0.q(r1, r2, r3, r4, r5)
            goto L_0x009a
        L_0x0077:
            boolean r9 = androidx.compose.foundation.text.input.internal.G.a(r8)
            if (r9 == 0) goto L_0x0086
            android.view.inputmethod.InsertGesture r8 = androidx.compose.foundation.text.input.internal.H.a(r8)
            int r7 = r6.n(r7, r8, r10, r11)
            goto L_0x009a
        L_0x0086:
            boolean r9 = androidx.compose.foundation.text.input.internal.J.a(r8)
            if (r9 == 0) goto L_0x0099
            android.view.inputmethod.RemoveSpaceGesture r2 = androidx.compose.foundation.text.input.internal.K.a(r8)
            r0 = r6
            r1 = r7
            r4 = r10
            r5 = r11
            int r7 = r0.s(r1, r2, r3, r4, r5)
            goto L_0x009a
        L_0x0099:
            r7 = 2
        L_0x009a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.l(androidx.compose.foundation.text.LegacyTextFieldState, android.view.inputmethod.HandwritingGesture, androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.ui.platform.ViewConfiguration, kotlin.jvm.functions.Function1):int");
    }

    public final int m(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture, TextLayoutState textLayoutState, Function0 function0, ViewConfiguration viewConfiguration) {
        if (C0034x.a(handwritingGesture)) {
            return v(transformedTextFieldState, I.a(handwritingGesture), textLayoutState, function0);
        }
        if (U.a(handwritingGesture)) {
            return g(transformedTextFieldState, W.a(handwritingGesture), textLayoutState);
        }
        if (X.a(handwritingGesture)) {
            return x(transformedTextFieldState, Y.a(handwritingGesture), textLayoutState, function0);
        }
        if (Z.a(handwritingGesture)) {
            return i(transformedTextFieldState, a0.a(handwritingGesture), textLayoutState);
        }
        if (L.a(handwritingGesture)) {
            return r(transformedTextFieldState, M.a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (G.a(handwritingGesture)) {
            return o(transformedTextFieldState, H.a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (J.a(handwritingGesture)) {
            return t(transformedTextFieldState, K.a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        return 2;
    }

    public final int n(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, Function1 function1) {
        TextLayoutResultProxy l2;
        TextLayoutResult f2;
        if (viewConfiguration == null) {
            return d(N.a(insertGesture), function1);
        }
        int c2 = HandwritingGesture_androidKt.q(legacyTextFieldState, HandwritingGesture_androidKt.F(insertGesture.getInsertionPoint()), viewConfiguration);
        if (c2 == -1 || ((l2 = legacyTextFieldState.l()) != null && (f2 = l2.f()) != null && HandwritingGesture_androidKt.z(f2, c2))) {
            return d(N.a(insertGesture), function1);
        }
        p(c2, insertGesture.getTextToInsert(), function1);
        return 1;
    }

    public final int o(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        int d2 = HandwritingGesture_androidKt.r(textLayoutState, HandwritingGesture_androidKt.F(insertGesture.getInsertionPoint()), viewConfiguration);
        if (d2 == -1) {
            return c(transformedTextFieldState, N.a(insertGesture));
        }
        TransformedTextFieldState.z(transformedTextFieldState, insertGesture.getTextToInsert(), TextRangeKt.a(d2), (TextFieldEditUndoBehavior) null, false, 12, (Object) null);
        return 1;
    }

    public final void p(int i2, String str, Function1 function1) {
        function1.invoke(HandwritingGesture_androidKt.n(new SetSelectionCommand(i2, i2), new CommitTextCommand(str, 1)));
    }

    public final int q(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1 function1) {
        TextLayoutResultProxy l2;
        TextLayoutResult f2;
        if (viewConfiguration == null) {
            return d(N.a(joinOrSplitGesture), function1);
        }
        int c2 = HandwritingGesture_androidKt.q(legacyTextFieldState, HandwritingGesture_androidKt.F(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (c2 == -1 || ((l2 = legacyTextFieldState.l()) != null && (f2 = l2.f()) != null && HandwritingGesture_androidKt.z(f2, c2))) {
            return d(N.a(joinOrSplitGesture), function1);
        }
        long k2 = HandwritingGesture_androidKt.E(annotatedString, c2);
        if (TextRange.h(k2)) {
            p(TextRange.n(k2), " ", function1);
        } else {
            k(k2, annotatedString, false, function1);
        }
        return 1;
    }

    public final int r(TransformedTextFieldState transformedTextFieldState, JoinOrSplitGesture joinOrSplitGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        TextLayoutResult f2;
        if (transformedTextFieldState.l() != transformedTextFieldState.n()) {
            return 3;
        }
        int d2 = HandwritingGesture_androidKt.r(textLayoutState, HandwritingGesture_androidKt.F(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (d2 == -1 || ((f2 = textLayoutState.f()) != null && HandwritingGesture_androidKt.z(f2, d2))) {
            return c(transformedTextFieldState, N.a(joinOrSplitGesture));
        }
        long k2 = HandwritingGesture_androidKt.E(transformedTextFieldState.o(), d2);
        if (TextRange.h(k2)) {
            TransformedTextFieldState.z(transformedTextFieldState, " ", k2, (TextFieldEditUndoBehavior) null, false, 12, (Object) null);
        } else {
            j(transformedTextFieldState, k2, false);
        }
        return 1;
    }

    public final int s(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1 function1) {
        TextLayoutResultProxy l2 = legacyTextFieldState.l();
        long e2 = HandwritingGesture_androidKt.t(l2 != null ? l2.f() : null, HandwritingGesture_androidKt.F(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.F(removeSpaceGesture.getEndPoint()), legacyTextFieldState.k(), viewConfiguration);
        if (TextRange.h(e2)) {
            return f6190a.d(N.a(removeSpaceGesture), function1);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f40906z = -1;
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.f40906z = -1;
        String f2 = new Regex("\\s+").f(TextRangeKt.e(annotatedString, e2), new HandwritingGestureApi34$performRemoveSpaceGesture$newText$2(intRef, intRef2));
        if (intRef.f40906z == -1 || intRef2.f40906z == -1) {
            return d(N.a(removeSpaceGesture), function1);
        }
        int n2 = TextRange.n(e2) + intRef.f40906z;
        int n3 = TextRange.n(e2) + intRef2.f40906z;
        String substring = f2.substring(intRef.f40906z, f2.length() - (TextRange.j(e2) - intRef2.f40906z));
        Intrinsics.h(substring, "substring(...)");
        function1.invoke(HandwritingGesture_androidKt.n(new SetSelectionCommand(n2, n3), new CommitTextCommand(substring, 1)));
        return 1;
    }

    public final int t(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        long e2 = HandwritingGesture_androidKt.t(textLayoutState.f(), HandwritingGesture_androidKt.F(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.F(removeSpaceGesture.getEndPoint()), textLayoutState.j(), viewConfiguration);
        if (TextRange.h(e2)) {
            return f6190a.c(transformedTextFieldState, N.a(removeSpaceGesture));
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f40906z = -1;
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.f40906z = -1;
        String f2 = new Regex("\\s+").f(TextRangeKt.e(transformedTextFieldState.o(), e2), new HandwritingGestureApi34$performRemoveSpaceGesture$newText$1(intRef, intRef2));
        if (intRef.f40906z == -1 || intRef2.f40906z == -1) {
            return c(transformedTextFieldState, N.a(removeSpaceGesture));
        }
        long b2 = TextRangeKt.b(TextRange.n(e2) + intRef.f40906z, TextRange.n(e2) + intRef2.f40906z);
        String substring = f2.substring(intRef.f40906z, f2.length() - (TextRange.j(e2) - intRef2.f40906z));
        Intrinsics.h(substring, "substring(...)");
        TransformedTextFieldState.z(transformedTextFieldState, substring, b2, (TextFieldEditUndoBehavior) null, false, 12, (Object) null);
        return 1;
    }

    public final int u(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, Function1 function1) {
        long f2 = HandwritingGesture_androidKt.v(legacyTextFieldState, RectHelper_androidKt.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), TextInclusionStrategy.f18459a.h());
        if (TextRange.h(f2)) {
            return f6190a.d(N.a(selectGesture), function1);
        }
        y(f2, textFieldSelectionManager, function1);
        return 1;
    }

    public final int v(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState, Function0 function0) {
        long g2 = HandwritingGesture_androidKt.w(textLayoutState, RectHelper_androidKt.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), TextInclusionStrategy.f18459a.h());
        if (TextRange.h(g2)) {
            return f6190a.c(transformedTextFieldState, N.a(selectGesture));
        }
        transformedTextFieldState.B(g2);
        if (function0 == null) {
            return 1;
        }
        function0.invoke();
        return 1;
    }

    public final int w(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, Function1 function1) {
        long h2 = HandwritingGesture_androidKt.x(legacyTextFieldState, RectHelper_androidKt.f(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), TextInclusionStrategy.f18459a.h());
        if (TextRange.h(h2)) {
            return f6190a.d(N.a(selectRangeGesture), function1);
        }
        y(h2, textFieldSelectionManager, function1);
        return 1;
    }

    public final int x(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState, Function0 function0) {
        long i2 = HandwritingGesture_androidKt.y(textLayoutState, RectHelper_androidKt.f(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), TextInclusionStrategy.f18459a.h());
        if (TextRange.h(i2)) {
            return f6190a.c(transformedTextFieldState, N.a(selectRangeGesture));
        }
        transformedTextFieldState.B(i2);
        if (function0 == null) {
            return 1;
        }
        function0.invoke();
        return 1;
    }

    public final void y(long j2, TextFieldSelectionManager textFieldSelectionManager, Function1 function1) {
        function1.invoke(new SetSelectionCommand(TextRange.n(j2), TextRange.i(j2)));
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.x(true);
        }
    }

    public final void z(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.e0(HandwritingGesture_androidKt.v(legacyTextFieldState, RectHelper_androidKt.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), TextInclusionStrategy.f18459a.h()));
        }
    }
}
