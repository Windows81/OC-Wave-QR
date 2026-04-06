package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class TextFieldSelectionManager {

    /* renamed from: a  reason: collision with root package name */
    public final UndoManager f6970a;

    /* renamed from: b  reason: collision with root package name */
    public OffsetMapping f6971b = ValidatingOffsetMappingKt.d();

    /* renamed from: c  reason: collision with root package name */
    public Function1 f6972c = TextFieldSelectionManager$onValueChange$1.f6998z;

    /* renamed from: d  reason: collision with root package name */
    public LegacyTextFieldState f6973d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f6974e = SnapshotStateKt__SnapshotStateKt.e(new TextFieldValue((String) null, 0, (TextRange) null, 7, (DefaultConstructorMarker) null), (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    public VisualTransformation f6975f = VisualTransformation.f18929a.c();

    /* renamed from: g  reason: collision with root package name */
    public Function0 f6976g;

    /* renamed from: h  reason: collision with root package name */
    public Clipboard f6977h;

    /* renamed from: i  reason: collision with root package name */
    public CoroutineScope f6978i;

    /* renamed from: j  reason: collision with root package name */
    public TextToolbar f6979j;

    /* renamed from: k  reason: collision with root package name */
    public HapticFeedback f6980k;

    /* renamed from: l  reason: collision with root package name */
    public FocusRequester f6981l;

    /* renamed from: m  reason: collision with root package name */
    public final MutableState f6982m;

    /* renamed from: n  reason: collision with root package name */
    public final MutableState f6983n;

    /* renamed from: o  reason: collision with root package name */
    public long f6984o;

    /* renamed from: p  reason: collision with root package name */
    public Integer f6985p;

    /* renamed from: q  reason: collision with root package name */
    public long f6986q;

    /* renamed from: r  reason: collision with root package name */
    public final MutableState f6987r;

    /* renamed from: s  reason: collision with root package name */
    public final MutableState f6988s;

    /* renamed from: t  reason: collision with root package name */
    public int f6989t;

    /* renamed from: u  reason: collision with root package name */
    public TextFieldValue f6990u;

    /* renamed from: v  reason: collision with root package name */
    public SelectionLayout f6991v;

    /* renamed from: w  reason: collision with root package name */
    public final TextDragObserver f6992w;

    /* renamed from: x  reason: collision with root package name */
    public final MouseSelectionObserver f6993x;

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.f6970a = undoManager;
        Boolean bool = Boolean.TRUE;
        this.f6982m = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6983n = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        Offset.Companion companion = Offset.f15855b;
        this.f6984o = companion.c();
        this.f6986q = companion.c();
        this.f6987r = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6988s = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6989t = -1;
        this.f6990u = new TextFieldValue((String) null, 0, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.f6992w = new TextFieldSelectionManager$touchSelectionObserver$1(this);
        this.f6993x = new TextFieldSelectionManager$mouseSelectionObserver$1(this);
    }

    public static /* synthetic */ Job r(TextFieldSelectionManager textFieldSelectionManager, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return textFieldSelectionManager.q(z2);
    }

    public static /* synthetic */ void w(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.v(offset);
    }

    public static /* synthetic */ void y(TextFieldSelectionManager textFieldSelectionManager, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        textFieldSelectionManager.x(z2);
    }

    public final Clipboard A() {
        return this.f6977h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        r4 = r4.k();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.geometry.Rect B() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.foundation.text.LegacyTextFieldState r1 = r0.f6973d
            if (r1 == 0) goto L_0x013c
            boolean r2 = r1.B()
            if (r2 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            if (r1 == 0) goto L_0x013c
            androidx.compose.ui.text.input.OffsetMapping r2 = r0.f6971b
            androidx.compose.ui.text.input.TextFieldValue r3 = r17.U()
            long r3 = r3.h()
            int r3 = androidx.compose.ui.text.TextRange.n(r3)
            int r2 = r2.b(r3)
            androidx.compose.ui.text.input.OffsetMapping r3 = r0.f6971b
            androidx.compose.ui.text.input.TextFieldValue r4 = r17.U()
            long r4 = r4.h()
            int r4 = androidx.compose.ui.text.TextRange.i(r4)
            int r3 = r3.b(r4)
            androidx.compose.foundation.text.LegacyTextFieldState r4 = r0.f6973d
            if (r4 == 0) goto L_0x0048
            androidx.compose.ui.layout.LayoutCoordinates r4 = r4.k()
            if (r4 == 0) goto L_0x0048
            r5 = 1
            long r5 = r0.K(r5)
            long r4 = r4.o0(r5)
            goto L_0x004e
        L_0x0048:
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.ui.geometry.Offset.f15855b
            long r4 = r4.c()
        L_0x004e:
            androidx.compose.foundation.text.LegacyTextFieldState r6 = r0.f6973d
            if (r6 == 0) goto L_0x0062
            androidx.compose.ui.layout.LayoutCoordinates r6 = r6.k()
            if (r6 == 0) goto L_0x0062
            r7 = 0
            long r7 = r0.K(r7)
            long r6 = r6.o0(r7)
            goto L_0x0068
        L_0x0062:
            androidx.compose.ui.geometry.Offset$Companion r6 = androidx.compose.ui.geometry.Offset.f15855b
            long r6 = r6.c()
        L_0x0068:
            androidx.compose.foundation.text.LegacyTextFieldState r8 = r0.f6973d
            r9 = 32
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r12 = 0
            if (r8 == 0) goto L_0x00af
            androidx.compose.ui.layout.LayoutCoordinates r8 = r8.k()
            if (r8 == 0) goto L_0x00af
            androidx.compose.foundation.text.TextLayoutResultProxy r13 = r1.l()
            if (r13 == 0) goto L_0x0091
            androidx.compose.ui.text.TextLayoutResult r13 = r13.f()
            if (r13 == 0) goto L_0x0091
            androidx.compose.ui.geometry.Rect r2 = r13.e(r2)
            if (r2 == 0) goto L_0x0091
            float r2 = r2.r()
            goto L_0x0092
        L_0x0091:
            r2 = r12
        L_0x0092:
            int r13 = java.lang.Float.floatToRawIntBits(r12)
            long r13 = (long) r13
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r15 = r6
            long r6 = (long) r2
            long r13 = r13 << r9
            long r6 = r6 & r10
            long r6 = r6 | r13
            long r6 = androidx.compose.ui.geometry.Offset.e(r6)
            long r6 = r8.o0(r6)
            long r6 = r6 & r10
            int r2 = (int) r6
            float r2 = java.lang.Float.intBitsToFloat(r2)
            goto L_0x00b1
        L_0x00af:
            r15 = r6
            r2 = r12
        L_0x00b1:
            androidx.compose.foundation.text.LegacyTextFieldState r6 = r0.f6973d
            if (r6 == 0) goto L_0x00ee
            androidx.compose.ui.layout.LayoutCoordinates r6 = r6.k()
            if (r6 == 0) goto L_0x00ee
            androidx.compose.foundation.text.TextLayoutResultProxy r7 = r1.l()
            if (r7 == 0) goto L_0x00d2
            androidx.compose.ui.text.TextLayoutResult r7 = r7.f()
            if (r7 == 0) goto L_0x00d2
            androidx.compose.ui.geometry.Rect r3 = r7.e(r3)
            if (r3 == 0) goto L_0x00d2
            float r3 = r3.r()
            goto L_0x00d3
        L_0x00d2:
            r3 = r12
        L_0x00d3:
            int r7 = java.lang.Float.floatToRawIntBits(r12)
            long r7 = (long) r7
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r12 = (long) r3
            long r7 = r7 << r9
            long r12 = r12 & r10
            long r7 = r7 | r12
            long r7 = androidx.compose.ui.geometry.Offset.e(r7)
            long r6 = r6.o0(r7)
            long r6 = r6 & r10
            int r3 = (int) r6
            float r12 = java.lang.Float.intBitsToFloat(r3)
        L_0x00ee:
            long r6 = r4 >> r9
            int r3 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r3)
            long r7 = r15 >> r9
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            float r6 = java.lang.Math.min(r6, r8)
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r3 = java.lang.Math.max(r3, r7)
            float r2 = java.lang.Math.min(r2, r12)
            long r4 = r4 & r10
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r7 = r15 & r10
            int r5 = (int) r7
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r4 = java.lang.Math.max(r4, r5)
            r5 = 25
            float r5 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.foundation.text.TextDelegate r1 = r1.x()
            androidx.compose.ui.unit.Density r1 = r1.a()
            float r1 = r1.getDensity()
            float r5 = r5 * r1
            float r4 = r4 + r5
            androidx.compose.ui.geometry.Rect r1 = new androidx.compose.ui.geometry.Rect
            r1.<init>(r6, r2, r3, r4)
            return r1
        L_0x013c:
            androidx.compose.ui.geometry.Rect$Companion r1 = androidx.compose.ui.geometry.Rect.f15860e
            androidx.compose.ui.geometry.Rect r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.B():androidx.compose.ui.geometry.Rect");
    }

    public final CoroutineScope C() {
        return this.f6978i;
    }

    public final Offset D() {
        return (Offset) this.f6988s.getValue();
    }

    public final long E(Density density) {
        int b2 = this.f6971b.b(TextRange.n(U().h()));
        LegacyTextFieldState legacyTextFieldState = this.f6973d;
        TextLayoutResultProxy l2 = legacyTextFieldState != null ? legacyTextFieldState.l() : null;
        Intrinsics.f(l2);
        TextLayoutResult f2 = l2.f();
        Rect e2 = f2.e(RangesKt.o(b2, 0, f2.l().j().length()));
        return Offset.e((((long) Float.floatToRawIntBits(e2.o() + (density.B1(TextFieldCursor_androidKt.a()) / ((float) 2)))) << 32) | (((long) Float.floatToRawIntBits(e2.i())) & 4294967295L));
    }

    public final Handle F() {
        return (Handle) this.f6987r.getValue();
    }

    public final boolean G() {
        return ((Boolean) this.f6982m.getValue()).booleanValue();
    }

    public final boolean H() {
        return ((Boolean) this.f6983n.getValue()).booleanValue();
    }

    public final FocusRequester I() {
        return this.f6981l;
    }

    public final float J(boolean z2) {
        TextLayoutResultProxy l2;
        TextLayoutResult f2;
        int n2 = z2 ? TextRange.n(U().h()) : TextRange.i(U().h());
        LegacyTextFieldState legacyTextFieldState = this.f6973d;
        if (legacyTextFieldState == null || (l2 = legacyTextFieldState.l()) == null || (f2 = l2.f()) == null) {
            return 0.0f;
        }
        return TextLayoutHelperKt.b(f2, n2);
    }

    public final long K(boolean z2) {
        TextLayoutResultProxy l2;
        TextLayoutResult f2;
        LegacyTextFieldState legacyTextFieldState = this.f6973d;
        if (legacyTextFieldState == null || (l2 = legacyTextFieldState.l()) == null || (f2 = l2.f()) == null) {
            return Offset.f15855b.b();
        }
        AnnotatedString S = S();
        if (S == null) {
            return Offset.f15855b.b();
        }
        if (!Intrinsics.d(S.k(), f2.l().j().k())) {
            return Offset.f15855b.b();
        }
        long h2 = U().h();
        return TextSelectionDelegateKt.b(f2, this.f6971b.b(z2 ? TextRange.n(h2) : TextRange.i(h2)), z2, TextRange.m(U().h()));
    }

    public final HapticFeedback L() {
        return this.f6980k;
    }

    public final MouseSelectionObserver M() {
        return this.f6993x;
    }

    public final OffsetMapping N() {
        return this.f6971b;
    }

    public final Function1 O() {
        return this.f6972c;
    }

    public final LegacyTextFieldState P() {
        return this.f6973d;
    }

    public final TextToolbar Q() {
        return this.f6979j;
    }

    public final TextDragObserver R() {
        return this.f6992w;
    }

    public final AnnotatedString S() {
        TextDelegate x2;
        LegacyTextFieldState legacyTextFieldState = this.f6973d;
        if (legacyTextFieldState == null || (x2 = legacyTextFieldState.x()) == null) {
            return null;
        }
        return x2.k();
    }

    public final UndoManager T() {
        return this.f6970a;
    }

    public final TextFieldValue U() {
        return (TextFieldValue) this.f6974e.getValue();
    }

    public final VisualTransformation V() {
        return this.f6975f;
    }

    public final TextDragObserver W(boolean z2) {
        return new TextFieldSelectionManager$handleDragObserver$1(this, z2);
    }

    public final void X() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.f6979j;
        if ((textToolbar2 != null ? textToolbar2.A() : null) == TextToolbarStatus.Shown && (textToolbar = this.f6979j) != null) {
            textToolbar.a();
        }
    }

    public final boolean Y() {
        return !Intrinsics.d(this.f6990u.i(), U().i());
    }

    public final Job Z() {
        CoroutineScope coroutineScope = this.f6978i;
        if (coroutineScope != null) {
            return BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$paste$1(this, (Continuation) null), 1, (Object) null);
        }
        return null;
    }

    public final void a0() {
        TextFieldValue s2 = s(U().f(), TextRangeKt.b(0, U().i().length()));
        this.f6972c.invoke(s2);
        this.f6990u = TextFieldValue.d(this.f6990u, (AnnotatedString) null, s2.h(), (TextRange) null, 5, (Object) null);
        x(true);
    }

    public final void b0(Clipboard clipboard) {
        this.f6977h = clipboard;
    }

    public final void c0(CoroutineScope coroutineScope) {
        this.f6978i = coroutineScope;
    }

    public final void d0(Offset offset) {
        this.f6988s.setValue(offset);
    }

    public final void e0(long j2) {
        LegacyTextFieldState legacyTextFieldState = this.f6973d;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.D(j2);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.f6973d;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.M(TextRange.f18496b.a());
        }
        if (!TextRange.h(j2)) {
            z();
        }
    }

    public final void f0(Handle handle) {
        this.f6987r.setValue(handle);
    }

    public final void g0(boolean z2) {
        this.f6982m.setValue(Boolean.valueOf(z2));
    }

    public final void h0(boolean z2) {
        this.f6983n.setValue(Boolean.valueOf(z2));
    }

    public final void i0(FocusRequester focusRequester) {
        this.f6981l = focusRequester;
    }

    public final void j0(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.f6973d;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.e() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.E(handleState);
            }
        }
    }

    public final void k0(HapticFeedback hapticFeedback) {
        this.f6980k = hapticFeedback;
    }

    public final void l0(OffsetMapping offsetMapping) {
        this.f6971b = offsetMapping;
    }

    public final void m0(Function1 function1) {
        this.f6972c = function1;
    }

    public final void n0(Function0 function0) {
        this.f6976g = function0;
    }

    public final void o() {
        Function0 function0 = this.f6976g;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void o0(long j2) {
        LegacyTextFieldState legacyTextFieldState = this.f6973d;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.M(j2);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.f6973d;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.D(TextRange.f18496b.a());
        }
        if (!TextRange.h(j2)) {
            z();
        }
    }

    public final void p() {
        LegacyTextFieldState legacyTextFieldState = this.f6973d;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.D(TextRange.f18496b.a());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.f6973d;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.M(TextRange.f18496b.a());
        }
    }

    public final void p0(LegacyTextFieldState legacyTextFieldState) {
        this.f6973d = legacyTextFieldState;
    }

    public final Job q(boolean z2) {
        CoroutineScope coroutineScope = this.f6978i;
        if (coroutineScope != null) {
            return BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$copy$1(this, z2, (Continuation) null), 1, (Object) null);
        }
        return null;
    }

    public final void q0(TextToolbar textToolbar) {
        this.f6979j = textToolbar;
    }

    public final void r0(TextFieldValue textFieldValue) {
        this.f6974e.setValue(textFieldValue);
    }

    public final TextFieldValue s(AnnotatedString annotatedString, long j2) {
        return new TextFieldValue(annotatedString, j2, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    public final void s0(VisualTransformation visualTransformation) {
        this.f6975f = visualTransformation;
    }

    public final TextDragObserver t() {
        return new TextFieldSelectionManager$cursorDragObserver$1(this);
    }

    public final Job t0() {
        CoroutineScope coroutineScope = this.f6978i;
        if (coroutineScope != null) {
            return BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$showSelectionToolbar$1(this, (Continuation) null), 1, (Object) null);
        }
        return null;
    }

    public final Job u() {
        CoroutineScope coroutineScope = this.f6978i;
        if (coroutineScope != null) {
            return BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, (Continuation) null), 1, (Object) null);
        }
        return null;
    }

    public final void u0(boolean z2) {
        LegacyTextFieldState legacyTextFieldState = this.f6973d;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.O(z2);
        }
        if (z2) {
            t0();
        } else {
            X();
        }
    }

    public final void v(Offset offset) {
        if (!TextRange.h(U().h())) {
            LegacyTextFieldState legacyTextFieldState = this.f6973d;
            TextLayoutResultProxy l2 = legacyTextFieldState != null ? legacyTextFieldState.l() : null;
            this.f6972c.invoke(TextFieldValue.d(U(), (AnnotatedString) null, TextRangeKt.a((offset == null || l2 == null) ? TextRange.k(U().h()) : this.f6971b.a(TextLayoutResultProxy.e(l2, offset.t(), false, 2, (Object) null))), (TextRange) null, 5, (Object) null));
        }
        j0((offset == null || U().i().length() <= 0) ? HandleState.None : HandleState.Cursor);
        u0(false);
    }

    public final long v0(TextFieldValue textFieldValue, long j2, boolean z2, boolean z3, SelectionAdjustment selectionAdjustment, boolean z4) {
        TextLayoutResultProxy l2;
        int i2;
        HapticFeedback hapticFeedback;
        boolean z5 = z4;
        LegacyTextFieldState legacyTextFieldState = this.f6973d;
        if (legacyTextFieldState == null || (l2 = legacyTextFieldState.l()) == null) {
            return TextRange.f18496b.a();
        }
        long b2 = TextRangeKt.b(this.f6971b.b(TextRange.n(textFieldValue.h())), this.f6971b.b(TextRange.i(textFieldValue.h())));
        boolean z6 = false;
        int d2 = l2.d(j2, false);
        int n2 = (z3 || z2) ? d2 : TextRange.n(b2);
        int i3 = (!z3 || z2) ? d2 : TextRange.i(b2);
        SelectionLayout selectionLayout = this.f6991v;
        if (z2 || selectionLayout == null || (i2 = this.f6989t) == -1) {
            i2 = -1;
        }
        SelectionLayout c2 = SelectionLayoutKt.c(l2.f(), n2, i3, i2, b2, z2, z3);
        if (!c2.g(selectionLayout)) {
            return textFieldValue.h();
        }
        this.f6991v = c2;
        this.f6989t = d2;
        Selection a2 = selectionAdjustment.a(c2);
        long b3 = TextRangeKt.b(this.f6971b.a(a2.e().d()), this.f6971b.a(a2.c().d()));
        if (TextRange.g(b3, textFieldValue.h())) {
            return textFieldValue.h();
        }
        boolean z7 = TextRange.m(b3) != TextRange.m(textFieldValue.h()) && TextRange.g(TextRangeKt.b(TextRange.i(b3), TextRange.n(b3)), textFieldValue.h());
        boolean z8 = TextRange.h(b3) && TextRange.h(textFieldValue.h());
        if (z5 && textFieldValue.i().length() > 0 && !z7 && !z8 && (hapticFeedback = this.f6980k) != null) {
            hapticFeedback.a(HapticFeedbackType.f16726b.i());
        }
        this.f6972c.invoke(s(textFieldValue.f(), b3));
        if (!z5) {
            u0(!TextRange.h(b3));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.f6973d;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.G(z5);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.f6973d;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.Q(!TextRange.h(b3) && TextFieldSelectionManagerKt.c(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.f6973d;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.P(!TextRange.h(b3) && TextFieldSelectionManagerKt.c(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.f6973d;
        if (legacyTextFieldState5 != null) {
            if (TextRange.h(b3) && TextFieldSelectionManagerKt.c(this, true)) {
                z6 = true;
            }
            legacyTextFieldState5.N(z6);
        }
        return b3;
    }

    public final void x(boolean z2) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.f6973d;
        if (!(legacyTextFieldState == null || legacyTextFieldState.f() || (focusRequester = this.f6981l) == null)) {
            FocusRequester.i(focusRequester, 0, 1, (Object) null);
        }
        this.f6990u = U();
        u0(z2);
        j0(HandleState.Selection);
    }

    public final void z() {
        u0(false);
        j0(HandleState.None);
    }
}
