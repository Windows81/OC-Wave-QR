package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class TextFieldSelectionState {

    /* renamed from: a  reason: collision with root package name */
    public final TransformedTextFieldState f6463a;

    /* renamed from: b  reason: collision with root package name */
    public final TextLayoutState f6464b;

    /* renamed from: c  reason: collision with root package name */
    public Density f6465c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6466d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6467e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6468f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6469g;

    /* renamed from: h  reason: collision with root package name */
    public HapticFeedback f6470h;

    /* renamed from: i  reason: collision with root package name */
    public TextToolbarHandler f6471i;

    /* renamed from: j  reason: collision with root package name */
    public Clipboard f6472j;

    /* renamed from: k  reason: collision with root package name */
    public final MutableState f6473k = SnapshotStateKt__SnapshotStateKt.e(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: l  reason: collision with root package name */
    public Function0 f6474l;

    /* renamed from: m  reason: collision with root package name */
    public Function0 f6475m;

    /* renamed from: n  reason: collision with root package name */
    public final MutableState f6476n;

    /* renamed from: o  reason: collision with root package name */
    public final MutableState f6477o;

    /* renamed from: p  reason: collision with root package name */
    public final MutableState f6478p;

    /* renamed from: q  reason: collision with root package name */
    public final MutableState f6479q;

    /* renamed from: r  reason: collision with root package name */
    public final MutableState f6480r;

    /* renamed from: s  reason: collision with root package name */
    public final MutableState f6481s;

    /* renamed from: t  reason: collision with root package name */
    public SelectionLayout f6482t;

    /* renamed from: u  reason: collision with root package name */
    public int f6483u;

    /* renamed from: v  reason: collision with root package name */
    public PressInteraction.Press f6484v;

    @Metadata
    public enum InputType {
        None,
        Touch,
        Mouse;

        static {
            InputType[] d2;
            D = EnumEntriesKt.a(d2);
        }
    }

    @Metadata
    public final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {

        /* renamed from: a  reason: collision with root package name */
        public final Function0 f6488a;

        /* renamed from: b  reason: collision with root package name */
        public int f6489b = -1;

        /* renamed from: c  reason: collision with root package name */
        public long f6490c = Offset.f15855b.b();

        public TextFieldMouseSelectionObserver(Function0 function0) {
            this.f6488a = function0;
        }

        public boolean a(long j2) {
            TextFieldSelectionStateKt.c(TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtendDrag$1.f6495z);
            return true;
        }

        public boolean b(long j2, SelectionAdjustment selectionAdjustment) {
            if (!TextFieldSelectionState.this.f6466d || TextFieldSelectionState.this.f6463a.o().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.c(TextFieldSelectionState$TextFieldMouseSelectionObserver$onStart$1.f6496z);
            TextFieldSelectionState.this.v0(InputType.Mouse);
            this.f6488a.invoke();
            TextFieldSelectionState.this.f6483u = -1;
            this.f6489b = -1;
            this.f6490c = j2;
            this.f6489b = TextRange.n(f(j2, selectionAdjustment, true));
            return true;
        }

        public void c() {
            TextFieldSelectionStateKt.c(TextFieldSelectionState$TextFieldMouseSelectionObserver$onDragDone$1.f6493z);
            TextFieldSelectionState.this.v0(InputType.None);
        }

        public boolean d(long j2, SelectionAdjustment selectionAdjustment) {
            if (!TextFieldSelectionState.this.f6466d || TextFieldSelectionState.this.f6463a.o().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.c(new TextFieldSelectionState$TextFieldMouseSelectionObserver$onDrag$1(j2));
            f(j2, selectionAdjustment, false);
            return true;
        }

        public boolean e(long j2) {
            TextFieldSelectionStateKt.c(TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtend$1.f6494z);
            return true;
        }

        public final long f(long j2, SelectionAdjustment selectionAdjustment, boolean z2) {
            Integer valueOf = Integer.valueOf(this.f6489b);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : TextFieldSelectionState.this.f6464b.h(this.f6490c, false);
            int h2 = TextFieldSelectionState.this.f6464b.h(j2, false);
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long z3 = textFieldSelectionState.J0(textFieldSelectionState.f6463a.o(), intValue, h2, false, selectionAdjustment, false, z2);
            if (this.f6489b == -1 && !TextRange.h(z3)) {
                this.f6489b = TextRange.n(z3);
            }
            if (TextRange.m(z3)) {
                z3 = TextFieldSelectionStateKt.d(z3);
            }
            TextFieldSelectionState.this.f6463a.B(z3);
            TextFieldSelectionState.this.L0(TextToolbarState.Selection);
            return z3;
        }
    }

    @Metadata
    public final class TextFieldTextDragObserver implements TextDragObserver {

        /* renamed from: a  reason: collision with root package name */
        public final Function0 f6497a;

        /* renamed from: b  reason: collision with root package name */
        public int f6498b = -1;

        /* renamed from: c  reason: collision with root package name */
        public long f6499c;

        /* renamed from: d  reason: collision with root package name */
        public long f6500d;

        /* renamed from: e  reason: collision with root package name */
        public Handle f6501e;

        public TextFieldTextDragObserver(Function0 function0) {
            this.f6497a = function0;
            Offset.Companion companion = Offset.f15855b;
            this.f6499c = companion.b();
            this.f6500d = companion.c();
            this.f6501e = Handle.SelectionEnd;
        }

        public final void a() {
            if ((this.f6499c & 9223372034707292159L) != 9205357640488583168L) {
                TextFieldSelectionStateKt.c(TextFieldSelectionState$TextFieldTextDragObserver$onDragStop$1.f6504z);
                TextFieldSelectionState.this.G();
                this.f6498b = -1;
                Offset.Companion companion = Offset.f15855b;
                this.f6499c = companion.b();
                this.f6500d = companion.c();
                TextFieldSelectionState.this.f6483u = -1;
                TextFieldSelectionState.this.v0(InputType.None);
                this.f6497a.invoke();
            }
        }

        public void l() {
            a();
        }

        public void m(long j2) {
        }

        public void n(long j2) {
            long j3 = j2;
            if (TextFieldSelectionState.this.f6466d) {
                TextFieldSelectionStateKt.c(new TextFieldSelectionState$TextFieldTextDragObserver$onStart$1(j3));
                TextFieldSelectionState.this.I0(this.f6501e, j3);
                TextFieldSelectionState.this.C0(false);
                TextFieldSelectionState.this.v0(InputType.Touch);
                this.f6499c = j3;
                this.f6500d = Offset.f15855b.c();
                TextFieldSelectionState.this.f6483u = -1;
                if (TextFieldSelectionState.this.f6464b.f() != null) {
                    if (!TextFieldSelectionState.this.f6464b.k(j3)) {
                        int i2 = TextLayoutState.i(TextFieldSelectionState.this.f6464b, j2, false, 2, (Object) null);
                        HapticFeedback h2 = TextFieldSelectionState.this.f6470h;
                        if (h2 != null) {
                            h2.a(HapticFeedbackType.f16726b.i());
                        }
                        TextFieldSelectionState.this.f6463a.t(i2);
                        TextFieldSelectionState.this.C0(true);
                        TextFieldSelectionState.this.L0(TextToolbarState.Cursor);
                    } else if (TextFieldSelectionState.this.f6463a.o().length() != 0) {
                        int i3 = TextLayoutState.i(TextFieldSelectionState.this.f6464b, j2, false, 2, (Object) null);
                        long K0 = TextFieldSelectionState.K0(TextFieldSelectionState.this, new TextFieldCharSequence(TextFieldSelectionState.this.f6463a.o(), TextRange.f18496b.a(), (TextRange) null, (Pair) null, (List) null, 28, (DefaultConstructorMarker) null), i3, i3, false, SelectionAdjustment.f6782a.o(), false, false, 96, (Object) null);
                        TextFieldSelectionState.this.f6463a.B(K0);
                        TextFieldSelectionState.this.L0(TextToolbarState.Selection);
                        this.f6498b = TextRange.n(K0);
                    }
                }
            }
        }

        public void o() {
        }

        public void onCancel() {
            a();
        }

        public void p(long j2) {
            int intValue;
            int h2;
            SelectionAdjustment o2;
            if (TextFieldSelectionState.this.f6466d && TextFieldSelectionState.this.f6464b.f() != null && TextFieldSelectionState.this.f6463a.o().length() != 0) {
                long q2 = Offset.q(this.f6500d, j2);
                this.f6500d = q2;
                long q3 = Offset.q(this.f6499c, q2);
                TextFieldSelectionStateKt.c(new TextFieldSelectionState$TextFieldTextDragObserver$onDrag$1(q3));
                if (this.f6498b >= 0 || TextFieldSelectionState.this.f6464b.k(q3)) {
                    Integer valueOf = Integer.valueOf(this.f6498b);
                    if (valueOf.intValue() < 0) {
                        valueOf = null;
                    }
                    intValue = valueOf != null ? valueOf.intValue() : TextFieldSelectionState.this.f6464b.h(this.f6499c, false);
                    h2 = TextFieldSelectionState.this.f6464b.h(q3, false);
                    if (this.f6498b >= 0 || intValue != h2) {
                        o2 = SelectionAdjustment.f6782a.o();
                        TextFieldSelectionState.this.L0(TextToolbarState.Selection);
                    } else {
                        return;
                    }
                } else {
                    intValue = TextLayoutState.i(TextFieldSelectionState.this.f6464b, this.f6499c, false, 2, (Object) null);
                    h2 = TextLayoutState.i(TextFieldSelectionState.this.f6464b, q3, false, 2, (Object) null);
                    o2 = intValue == h2 ? SelectionAdjustment.f6782a.m() : SelectionAdjustment.f6782a.o();
                }
                int i2 = intValue;
                int i3 = h2;
                SelectionAdjustment selectionAdjustment = o2;
                long g2 = TextFieldSelectionState.this.f6463a.o().g();
                TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                long K0 = TextFieldSelectionState.K0(textFieldSelectionState, textFieldSelectionState.f6463a.o(), i2, i3, false, selectionAdjustment, false, false, 64, (Object) null);
                if (this.f6498b == -1 && !TextRange.h(K0)) {
                    this.f6498b = TextRange.n(K0);
                }
                if (TextRange.m(K0)) {
                    K0 = TextFieldSelectionStateKt.d(K0);
                }
                if (!TextRange.g(K0, g2)) {
                    this.f6501e = (TextRange.n(K0) == TextRange.n(g2) || TextRange.i(K0) != TextRange.i(g2)) ? (TextRange.n(K0) != TextRange.n(g2) || TextRange.i(K0) == TextRange.i(g2)) ? ((float) (TextRange.n(K0) + TextRange.i(K0))) / 2.0f > ((float) (TextRange.n(g2) + TextRange.i(g2))) / 2.0f ? Handle.SelectionEnd : Handle.SelectionStart : Handle.SelectionEnd : Handle.SelectionStart;
                }
                if (TextRange.h(g2) || !TextRange.h(K0)) {
                    TextFieldSelectionState.this.f6463a.B(K0);
                }
                TextFieldSelectionState.this.I0(this.f6501e, q3);
            }
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6506a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.foundation.text.input.internal.IndexTransformationType[] r0 = androidx.compose.foundation.text.input.internal.IndexTransformationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.input.internal.IndexTransformationType r1 = androidx.compose.foundation.text.input.internal.IndexTransformationType.Untransformed     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.input.internal.IndexTransformationType r1 = androidx.compose.foundation.text.input.internal.IndexTransformationType.Deletion     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.input.internal.IndexTransformationType r1 = androidx.compose.foundation.text.input.internal.IndexTransformationType.Insertion     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.foundation.text.input.internal.IndexTransformationType r1 = androidx.compose.foundation.text.input.internal.IndexTransformationType.Replacement     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f6506a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.WhenMappings.<clinit>():void");
        }
    }

    public TextFieldSelectionState(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, Density density, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f6463a = transformedTextFieldState;
        this.f6464b = textLayoutState;
        this.f6465c = density;
        this.f6466d = z2;
        this.f6467e = z3;
        this.f6468f = z4;
        this.f6469g = z5;
        Offset.Companion companion = Offset.f15855b;
        this.f6476n = SnapshotStateKt__SnapshotStateKt.e(Offset.d(companion.b()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6477o = SnapshotStateKt__SnapshotStateKt.e(Offset.d(companion.b()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6478p = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6479q = SnapshotStateKt__SnapshotStateKt.e(InputType.None, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6480r = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6481s = SnapshotStateKt__SnapshotStateKt.e(TextToolbarState.None, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6483u = -1;
    }

    public static /* synthetic */ Object I(TextFieldSelectionState textFieldSelectionState, boolean z2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return textFieldSelectionState.H(z2, continuation);
    }

    public static /* synthetic */ long K0(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i2, int i3, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3, boolean z4, int i4, Object obj) {
        return textFieldSelectionState.J0(textFieldCharSequence, i2, i3, z2, selectionAdjustment, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4);
    }

    public static final void N(Ref.LongRef longRef, Ref.LongRef longRef2, TextFieldSelectionState textFieldSelectionState) {
        if ((longRef.f40907z & 9223372034707292159L) != 9205357640488583168L) {
            Offset.Companion companion = Offset.f15855b;
            longRef.f40907z = companion.b();
            longRef2.f40907z = companion.b();
            textFieldSelectionState.G();
        }
    }

    public static final void P(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2) {
        if ((longRef.f40907z & 9223372034707292159L) != 9205357640488583168L) {
            textFieldSelectionState.G();
            Offset.Companion companion = Offset.f15855b;
            longRef.f40907z = companion.b();
            longRef2.f40907z = companion.c();
            textFieldSelectionState.f6483u = -1;
        }
    }

    public final void A() {
        Function0 function0 = this.f6474l;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void A0(Function0 function0) {
        this.f6475m = function0;
    }

    public final boolean B() {
        return Z() && TextRange.h(this.f6463a.o().g());
    }

    public final void B0(Function0 function0) {
        this.f6474l = function0;
    }

    public final boolean C() {
        return !TextRange.h(this.f6463a.o().g()) && !this.f6469g;
    }

    public final void C0(boolean z2) {
        this.f6480r.setValue(Boolean.valueOf(z2));
    }

    public final boolean D() {
        return !TextRange.h(this.f6463a.o().g()) && Z() && !this.f6469g;
    }

    public final void D0(long j2) {
        this.f6476n.setValue(Offset.d(j2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r5) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.ResultKt.b(r8)
            goto L_0x0091
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0036:
            java.lang.Object r2 = r0.C
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r2
            kotlin.ResultKt.b(r8)
            goto L_0x005c
        L_0x003e:
            kotlin.ResultKt.b(r8)
            boolean r8 = r7.Z()
            if (r8 != 0) goto L_0x004c
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r8
        L_0x004c:
            androidx.compose.ui.platform.Clipboard r8 = r7.f6472j
            if (r8 == 0) goto L_0x006a
            r0.C = r7
            r0.F = r5
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r2 = r7
        L_0x005c:
            androidx.compose.ui.platform.ClipEntry r8 = (androidx.compose.ui.platform.ClipEntry) r8
            if (r8 == 0) goto L_0x0068
            boolean r8 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.c(r8)
            if (r8 != r5) goto L_0x0068
            r8 = r5
            goto L_0x006c
        L_0x0068:
            r8 = r4
            goto L_0x006c
        L_0x006a:
            r2 = r7
            goto L_0x0068
        L_0x006c:
            if (r8 == 0) goto L_0x0073
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
            return r8
        L_0x0073:
            kotlin.jvm.functions.Function0 r8 = r2.f6475m
            r6 = 0
            if (r8 == 0) goto L_0x007f
            java.lang.Object r8 = r8.invoke()
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r8 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r8
            goto L_0x0080
        L_0x007f:
            r8 = r6
        L_0x0080:
            if (r8 == 0) goto L_0x0097
            androidx.compose.ui.platform.Clipboard r8 = r2.f6472j
            if (r8 == 0) goto L_0x0094
            r0.C = r6
            r0.F = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L_0x0091
            return r1
        L_0x0091:
            r6 = r8
            androidx.compose.ui.platform.ClipEntry r6 = (androidx.compose.ui.platform.ClipEntry) r6
        L_0x0094:
            if (r6 == 0) goto L_0x0097
            r4 = r5
        L_0x0097:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.E(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void E0(TextToolbarState textToolbarState) {
        this.f6481s.setValue(textToolbarState);
    }

    public final boolean F() {
        return TextRange.j(this.f6463a.o().g()) != this.f6463a.o().length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F0(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.ResultKt.b(r6)     // Catch:{ all -> 0x002e }
            goto L_0x004d
        L_0x002e:
            r6 = move-exception
            goto L_0x0060
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            kotlin.ResultKt.b(r6)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 r6 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2     // Catch:{ all -> 0x005e }
            r2 = 0
            r6.<init>(r5, r2)     // Catch:{ all -> 0x005e }
            r0.C = r5     // Catch:{ all -> 0x005e }
            r0.F = r4     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.f(r6, r0)     // Catch:{ all -> 0x005e }
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
        L_0x004d:
            r0.C0(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r6 = r0.i0()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r6 == r1) goto L_0x005b
            r0.j0()
        L_0x005b:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x005e:
            r6 = move-exception
            r0 = r5
        L_0x0060:
            r0.C0(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = r0.i0()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r1 == r2) goto L_0x006e
            r0.j0()
        L_0x006e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.F0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void G() {
        w0((Handle) null);
        Offset.Companion companion = Offset.f15855b;
        z0(companion.b());
        D0(companion.b());
    }

    public final Object G0(PointerInputScope pointerInputScope, Function0 function0, Continuation continuation) {
        Object n2 = SelectionGesturesKt.n(pointerInputScope, new TextFieldMouseSelectionObserver(function0), new TextFieldTextDragObserver(function0), continuation);
        return n2 == IntrinsicsKt.f() ? n2 : Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object H(boolean r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            boolean r7 = r0.D
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.ResultKt.b(r8)
            goto L_0x0072
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            kotlin.ResultKt.b(r8)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r8 = r6.f6463a
            androidx.compose.foundation.text.input.TextFieldCharSequence r8 = r8.o()
            long r4 = r8.g()
            boolean r2 = androidx.compose.ui.text.TextRange.h(r4)
            if (r2 == 0) goto L_0x004d
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x004d:
            androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
            java.lang.CharSequence r8 = androidx.compose.foundation.text.input.TextFieldCharSequenceKt.a(r8)
            java.lang.String r8 = r8.toString()
            r4 = 2
            r5 = 0
            r2.<init>(r8, r5, r4, r5)
            androidx.compose.ui.platform.Clipboard r8 = r6.f6472j
            if (r8 == 0) goto L_0x0071
            androidx.compose.ui.platform.ClipEntry r2 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.f(r2)
            r0.C = r6
            r0.D = r7
            r0.G = r3
            java.lang.Object r8 = r8.b(r2, r0)
            if (r8 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r0 = r6
        L_0x0072:
            if (r7 != 0) goto L_0x0077
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x0077:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r0.f6463a
            r7.h()
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.H(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void H0(HapticFeedback hapticFeedback, Clipboard clipboard, TextToolbarHandler textToolbarHandler, Density density, boolean z2, boolean z3, boolean z4) {
        if (!z2) {
            j0();
        }
        this.f6470h = hapticFeedback;
        this.f6472j = clipboard;
        this.f6471i = textToolbarHandler;
        this.f6465c = density;
        this.f6466d = z2;
        this.f6467e = z3;
        this.f6469g = z4;
    }

    public final void I0(Handle handle, long j2) {
        w0(handle);
        z0(j2);
    }

    public final Object J(PointerInputScope pointerInputScope, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new TextFieldSelectionState$cursorHandleGestures$2(this, pointerInputScope, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public final long J0(TextFieldCharSequence textFieldCharSequence, int i2, int i3, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3, boolean z4) {
        HapticFeedback hapticFeedback;
        TextRange b2 = TextRange.b(textFieldCharSequence.g());
        long r2 = b2.r();
        if (z4 || (!z3 && TextRange.h(r2))) {
            b2 = null;
        }
        long g0 = g0(i2, i3, b2, z2, selectionAdjustment);
        if (TextRange.g(g0, textFieldCharSequence.g())) {
            return g0;
        }
        boolean z5 = TextRange.m(g0) != TextRange.m(textFieldCharSequence.g()) && TextRange.g(TextRangeKt.b(TextRange.i(g0), TextRange.n(g0)), textFieldCharSequence.g());
        if (m0() && !z5 && (hapticFeedback = this.f6470h) != null) {
            hapticFeedback.a(HapticFeedbackType.f16726b.i());
        }
        return g0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object K(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.ResultKt.b(r7)
            goto L_0x006e
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            kotlin.ResultKt.b(r7)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r6.f6463a
            androidx.compose.foundation.text.input.TextFieldCharSequence r7 = r7.o()
            long r4 = r7.g()
            boolean r2 = androidx.compose.ui.text.TextRange.h(r4)
            if (r2 == 0) goto L_0x004b
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x004b:
            androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
            java.lang.CharSequence r7 = androidx.compose.foundation.text.input.TextFieldCharSequenceKt.a(r7)
            java.lang.String r7 = r7.toString()
            r4 = 2
            r5 = 0
            r2.<init>(r7, r5, r4, r5)
            androidx.compose.ui.platform.Clipboard r7 = r6.f6472j
            if (r7 == 0) goto L_0x006d
            androidx.compose.ui.platform.ClipEntry r2 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.f(r2)
            r0.C = r6
            r0.F = r3
            java.lang.Object r7 = r7.b(r2, r0)
            if (r7 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r0 = r6
        L_0x006e:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r0.f6463a
            r7.k()
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.K(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void L() {
        if (!TextRange.h(this.f6463a.o().g())) {
            this.f6463a.g();
        }
        C0(false);
        L0(TextToolbarState.None);
    }

    public final void L0(TextToolbarState textToolbarState) {
        E0(textToolbarState);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object M(androidx.compose.ui.input.pointer.PointerInputScope r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            if (r0 == 0) goto L_0x0014
            r0 = r11
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.H = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            r0.<init>(r9, r11)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r11 = r6.F
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.H
            r2 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 != r2) goto L_0x0039
            java.lang.Object r10 = r6.E
            kotlin.jvm.internal.Ref$LongRef r10 = (kotlin.jvm.internal.Ref.LongRef) r10
            java.lang.Object r0 = r6.D
            kotlin.jvm.internal.Ref$LongRef r0 = (kotlin.jvm.internal.Ref.LongRef) r0
            java.lang.Object r1 = r6.C
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r1
            kotlin.ResultKt.b(r11)     // Catch:{ all -> 0x0037 }
            goto L_0x0087
        L_0x0037:
            r11 = move-exception
            goto L_0x0092
        L_0x0039:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0041:
            kotlin.ResultKt.b(r11)
            kotlin.jvm.internal.Ref$LongRef r11 = new kotlin.jvm.internal.Ref$LongRef
            r11.<init>()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.f15855b
            long r3 = r1.b()
            r11.f40907z = r3
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            long r3 = r1.b()
            r7.f40907z = r3
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2 r3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2     // Catch:{ all -> 0x008d }
            r3.<init>(r11, r9, r7)     // Catch:{ all -> 0x008d }
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3 r4 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3     // Catch:{ all -> 0x008d }
            r4.<init>(r11, r7, r9)     // Catch:{ all -> 0x008d }
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4 r5 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4     // Catch:{ all -> 0x008d }
            r5.<init>(r11, r7, r9)     // Catch:{ all -> 0x008d }
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5 r8 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5     // Catch:{ all -> 0x008d }
            r8.<init>(r7, r9, r11)     // Catch:{ all -> 0x008d }
            r6.C = r9     // Catch:{ all -> 0x008d }
            r6.D = r11     // Catch:{ all -> 0x008d }
            r6.E = r7     // Catch:{ all -> 0x008d }
            r6.H = r2     // Catch:{ all -> 0x008d }
            r1 = r10
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            java.lang.Object r10 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008d }
            if (r10 != r0) goto L_0x0084
            return r0
        L_0x0084:
            r1 = r9
            r0 = r11
            r10 = r7
        L_0x0087:
            N(r0, r10, r1)
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        L_0x008d:
            r10 = move-exception
            r1 = r9
            r0 = r11
            r11 = r10
            r10 = r7
        L_0x0092:
            N(r0, r10, r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.M(androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(androidx.compose.ui.input.pointer.PointerInputScope r18, boolean r19, kotlin.coroutines.Continuation r20) {
        /*
            r17 = this;
            r7 = r17
            r0 = r20
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1
            if (r1 == 0) goto L_0x0018
            r1 = r0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 r1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1) r1
            int r2 = r1.I
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.I = r2
        L_0x0016:
            r13 = r1
            goto L_0x001e
        L_0x0018:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1 r1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1
            r1.<init>(r7, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r13.G
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r13.I
            r8 = 1
            if (r1 == 0) goto L_0x004b
            if (r1 != r8) goto L_0x0043
            java.lang.Object r1 = r13.F
            androidx.compose.foundation.text.Handle r1 = (androidx.compose.foundation.text.Handle) r1
            java.lang.Object r2 = r13.E
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref.LongRef) r2
            java.lang.Object r3 = r13.D
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            java.lang.Object r4 = r13.C
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r4
            kotlin.ResultKt.b(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x00ae
        L_0x0040:
            r0 = move-exception
            goto L_0x00ca
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            kotlin.ResultKt.b(r0)
            kotlin.jvm.internal.Ref$LongRef r15 = new kotlin.jvm.internal.Ref$LongRef
            r15.<init>()
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.f15855b
            long r1 = r0.b()
            r15.f40907z = r1
            kotlin.jvm.internal.Ref$LongRef r12 = new kotlin.jvm.internal.Ref$LongRef
            r12.<init>()
            long r0 = r0.c()
            r12.f40907z = r0
            if (r19 == 0) goto L_0x006c
            androidx.compose.foundation.text.Handle r0 = androidx.compose.foundation.text.Handle.SelectionStart
        L_0x006a:
            r11 = r0
            goto L_0x006f
        L_0x006c:
            androidx.compose.foundation.text.Handle r0 = androidx.compose.foundation.text.Handle.SelectionEnd
            goto L_0x006a
        L_0x006f:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$2 r9 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$2     // Catch:{ all -> 0x00c6 }
            r1 = r9
            r2 = r15
            r3 = r17
            r4 = r19
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00c6 }
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$3 r10 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$3     // Catch:{ all -> 0x00c6 }
            r10.<init>(r15, r7, r12)     // Catch:{ all -> 0x00c6 }
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$4 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$4     // Catch:{ all -> 0x00c6 }
            r0.<init>(r15, r7, r12)     // Catch:{ all -> 0x00c6 }
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$5 r16 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$5     // Catch:{ all -> 0x00c6 }
            r1 = r16
            r2 = r12
            r3 = r17
            r4 = r11
            r5 = r15
            r6 = r19
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00c6 }
            r13.C = r7     // Catch:{ all -> 0x00c6 }
            r13.D = r15     // Catch:{ all -> 0x00c6 }
            r13.E = r12     // Catch:{ all -> 0x00c6 }
            r13.F = r11     // Catch:{ all -> 0x00c6 }
            r13.I = r8     // Catch:{ all -> 0x00c6 }
            r8 = r18
            r1 = r11
            r11 = r0
            r2 = r12
            r12 = r16
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00c2 }
            if (r0 != r14) goto L_0x00ac
            return r14
        L_0x00ac:
            r4 = r7
            r3 = r15
        L_0x00ae:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6
            r0.<init>(r4, r1)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.c(r0)
            androidx.compose.foundation.text.Handle r0 = r4.Y()
            if (r0 != r1) goto L_0x00bf
            P(r3, r4, r2)
        L_0x00bf:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        L_0x00c2:
            r0 = move-exception
        L_0x00c3:
            r4 = r7
            r3 = r15
            goto L_0x00ca
        L_0x00c6:
            r0 = move-exception
            r1 = r11
            r2 = r12
            goto L_0x00c3
        L_0x00ca:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6 r5 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6
            r5.<init>(r4, r1)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.c(r5)
            androidx.compose.foundation.text.Handle r5 = r4.Y()
            if (r5 != r1) goto L_0x00db
            P(r3, r4, r2)
        L_0x00db:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.O(androidx.compose.ui.input.pointer.PointerInputScope, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object Q(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, Function0 function0, Function0 function02, Continuation continuation) {
        Object k2 = TapGestureDetectorKt.k(pointerInputScope, new TextFieldSelectionState$detectTextFieldTapGestures$2(mutableInteractionSource, this, (Continuation) null), new TextFieldSelectionState$detectTextFieldTapGestures$3(function0, this, function02), continuation);
        return k2 == IntrinsicsKt.f() ? k2 : Unit.f40552a;
    }

    public final Object R(PointerInputScope pointerInputScope, Continuation continuation) {
        Object M0 = pointerInputScope.M0(new TextFieldSelectionState$detectTouchMode$2(this, (Continuation) null), continuation);
        return M0 == IntrinsicsKt.f() ? M0 : Unit.f40552a;
    }

    public final void S() {
        j0();
        this.f6472j = null;
        this.f6470h = null;
    }

    public final Rect T() {
        float f2;
        Rect e2;
        Rect e3;
        TextFieldCharSequence o2 = this.f6463a.o();
        if (TextRange.h(o2.g())) {
            Rect W = W();
            LayoutCoordinates h0 = h0();
            return RectKt.c(h0 != null ? h0.o0(W.t()) : Offset.f15855b.c(), W.q());
        }
        LayoutCoordinates h02 = h0();
        long o0 = h02 != null ? h02.o0(b0(true)) : Offset.f15855b.c();
        LayoutCoordinates h03 = h0();
        long o02 = h03 != null ? h03.o0(b0(false)) : Offset.f15855b.c();
        LayoutCoordinates h04 = h0();
        float f3 = 0.0f;
        if (h04 != null) {
            TextLayoutResult f4 = this.f6464b.f();
            f2 = Float.intBitsToFloat((int) (h04.o0(Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((f4 == null || (e3 = f4.e(TextRange.n(o2.g()))) == null) ? 0.0f : e3.r())) & 4294967295L))) & 4294967295L));
        } else {
            f2 = 0.0f;
        }
        LayoutCoordinates h05 = h0();
        if (h05 != null) {
            TextLayoutResult f5 = this.f6464b.f();
            f3 = Float.intBitsToFloat((int) (h05.o0(Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((f5 == null || (e2 = f5.e(TextRange.i(o2.g()))) == null) ? 0.0f : e2.r())) & 4294967295L))) & 4294967295L));
        }
        int i2 = (int) (o0 >> 32);
        int i3 = (int) (o02 >> 32);
        return new Rect(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(f2, f3), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.max(Float.intBitsToFloat((int) (o0 & 4294967295L)), Float.intBitsToFloat((int) (o02 & 4294967295L))));
    }

    public final long U() {
        LayoutCoordinates h0 = h0();
        return h0 != null ? LayoutCoordinatesKt.g(h0) : Offset.f15855b.b();
    }

    public final TextFieldHandleState V(boolean z2) {
        TextFieldCharSequence o2 = this.f6463a.o();
        boolean e0 = e0();
        boolean z3 = X() == InputType.None;
        Handle Y = Y();
        if (!e0 || !z3 || !TextRange.h(o2.g()) || !o2.i() || o2.length() <= 0 || (Y != Handle.Cursor && !k0())) {
            return TextFieldHandleState.f6437f.a();
        }
        return new TextFieldHandleState(true, z2 ? W().j() : Offset.f15855b.b(), 0.0f, ResolvedTextDirection.Ltr, false, (DefaultConstructorMarker) null);
    }

    public final Rect W() {
        TextLayoutResult f2 = this.f6464b.f();
        if (f2 == null) {
            return Rect.f15860e.a();
        }
        TextFieldCharSequence o2 = this.f6463a.o();
        if (!TextRange.h(o2.g())) {
            return Rect.f15860e.a();
        }
        Rect e2 = f2.e(TextRange.n(o2.g()));
        float d2 = RangesKt.d((float) Math.floor((double) this.f6465c.B1(TextFieldCursor_androidKt.a())), 1.0f);
        float f3 = d2 / ((float) 2);
        float d3 = RangesKt.d(RangesKt.i(f2.l().d() == LayoutDirection.Ltr ? e2.o() + (d2 / ((float) 2)) : e2.p() - (d2 / ((float) 2)), ((float) ((int) (f2.B() >> 32))) - f3), f3);
        float floor = ((int) d2) % 2 == 1 ? ((float) Math.floor((double) d3)) + 0.5f : (float) Math.rint((double) d3);
        return new Rect(floor - f3, e2.r(), floor + f3, e2.i());
    }

    public final InputType X() {
        return (InputType) this.f6479q.getValue();
    }

    public final Handle Y() {
        return (Handle) this.f6478p.getValue();
    }

    public final boolean Z() {
        return this.f6466d && !this.f6467e;
    }

    public final long a0() {
        return (c0() & 9223372034707292159L) == 9205357640488583168L ? Offset.f15855b.b() : (f0() & 9223372034707292159L) == 9205357640488583168L ? TextLayoutStateKt.b(this.f6464b, c0()) : Offset.q(c0(), Offset.p(f0(), U()));
    }

    public final long b0(boolean z2) {
        TextLayoutResult f2 = this.f6464b.f();
        if (f2 == null) {
            return Offset.f15855b.c();
        }
        long g2 = this.f6463a.o().g();
        return TextSelectionDelegateKt.b(f2, z2 ? TextRange.n(g2) : TextRange.i(g2), z2, TextRange.m(g2));
    }

    public final long c0() {
        return ((Offset) this.f6477o.getValue()).t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (((r1 == null || (r1 = androidx.compose.foundation.text.selection.SelectionManagerKt.i(r1)) == null) ? false : androidx.compose.foundation.text.selection.SelectionManagerKt.d(r1, r5)) != false) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState d0(boolean r16, boolean r17) {
        /*
            r15 = this;
            r0 = r15
            if (r16 == 0) goto L_0x0006
            androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionStart
            goto L_0x0008
        L_0x0006:
            androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionEnd
        L_0x0008:
            androidx.compose.foundation.text.input.internal.TextLayoutState r2 = r0.f6464b
            androidx.compose.ui.text.TextLayoutResult r2 = r2.f()
            if (r2 != 0) goto L_0x0017
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r1 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.f6437f
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r1 = r1.a()
            return r1
        L_0x0017:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r3 = r0.f6463a
            androidx.compose.foundation.text.input.TextFieldCharSequence r3 = r3.o()
            long r3 = r3.g()
            boolean r5 = androidx.compose.ui.text.TextRange.h(r3)
            if (r5 == 0) goto L_0x002e
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r1 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.f6437f
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r1 = r1.a()
            return r1
        L_0x002e:
            long r5 = r15.b0(r16)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r7 = r15.X()
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r8 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.None
            r9 = 1
            r10 = 0
            if (r7 != r8) goto L_0x0058
            androidx.compose.foundation.text.Handle r7 = r15.Y()
            if (r7 == r1) goto L_0x0056
            androidx.compose.ui.layout.LayoutCoordinates r1 = r15.h0()
            if (r1 == 0) goto L_0x0053
            androidx.compose.ui.geometry.Rect r1 = androidx.compose.foundation.text.selection.SelectionManagerKt.i(r1)
            if (r1 == 0) goto L_0x0053
            boolean r1 = androidx.compose.foundation.text.selection.SelectionManagerKt.d(r1, r5)
            goto L_0x0054
        L_0x0053:
            r1 = r10
        L_0x0054:
            if (r1 == 0) goto L_0x0058
        L_0x0056:
            r1 = r9
            goto L_0x0059
        L_0x0058:
            r1 = r10
        L_0x0059:
            if (r1 != 0) goto L_0x0062
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r1 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.f6437f
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r1 = r1.a()
            return r1
        L_0x0062:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r1 = r0.f6463a
            androidx.compose.foundation.text.input.TextFieldCharSequence r1 = r1.o()
            boolean r1 = r1.i()
            if (r1 != 0) goto L_0x0075
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r1 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.f6437f
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r1 = r1.a()
            return r1
        L_0x0075:
            if (r16 == 0) goto L_0x007c
            int r1 = androidx.compose.ui.text.TextRange.n(r3)
            goto L_0x0085
        L_0x007c:
            int r1 = androidx.compose.ui.text.TextRange.i(r3)
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r10)
        L_0x0085:
            androidx.compose.ui.text.style.ResolvedTextDirection r12 = r2.c(r1)
            boolean r13 = androidx.compose.ui.text.TextRange.m(r3)
            if (r17 == 0) goto L_0x00a1
            androidx.compose.ui.layout.LayoutCoordinates r1 = r15.h0()
            if (r1 == 0) goto L_0x009f
            androidx.compose.ui.geometry.Rect r1 = androidx.compose.foundation.text.selection.SelectionManagerKt.i(r1)
            if (r1 == 0) goto L_0x009f
            long r5 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.a(r5, r1)
        L_0x009f:
            r9 = r5
            goto L_0x00a8
        L_0x00a1:
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.f15855b
            long r5 = r1.b()
            goto L_0x009f
        L_0x00a8:
            if (r16 == 0) goto L_0x00af
            int r1 = androidx.compose.ui.text.TextRange.n(r3)
            goto L_0x00b3
        L_0x00af:
            int r1 = androidx.compose.ui.text.TextRange.i(r3)
        L_0x00b3:
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState
            float r11 = androidx.compose.foundation.text.TextLayoutHelperKt.b(r2, r1)
            r14 = 0
            r8 = 1
            r7 = r3
            r7.<init>(r8, r9, r11, r12, r13, r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.d0(boolean, boolean):androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState");
    }

    public final boolean e0() {
        return ((Boolean) this.f6480r.getValue()).booleanValue();
    }

    public final long f0() {
        return ((Offset) this.f6476n.getValue()).t();
    }

    public final long g0(int i2, int i3, TextRange textRange, boolean z2, SelectionAdjustment selectionAdjustment) {
        TextLayoutResult f2 = this.f6464b.f();
        if (f2 == null) {
            return TextRange.f18496b.a();
        }
        if (textRange == null && Intrinsics.d(selectionAdjustment, SelectionAdjustment.f6782a.k())) {
            return TextRangeKt.b(i2, i3);
        }
        SelectionLayout c2 = SelectionLayoutKt.c(f2, i2, i3, this.f6483u, textRange != null ? textRange.r() : TextRange.f18496b.a(), textRange == null, z2);
        if (textRange != null && !c2.g(this.f6482t)) {
            return textRange.r();
        }
        long g2 = selectionAdjustment.a(c2).g();
        this.f6482t = c2;
        if (!z2) {
            i2 = i3;
        }
        this.f6483u = i2;
        return g2;
    }

    public final LayoutCoordinates h0() {
        LayoutCoordinates j2 = this.f6464b.j();
        if (j2 == null || !j2.b()) {
            return null;
        }
        return j2;
    }

    public final TextToolbarState i0() {
        return (TextToolbarState) this.f6481s.getValue();
    }

    public final void j0() {
        TextToolbarHandler textToolbarHandler = this.f6471i;
        if (textToolbarHandler != null) {
            textToolbarHandler.b();
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean k0() {
        Rect i2;
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            long j2 = W().j();
            companion.m(d2, f2, g2);
            LayoutCoordinates h0 = h0();
            if (h0 == null || (i2 = SelectionManagerKt.i(h0)) == null) {
                return false;
            }
            return SelectionManagerKt.d(i2, j2);
        } catch (Throwable th) {
            companion.m(d2, f2, g2);
            throw th;
        }
    }

    public final boolean l0() {
        return this.f6468f;
    }

    public final boolean m0() {
        return ((Boolean) this.f6473k.getValue()).booleanValue();
    }

    public final void n0() {
        D0(U());
    }

    public final Object o0(Continuation continuation) {
        Object a2 = FlowKt.w(FlowKt.v(SnapshotStateKt.q(new TextFieldSelectionState$observeTextChanges$2(this)), TextFieldSelectionState$observeTextChanges$3.I), 1).a(new TextFieldSelectionState$observeTextChanges$4(this), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public final Object p0(Continuation continuation) {
        Object a2 = SnapshotStateKt.q(new TextFieldSelectionState$observeTextToolbarVisibility$2(this)).a(new TextFieldSelectionState$observeTextToolbarVisibility$3(this), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.content.internal.ReceiveContentConfiguration} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q0(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.ResultKt.b(r13)
            goto L_0x00ba
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0038:
            java.lang.Object r2 = r0.D
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r2 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r2
            java.lang.Object r4 = r0.C
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r4
            kotlin.ResultKt.b(r13)
            goto L_0x006c
        L_0x0044:
            kotlin.ResultKt.b(r13)
            goto L_0x00c6
        L_0x0049:
            kotlin.ResultKt.b(r13)
            kotlin.jvm.functions.Function0 r13 = r12.f6475m
            if (r13 == 0) goto L_0x00bd
            java.lang.Object r13 = r13.invoke()
            r2 = r13
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r2 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r2
            if (r2 != 0) goto L_0x005a
            goto L_0x00bd
        L_0x005a:
            androidx.compose.ui.platform.Clipboard r13 = r12.f6472j
            if (r13 == 0) goto L_0x00ab
            r0.C = r12
            r0.D = r2
            r0.G = r4
            java.lang.Object r13 = r13.a(r0)
            if (r13 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r4 = r12
        L_0x006c:
            r6 = r13
            androidx.compose.ui.platform.ClipEntry r6 = (androidx.compose.ui.platform.ClipEntry) r6
            if (r6 != 0) goto L_0x0072
            goto L_0x00ac
        L_0x0072:
            androidx.compose.ui.platform.ClipMetadata r7 = r6.b()
            androidx.compose.foundation.content.ReceiveContentListener r13 = r2.a()
            androidx.compose.foundation.content.TransferableContent$Source$Companion r0 = androidx.compose.foundation.content.TransferableContent.Source.f3207b
            int r8 = r0.a()
            androidx.compose.foundation.content.TransferableContent r0 = new androidx.compose.foundation.content.TransferableContent
            r10 = 8
            r11 = 0
            r9 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            androidx.compose.foundation.content.TransferableContent r13 = r13.e(r0)
            if (r13 == 0) goto L_0x00a8
            androidx.compose.ui.platform.ClipEntry r13 = r13.a()
            if (r13 == 0) goto L_0x00a8
            java.lang.String r6 = androidx.compose.foundation.content.TransferableContent_androidKt.a(r13)
            if (r6 == 0) goto L_0x00a8
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r5 = r4.f6463a
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r8 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge
            r10 = 10
            r11 = 0
            r7 = 0
            r9 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.x(r5, r6, r7, r8, r9, r10, r11)
        L_0x00a8:
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        L_0x00ab:
            r4 = r12
        L_0x00ac:
            r13 = 0
            r0.C = r13
            r0.D = r13
            r0.G = r3
            java.lang.Object r13 = r4.r0(r0)
            if (r13 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        L_0x00bd:
            r0.G = r5
            java.lang.Object r13 = r12.r0(r0)
            if (r13 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.q0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r0(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.ResultKt.b(r9)
            goto L_0x0048
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0035:
            kotlin.ResultKt.b(r9)
            androidx.compose.ui.platform.Clipboard r9 = r8.f6472j
            if (r9 == 0) goto L_0x0062
            r0.C = r8
            r0.F = r3
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = r8
        L_0x0048:
            androidx.compose.ui.platform.ClipEntry r9 = (androidx.compose.ui.platform.ClipEntry) r9
            if (r9 == 0) goto L_0x0062
            java.lang.String r2 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.e(r9)
            if (r2 != 0) goto L_0x0053
            goto L_0x0062
        L_0x0053:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r1 = r0.f6463a
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r4 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge
            r6 = 10
            r7 = 0
            r3 = 0
            r5 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.x(r1, r2, r3, r4, r5, r6, r7)
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        L_0x0062:
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.r0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean s0(long j2) {
        int x2;
        int i2;
        TextLayoutResult f2 = this.f6464b.f();
        if (f2 == null || (x2 = f2.x(j2)) == -1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = this.f6463a;
        long q2 = transformedTextFieldState.q(x2);
        long s2 = transformedTextFieldState.s(q2);
        int i3 = WhenMappings.f6506a[((!TextRange.h(q2) || !TextRange.h(s2)) ? (TextRange.h(q2) || TextRange.h(s2)) ? (!TextRange.h(q2) || TextRange.h(s2)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement : IndexTransformationType.Untransformed).ordinal()];
        SelectionWedgeAffinity selectionWedgeAffinity = null;
        if (i3 == 1) {
            i2 = TextRange.n(q2);
        } else if (i3 == 2) {
            i2 = TextRange.n(q2);
        } else if (i3 == 3) {
            selectionWedgeAffinity = MathUtilsKt.b(j2, f2.e(TextRange.n(s2)), f2.e(TextRange.i(s2))) < 0 ? new SelectionWedgeAffinity(WedgeAffinity.Start) : new SelectionWedgeAffinity(WedgeAffinity.End);
            i2 = TextRange.n(q2);
        } else if (i3 == 4) {
            i2 = MathUtilsKt.b(j2, f2.e(TextRange.n(s2)), f2.e(TextRange.i(s2))) < 0 ? TextRange.n(q2) : TextRange.i(q2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        long a2 = TextRangeKt.a(i2);
        if (TextRange.g(a2, this.f6463a.n().g()) && (selectionWedgeAffinity == null || Intrinsics.d(selectionWedgeAffinity, this.f6463a.m()))) {
            return false;
        }
        this.f6463a.C(a2);
        if (selectionWedgeAffinity != null) {
            this.f6463a.D(selectionWedgeAffinity);
        }
        return true;
    }

    public final void t0() {
        this.f6463a.A();
    }

    public final Object u0(PointerInputScope pointerInputScope, boolean z2, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new TextFieldSelectionState$selectionHandleGestures$2(this, pointerInputScope, z2, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public final void v0(InputType inputType) {
        this.f6479q.setValue(inputType);
    }

    public final void w0(Handle handle) {
        this.f6478p.setValue(handle);
    }

    public final void x0(boolean z2) {
        this.f6468f = z2;
    }

    public final void y0(boolean z2) {
        this.f6473k.setValue(Boolean.valueOf(z2));
    }

    public final void z0(long j2) {
        this.f6477o.setValue(Offset.d(j2));
    }
}
