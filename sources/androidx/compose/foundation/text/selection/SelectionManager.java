package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SelectionManager {

    /* renamed from: a  reason: collision with root package name */
    public final SelectionRegistrarImpl f6877a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f6878b = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f6879c = SnapshotStateKt__SnapshotStateKt.e(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public Function1 f6880d = new SelectionManager$onSelectionChange$1(this);

    /* renamed from: e  reason: collision with root package name */
    public HapticFeedback f6881e;

    /* renamed from: f  reason: collision with root package name */
    public Function1 f6882f;

    /* renamed from: g  reason: collision with root package name */
    public TextToolbar f6883g;

    /* renamed from: h  reason: collision with root package name */
    public FocusRequester f6884h = new FocusRequester();

    /* renamed from: i  reason: collision with root package name */
    public final MutableState f6885i = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: j  reason: collision with root package name */
    public Offset f6886j;

    /* renamed from: k  reason: collision with root package name */
    public LayoutCoordinates f6887k;

    /* renamed from: l  reason: collision with root package name */
    public final MutableState f6888l;

    /* renamed from: m  reason: collision with root package name */
    public final MutableState f6889m;

    /* renamed from: n  reason: collision with root package name */
    public final MutableState f6890n;

    /* renamed from: o  reason: collision with root package name */
    public final MutableState f6891o;

    /* renamed from: p  reason: collision with root package name */
    public final MutableState f6892p;

    /* renamed from: q  reason: collision with root package name */
    public final MutableState f6893q;

    /* renamed from: r  reason: collision with root package name */
    public SelectionLayout f6894r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6895s;

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        this.f6877a = selectionRegistrarImpl;
        Offset.Companion companion = Offset.f15855b;
        this.f6888l = SnapshotStateKt__SnapshotStateKt.e(Offset.d(companion.c()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6889m = SnapshotStateKt__SnapshotStateKt.e(Offset.d(companion.c()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6890n = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6891o = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6892p = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f6893q = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        selectionRegistrarImpl.p(new Function1<Long, Unit>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ SelectionManager f6897z;

            {
                this.f6897z = r1;
            }

            public final void b(long j2) {
                if (this.f6897z.f6877a.e().a(j2)) {
                    this.f6897z.m0();
                    this.f6897z.p0();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Number) obj).longValue());
                return Unit.f40552a;
            }
        });
        selectionRegistrarImpl.u(new Function4<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, Unit>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ SelectionManager f6898z;

            {
                this.f6898z = r1;
            }

            public final void b(boolean z2, LayoutCoordinates layoutCoordinates, long j2, SelectionAdjustment selectionAdjustment) {
                long a2 = layoutCoordinates.a();
                Rect rect = new Rect(0.0f, 0.0f, (float) ((int) (a2 >> 32)), (float) ((int) (a2 & 4294967295L)));
                if (!SelectionManagerKt.d(rect, j2)) {
                    j2 = TextLayoutStateKt.a(j2, rect);
                }
                long a3 = this.f6898z.n(layoutCoordinates, j2);
                if ((9223372034707292159L & a3) != 9205357640488583168L) {
                    this.f6898z.c0(z2);
                    this.f6898z.k0(a3, false, selectionAdjustment);
                    FocusRequester.i(this.f6898z.y(), 0, 1, (Object) null);
                    this.f6898z.g0(false);
                }
            }

            public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                b(((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, ((Offset) obj3).t(), (SelectionAdjustment) obj4);
                return Unit.f40552a;
            }
        });
        selectionRegistrarImpl.t(new Function2<Boolean, Long, Unit>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ SelectionManager f6899z;

            {
                this.f6899z = r1;
            }

            public final void b(boolean z2, long j2) {
                SelectionManager selectionManager = this.f6899z;
                Pair S = selectionManager.S(j2, selectionManager.D());
                Selection selection = (Selection) S.a();
                LongObjectMap longObjectMap = (LongObjectMap) S.b();
                if (!Intrinsics.d(selection, this.f6899z.D())) {
                    this.f6899z.f6877a.v(longObjectMap);
                    this.f6899z.B().invoke(selection);
                }
                this.f6899z.c0(z2);
                FocusRequester.i(this.f6899z.y(), 0, 1, (Object) null);
                this.f6899z.g0(false);
            }

            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                b(((Boolean) obj).booleanValue(), ((Number) obj2).longValue());
                return Unit.f40552a;
            }
        });
        selectionRegistrarImpl.r(new Function6<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ SelectionManager f6900z;

            {
                this.f6900z = r1;
            }

            public final Boolean b(boolean z2, LayoutCoordinates layoutCoordinates, long j2, long j3, boolean z3, SelectionAdjustment selectionAdjustment) {
                long a2 = this.f6900z.n(layoutCoordinates, j2);
                long a3 = this.f6900z.n(layoutCoordinates, j3);
                this.f6900z.c0(z2);
                return Boolean.valueOf(this.f6900z.o0(Offset.d(a2), a3, z3, selectionAdjustment));
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return b(((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, ((Offset) obj3).t(), ((Offset) obj4).t(), ((Boolean) obj5).booleanValue(), (SelectionAdjustment) obj6);
            }
        });
        selectionRegistrarImpl.s(new Function0<Unit>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ SelectionManager f6901z;

            {
                this.f6901z = r1;
            }

            public final void invoke() {
                this.f6901z.g0(true);
                this.f6901z.Y((Handle) null);
                this.f6901z.V((Offset) null);
            }
        });
        selectionRegistrarImpl.q(new Function1<Long, Unit>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ SelectionManager f6902z;

            {
                this.f6902z = r1;
            }

            public final void b(long j2) {
                if (this.f6902z.f6877a.e().a(j2)) {
                    this.f6902z.P();
                    this.f6902z.f0((Selection) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Number) obj).longValue());
                return Unit.f40552a;
            }
        });
        selectionRegistrarImpl.o(new Function1<Long, Unit>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ SelectionManager f6903z;

            {
                this.f6903z = r1;
            }

            public final void b(long j2) {
                Selection.AnchorInfo c2;
                Selection.AnchorInfo e2;
                Selection D = this.f6903z.D();
                if (!(D == null || (e2 = D.e()) == null || j2 != e2.e())) {
                    this.f6903z.h0((Offset) null);
                }
                Selection D2 = this.f6903z.D();
                if (!(D2 == null || (c2 = D2.c()) == null || j2 != c2.e())) {
                    this.f6903z.Z((Offset) null);
                }
                if (this.f6903z.f6877a.e().a(j2)) {
                    this.f6903z.p0();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Number) obj).longValue());
                return Unit.f40552a;
            }
        });
    }

    public final Modifier A() {
        Modifier modifier = Modifier.f15489d;
        Modifier a2 = KeyInputModifierKt.a(SelectionGesturesKt.r(FocusableKt.b(FocusChangedModifierKt.a(FocusRequesterModifierKt.a(OnGloballyPositionedModifierKt.a(O(modifier, new SelectionManager$modifier$1(this)), new SelectionManager$modifier$2(this)), this.f6884h), new SelectionManager$modifier$3(this)), false, (MutableInteractionSource) null, 3, (Object) null), new SelectionManager$modifier$4(this)), new SelectionManager$modifier$5(this));
        if (F()) {
            modifier = SelectionManager_androidKt.c(modifier, this);
        }
        return a2.o0(modifier);
    }

    public final Function1 B() {
        return this.f6880d;
    }

    public final AnnotatedString C() {
        if (D() == null || this.f6877a.e().e()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, (DefaultConstructorMarker) null);
        List w2 = this.f6877a.w(Q());
        int size = w2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = (Selectable) w2.get(i2);
            Selection selection = (Selection) this.f6877a.e().b(selectable.k());
            if (selection != null) {
                AnnotatedString b2 = selectable.b();
                builder.i(selection.d() ? b2.subSequence(selection.c().d(), selection.e().d()) : b2.subSequence(selection.e().d(), selection.c().d()));
            }
        }
        return builder.r();
    }

    public final Selection D() {
        return (Selection) this.f6878b.getValue();
    }

    public final SelectionLayout E(long j2, long j3, boolean z2) {
        LayoutCoordinates Q = Q();
        List w2 = this.f6877a.w(Q);
        MutableLongIntMap a2 = LongIntMapKt.a();
        Collection collection = w2;
        int size = collection.size();
        for (int i2 = 0; i2 < size; i2++) {
            a2.n(((Selectable) w2.get(i2)).k(), i2);
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(j2, j3, Q, z2, (j3 & 9223372034707292159L) == 9205357640488583168L ? null : D(), new SelectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1(a2), (DefaultConstructorMarker) null);
        int size2 = collection.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Selectable) w2.get(i3)).m(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.b();
    }

    public final boolean F() {
        return J() && L() && !N();
    }

    public final float G() {
        Selectable p2;
        Selection D = D();
        if (D == null || (p2 = p(D.e())) == null) {
            return 0.0f;
        }
        return p2.f(D.e().d());
    }

    public final Offset H() {
        return (Offset) this.f6890n.getValue();
    }

    public final TextDragObserver I(boolean z2) {
        return new SelectionManager$handleDragObserver$1(z2, this);
    }

    public final boolean J() {
        return v() != null;
    }

    public final boolean K() {
        Selection selection;
        List w2 = this.f6877a.w(Q());
        if (w2.isEmpty()) {
            return true;
        }
        int size = w2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = (Selectable) w2.get(i2);
            AnnotatedString b2 = selectable.b();
            if (b2.length() != 0 && ((selection = (Selection) this.f6877a.e().b(selectable.k())) == null || Math.abs(selection.e().d() - selection.c().d()) != b2.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean L() {
        return ((Boolean) this.f6879c.getValue()).booleanValue();
    }

    public final boolean M() {
        Selection D = D();
        if (D == null || Intrinsics.d(D.e(), D.c())) {
            return false;
        }
        if (D.e().e() == D.c().e()) {
            return true;
        }
        List w2 = this.f6877a.w(Q());
        int size = w2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selection selection = (Selection) this.f6877a.e().b(((Selectable) w2.get(i2)).k());
            if (selection != null && selection.e().d() != selection.c().d()) {
                return true;
            }
        }
        return false;
    }

    public final boolean N() {
        Selection D = D();
        if (D == null) {
            return true;
        }
        return Intrinsics.d(D.e(), D.c());
    }

    public final Modifier O(Modifier modifier, Function0 function0) {
        return SuspendingPointerInputFilterKt.c(modifier, Unit.f40552a, new SelectionManager$onClearSelectionRequested$1(this, function0));
    }

    public final void P() {
        HapticFeedback hapticFeedback;
        this.f6877a.v(LongObjectMapKt.a());
        g0(false);
        if (D() != null) {
            this.f6880d.invoke((Object) null);
            if (L() && (hapticFeedback = this.f6881e) != null) {
                hapticFeedback.a(HapticFeedbackType.f16726b.i());
            }
        }
    }

    public final LayoutCoordinates Q() {
        LayoutCoordinates layoutCoordinates = this.f6887k;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.b()) {
                InlineClassHelperKt.a("unattached coordinates");
            }
            return layoutCoordinates;
        }
        InlineClassHelperKt.b("null coordinates");
        throw new KotlinNothingValueException();
    }

    public final void R() {
        List w2 = this.f6877a.w(Q());
        if (!w2.isEmpty()) {
            MutableLongObjectMap c2 = LongObjectMapKt.c();
            int size = w2.size();
            Selection selection = null;
            Selection selection2 = null;
            for (int i2 = 0; i2 < size; i2++) {
                Selectable selectable = (Selectable) w2.get(i2);
                Selection l2 = selectable.l();
                if (l2 != null) {
                    if (selection == null) {
                        selection = l2;
                    }
                    c2.n(selectable.k(), l2);
                    selection2 = l2;
                }
            }
            if (!c2.e()) {
                if (selection != selection2) {
                    Intrinsics.f(selection);
                    Selection.AnchorInfo e2 = selection.e();
                    Intrinsics.f(selection2);
                    selection = new Selection(e2, selection2.c(), false);
                }
                this.f6877a.v(c2);
                this.f6880d.invoke(selection);
                this.f6894r = null;
            }
        }
    }

    public final Pair S(long j2, Selection selection) {
        HapticFeedback hapticFeedback;
        MutableLongObjectMap c2 = LongObjectMapKt.c();
        List w2 = this.f6877a.w(Q());
        int size = w2.size();
        Selection selection2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = (Selectable) w2.get(i2);
            Selection l2 = selectable.k() == j2 ? selectable.l() : null;
            if (l2 != null) {
                c2.r(selectable.k(), l2);
            }
            selection2 = SelectionManagerKt.h(selection2, l2);
        }
        if (L() && !Intrinsics.d(selection2, selection) && (hapticFeedback = this.f6881e) != null) {
            hapticFeedback.a(HapticFeedbackType.f16726b.i());
        }
        return new Pair(selection2, c2);
    }

    public final void T(SelectionLayout selectionLayout, Selection selection) {
        HapticFeedback hapticFeedback;
        if (j0() && (hapticFeedback = this.f6881e) != null) {
            hapticFeedback.a(HapticFeedbackType.f16726b.i());
        }
        this.f6877a.v(selectionLayout.f(selection));
        this.f6880d.invoke(selection);
    }

    public final void U(LayoutCoordinates layoutCoordinates) {
        this.f6887k = layoutCoordinates;
        if (z() && D() != null) {
            Offset d2 = layoutCoordinates != null ? Offset.d(LayoutCoordinatesKt.g(layoutCoordinates)) : null;
            if (!Intrinsics.d(this.f6886j, d2)) {
                this.f6886j = d2;
                m0();
                p0();
            }
        }
    }

    public final void V(Offset offset) {
        this.f6893q.setValue(offset);
    }

    public final void W(long j2) {
        this.f6888l.setValue(Offset.d(j2));
    }

    public final void X(long j2) {
        this.f6889m.setValue(Offset.d(j2));
    }

    public final void Y(Handle handle) {
        this.f6892p.setValue(handle);
    }

    public final void Z(Offset offset) {
        this.f6891o.setValue(offset);
    }

    public final void a0(HapticFeedback hapticFeedback) {
        this.f6881e = hapticFeedback;
    }

    public final void b0(boolean z2) {
        this.f6885i.setValue(Boolean.valueOf(z2));
    }

    public final void c0(boolean z2) {
        if (((Boolean) this.f6879c.getValue()).booleanValue() != z2) {
            this.f6879c.setValue(Boolean.valueOf(z2));
            p0();
        }
    }

    public final void d0(Function1 function1) {
        this.f6882f = function1;
    }

    public final void e0(Function1 function1) {
        this.f6880d = new SelectionManager$onSelectionChange$2(this, function1);
    }

    public final void f0(Selection selection) {
        this.f6878b.setValue(selection);
        if (selection != null) {
            m0();
        }
    }

    public final void g0(boolean z2) {
        this.f6895s = z2;
        p0();
    }

    public final void h0(Offset offset) {
        this.f6890n.setValue(offset);
    }

    public final void i0(TextToolbar textToolbar) {
        this.f6883g = textToolbar;
    }

    public final boolean j0() {
        if (!L()) {
            return false;
        }
        List n2 = this.f6877a.n();
        int size = n2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Selectable) n2.get(i2)).b().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void k0(long j2, boolean z2, SelectionAdjustment selectionAdjustment) {
        this.f6894r = null;
        n0(j2, Offset.f15855b.b(), z2, selectionAdjustment);
    }

    public final void l0() {
        o();
        P();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = r1.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.d(r8, r13) == false) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m0() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.foundation.text.selection.Selection r1 = r17.D()
            androidx.compose.ui.layout.LayoutCoordinates r2 = r0.f6887k
            r3 = 0
            if (r1 == 0) goto L_0x0016
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r4 = r1.e()
            if (r4 == 0) goto L_0x0016
            androidx.compose.foundation.text.selection.Selectable r4 = r0.p(r4)
            goto L_0x0017
        L_0x0016:
            r4 = r3
        L_0x0017:
            if (r1 == 0) goto L_0x0024
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r5 = r1.c()
            if (r5 == 0) goto L_0x0024
            androidx.compose.foundation.text.selection.Selectable r5 = r0.p(r5)
            goto L_0x0025
        L_0x0024:
            r5 = r3
        L_0x0025:
            if (r4 == 0) goto L_0x002c
            androidx.compose.ui.layout.LayoutCoordinates r6 = r4.N()
            goto L_0x002d
        L_0x002c:
            r6 = r3
        L_0x002d:
            if (r5 == 0) goto L_0x0034
            androidx.compose.ui.layout.LayoutCoordinates r7 = r5.N()
            goto L_0x0035
        L_0x0034:
            r7 = r3
        L_0x0035:
            if (r1 == 0) goto L_0x00ab
            if (r2 == 0) goto L_0x00ab
            boolean r8 = r2.b()
            if (r8 == 0) goto L_0x00ab
            if (r6 != 0) goto L_0x0044
            if (r7 != 0) goto L_0x0044
            goto L_0x00ab
        L_0x0044:
            androidx.compose.ui.geometry.Rect r8 = androidx.compose.foundation.text.selection.SelectionManagerKt.i(r2)
            r9 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L_0x007b
            r13 = 1
            long r13 = r4.o(r1, r13)
            long r15 = r13 & r11
            int r4 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0060
            goto L_0x007b
        L_0x0060:
            long r13 = r2.N(r6, r13)
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.d(r13)
            long r13 = r4.t()
            androidx.compose.foundation.text.Handle r6 = r17.v()
            androidx.compose.foundation.text.Handle r15 = androidx.compose.foundation.text.Handle.SelectionStart
            if (r6 == r15) goto L_0x007c
            boolean r6 = androidx.compose.foundation.text.selection.SelectionManagerKt.d(r8, r13)
            if (r6 == 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r4 = r3
        L_0x007c:
            r0.h0(r4)
            if (r7 == 0) goto L_0x00a7
            r4 = 0
            long r4 = r5.o(r1, r4)
            long r11 = r11 & r4
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x008c
            goto L_0x00a7
        L_0x008c:
            long r1 = r2.N(r7, r4)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.d(r1)
            long r4 = r1.t()
            androidx.compose.foundation.text.Handle r2 = r17.v()
            androidx.compose.foundation.text.Handle r6 = androidx.compose.foundation.text.Handle.SelectionEnd
            if (r2 == r6) goto L_0x00a6
            boolean r2 = androidx.compose.foundation.text.selection.SelectionManagerKt.d(r8, r4)
            if (r2 == 0) goto L_0x00a7
        L_0x00a6:
            r3 = r1
        L_0x00a7:
            r0.Z(r3)
            return
        L_0x00ab:
            r0.h0(r3)
            r0.Z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.m0():void");
    }

    public final long n(LayoutCoordinates layoutCoordinates, long j2) {
        LayoutCoordinates layoutCoordinates2 = this.f6887k;
        return (layoutCoordinates2 == null || !layoutCoordinates2.b()) ? Offset.f15855b.b() : Q().N(layoutCoordinates, j2);
    }

    public final boolean n0(long j2, long j3, boolean z2, SelectionAdjustment selectionAdjustment) {
        Y(z2 ? Handle.SelectionStart : Handle.SelectionEnd);
        V(Offset.d(j2));
        SelectionLayout E = E(j2, j3, z2);
        if (E == null || !E.g(this.f6894r)) {
            return false;
        }
        Selection a2 = selectionAdjustment.a(E);
        if (!Intrinsics.d(a2, D())) {
            T(E, a2);
        }
        this.f6894r = E;
        return true;
    }

    public final void o() {
        Function1 function1;
        AnnotatedString C = C();
        if (C != null) {
            if (C.length() <= 0) {
                C = null;
            }
            if (C != null && (function1 = this.f6882f) != null) {
                function1.invoke(C);
            }
        }
    }

    public final boolean o0(Offset offset, long j2, boolean z2, SelectionAdjustment selectionAdjustment) {
        if (offset == null) {
            return false;
        }
        return n0(offset.t(), j2, z2, selectionAdjustment);
    }

    public final Selectable p(Selection.AnchorInfo anchorInfo) {
        return (Selectable) this.f6877a.m().b(anchorInfo.e());
    }

    public final void p0() {
        TextToolbar textToolbar;
        if (!z() || (textToolbar = this.f6883g) == null) {
            return;
        }
        if (this.f6895s && L()) {
            Rect r2 = r();
            if (r2 != null) {
                SelectionManager$updateSelectionToolbar$2 selectionManager$updateSelectionToolbar$2 = null;
                SelectionManager$updateSelectionToolbar$1 selectionManager$updateSelectionToolbar$1 = M() ? new SelectionManager$updateSelectionToolbar$1(this) : null;
                if (!K()) {
                    selectionManager$updateSelectionToolbar$2 = new SelectionManager$updateSelectionToolbar$2(this);
                }
                TextToolbar.D(textToolbar, r2, selectionManager$updateSelectionToolbar$1, (Function0) null, (Function0) null, selectionManager$updateSelectionToolbar$2, (Function0) null, 12, (Object) null);
            }
        } else if (textToolbar.A() == TextToolbarStatus.Shown) {
            textToolbar.a();
        }
    }

    public final LayoutCoordinates q() {
        return this.f6887k;
    }

    public final Rect r() {
        LayoutCoordinates layoutCoordinates;
        if (D() == null || (layoutCoordinates = this.f6887k) == null || !layoutCoordinates.b()) {
            return null;
        }
        List w2 = this.f6877a.w(Q());
        ArrayList arrayList = new ArrayList(w2.size());
        int size = w2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = (Selectable) w2.get(i2);
            Selection selection = (Selection) this.f6877a.e().b(selectable.k());
            Pair a2 = selection != null ? TuplesKt.a(selectable, selection) : null;
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        List a3 = SelectionManagerKt.e(arrayList);
        if (a3.isEmpty()) {
            return null;
        }
        Rect g2 = SelectionManagerKt.g(a3, layoutCoordinates);
        if (Intrinsics.d(g2, SelectionManagerKt.f6917a)) {
            return null;
        }
        Rect x2 = SelectionManagerKt.i(layoutCoordinates).x(g2);
        if (x2.p() - x2.o() < 0.0f || x2.i() - x2.r() < 0.0f) {
            return null;
        }
        Rect B2 = x2.B(LayoutCoordinatesKt.f(layoutCoordinates));
        return Rect.h(B2, 0.0f, 0.0f, 0.0f, B2.i() + (SelectionHandlesKt.b() * ((float) 4)), 7, (Object) null);
    }

    public final Offset s() {
        return (Offset) this.f6893q.getValue();
    }

    public final long t() {
        return ((Offset) this.f6888l.getValue()).t();
    }

    public final long u() {
        return ((Offset) this.f6889m.getValue()).t();
    }

    public final Handle v() {
        return (Handle) this.f6892p.getValue();
    }

    public final float w() {
        Selectable p2;
        Selection D = D();
        if (D == null || (p2 = p(D.c())) == null) {
            return 0.0f;
        }
        return p2.f(D.c().d());
    }

    public final Offset x() {
        return (Offset) this.f6891o.getValue();
    }

    public final FocusRequester y() {
        return this.f6884h;
    }

    public final boolean z() {
        return ((Boolean) this.f6885i.getValue()).booleanValue();
    }
}
