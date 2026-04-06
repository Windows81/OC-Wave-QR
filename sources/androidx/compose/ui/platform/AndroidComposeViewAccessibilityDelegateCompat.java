package androidx.compose.ui.platform;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.ArraySet;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final Companion Q = new Companion((DefaultConstructorMarker) null);
    public static final int R = 8;
    public static final IntList S = IntListKt.d(R.id.f15499a, R.id.f15500b, R.id.f15511m, R.id.f15522x, R.id.f15497A, R.id.f15498B, R.id.C, R.id.D, R.id.E, R.id.F, R.id.f15501c, R.id.f15502d, R.id.f15503e, R.id.f15504f, R.id.f15505g, R.id.f15506h, R.id.f15507i, R.id.f15508j, R.id.f15509k, R.id.f15510l, R.id.f15512n, R.id.f15513o, R.id.f15514p, R.id.f15515q, R.id.f15516r, R.id.f15517s, R.id.f15518t, R.id.f15519u, R.id.f15520v, R.id.f15521w, R.id.f15523y, R.id.f15524z);

    /* renamed from: A  reason: collision with root package name */
    public final Channel f17530A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f17531B;
    public PendingTextTraversedEvent C;
    public IntObjectMap D;
    public MutableIntSet E;
    public MutableIntIntMap F;
    public MutableIntIntMap G;
    public final String H;
    public final String I;
    public final URLSpanCache J;
    public MutableIntObjectMap K;
    public SemanticsNodeCopy L;
    public boolean M;
    public final Runnable N;
    public final List O;
    public final Function1 P;

    /* renamed from: d  reason: collision with root package name */
    public final AndroidComposeView f17532d;

    /* renamed from: e  reason: collision with root package name */
    public int f17533e = Integer.MIN_VALUE;

    /* renamed from: f  reason: collision with root package name */
    public Function1 f17534f = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this);

    /* renamed from: g  reason: collision with root package name */
    public final AccessibilityManager f17535g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17536h;

    /* renamed from: i  reason: collision with root package name */
    public long f17537i;

    /* renamed from: j  reason: collision with root package name */
    public final AccessibilityManager.AccessibilityStateChangeListener f17538j;

    /* renamed from: k  reason: collision with root package name */
    public final AccessibilityManager.TouchExplorationStateChangeListener f17539k;

    /* renamed from: l  reason: collision with root package name */
    public List f17540l;

    /* renamed from: m  reason: collision with root package name */
    public final Handler f17541m;

    /* renamed from: n  reason: collision with root package name */
    public ComposeAccessibilityNodeProvider f17542n;

    /* renamed from: o  reason: collision with root package name */
    public int f17543o;

    /* renamed from: p  reason: collision with root package name */
    public int f17544p;

    /* renamed from: q  reason: collision with root package name */
    public AccessibilityNodeInfoCompat f17545q;

    /* renamed from: r  reason: collision with root package name */
    public AccessibilityNodeInfoCompat f17546r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f17547s;

    /* renamed from: t  reason: collision with root package name */
    public final MutableIntObjectMap f17548t;

    /* renamed from: u  reason: collision with root package name */
    public final MutableIntObjectMap f17549u;

    /* renamed from: v  reason: collision with root package name */
    public SparseArrayCompat f17550v;

    /* renamed from: w  reason: collision with root package name */
    public SparseArrayCompat f17551w;

    /* renamed from: x  reason: collision with root package name */
    public int f17552x;

    /* renamed from: y  reason: collision with root package name */
    public Integer f17553y;

    /* renamed from: z  reason: collision with root package name */
    public final ArraySet f17554z;

    @Metadata
    public static final class Api24Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api24Impl f17556a = new Api24Impl();

        public static final void a(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), SemanticsActions.f18056a.x())) != null) {
                accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908349, accessibilityAction.b()));
            }
        }
    }

    @Metadata
    public static final class Api29Impl {

        /* renamed from: a  reason: collision with root package name */
        public static final Api29Impl f17557a = new Api29Impl();

        public static final void a(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            Role role = (Role) SemanticsConfigurationKt.a(semanticsNode.w(), SemanticsProperties.f18102a.C());
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode)) {
                if (!(role == null ? false : Role.m(role.p(), Role.f18040b.b()))) {
                    SemanticsConfiguration w2 = semanticsNode.w();
                    SemanticsActions semanticsActions = SemanticsActions.f18056a;
                    AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(w2, semanticsActions.r());
                    if (accessibilityAction != null) {
                        accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908358, accessibilityAction.b()));
                    }
                    AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.o());
                    if (accessibilityAction2 != null) {
                        accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908359, accessibilityAction2.b()));
                    }
                    AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.p());
                    if (accessibilityAction3 != null) {
                        accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908360, accessibilityAction3.b()));
                    }
                    AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.q());
                    if (accessibilityAction4 != null) {
                        accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908361, accessibilityAction4.b()));
                    }
                }
            }
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        public void a(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.M(i2, accessibilityNodeInfoCompat, str, bundle);
        }

        public AccessibilityNodeInfoCompat b(int i2) {
            AccessibilityNodeInfoCompat s2 = AndroidComposeViewAccessibilityDelegateCompat.this.U(i2);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.f17547s) {
                if (i2 == androidComposeViewAccessibilityDelegateCompat.f17543o) {
                    androidComposeViewAccessibilityDelegateCompat.f17545q = s2;
                }
                if (i2 == androidComposeViewAccessibilityDelegateCompat.f17544p) {
                    androidComposeViewAccessibilityDelegateCompat.f17546r = s2;
                }
            }
            return s2;
        }

        public AccessibilityNodeInfoCompat d(int i2) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return b(AndroidComposeViewAccessibilityDelegateCompat.this.f17543o);
                }
                throw new IllegalArgumentException("Unknown focus type: " + i2);
            } else if (AndroidComposeViewAccessibilityDelegateCompat.this.f17544p == Integer.MIN_VALUE) {
                return null;
            } else {
                return b(AndroidComposeViewAccessibilityDelegateCompat.this.f17544p);
            }
        }

        public boolean f(int i2, int i3, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.r0(i2, i3, bundle);
        }
    }

    @Metadata
    public static final class PendingTextTraversedEvent {

        /* renamed from: a  reason: collision with root package name */
        public final SemanticsNode f17559a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17560b;

        /* renamed from: c  reason: collision with root package name */
        public final int f17561c;

        /* renamed from: d  reason: collision with root package name */
        public final int f17562d;

        /* renamed from: e  reason: collision with root package name */
        public final int f17563e;

        /* renamed from: f  reason: collision with root package name */
        public final long f17564f;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i2, int i3, int i4, int i5, long j2) {
            this.f17559a = semanticsNode;
            this.f17560b = i2;
            this.f17561c = i3;
            this.f17562d = i4;
            this.f17563e = i5;
            this.f17564f = j2;
        }

        public final int a() {
            return this.f17560b;
        }

        public final int b() {
            return this.f17562d;
        }

        public final int c() {
            return this.f17561c;
        }

        public final SemanticsNode d() {
            return this.f17559a;
        }

        public final int e() {
            return this.f17563e;
        }

        public final long f() {
            return this.f17564f;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.f17532d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f17535g = accessibilityManager;
        this.f17537i = 100;
        this.f17538j = new C0341g(this);
        this.f17539k = new C0342h(this);
        this.f17540l = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f17541m = new Handler(Looper.getMainLooper());
        this.f17542n = new ComposeAccessibilityNodeProvider();
        this.f17543o = Integer.MIN_VALUE;
        this.f17544p = Integer.MIN_VALUE;
        this.f17548t = new MutableIntObjectMap(0, 1, (DefaultConstructorMarker) null);
        this.f17549u = new MutableIntObjectMap(0, 1, (DefaultConstructorMarker) null);
        this.f17550v = new SparseArrayCompat(0, 1, (DefaultConstructorMarker) null);
        this.f17551w = new SparseArrayCompat(0, 1, (DefaultConstructorMarker) null);
        this.f17552x = -1;
        this.f17554z = new ArraySet(0, 1, (DefaultConstructorMarker) null);
        this.f17530A = ChannelKt.b(1, (BufferOverflow) null, (Function1) null, 6, (Object) null);
        this.f17531B = true;
        this.D = IntObjectMapKt.b();
        this.E = new MutableIntSet(0, 1, (DefaultConstructorMarker) null);
        this.F = new MutableIntIntMap(0, 1, (DefaultConstructorMarker) null);
        this.G = new MutableIntIntMap(0, 1, (DefaultConstructorMarker) null);
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.J = new URLSpanCache();
        this.K = IntObjectMapKt.c();
        this.L = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().d(), IntObjectMapKt.b());
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f17555z;

            {
                this.f17555z = r1;
            }

            public void onViewAttachedToWindow(View view) {
                AccessibilityManager u2 = this.f17555z.f17535g;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f17555z;
                u2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f17538j);
                u2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f17539k);
            }

            public void onViewDetachedFromWindow(View view) {
                this.f17555z.f17541m.removeCallbacks(this.f17555z.N);
                AccessibilityManager u2 = this.f17555z.f17535g;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f17555z;
                u2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f17538j);
                u2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f17539k);
            }
        });
        this.N = new C0343i(this);
        this.O = new ArrayList();
        this.P = new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(this);
    }

    /* JADX INFO: finally extract failed */
    public static final void A0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.d(androidComposeViewAccessibilityDelegateCompat.f17532d, false, 1, (Object) null);
            Unit unit = Unit.f40552a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.R();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.M = false;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ boolean F0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i2, int i3, Integer num, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.E0(i2, i3, num, list);
    }

    public static final void R0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z2) {
        androidComposeViewAccessibilityDelegateCompat.f17540l = androidComposeViewAccessibilityDelegateCompat.f17535g.getEnabledAccessibilityServiceList(-1);
    }

    public static final void X(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z2) {
        androidComposeViewAccessibilityDelegateCompat.f17540l = z2 ? androidComposeViewAccessibilityDelegateCompat.f17535g.getEnabledAccessibilityServiceList(-1) : CollectionsKt.m();
    }

    public static final boolean s0(ScrollAxisRange scrollAxisRange, float f2) {
        return (f2 < 0.0f && ((Number) scrollAxisRange.c().invoke()).floatValue() > 0.0f) || (f2 > 0.0f && ((Number) scrollAxisRange.c().invoke()).floatValue() < ((Number) scrollAxisRange.a().invoke()).floatValue());
    }

    public static final float t0(float f2, float f3) {
        if (Math.signum(f2) == Math.signum(f3)) {
            return Math.abs(f2) < Math.abs(f3) ? f2 : f3;
        }
        return 0.0f;
    }

    public static final boolean v0(ScrollAxisRange scrollAxisRange) {
        return (((Number) scrollAxisRange.c().invoke()).floatValue() > 0.0f && !scrollAxisRange.b()) || (((Number) scrollAxisRange.c().invoke()).floatValue() < ((Number) scrollAxisRange.a().invoke()).floatValue() && scrollAxisRange.b());
    }

    public static final boolean w0(ScrollAxisRange scrollAxisRange) {
        return (((Number) scrollAxisRange.c().invoke()).floatValue() < ((Number) scrollAxisRange.a().invoke()).floatValue() && !scrollAxisRange.b()) || (((Number) scrollAxisRange.c().invoke()).floatValue() > 0.0f && scrollAxisRange.b());
    }

    public final int B0(int i2) {
        if (i2 == this.f17532d.getSemanticsOwner().d().o()) {
            return -1;
        }
        return i2;
    }

    public final void C0(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        MutableIntSet b2 = IntSetKt.b();
        List t2 = semanticsNode.t();
        int size = t2.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) t2.get(i2);
            if (a0().a(semanticsNode2.o())) {
                if (!semanticsNodeCopy.a().a(semanticsNode2.o())) {
                    o0(semanticsNode.q());
                    return;
                }
                b2.g(semanticsNode2.o());
            }
        }
        MutableIntSet a2 = semanticsNodeCopy.a();
        int[] iArr = a2.f1799b;
        long[] jArr = a2.f1798a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j2) >= 128 || b2.a(iArr[(i3 << 3) + i5])) {
                            j2 >>= 8;
                            i5++;
                        } else {
                            o0(semanticsNode.q());
                            return;
                        }
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        List t3 = semanticsNode.t();
        int size2 = t3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            SemanticsNode semanticsNode3 = (SemanticsNode) t3.get(i6);
            if (a0().a(semanticsNode3.o())) {
                Object b3 = this.K.b(semanticsNode3.o());
                Intrinsics.f(b3);
                C0(semanticsNode3, (SemanticsNodeCopy) b3);
            }
        }
    }

    public final boolean D0(AccessibilityEvent accessibilityEvent) {
        if (!m0()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f17547s = true;
        }
        try {
            return ((Boolean) this.f17534f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f17547s = false;
        }
    }

    public final boolean E0(int i2, int i3, Integer num, List list) {
        if (i2 == Integer.MIN_VALUE || !m0()) {
            return false;
        }
        AccessibilityEvent T = T(i2, i3);
        if (num != null) {
            T.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            T.setContentDescription(ListUtilsKt.e(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
        return D0(T);
    }

    public final void G0(int i2, int i3, String str) {
        AccessibilityEvent T = T(B0(i2), 32);
        T.setContentChangeTypes(i3);
        if (str != null) {
            T.getText().add(str);
        }
        D0(T);
    }

    public final void H0(int i2) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.C;
        if (pendingTextTraversedEvent != null) {
            if (i2 == pendingTextTraversedEvent.d().o()) {
                if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.f() <= 1000) {
                    AccessibilityEvent T = T(B0(pendingTextTraversedEvent.d().o()), 131072);
                    T.setFromIndex(pendingTextTraversedEvent.b());
                    T.setToIndex(pendingTextTraversedEvent.e());
                    T.setAction(pendingTextTraversedEvent.a());
                    T.setMovementGranularity(pendingTextTraversedEvent.c());
                    T.getText().add(f0(pendingTextTraversedEvent.d()));
                    D0(T);
                }
            } else {
                return;
            }
        }
        this.C = null;
    }

    /* JADX WARNING: type inference failed for: r1v30, types: [androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x05bf, code lost:
        if (r1.containsAll(r2) != false) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x05ca, code lost:
        if (r1.isEmpty() == false) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x05e3, code lost:
        if (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m((androidx.compose.ui.semantics.AccessibilityAction) r1, androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r25.b(), r3)) != false) goto L_0x05c2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I0(androidx.collection.IntObjectMap r55) {
        /*
            r54 = this;
            r7 = r54
            r8 = r55
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.List r0 = r7.O
            java.util.Collection r0 = (java.util.Collection) r0
            r10.<init>(r0)
            java.util.List r0 = r7.O
            r0.clear()
            int[] r11 = r8.f1793b
            long[] r12 = r8.f1792a
            int r0 = r12.length
            r13 = 2
            int r14 = r0 + -2
            if (r14 < 0) goto L_0x06f5
            r6 = 0
        L_0x001d:
            r0 = r12[r6]
            long r2 = ~r0
            r16 = 7
            long r2 = r2 << r16
            long r2 = r2 & r0
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r17
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x06dc
            int r2 = r6 - r14
            int r2 = ~r2
            int r2 = r2 >>> 31
            r5 = 8
            int r4 = 8 - r2
            r19 = r0
            r3 = 0
        L_0x003c:
            if (r3 >= r4) goto L_0x06cd
            r21 = 255(0xff, double:1.26E-321)
            long r0 = r19 & r21
            r23 = 128(0x80, double:6.32E-322)
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x06ab
            int r0 = r6 << 3
            int r0 = r0 + r3
            r2 = r11[r0]
            androidx.collection.MutableIntObjectMap r0 = r7.K
            java.lang.Object r0 = r0.b(r2)
            r25 = r0
            androidx.compose.ui.platform.SemanticsNodeCopy r25 = (androidx.compose.ui.platform.SemanticsNodeCopy) r25
            if (r25 != 0) goto L_0x005b
            goto L_0x06ab
        L_0x005b:
            java.lang.Object r0 = r8.b(r2)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r0 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r0
            r26 = 0
            if (r0 == 0) goto L_0x006b
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.b()
            r1 = r0
            goto L_0x006d
        L_0x006b:
            r1 = r26
        L_0x006d:
            if (r1 == 0) goto L_0x06a0
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r1.w()
            androidx.collection.MutableScatterMap r0 = r0.q()
            java.lang.Object[] r9 = r0.f1960b
            java.lang.Object[] r15 = r0.f1961c
            long[] r0 = r0.f1959a
            int r5 = r0.length
            int r5 = r5 - r13
            if (r5 < 0) goto L_0x0668
            r31 = r3
            r30 = r4
            r13 = 0
            r29 = 0
        L_0x0088:
            r3 = r0[r13]
            r33 = r0
            r32 = r1
            long r0 = ~r3
            long r0 = r0 << r16
            long r0 = r0 & r3
            long r0 = r0 & r17
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x063b
            int r0 = r13 - r5
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r0 = 8 - r0
            r34 = r3
            r4 = 0
        L_0x00a4:
            if (r4 >= r0) goto L_0x061f
            long r36 = r34 & r21
            int r1 = (r36 > r23 ? 1 : (r36 == r23 ? 0 : -1))
            if (r1 >= 0) goto L_0x05e9
            int r1 = r13 << 3
            int r1 = r1 + r4
            r3 = r9[r1]
            r1 = r15[r1]
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = (androidx.compose.ui.semantics.SemanticsPropertyKey) r3
            androidx.compose.ui.semantics.SemanticsProperties r36 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            r37 = r0
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.l()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r0 != 0) goto L_0x00d0
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.M()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r0 == 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r0 = 0
            goto L_0x00d4
        L_0x00d0:
            boolean r0 = r7.x0(r2, r10)
        L_0x00d4:
            if (r0 != 0) goto L_0x00fc
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r25.b()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r1, r0)
            if (r0 == 0) goto L_0x00fc
            r44 = r5
            r8 = r6
            r28 = r10
            r38 = r11
            r39 = r12
            r40 = r15
            r43 = r30
            r41 = r37
            r10 = 2
            r11 = 8
            r30 = r4
            r37 = r32
            goto L_0x05ff
        L_0x00fc:
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.z()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.g(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r25.b()
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r36.z()
            boolean r0 = r0.h(r3)
            if (r0 == 0) goto L_0x013a
            r0 = 8
            r7.G0(r2, r0, r1)
            r44 = r5
            r8 = r6
            r28 = r10
            r38 = r11
            r39 = r12
            r40 = r15
            r43 = r30
            r41 = r37
            r10 = 2
            r11 = r0
        L_0x0131:
            r30 = r4
            r37 = r32
            r32 = r9
            r9 = r2
            goto L_0x05ce
        L_0x013a:
            r44 = r5
            r8 = r6
            r28 = r10
            r38 = r11
            r39 = r12
            r40 = r15
            r43 = r30
            r41 = r37
            r10 = 2
            r11 = 8
            goto L_0x0131
        L_0x014d:
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.F()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r0 == 0) goto L_0x0159
            r0 = 1
            goto L_0x0161
        L_0x0159:
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.K()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
        L_0x0161:
            r38 = 64
            if (r0 == 0) goto L_0x01ba
            int r1 = r7.B0(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r38)
            r36 = 8
            r38 = 0
            r39 = 2048(0x800, float:2.87E-42)
            r40 = 0
            r41 = r37
            r28 = 8
            r0 = r54
            r37 = r32
            r42 = r2
            r2 = r39
            r43 = r30
            r30 = r4
            r4 = r40
            r44 = r5
            r5 = r36
            r8 = r6
            r6 = r38
            F0(r0, r1, r2, r3, r4, r5, r6)
            r6 = r42
            int r1 = r7.B0(r6)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 8
            r28 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r54
            r32 = r9
            r9 = r6
            r6 = r28
            F0(r0, r1, r2, r3, r4, r5, r6)
        L_0x01ad:
            r28 = r10
            r38 = r11
            r39 = r12
            r40 = r15
        L_0x01b5:
            r10 = 2
        L_0x01b6:
            r11 = 8
            goto L_0x05ce
        L_0x01ba:
            r44 = r5
            r8 = r6
            r43 = r30
            r41 = r37
            r30 = r4
            r37 = r32
            r32 = r9
            r9 = r2
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.B()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r0 == 0) goto L_0x01f4
            int r1 = r7.B0(r9)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r38)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r54
            F0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.B0(r9)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = r54
            F0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ad
        L_0x01f4:
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.E()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            r2 = 4
            if (r0 == 0) goto L_0x02e1
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r37.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r36.C()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.Role r0 = (androidx.compose.ui.semantics.Role) r0
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.ui.semantics.Role.f18040b
            int r1 = r1.h()
            if (r0 != 0) goto L_0x0217
            r0 = 0
            goto L_0x021f
        L_0x0217:
            int r0 = r0.p()
            boolean r0 = androidx.compose.ui.semantics.Role.m(r0, r1)
        L_0x021f:
            if (r0 == 0) goto L_0x02be
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r37.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r36.E()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 == 0) goto L_0x02a8
            int r0 = r7.B0(r9)
            android.view.accessibility.AccessibilityEvent r0 = r7.T(r0, r2)
            androidx.compose.ui.semantics.SemanticsNode r1 = r37.a()
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r1.n()
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r36.d()
            java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r2, r3)
            r45 = r2
            java.util.List r45 = (java.util.List) r45
            if (r45 == 0) goto L_0x0268
            r52 = 62
            r53 = 0
            java.lang.String r46 = ","
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            java.lang.String r2 = androidx.compose.ui.util.ListUtilsKt.e(r45, r46, r47, r48, r49, r50, r51, r52, r53)
            goto L_0x026a
        L_0x0268:
            r2 = r26
        L_0x026a:
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r1.n()
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r36.H()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r3)
            r45 = r1
            java.util.List r45 = (java.util.List) r45
            if (r45 == 0) goto L_0x0291
            r52 = 62
            r53 = 0
            java.lang.String r46 = ","
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            java.lang.String r1 = androidx.compose.ui.util.ListUtilsKt.e(r45, r46, r47, r48, r49, r50, r51, r52, r53)
            goto L_0x0293
        L_0x0291:
            r1 = r26
        L_0x0293:
            if (r2 == 0) goto L_0x029a
            r0.setContentDescription(r2)
            kotlin.Unit r2 = kotlin.Unit.f40552a
        L_0x029a:
            if (r1 == 0) goto L_0x02a3
            java.util.List r2 = r0.getText()
            r2.add(r1)
        L_0x02a3:
            r7.D0(r0)
            goto L_0x01ad
        L_0x02a8:
            int r1 = r7.B0(r9)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r54
            F0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ad
        L_0x02be:
            int r1 = r7.B0(r9)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r38)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r54
            F0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.B0(r9)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = r54
            F0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ad
        L_0x02e1:
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.d()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r0 == 0) goto L_0x0301
            int r0 = r7.B0(r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            kotlin.jvm.internal.Intrinsics.g(r1, r3)
            java.util.List r1 = (java.util.List) r1
            r3 = 2048(0x800, float:2.87E-42)
            r7.E0(r0, r3, r2, r1)
            goto L_0x01ad
        L_0x0301:
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.g()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            r2 = 100000(0x186a0, float:1.4013E-40)
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x044b
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r37.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.z()
            boolean r0 = r0.h(r1)
            if (r0 == 0) goto L_0x042d
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r25.b()
            androidx.compose.ui.text.AnnotatedString r0 = r7.h0(r0)
            if (r0 == 0) goto L_0x032b
            goto L_0x032c
        L_0x032b:
            r0 = r4
        L_0x032c:
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r37.w()
            androidx.compose.ui.text.AnnotatedString r1 = r7.h0(r1)
            if (r1 == 0) goto L_0x0337
            r4 = r1
        L_0x0337:
            java.lang.CharSequence r5 = r7.T0(r4, r2)
            int r1 = r0.length()
            int r2 = r4.length()
            int r3 = kotlin.ranges.RangesKt.j(r1, r2)
            r6 = 0
        L_0x0348:
            r28 = r10
            if (r6 >= r3) goto L_0x0361
            char r10 = r0.charAt(r6)
            r38 = r11
            char r11 = r4.charAt(r6)
            if (r10 == r11) goto L_0x035a
        L_0x0358:
            r10 = 1
            goto L_0x0364
        L_0x035a:
            r10 = 1
            int r6 = r6 + r10
            r10 = r28
            r11 = r38
            goto L_0x0348
        L_0x0361:
            r38 = r11
            goto L_0x0358
        L_0x0364:
            r39 = r12
            r11 = 0
        L_0x0367:
            int r12 = r3 - r6
            if (r11 >= r12) goto L_0x0380
            int r12 = r1 + -1
            int r12 = r12 - r11
            char r12 = r0.charAt(r12)
            int r27 = r2 + -1
            int r10 = r27 - r11
            char r10 = r4.charAt(r10)
            if (r12 == r10) goto L_0x037d
            goto L_0x0380
        L_0x037d:
            r10 = 1
            int r11 = r11 + r10
            goto L_0x0367
        L_0x0380:
            int r1 = r1 - r11
            int r1 = r1 - r6
            int r3 = r2 - r11
            int r3 = r3 - r6
            androidx.compose.ui.semantics.SemanticsConfiguration r4 = r25.b()
            androidx.compose.ui.semantics.SemanticsProperties r10 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            androidx.compose.ui.semantics.SemanticsPropertyKey r11 = r10.A()
            boolean r4 = r4.h(r11)
            androidx.compose.ui.semantics.SemanticsConfiguration r11 = r37.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r12 = r10.A()
            boolean r11 = r11.h(r12)
            androidx.compose.ui.semantics.SemanticsConfiguration r12 = r25.b()
            r40 = r15
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r10.g()
            boolean r12 = r12.h(r15)
            if (r12 == 0) goto L_0x03b5
            if (r4 != 0) goto L_0x03b5
            if (r11 == 0) goto L_0x03b5
            r15 = 1
            goto L_0x03b6
        L_0x03b5:
            r15 = 0
        L_0x03b6:
            if (r12 == 0) goto L_0x03be
            if (r4 == 0) goto L_0x03be
            if (r11 != 0) goto L_0x03be
            r11 = 1
            goto L_0x03bf
        L_0x03be:
            r11 = 0
        L_0x03bf:
            if (r15 != 0) goto L_0x03e2
            if (r11 == 0) goto L_0x03c4
            goto L_0x03e2
        L_0x03c4:
            int r2 = r7.B0(r9)
            r4 = 16
            android.view.accessibility.AccessibilityEvent r2 = r7.T(r2, r4)
            r2.setFromIndex(r6)
            r2.setRemovedCount(r1)
            r2.setAddedCount(r3)
            r2.setBeforeText(r0)
            java.util.List r0 = r2.getText()
            r0.add(r5)
            goto L_0x03fc
        L_0x03e2:
            int r1 = r7.B0(r9)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r0 = r54
            r2 = r3
            r3 = r4
            r4 = r6
            android.view.accessibility.AccessibilityEvent r2 = r0.V(r1, r2, r3, r4, r5)
        L_0x03fc:
            java.lang.String r0 = "android.widget.EditText"
            r2.setClassName(r0)
            r7.D0(r2)
            if (r15 != 0) goto L_0x0408
            if (r11 == 0) goto L_0x01b5
        L_0x0408:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r37.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r10.I()
            java.lang.Object r0 = r0.n(r1)
            androidx.compose.ui.text.TextRange r0 = (androidx.compose.ui.text.TextRange) r0
            long r0 = r0.r()
            int r3 = androidx.compose.ui.text.TextRange.n(r0)
            r2.setFromIndex(r3)
            int r0 = androidx.compose.ui.text.TextRange.i(r0)
            r2.setToIndex(r0)
            r7.D0(r2)
            goto L_0x01b5
        L_0x042d:
            r28 = r10
            r38 = r11
            r39 = r12
            r40 = r15
            int r1 = r7.B0(r9)
            r10 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r54
            F0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01b6
        L_0x044b:
            r28 = r10
            r38 = r11
            r39 = r12
            r40 = r15
            r10 = 2
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.I()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r0 == 0) goto L_0x04b9
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r37.w()
            androidx.compose.ui.text.AnnotatedString r0 = r7.h0(r0)
            if (r0 == 0) goto L_0x0470
            java.lang.String r0 = r0.k()
            if (r0 != 0) goto L_0x046f
            goto L_0x0470
        L_0x046f:
            r4 = r0
        L_0x0470:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r37.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r36.I()
            java.lang.Object r0 = r0.n(r1)
            androidx.compose.ui.text.TextRange r0 = (androidx.compose.ui.text.TextRange) r0
            long r0 = r0.r()
            int r3 = r7.B0(r9)
            int r5 = androidx.compose.ui.text.TextRange.n(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r0 = androidx.compose.ui.text.TextRange.i(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r0 = r4.length()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.CharSequence r12 = r7.T0(r4, r2)
            r0 = r54
            r1 = r3
            r2 = r5
            r3 = r6
            r4 = r11
            r5 = r12
            android.view.accessibility.AccessibilityEvent r0 = r0.V(r1, r2, r3, r4, r5)
            r7.D0(r0)
            int r0 = r37.o()
            r7.H0(r0)
            goto L_0x01b6
        L_0x04b9:
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.l()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r0 == 0) goto L_0x04c5
            r0 = 1
            goto L_0x04cd
        L_0x04c5:
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.M()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
        L_0x04cd:
            if (r0 == 0) goto L_0x0506
            androidx.compose.ui.node.LayoutNode r0 = r37.q()
            r7.o0(r0)
            java.util.List r0 = r7.O
            androidx.compose.ui.platform.ScrollObservationScope r0 = androidx.compose.ui.platform.SemanticsUtils_androidKt.a(r0, r9)
            kotlin.jvm.internal.Intrinsics.f(r0)
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r37.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r36.l()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r2)
            androidx.compose.ui.semantics.ScrollAxisRange r1 = (androidx.compose.ui.semantics.ScrollAxisRange) r1
            r0.f(r1)
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r37.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r36.M()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r2)
            androidx.compose.ui.semantics.ScrollAxisRange r1 = (androidx.compose.ui.semantics.ScrollAxisRange) r1
            r0.i(r1)
            r7.z0(r0)
            goto L_0x01b6
        L_0x0506:
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r36.i()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r0 == 0) goto L_0x054b
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.Intrinsics.g(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x052f
            int r0 = r37.o()
            int r0 = r7.B0(r0)
            r11 = 8
            android.view.accessibility.AccessibilityEvent r0 = r7.T(r0, r11)
            r7.D0(r0)
            goto L_0x0531
        L_0x052f:
            r11 = 8
        L_0x0531:
            int r0 = r37.o()
            int r1 = r7.B0(r0)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r54
            F0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x05ce
        L_0x054b:
            r11 = 8
            androidx.compose.ui.semantics.SemanticsActions r0 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r0.d()
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r3, r2)
            if (r2 == 0) goto L_0x05d1
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r37.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r0.d()
            java.lang.Object r1 = r1.n(r2)
            java.util.List r1 = (java.util.List) r1
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r25.b()
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.d()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r2, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x05c4
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
        L_0x0584:
            if (r4 >= r3) goto L_0x0596
            java.lang.Object r5 = r1.get(r4)
            androidx.compose.ui.semantics.CustomAccessibilityAction r5 = (androidx.compose.ui.semantics.CustomAccessibilityAction) r5
            java.lang.String r5 = r5.b()
            r2.add(r5)
            r5 = 1
            int r4 = r4 + r5
            goto L_0x0584
        L_0x0596:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
        L_0x05a3:
            if (r4 >= r3) goto L_0x05b5
            java.lang.Object r5 = r0.get(r4)
            androidx.compose.ui.semantics.CustomAccessibilityAction r5 = (androidx.compose.ui.semantics.CustomAccessibilityAction) r5
            java.lang.String r5 = r5.b()
            r1.add(r5)
            r5 = 1
            int r4 = r4 + r5
            goto L_0x05a3
        L_0x05b5:
            boolean r0 = r2.containsAll(r1)
            if (r0 == 0) goto L_0x05cc
            boolean r0 = r1.containsAll(r2)
            if (r0 != 0) goto L_0x05c2
            goto L_0x05cc
        L_0x05c2:
            r0 = 0
            goto L_0x05e6
        L_0x05c4:
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x05ce
        L_0x05cc:
            r0 = 1
            goto L_0x05e6
        L_0x05ce:
            r0 = r29
            goto L_0x05e6
        L_0x05d1:
            boolean r0 = r1 instanceof androidx.compose.ui.semantics.AccessibilityAction
            if (r0 == 0) goto L_0x05cc
            androidx.compose.ui.semantics.AccessibilityAction r1 = (androidx.compose.ui.semantics.AccessibilityAction) r1
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r25.b()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r3)
            boolean r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m(r1, r0)
            if (r0 != 0) goto L_0x05c2
            goto L_0x05cc
        L_0x05e6:
            r29 = r0
            goto L_0x0602
        L_0x05e9:
            r41 = r0
            r44 = r5
            r8 = r6
            r28 = r10
            r38 = r11
            r39 = r12
            r40 = r15
            r43 = r30
            r37 = r32
            r10 = 2
            r11 = 8
            r30 = r4
        L_0x05ff:
            r32 = r9
            r9 = r2
        L_0x0602:
            long r34 = r34 >> r11
            r0 = 1
            int r4 = r30 + 1
            r6 = r8
            r2 = r9
            r10 = r28
            r9 = r32
            r32 = r37
            r11 = r38
            r12 = r39
            r15 = r40
            r0 = r41
            r30 = r43
            r5 = r44
            r8 = r55
            goto L_0x00a4
        L_0x061f:
            r44 = r5
            r8 = r6
            r28 = r10
            r38 = r11
            r39 = r12
            r40 = r15
            r43 = r30
            r37 = r32
            r10 = 2
            r11 = 8
            r5 = r0
            r32 = r9
            r0 = 1
            r9 = r2
            if (r5 != r11) goto L_0x067b
            r5 = r44
            goto L_0x064f
        L_0x063b:
            r8 = r6
            r28 = r10
            r38 = r11
            r39 = r12
            r40 = r15
            r43 = r30
            r37 = r32
            r0 = 1
            r10 = 2
            r11 = 8
            r32 = r9
            r9 = r2
        L_0x064f:
            if (r13 == r5) goto L_0x067b
            int r13 = r13 + r0
            r6 = r8
            r2 = r9
            r10 = r28
            r9 = r32
            r0 = r33
            r1 = r37
            r11 = r38
            r12 = r39
            r15 = r40
            r30 = r43
            r8 = r55
            goto L_0x0088
        L_0x0668:
            r37 = r1
            r9 = r2
            r31 = r3
            r43 = r4
            r8 = r6
            r28 = r10
            r38 = r11
            r39 = r12
            r10 = r13
            r11 = 8
            r29 = 0
        L_0x067b:
            if (r29 != 0) goto L_0x0687
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r25.b()
            r1 = r37
            boolean r29 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.y(r1, r0)
        L_0x0687:
            if (r29 == 0) goto L_0x069e
            int r1 = r7.B0(r9)
            r9 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r54
            F0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x06b9
        L_0x069e:
            r9 = 0
            goto L_0x06b9
        L_0x06a0:
            java.lang.String r0 = "no value for specified key"
            androidx.compose.ui.internal.InlineClassHelperKt.d(r0)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x06ab:
            r31 = r3
            r43 = r4
            r8 = r6
            r28 = r10
            r38 = r11
            r39 = r12
            r10 = r13
            r9 = 0
            r11 = r5
        L_0x06b9:
            long r19 = r19 >> r11
            r0 = 1
            int r3 = r31 + 1
            r6 = r8
            r13 = r10
            r5 = r11
            r10 = r28
            r11 = r38
            r12 = r39
            r4 = r43
            r8 = r55
            goto L_0x003c
        L_0x06cd:
            r8 = r6
            r28 = r10
            r38 = r11
            r39 = r12
            r10 = r13
            r0 = 1
            r9 = 0
            r11 = r5
            r5 = r4
            if (r5 != r11) goto L_0x06f5
            goto L_0x06e6
        L_0x06dc:
            r8 = r6
            r28 = r10
            r38 = r11
            r39 = r12
            r10 = r13
            r0 = 1
            r9 = 0
        L_0x06e6:
            if (r8 == r14) goto L_0x06f5
            int r6 = r8 + 1
            r8 = r55
            r13 = r10
            r10 = r28
            r11 = r38
            r12 = r39
            goto L_0x001d
        L_0x06f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.I0(androidx.collection.IntObjectMap):void");
    }

    public final void J0(LayoutNode layoutNode, MutableIntSet mutableIntSet) {
        SemanticsConfiguration a0;
        LayoutNode e2;
        if (layoutNode.b() && !this.f17532d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.u0().p(NodeKind.a(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.f17570z);
            }
            if (layoutNode != null && (a0 = layoutNode.a0()) != null) {
                if (!a0.u() && (e2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.f17569z)) != null) {
                    layoutNode = e2;
                }
                int v2 = layoutNode.v();
                if (mutableIntSet.g(v2)) {
                    F0(this, B0(v2), 2048, 1, (List) null, 8, (Object) null);
                }
            }
        }
    }

    public final void K0(LayoutNode layoutNode) {
        if (layoutNode.b() && !this.f17532d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int v2 = layoutNode.v();
            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) this.f17548t.b(v2);
            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) this.f17549u.b(v2);
            if (scrollAxisRange != null || scrollAxisRange2 != null) {
                AccessibilityEvent T = T(v2, 4096);
                if (scrollAxisRange != null) {
                    T.setScrollX((int) ((Number) scrollAxisRange.c().invoke()).floatValue());
                    T.setMaxScrollX((int) ((Number) scrollAxisRange.a().invoke()).floatValue());
                }
                if (scrollAxisRange2 != null) {
                    T.setScrollY((int) ((Number) scrollAxisRange2.c().invoke()).floatValue());
                    T.setMaxScrollY((int) ((Number) scrollAxisRange2.a().invoke()).floatValue());
                }
                D0(T);
            }
        }
    }

    public final boolean L0(SemanticsNode semanticsNode, int i2, int i3, boolean z2) {
        String f0;
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsActions semanticsActions = SemanticsActions.f18056a;
        boolean z3 = false;
        if (w2.h(semanticsActions.y()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode)) {
            Function3 function3 = (Function3) ((AccessibilityAction) semanticsNode.w().n(semanticsActions.y())).a();
            if (function3 != null) {
                return ((Boolean) function3.d(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
            }
            return false;
        } else if ((i2 == i3 && i3 == this.f17552x) || (f0 = f0(semanticsNode)) == null) {
            return false;
        } else {
            if (i2 < 0 || i2 != i3 || i3 > f0.length()) {
                i2 = -1;
            }
            this.f17552x = i2;
            if (f0.length() > 0) {
                z3 = true;
            }
            int B0 = B0(semanticsNode.o());
            Integer num = null;
            Integer valueOf = z3 ? Integer.valueOf(this.f17552x) : null;
            Integer valueOf2 = z3 ? Integer.valueOf(this.f17552x) : null;
            if (z3) {
                num = Integer.valueOf(f0.length());
            }
            D0(V(B0, valueOf, valueOf2, num, f0));
            H0(semanticsNode.o());
            return true;
        }
    }

    public final void M(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        SemanticsNode b2;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) a0().b(i2);
        if (semanticsNodeWithAdjustedBounds != null && (b2 = semanticsNodeWithAdjustedBounds.b()) != null) {
            String f0 = f0(b2);
            if (Intrinsics.d(str, this.H)) {
                int e2 = this.F.e(i2, -1);
                if (e2 != -1) {
                    accessibilityNodeInfoCompat.t().putInt(str, e2);
                }
            } else if (Intrinsics.d(str, this.I)) {
                int e3 = this.G.e(i2, -1);
                if (e3 != -1) {
                    accessibilityNodeInfoCompat.t().putInt(str, e3);
                }
            } else if (!b2.w().h(SemanticsActions.f18056a.i()) || bundle == null || !Intrinsics.d(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                SemanticsConfiguration w2 = b2.w();
                SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
                if (w2.h(semanticsProperties.G()) && bundle != null && Intrinsics.d(str, "androidx.compose.ui.semantics.testTag")) {
                    String str2 = (String) SemanticsConfigurationKt.a(b2.w(), semanticsProperties.G());
                    if (str2 != null) {
                        accessibilityNodeInfoCompat.t().putCharSequence(str, str2);
                    }
                } else if (Intrinsics.d(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfoCompat.t().putInt(str, b2.o());
                }
            } else {
                int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i4 > 0 && i3 >= 0) {
                    if (i3 < (f0 != null ? f0.length() : Integer.MAX_VALUE)) {
                        TextLayoutResult e4 = SemanticsUtils_androidKt.e(b2.w());
                        if (e4 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i5 = 0; i5 < i4; i5++) {
                                int i6 = i3 + i5;
                                if (i6 >= e4.l().j().length()) {
                                    arrayList.add((Object) null);
                                } else {
                                    arrayList.add(P0(b2, e4.d(i6)));
                                }
                            }
                            accessibilityNodeInfoCompat.t().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            }
        }
    }

    public final void M0(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        if (w2.h(semanticsProperties.h())) {
            accessibilityNodeInfoCompat.n0(true);
            accessibilityNodeInfoCompat.q0((CharSequence) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties.h()));
        }
    }

    public final Rect N(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        Rect a2 = semanticsNodeWithAdjustedBounds.a();
        AndroidComposeView androidComposeView = this.f17532d;
        long floatToRawIntBits = (long) Float.floatToRawIntBits((float) a2.left);
        long f2 = androidComposeView.f(Offset.e((((long) Float.floatToRawIntBits((float) a2.top)) & 4294967295L) | (floatToRawIntBits << 32)));
        long f3 = this.f17532d.f(Offset.e((((long) Float.floatToRawIntBits((float) a2.right)) << 32) | (((long) Float.floatToRawIntBits((float) a2.bottom)) & 4294967295L)));
        return new Rect((int) ((float) Math.floor((double) Float.intBitsToFloat((int) (f2 >> 32)))), (int) ((float) Math.floor((double) Float.intBitsToFloat((int) (f2 & 4294967295L)))), (int) ((float) Math.ceil((double) Float.intBitsToFloat((int) (f3 >> 32)))), (int) ((float) Math.ceil((double) Float.intBitsToFloat((int) (f3 & 4294967295L)))));
    }

    public final void N0(long j2) {
        this.f17537i = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073 A[Catch:{ all -> 0x003a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x0045
            if (r2 != r4) goto L_0x003d
            java.lang.Object r2 = r0.E
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r0.D
            androidx.collection.MutableIntSet r6 = (androidx.collection.MutableIntSet) r6
            java.lang.Object r7 = r0.C
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r7 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r7
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x003a }
        L_0x0038:
            r12 = r6
            goto L_0x0065
        L_0x003a:
            r12 = move-exception
            goto L_0x00dc
        L_0x003d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0045:
            java.lang.Object r2 = r0.E
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r0.D
            androidx.collection.MutableIntSet r6 = (androidx.collection.MutableIntSet) r6
            java.lang.Object r7 = r0.C
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r7 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r7
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x003a }
            goto L_0x0077
        L_0x0055:
            kotlin.ResultKt.b(r12)
            androidx.collection.MutableIntSet r12 = new androidx.collection.MutableIntSet     // Catch:{ all -> 0x00da }
            r2 = 0
            r12.<init>(r3, r5, r2)     // Catch:{ all -> 0x00da }
            kotlinx.coroutines.channels.Channel r2 = r11.f17530A     // Catch:{ all -> 0x00da }
            kotlinx.coroutines.channels.ChannelIterator r2 = r2.iterator()     // Catch:{ all -> 0x00da }
            r7 = r11
        L_0x0065:
            r0.C = r7     // Catch:{ all -> 0x003a }
            r0.D = r12     // Catch:{ all -> 0x003a }
            r0.E = r2     // Catch:{ all -> 0x003a }
            r0.H = r5     // Catch:{ all -> 0x003a }
            java.lang.Object r6 = r2.a(r0)     // Catch:{ all -> 0x003a }
            if (r6 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r10 = r6
            r6 = r12
            r12 = r10
        L_0x0077:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x003a }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x003a }
            if (r12 == 0) goto L_0x00d2
            r2.next()     // Catch:{ all -> 0x003a }
            boolean r12 = r7.m0()     // Catch:{ all -> 0x003a }
            if (r12 == 0) goto L_0x00b2
            androidx.collection.ArraySet r12 = r7.f17554z     // Catch:{ all -> 0x003a }
            int r12 = r12.size()     // Catch:{ all -> 0x003a }
            r8 = r3
        L_0x008f:
            if (r8 >= r12) goto L_0x00a2
            androidx.collection.ArraySet r9 = r7.f17554z     // Catch:{ all -> 0x003a }
            java.lang.Object r9 = r9.s(r8)     // Catch:{ all -> 0x003a }
            androidx.compose.ui.node.LayoutNode r9 = (androidx.compose.ui.node.LayoutNode) r9     // Catch:{ all -> 0x003a }
            r7.J0(r9, r6)     // Catch:{ all -> 0x003a }
            r7.K0(r9)     // Catch:{ all -> 0x003a }
            int r8 = r8 + 1
            goto L_0x008f
        L_0x00a2:
            r6.i()     // Catch:{ all -> 0x003a }
            boolean r12 = r7.M     // Catch:{ all -> 0x003a }
            if (r12 != 0) goto L_0x00b2
            r7.M = r5     // Catch:{ all -> 0x003a }
            android.os.Handler r12 = r7.f17541m     // Catch:{ all -> 0x003a }
            java.lang.Runnable r8 = r7.N     // Catch:{ all -> 0x003a }
            r12.post(r8)     // Catch:{ all -> 0x003a }
        L_0x00b2:
            androidx.collection.ArraySet r12 = r7.f17554z     // Catch:{ all -> 0x003a }
            r12.clear()     // Catch:{ all -> 0x003a }
            androidx.collection.MutableIntObjectMap r12 = r7.f17548t     // Catch:{ all -> 0x003a }
            r12.g()     // Catch:{ all -> 0x003a }
            androidx.collection.MutableIntObjectMap r12 = r7.f17549u     // Catch:{ all -> 0x003a }
            r12.g()     // Catch:{ all -> 0x003a }
            long r8 = r7.f17537i     // Catch:{ all -> 0x003a }
            r0.C = r7     // Catch:{ all -> 0x003a }
            r0.D = r6     // Catch:{ all -> 0x003a }
            r0.E = r2     // Catch:{ all -> 0x003a }
            r0.H = r4     // Catch:{ all -> 0x003a }
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r8, r0)     // Catch:{ all -> 0x003a }
            if (r12 != r1) goto L_0x0038
            return r1
        L_0x00d2:
            androidx.collection.ArraySet r12 = r7.f17554z
            r12.clear()
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        L_0x00da:
            r12 = move-exception
            r7 = r11
        L_0x00dc:
            androidx.collection.ArraySet r0 = r7.f17554z
            r0.clear()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.O(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void O0(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AnnotatedString h2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.u(semanticsNode);
        accessibilityNodeInfoCompat.M0(h2 != null ? Q0(h2) : null);
    }

    public final boolean P(boolean z2, int i2, long j2) {
        if (!Intrinsics.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        return Q(a0(), z2, i2, j2);
    }

    public final RectF P0(SemanticsNode semanticsNode, androidx.compose.ui.geometry.Rect rect) {
        if (semanticsNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect B2 = rect.B(semanticsNode.s());
        androidx.compose.ui.geometry.Rect i2 = semanticsNode.i();
        androidx.compose.ui.geometry.Rect x2 = B2.z(i2) ? B2.x(i2) : null;
        if (x2 == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.f17532d;
        float o2 = x2.o();
        long f2 = androidComposeView.f(Offset.e((((long) Float.floatToRawIntBits(x2.r())) & 4294967295L) | (((long) Float.floatToRawIntBits(o2)) << 32)));
        long f3 = this.f17532d.f(Offset.e((((long) Float.floatToRawIntBits(x2.p())) << 32) | (((long) Float.floatToRawIntBits(x2.i())) & 4294967295L)));
        return new RectF(Float.intBitsToFloat((int) (f2 >> 32)), Float.intBitsToFloat((int) (f2 & 4294967295L)), Float.intBitsToFloat((int) (f3 >> 32)), Float.intBitsToFloat((int) (f3 & 4294967295L)));
    }

    public final boolean Q(IntObjectMap intObjectMap, boolean z2, int i2, long j2) {
        SemanticsPropertyKey semanticsPropertyKey;
        boolean z3;
        ScrollAxisRange scrollAxisRange;
        IntObjectMap intObjectMap2 = intObjectMap;
        boolean z4 = z2;
        int i3 = i2;
        long j3 = j2;
        if (Offset.j(j3, Offset.f15855b.b()) || (((9223372034707292159L & j3) + 36028792732385279L) & -9223372034707292160L) != 0) {
            return false;
        }
        if (z4) {
            semanticsPropertyKey = SemanticsProperties.f18102a.M();
        } else if (!z4) {
            semanticsPropertyKey = SemanticsProperties.f18102a.l();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Object[] objArr = intObjectMap2.f1794c;
        long[] jArr = intObjectMap2.f1792a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            boolean z5 = false;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & 255) < 128) {
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) objArr[(i4 << 3) + i6];
                            if (RectHelper_androidKt.e(semanticsNodeWithAdjustedBounds.a()).f(j3) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNodeWithAdjustedBounds.b().w(), semanticsPropertyKey)) != null) {
                                int i7 = scrollAxisRange.b() ? -i3 : i3;
                                if (i3 == 0 && scrollAxisRange.b()) {
                                    i7 = -1;
                                }
                                if (i7 < 0) {
                                    if (((Number) scrollAxisRange.c().invoke()).floatValue() <= 0.0f) {
                                    }
                                } else if (((Number) scrollAxisRange.c().invoke()).floatValue() >= ((Number) scrollAxisRange.a().invoke()).floatValue()) {
                                }
                                z5 = true;
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        return z5;
                    }
                }
                if (i4 == length) {
                    z3 = z5;
                    break;
                }
                i4++;
            }
        } else {
            z3 = false;
        }
        return z3;
    }

    public final SpannableString Q0(AnnotatedString annotatedString) {
        return (SpannableString) T0(AndroidAccessibilitySpannableString_androidKt.b(annotatedString, this.f17532d.getDensity(), this.f17532d.getFontFamilyResolver(), this.J), 100000);
    }

    /* JADX INFO: finally extract failed */
    public final void R() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m0()) {
                C0(this.f17532d.getSemanticsOwner().d(), this.L);
            }
            Unit unit = Unit.f40552a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                I0(a0());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    V0();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean S(int i2) {
        if (!k0(i2)) {
            return false;
        }
        this.f17543o = Integer.MIN_VALUE;
        this.f17545q = null;
        this.f17532d.invalidate();
        F0(this, i2, 65536, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    public final boolean S0(SemanticsNode semanticsNode, int i2, boolean z2, boolean z3) {
        int i3;
        int i4;
        int o2 = semanticsNode.o();
        Integer num = this.f17553y;
        if (num == null || o2 != num.intValue()) {
            this.f17552x = -1;
            this.f17553y = Integer.valueOf(semanticsNode.o());
        }
        String f0 = f0(semanticsNode);
        boolean z4 = false;
        if (!(f0 == null || f0.length() == 0)) {
            AccessibilityIterators.TextSegmentIterator g0 = g0(semanticsNode, i2);
            if (g0 == null) {
                return false;
            }
            int Y = Y(semanticsNode);
            if (Y == -1) {
                Y = z2 ? 0 : f0.length();
            }
            int[] a2 = z2 ? g0.a(Y) : g0.b(Y);
            if (a2 == null) {
                return false;
            }
            int i5 = a2[0];
            z4 = true;
            int i6 = a2[1];
            if (!z3 || !l0(semanticsNode)) {
                i3 = z2 ? i6 : i5;
                i4 = i3;
            } else {
                i3 = Z(semanticsNode);
                if (i3 == -1) {
                    i3 = z2 ? i5 : i6;
                }
                i4 = z2 ? i6 : i5;
            }
            this.C = new PendingTextTraversedEvent(semanticsNode, z2 ? 256 : 512, i2, i5, i6, SystemClock.uptimeMillis());
            L0(semanticsNode, i3, i4, true);
        }
        return z4;
    }

    public final AccessibilityEvent T(int i2, int i3) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f17532d.getContext().getPackageName());
        obtain.setSource(this.f17532d, i2);
        if (m0() && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) a0().b(i2)) != null) {
            obtain.setPassword(semanticsNodeWithAdjustedBounds.b().w().h(SemanticsProperties.f18102a.A()));
        }
        return obtain;
    }

    public final CharSequence T0(CharSequence charSequence, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        } else if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i2) {
            return charSequence;
        } else {
            int i3 = i2 - 1;
            if (Character.isHighSurrogate(charSequence.charAt(i3)) && Character.isLowSurrogate(charSequence.charAt(i2))) {
                i2 = i3;
            }
            CharSequence subSequence = charSequence.subSequence(0, i2);
            Intrinsics.g(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
            return subSequence;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = (r0 = r0.a()).a();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat U(int r7) {
        /*
            r6 = this;
            androidx.compose.ui.platform.AndroidComposeView r0 = r6.f17532d
            androidx.compose.ui.platform.AndroidComposeView$ViewTreeOwners r0 = r0.getViewTreeOwners()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.LifecycleOwner r0 = r0.a()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle r0 = r0.a()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle$State r0 = r0.b()
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r2) goto L_0x0020
            return r1
        L_0x0020:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.U()
            androidx.collection.IntObjectMap r2 = r6.a0()
            java.lang.Object r2 = r2.b(r7)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r2 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r2
            if (r2 != 0) goto L_0x0031
            return r1
        L_0x0031:
            androidx.compose.ui.semantics.SemanticsNode r3 = r2.b()
            r4 = -1
            if (r7 != r4) goto L_0x0049
            androidx.compose.ui.platform.AndroidComposeView r4 = r6.f17532d
            android.view.ViewParent r4 = r4.getParentForAccessibility()
            boolean r5 = r4 instanceof android.view.View
            if (r5 == 0) goto L_0x0045
            r1 = r4
            android.view.View r1 = (android.view.View) r1
        L_0x0045:
            r0.B0(r1)
            goto L_0x0074
        L_0x0049:
            androidx.compose.ui.semantics.SemanticsNode r5 = r3.r()
            if (r5 == 0) goto L_0x0057
            int r1 = r5.o()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0057:
            if (r1 == 0) goto L_0x0084
            int r1 = r1.intValue()
            androidx.compose.ui.platform.AndroidComposeView r5 = r6.f17532d
            androidx.compose.ui.semantics.SemanticsOwner r5 = r5.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r5 = r5.d()
            int r5 = r5.o()
            if (r1 != r5) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = r1
        L_0x006f:
            androidx.compose.ui.platform.AndroidComposeView r1 = r6.f17532d
            r0.C0(r1, r4)
        L_0x0074:
            androidx.compose.ui.platform.AndroidComposeView r1 = r6.f17532d
            r0.K0(r1, r7)
            android.graphics.Rect r1 = r6.N(r2)
            r0.e0(r1)
            r6.u0(r7, r0, r3)
            return r0
        L_0x0084:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "semanticsNode "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = " has null parent"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            androidx.compose.ui.internal.InlineClassHelperKt.d(r7)
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.U(int):androidx.core.view.accessibility.AccessibilityNodeInfoCompat");
    }

    public final void U0(int i2) {
        int i3 = this.f17533e;
        if (i3 != i2) {
            this.f17533e = i2;
            F0(this, i2, 128, (Integer) null, (List) null, 12, (Object) null);
            F0(this, i3, 256, (Integer) null, (List) null, 12, (Object) null);
        }
    }

    public final AccessibilityEvent V(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent T = T(i2, 8192);
        if (num != null) {
            T.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            T.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            T.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            T.getText().add(charSequence);
        }
        return T;
    }

    public final void V0() {
        SemanticsConfiguration b2;
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, (DefaultConstructorMarker) null);
        MutableIntSet mutableIntSet2 = this.E;
        int[] iArr = mutableIntSet2.f1799b;
        long[] jArr = mutableIntSet2.f1798a;
        int length = jArr.length - 2;
        long j2 = 128;
        long j3 = 255;
        char c2 = 7;
        long j4 = -9187201950435737472L;
        if (length >= 0) {
            int i2 = 0;
            int[] iArr2 = iArr;
            while (true) {
                long j5 = jArr[i2];
                long[] jArr2 = jArr;
                if ((((~j5) << 7) & j5 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j5 & j3) < j2) {
                            int i5 = iArr2[(i2 << 3) + i4];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) a0().b(i5);
                            SemanticsNode b3 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.b() : null;
                            if (b3 == null || !b3.w().h(SemanticsProperties.f18102a.z())) {
                                mutableIntSet.g(i5);
                                SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) this.K.b(i5);
                                G0(i5, 32, (semanticsNodeCopy == null || (b2 = semanticsNodeCopy.b()) == null) ? null : (String) SemanticsConfigurationKt.a(b2, SemanticsProperties.f18102a.z()));
                            }
                        }
                        j5 >>= 8;
                        i4++;
                        j2 = 128;
                        j3 = 255;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr = jArr2;
                j2 = 128;
                j3 = 255;
            }
        }
        this.E.s(mutableIntSet);
        this.K.g();
        IntObjectMap a0 = a0();
        int[] iArr3 = a0.f1793b;
        Object[] objArr = a0.f1794c;
        long[] jArr3 = a0.f1792a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr3[i6];
                if ((((~j6) << c2) & j6 & j4) != j4) {
                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((j6 & 255) < 128) {
                            int i9 = (i6 << 3) + i8;
                            int i10 = iArr3[i9];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) objArr[i9];
                            SemanticsConfiguration w2 = semanticsNodeWithAdjustedBounds2.b().w();
                            SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
                            if (w2.h(semanticsProperties.z()) && this.E.g(i10)) {
                                G0(i10, 16, (String) semanticsNodeWithAdjustedBounds2.b().w().n(semanticsProperties.z()));
                            }
                            this.K.r(i10, new SemanticsNodeCopy(semanticsNodeWithAdjustedBounds2.b(), a0()));
                        }
                        j6 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length2) {
                    break;
                }
                i6++;
                c2 = 7;
                j4 = -9187201950435737472L;
            }
        }
        this.L = new SemanticsNodeCopy(this.f17532d.getSemanticsOwner().d(), a0());
    }

    public final boolean W(MotionEvent motionEvent) {
        if (!n0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int j0 = j0(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.f17532d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            U0(j0);
            if (j0 == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        } else if (action != 10) {
            return false;
        } else {
            if (this.f17533e == Integer.MIN_VALUE) {
                return this.f17532d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            }
            U0(Integer.MIN_VALUE);
            return true;
        }
    }

    public final int Y(SemanticsNode semanticsNode) {
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        return (w2.h(semanticsProperties.d()) || !semanticsNode.w().h(semanticsProperties.I())) ? this.f17552x : TextRange.i(((TextRange) semanticsNode.w().n(semanticsProperties.I())).r());
    }

    public final int Z(SemanticsNode semanticsNode) {
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        return (w2.h(semanticsProperties.d()) || !semanticsNode.w().h(semanticsProperties.I())) ? this.f17552x : TextRange.n(((TextRange) semanticsNode.w().n(semanticsProperties.I())).r());
    }

    public final IntObjectMap a0() {
        if (this.f17531B) {
            this.f17531B = false;
            this.D = SemanticsUtils_androidKt.b(this.f17532d.getSemanticsOwner());
            if (m0()) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.z(this.D, this.F, this.G, this.f17532d.getContext().getResources());
            }
        }
        return this.D;
    }

    public AccessibilityNodeProviderCompat b(View view) {
        return this.f17542n;
    }

    public final String b0() {
        return this.I;
    }

    public final String c0() {
        return this.H;
    }

    public final MutableIntIntMap d0() {
        return this.G;
    }

    public final MutableIntIntMap e0() {
        return this.F;
    }

    public final String f0(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        if (w2.h(semanticsProperties.d())) {
            return ListUtilsKt.e((List) semanticsNode.w().n(semanticsProperties.d()), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
        if (semanticsNode.w().h(semanticsProperties.g())) {
            AnnotatedString h0 = h0(semanticsNode.w());
            if (h0 != null) {
                return h0.k();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties.H());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.g0(list)) == null) {
            return null;
        }
        return annotatedString.k();
    }

    public final AccessibilityIterators.TextSegmentIterator g0(SemanticsNode semanticsNode, int i2) {
        String f0;
        TextLayoutResult e2;
        if (semanticsNode == null || (f0 = f0(semanticsNode)) == null || f0.length() == 0) {
            return null;
        }
        if (i2 == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator a2 = AccessibilityIterators.CharacterTextSegmentIterator.f17465d.a(this.f17532d.getContext().getResources().getConfiguration().locale);
            a2.e(f0);
            return a2;
        } else if (i2 != 2) {
            if (i2 != 4) {
                if (i2 == 8) {
                    AccessibilityIterators.ParagraphTextSegmentIterator a3 = AccessibilityIterators.ParagraphTextSegmentIterator.f17483c.a();
                    a3.e(f0);
                    return a3;
                } else if (i2 != 16) {
                    return null;
                }
            }
            if (!semanticsNode.w().h(SemanticsActions.f18056a.i()) || (e2 = SemanticsUtils_androidKt.e(semanticsNode.w())) == null) {
                return null;
            }
            if (i2 == 4) {
                AccessibilityIterators.LineTextSegmentIterator a4 = AccessibilityIterators.LineTextSegmentIterator.f17469d.a();
                a4.j(f0, e2);
                return a4;
            }
            AccessibilityIterators.PageTextSegmentIterator a5 = AccessibilityIterators.PageTextSegmentIterator.f17475f.a();
            a5.j(f0, e2, semanticsNode);
            return a5;
        } else {
            AccessibilityIterators.WordTextSegmentIterator a6 = AccessibilityIterators.WordTextSegmentIterator.f17485d.a(this.f17532d.getContext().getResources().getConfiguration().locale);
            a6.e(f0);
            return a6;
        }
    }

    public final AnnotatedString h0(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.f18102a.g());
    }

    public final AndroidComposeView i0() {
        return this.f17532d;
    }

    public final int j0(float f2, float f3) {
        int i2;
        Owner.d(this.f17532d, false, 1, (Object) null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.N0(this.f17532d.getRoot(), Offset.e((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32)), hitTestResult, 0, false, 12, (Object) null);
        int o2 = CollectionsKt.o(hitTestResult);
        while (true) {
            i2 = Integer.MIN_VALUE;
            if (-1 >= o2) {
                break;
            }
            LayoutNode o3 = DelegatableNodeKt.o(hitTestResult.get(o2));
            if (this.f17532d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(o3) != null) {
                return Integer.MIN_VALUE;
            }
            if (o3.u0().p(NodeKind.a(8))) {
                i2 = B0(o3.v());
                SemanticsNode a2 = SemanticsNodeKt.a(o3, false);
                if (SemanticsUtils_androidKt.g(a2) && !a2.n().h(SemanticsProperties.f18102a.w())) {
                    break;
                }
            }
            o2--;
        }
        return i2;
    }

    public final boolean k0(int i2) {
        return this.f17543o == i2;
    }

    public final boolean l0(SemanticsNode semanticsNode) {
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        return !w2.h(semanticsProperties.d()) && semanticsNode.w().h(semanticsProperties.g());
    }

    public final boolean m0() {
        return this.f17536h || (this.f17535g.isEnabled() && !this.f17540l.isEmpty());
    }

    public final boolean n0() {
        return this.f17536h || (this.f17535g.isEnabled() && this.f17535g.isTouchExplorationEnabled());
    }

    public final void o0(LayoutNode layoutNode) {
        if (this.f17554z.add(layoutNode)) {
            this.f17530A.L(Unit.f40552a);
        }
    }

    public final void p0(LayoutNode layoutNode) {
        this.f17531B = true;
        if (m0()) {
            o0(layoutNode);
        }
    }

    public final void q0() {
        this.f17531B = true;
        if (m0() && !this.M) {
            this.M = true;
            this.f17541m.post(this.N);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r0(int r17, int r18, android.os.Bundle r19) {
        /*
            r16 = this;
            r7 = r16
            r1 = r17
            r0 = r18
            r2 = r19
            androidx.collection.IntObjectMap r3 = r16.a0()
            java.lang.Object r3 = r3.b(r1)
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r3 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r3
            r8 = 0
            if (r3 == 0) goto L_0x001b
            androidx.compose.ui.semantics.SemanticsNode r3 = r3.b()
            if (r3 != 0) goto L_0x001e
        L_0x001b:
            r0 = r8
            goto L_0x070c
        L_0x001e:
            r4 = 64
            if (r0 == r4) goto L_0x0708
            r4 = 128(0x80, float:1.794E-43)
            if (r0 == r4) goto L_0x0703
            r4 = 256(0x100, float:3.59E-43)
            r5 = 1
            if (r0 == r4) goto L_0x06e9
            r6 = 512(0x200, float:7.175E-43)
            if (r0 == r6) goto L_0x06e9
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r0 == r4) goto L_0x06c2
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r0 == r4) goto L_0x0694
            boolean r4 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(r3)
            if (r4 != 0) goto L_0x003e
            return r8
        L_0x003e:
            if (r0 == r5) goto L_0x066d
            r4 = 2
            if (r0 == r4) goto L_0x0643
            r6 = 0
            switch(r0) {
                case 16: goto L_0x060b;
                case 32: goto L_0x05e4;
                case 4096: goto L_0x0376;
                case 8192: goto L_0x0376;
                case 32768: goto L_0x0351;
                case 65536: goto L_0x032c;
                case 262144: goto L_0x0307;
                case 524288: goto L_0x02e2;
                case 1048576: goto L_0x02bd;
                case 2097152: goto L_0x0285;
                case 16908342: goto L_0x0191;
                case 16908349: goto L_0x0159;
                case 16908372: goto L_0x0134;
                default: goto L_0x0047;
            }
        L_0x0047:
            switch(r0) {
                case 16908344: goto L_0x0376;
                case 16908345: goto L_0x0376;
                case 16908346: goto L_0x0376;
                case 16908347: goto L_0x0376;
                default: goto L_0x004a;
            }
        L_0x004a:
            switch(r0) {
                case 16908358: goto L_0x010f;
                case 16908359: goto L_0x00ea;
                case 16908360: goto L_0x00c5;
                case 16908361: goto L_0x00a0;
                default: goto L_0x004d;
            }
        L_0x004d:
            androidx.collection.SparseArrayCompat r2 = r7.f17550v
            java.lang.Object r1 = r2.g(r1)
            androidx.collection.SparseArrayCompat r1 = (androidx.collection.SparseArrayCompat) r1
            if (r1 == 0) goto L_0x009f
            java.lang.Object r0 = r1.g(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 != 0) goto L_0x0060
            goto L_0x009f
        L_0x0060:
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r2 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.d()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0073
            return r8
        L_0x0073:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r3 = r8
        L_0x007b:
            if (r3 >= r2) goto L_0x009f
            java.lang.Object r4 = r1.get(r3)
            androidx.compose.ui.semantics.CustomAccessibilityAction r4 = (androidx.compose.ui.semantics.CustomAccessibilityAction) r4
            java.lang.String r5 = r4.b()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r0)
            if (r5 == 0) goto L_0x009c
            kotlin.jvm.functions.Function0 r0 = r4.a()
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x009c:
            int r3 = r3 + 1
            goto L_0x007b
        L_0x009f:
            return r8
        L_0x00a0:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.q()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x00c4
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x00c4:
            return r8
        L_0x00c5:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.p()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x00e9
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x00e9:
            return r8
        L_0x00ea:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.o()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x010e
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x010e:
            return r8
        L_0x010f:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.r()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x0133
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0133:
            return r8
        L_0x0134:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.m()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x0158
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x0158
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0158:
            return r8
        L_0x0159:
            if (r2 == 0) goto L_0x0190
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r1 = r2.containsKey(r0)
            if (r1 != 0) goto L_0x0164
            goto L_0x0190
        L_0x0164:
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r3 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.x()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r3)
            androidx.compose.ui.semantics.AccessibilityAction r1 = (androidx.compose.ui.semantics.AccessibilityAction) r1
            if (r1 == 0) goto L_0x0190
            kotlin.Function r1 = r1.a()
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            if (r1 == 0) goto L_0x0190
            float r0 = r2.getFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0190:
            return r8
        L_0x0191:
            androidx.compose.ui.semantics.SemanticsNode r0 = r3.r()
            if (r0 == 0) goto L_0x01aa
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r0.w()
            if (r1 == 0) goto L_0x01aa
            androidx.compose.ui.semantics.SemanticsActions r2 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.u()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r2)
            androidx.compose.ui.semantics.AccessibilityAction r1 = (androidx.compose.ui.semantics.AccessibilityAction) r1
            goto L_0x01ab
        L_0x01aa:
            r1 = r6
        L_0x01ab:
            if (r0 == 0) goto L_0x01c9
            if (r1 == 0) goto L_0x01b0
            goto L_0x01c9
        L_0x01b0:
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.r()
            if (r0 == 0) goto L_0x01aa
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r0.w()
            if (r1 == 0) goto L_0x01aa
            androidx.compose.ui.semantics.SemanticsActions r2 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.u()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r2)
            androidx.compose.ui.semantics.AccessibilityAction r1 = (androidx.compose.ui.semantics.AccessibilityAction) r1
            goto L_0x01ab
        L_0x01c9:
            if (r0 != 0) goto L_0x01cc
            return r8
        L_0x01cc:
            androidx.compose.ui.layout.LayoutInfo r2 = r0.p()
            androidx.compose.ui.layout.LayoutCoordinates r2 = r2.w()
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinatesKt.a(r2)
            androidx.compose.ui.layout.LayoutInfo r4 = r0.p()
            androidx.compose.ui.layout.LayoutCoordinates r4 = r4.w()
            androidx.compose.ui.layout.LayoutCoordinates r4 = r4.g0()
            if (r4 == 0) goto L_0x01eb
            long r9 = androidx.compose.ui.layout.LayoutCoordinatesKt.f(r4)
            goto L_0x01f1
        L_0x01eb:
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.ui.geometry.Offset.f15855b
            long r9 = r4.c()
        L_0x01f1:
            androidx.compose.ui.geometry.Rect r2 = r2.B(r9)
            long r9 = r3.s()
            long r11 = r3.u()
            long r11 = androidx.compose.ui.unit.IntSizeKt.e(r11)
            androidx.compose.ui.geometry.Rect r4 = androidx.compose.ui.geometry.RectKt.c(r9, r11)
            androidx.compose.ui.semantics.SemanticsConfiguration r6 = r0.w()
            androidx.compose.ui.semantics.SemanticsProperties r9 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            androidx.compose.ui.semantics.SemanticsPropertyKey r10 = r9.l()
            java.lang.Object r6 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r6, r10)
            androidx.compose.ui.semantics.ScrollAxisRange r6 = (androidx.compose.ui.semantics.ScrollAxisRange) r6
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r0.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r9 = r9.M()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r9)
            androidx.compose.ui.semantics.ScrollAxisRange r0 = (androidx.compose.ui.semantics.ScrollAxisRange) r0
            float r9 = r4.o()
            float r10 = r2.o()
            float r9 = r9 - r10
            float r10 = r4.p()
            float r11 = r2.p()
            float r10 = r10 - r11
            float r9 = t0(r9, r10)
            if (r6 == 0) goto L_0x0242
            boolean r6 = r6.b()
            if (r6 != r5) goto L_0x0242
            float r9 = -r9
        L_0x0242:
            boolean r3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.v(r3)
            if (r3 == 0) goto L_0x0249
            float r9 = -r9
        L_0x0249:
            float r3 = r4.r()
            float r6 = r2.r()
            float r3 = r3 - r6
            float r4 = r4.i()
            float r2 = r2.i()
            float r4 = r4 - r2
            float r2 = t0(r3, r4)
            if (r0 == 0) goto L_0x0268
            boolean r0 = r0.b()
            if (r0 != r5) goto L_0x0268
            float r2 = -r2
        L_0x0268:
            if (r1 == 0) goto L_0x0284
            kotlin.Function r0 = r1.a()
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            if (r0 == 0) goto L_0x0284
            java.lang.Float r1 = java.lang.Float.valueOf(r9)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r0 = r0.m(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0284:
            return r8
        L_0x0285:
            if (r2 == 0) goto L_0x028e
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r0 = r2.getString(r0)
            goto L_0x028f
        L_0x028e:
            r0 = r6
        L_0x028f:
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r2 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.z()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r2)
            androidx.compose.ui.semantics.AccessibilityAction r1 = (androidx.compose.ui.semantics.AccessibilityAction) r1
            if (r1 == 0) goto L_0x02bc
            kotlin.Function r1 = r1.a()
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            if (r1 == 0) goto L_0x02bc
            androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
            if (r0 != 0) goto L_0x02af
            java.lang.String r0 = ""
        L_0x02af:
            r2.<init>(r0, r6, r4, r6)
            java.lang.Object r0 = r1.invoke(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x02bc:
            return r8
        L_0x02bd:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.f()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x02e1
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x02e1
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x02e1:
            return r8
        L_0x02e2:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.b()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x0306
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x0306
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0306:
            return r8
        L_0x0307:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.g()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x032b
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x032b
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x032b:
            return r8
        L_0x032c:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.e()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x0350
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x0350
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0350:
            return r8
        L_0x0351:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.s()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x0375
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x0375
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0375:
            return r8
        L_0x0376:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L_0x037c
            r1 = r5
            goto L_0x037d
        L_0x037c:
            r1 = r8
        L_0x037d:
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r0 != r2) goto L_0x0383
            r2 = r5
            goto L_0x0384
        L_0x0383:
            r2 = r8
        L_0x0384:
            r4 = 16908345(0x1020039, float:2.387739E-38)
            if (r0 != r4) goto L_0x038b
            r4 = r5
            goto L_0x038c
        L_0x038b:
            r4 = r8
        L_0x038c:
            r6 = 16908347(0x102003b, float:2.3877394E-38)
            if (r0 != r6) goto L_0x0393
            r6 = r5
            goto L_0x0394
        L_0x0393:
            r6 = r8
        L_0x0394:
            r9 = 16908344(0x1020038, float:2.3877386E-38)
            if (r0 != r9) goto L_0x039b
            r9 = r5
            goto L_0x039c
        L_0x039b:
            r9 = r8
        L_0x039c:
            r10 = 16908346(0x102003a, float:2.3877392E-38)
            if (r0 != r10) goto L_0x03a3
            r0 = r5
            goto L_0x03a4
        L_0x03a3:
            r0 = r8
        L_0x03a4:
            if (r4 != 0) goto L_0x03af
            if (r6 != 0) goto L_0x03af
            if (r1 != 0) goto L_0x03af
            if (r2 == 0) goto L_0x03ad
            goto L_0x03af
        L_0x03ad:
            r10 = r8
            goto L_0x03b0
        L_0x03af:
            r10 = r5
        L_0x03b0:
            if (r9 != 0) goto L_0x03bb
            if (r0 != 0) goto L_0x03bb
            if (r1 != 0) goto L_0x03bb
            if (r2 == 0) goto L_0x03b9
            goto L_0x03bb
        L_0x03b9:
            r0 = r8
            goto L_0x03bc
        L_0x03bb:
            r0 = r5
        L_0x03bc:
            if (r1 != 0) goto L_0x03c0
            if (r2 == 0) goto L_0x0456
        L_0x03c0:
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r3.w()
            androidx.compose.ui.semantics.SemanticsProperties r11 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            androidx.compose.ui.semantics.SemanticsPropertyKey r11 = r11.B()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r11)
            androidx.compose.ui.semantics.ProgressBarRangeInfo r1 = (androidx.compose.ui.semantics.ProgressBarRangeInfo) r1
            androidx.compose.ui.semantics.SemanticsConfiguration r11 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r12 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r12 = r12.x()
            java.lang.Object r11 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r11, r12)
            androidx.compose.ui.semantics.AccessibilityAction r11 = (androidx.compose.ui.semantics.AccessibilityAction) r11
            if (r1 == 0) goto L_0x0456
            if (r11 == 0) goto L_0x0456
            kotlin.ranges.ClosedFloatingPointRange r0 = r1.c()
            java.lang.Comparable r0 = r0.m()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r3 = r1.c()
            java.lang.Comparable r3 = r3.e()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r0 = kotlin.ranges.RangesKt.d(r0, r3)
            kotlin.ranges.ClosedFloatingPointRange r3 = r1.c()
            java.lang.Comparable r3 = r3.e()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            kotlin.ranges.ClosedFloatingPointRange r4 = r1.c()
            java.lang.Comparable r4 = r4.m()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r3 = kotlin.ranges.RangesKt.i(r3, r4)
            int r4 = r1.d()
            if (r4 <= 0) goto L_0x0433
            float r0 = r0 - r3
            int r3 = r1.d()
            int r3 = r3 + r5
        L_0x0430:
            float r3 = (float) r3
            float r0 = r0 / r3
            goto L_0x0437
        L_0x0433:
            float r0 = r0 - r3
            r3 = 20
            goto L_0x0430
        L_0x0437:
            if (r2 == 0) goto L_0x043a
            float r0 = -r0
        L_0x043a:
            kotlin.Function r2 = r11.a()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            if (r2 == 0) goto L_0x0455
            float r1 = r1.b()
            float r1 = r1 + r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0455:
            return r8
        L_0x0456:
            androidx.compose.ui.layout.LayoutInfo r1 = r3.p()
            androidx.compose.ui.layout.LayoutCoordinates r1 = r1.w()
            androidx.compose.ui.geometry.Rect r1 = androidx.compose.ui.layout.LayoutCoordinatesKt.a(r1)
            long r11 = r1.q()
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r3.w()
            java.lang.Float r1 = androidx.compose.ui.platform.SemanticsUtils_androidKt.d(r1)
            androidx.compose.ui.semantics.SemanticsConfiguration r5 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r13 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r13.u()
            java.lang.Object r5 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r5, r14)
            androidx.compose.ui.semantics.AccessibilityAction r5 = (androidx.compose.ui.semantics.AccessibilityAction) r5
            if (r5 != 0) goto L_0x0481
            return r8
        L_0x0481:
            androidx.compose.ui.semantics.SemanticsConfiguration r14 = r3.w()
            androidx.compose.ui.semantics.SemanticsProperties r15 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            androidx.compose.ui.semantics.SemanticsPropertyKey r8 = r15.l()
            java.lang.Object r8 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r14, r8)
            androidx.compose.ui.semantics.ScrollAxisRange r8 = (androidx.compose.ui.semantics.ScrollAxisRange) r8
            if (r8 == 0) goto L_0x0538
            if (r10 == 0) goto L_0x0538
            if (r1 == 0) goto L_0x049e
            float r10 = r1.floatValue()
            r17 = r15
            goto L_0x04a9
        L_0x049e:
            r10 = 32
            r17 = r15
            long r14 = r11 >> r10
            int r10 = (int) r14
            float r10 = java.lang.Float.intBitsToFloat(r10)
        L_0x04a9:
            if (r4 != 0) goto L_0x04ad
            if (r2 == 0) goto L_0x04ae
        L_0x04ad:
            float r10 = -r10
        L_0x04ae:
            boolean r14 = r8.b()
            if (r14 == 0) goto L_0x04b5
            float r10 = -r10
        L_0x04b5:
            boolean r14 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.v(r3)
            if (r14 == 0) goto L_0x04c0
            if (r4 != 0) goto L_0x04bf
            if (r6 == 0) goto L_0x04c0
        L_0x04bf:
            float r10 = -r10
        L_0x04c0:
            boolean r4 = s0(r8, r10)
            if (r4 == 0) goto L_0x053a
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r13.p()
            boolean r0 = r0.h(r1)
            if (r0 != 0) goto L_0x04e2
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r13.q()
            boolean r0 = r0.h(r1)
            if (r0 == 0) goto L_0x04e4
        L_0x04e2:
            r2 = 0
            goto L_0x0502
        L_0x04e4:
            kotlin.Function r0 = r5.a()
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            if (r0 == 0) goto L_0x0500
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r0 = r0.m(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x0537
        L_0x0500:
            r8 = 0
            goto L_0x0537
        L_0x0502:
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0515
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r13.q()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            goto L_0x0523
        L_0x0515:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r13.p()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
        L_0x0523:
            if (r0 == 0) goto L_0x0500
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x0500
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0537:
            return r8
        L_0x0538:
            r17 = r15
        L_0x053a:
            androidx.compose.ui.semantics.SemanticsConfiguration r4 = r3.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r6 = r17.M()
            java.lang.Object r4 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r4, r6)
            androidx.compose.ui.semantics.ScrollAxisRange r4 = (androidx.compose.ui.semantics.ScrollAxisRange) r4
            if (r4 == 0) goto L_0x05e2
            if (r0 == 0) goto L_0x05e2
            if (r1 == 0) goto L_0x0553
            float r0 = r1.floatValue()
            goto L_0x055e
        L_0x0553:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r11
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
        L_0x055e:
            if (r9 != 0) goto L_0x0562
            if (r2 == 0) goto L_0x0563
        L_0x0562:
            float r0 = -r0
        L_0x0563:
            boolean r1 = r4.b()
            if (r1 == 0) goto L_0x056a
            float r0 = -r0
        L_0x056a:
            boolean r1 = s0(r4, r0)
            if (r1 == 0) goto L_0x05e2
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r3.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r13.r()
            boolean r1 = r1.h(r2)
            if (r1 != 0) goto L_0x058c
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r3.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r13.o()
            boolean r1 = r1.h(r2)
            if (r1 == 0) goto L_0x058e
        L_0x058c:
            r2 = 0
            goto L_0x05ac
        L_0x058e:
            kotlin.Function r1 = r5.a()
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            if (r1 == 0) goto L_0x05aa
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.m(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x05e1
        L_0x05aa:
            r8 = 0
            goto L_0x05e1
        L_0x05ac:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x05bf
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r13.o()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            goto L_0x05cd
        L_0x05bf:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r13.r()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
        L_0x05cd:
            if (r0 == 0) goto L_0x05aa
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x05aa
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x05e1:
            return r8
        L_0x05e2:
            r0 = 0
            return r0
        L_0x05e4:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.n()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x0609
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x0609
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x060a
        L_0x0609:
            r8 = 0
        L_0x060a:
            return r8
        L_0x060b:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r2 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.l()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r2)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x062c
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x062c
            java.lang.Object r0 = r0.invoke()
            r6 = r0
            java.lang.Boolean r6 = (java.lang.Boolean) r6
        L_0x062c:
            r8 = r6
            r5 = 12
            r6 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r0 = r16
            r1 = r17
            F0(r0, r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L_0x0641
            boolean r8 = r8.booleanValue()
            goto L_0x0642
        L_0x0641:
            r8 = 0
        L_0x0642:
            return r8
        L_0x0643:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsProperties r1 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.i()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 == 0) goto L_0x066b
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.f17532d
            androidx.compose.ui.focus.FocusOwner r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.FocusDirection$Companion r1 = androidx.compose.ui.focus.FocusDirection.f15729b
            int r1 = r1.c()
            r2 = 0
            r0.i(r2, r5, r5, r1)
            r8 = r5
            goto L_0x066c
        L_0x066b:
            r8 = 0
        L_0x066c:
            return r8
        L_0x066d:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.t()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x0692
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x0692
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x0693
        L_0x0692:
            r8 = 0
        L_0x0693:
            return r8
        L_0x0694:
            r0 = -1
            if (r2 == 0) goto L_0x069e
            java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r1 = r2.getInt(r1, r0)
            goto L_0x069f
        L_0x069e:
            r1 = r0
        L_0x069f:
            if (r2 == 0) goto L_0x06a7
            java.lang.String r4 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r0 = r2.getInt(r4, r0)
        L_0x06a7:
            r2 = 0
            boolean r8 = r7.L0(r3, r1, r0, r2)
            if (r8 == 0) goto L_0x06c1
            int r0 = r3.o()
            int r1 = r7.B0(r0)
            r5 = 12
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r16
            F0(r0, r1, r2, r3, r4, r5, r6)
        L_0x06c1:
            return r8
        L_0x06c2:
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r3.w()
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.c()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
            androidx.compose.ui.semantics.AccessibilityAction r0 = (androidx.compose.ui.semantics.AccessibilityAction) r0
            if (r0 == 0) goto L_0x06e7
            kotlin.Function r0 = r0.a()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L_0x06e7
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x06e8
        L_0x06e7:
            r8 = 0
        L_0x06e8:
            return r8
        L_0x06e9:
            if (r2 == 0) goto L_0x0701
            java.lang.String r1 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r1 = r2.getInt(r1)
            java.lang.String r6 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r2 = r2.getBoolean(r6)
            if (r0 != r4) goto L_0x06fb
            r8 = r5
            goto L_0x06fc
        L_0x06fb:
            r8 = 0
        L_0x06fc:
            boolean r0 = r7.S0(r3, r1, r8, r2)
            return r0
        L_0x0701:
            r0 = 0
            return r0
        L_0x0703:
            boolean r0 = r16.S(r17)
            return r0
        L_0x0708:
            boolean r0 = r16.y0(r17)
        L_0x070c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.r0(int, int, android.os.Bundle):boolean");
    }

    public final void u0(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
        View h2;
        boolean z2;
        boolean z3;
        int i3 = i2;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
        SemanticsNode semanticsNode2 = semanticsNode;
        Resources resources = this.f17532d.getContext().getResources();
        accessibilityNodeInfoCompat2.i0("android.view.View");
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        if (w2.h(semanticsProperties.g())) {
            accessibilityNodeInfoCompat2.i0("android.widget.EditText");
        }
        if (semanticsNode.w().h(semanticsProperties.H())) {
            accessibilityNodeInfoCompat2.i0("android.widget.TextView");
        }
        Role role = (Role) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties.C());
        if (role != null) {
            role.p();
            if (semanticsNode.x() || semanticsNode.t().isEmpty()) {
                Role.Companion companion = Role.f18040b;
                if (Role.m(role.p(), companion.h())) {
                    accessibilityNodeInfoCompat2.F0(resources.getString(R.string.f15542r));
                } else {
                    if (Role.m(role.p(), companion.g())) {
                        accessibilityNodeInfoCompat2.F0(resources.getString(R.string.f15541q));
                    } else {
                        String i4 = SemanticsUtils_androidKt.i(role.p());
                        if (!Role.m(role.p(), companion.e()) || semanticsNode.A() || semanticsNode.w().u()) {
                            accessibilityNodeInfoCompat2.i0(i4);
                        }
                    }
                }
            }
            Unit unit = Unit.f40552a;
        }
        accessibilityNodeInfoCompat2.z0(this.f17532d.getContext().getPackageName());
        accessibilityNodeInfoCompat2.u0(SemanticsUtils_androidKt.g(semanticsNode));
        List t2 = semanticsNode.t();
        int size = t2.size();
        for (int i5 = 0; i5 < size; i5++) {
            SemanticsNode semanticsNode3 = (SemanticsNode) t2.get(i5);
            if (a0().a(semanticsNode3.o())) {
                AndroidViewHolder androidViewHolder = this.f17532d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode3.q());
                if (semanticsNode3.o() != -1) {
                    if (androidViewHolder != null) {
                        accessibilityNodeInfoCompat2.c(androidViewHolder);
                    } else {
                        accessibilityNodeInfoCompat2.d(this.f17532d, semanticsNode3.o());
                    }
                }
            }
        }
        if (i3 == this.f17543o) {
            accessibilityNodeInfoCompat2.a0(true);
            accessibilityNodeInfoCompat2.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20391l);
        } else {
            accessibilityNodeInfoCompat2.a0(false);
            accessibilityNodeInfoCompat2.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20390k);
        }
        O0(semanticsNode2, accessibilityNodeInfoCompat2);
        M0(semanticsNode2, accessibilityNodeInfoCompat2);
        accessibilityNodeInfoCompat2.L0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode2, resources));
        accessibilityNodeInfoCompat2.g0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.s(semanticsNode));
        SemanticsConfiguration w3 = semanticsNode.w();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.f18102a;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(w3, semanticsProperties2.K());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                accessibilityNodeInfoCompat2.h0(true);
            } else if (toggleableState == ToggleableState.Off) {
                accessibilityNodeInfoCompat2.h0(false);
            }
            Unit unit2 = Unit.f40552a;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties2.E());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (role == null ? false : Role.m(role.p(), Role.f18040b.h())) {
                accessibilityNodeInfoCompat2.I0(booleanValue);
            } else {
                accessibilityNodeInfoCompat2.h0(booleanValue);
            }
            Unit unit3 = Unit.f40552a;
        }
        if (!semanticsNode.w().u() || semanticsNode.t().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties2.d());
            accessibilityNodeInfoCompat2.m0(list != null ? (String) CollectionsKt.g0(list) : null);
        }
        String str = (String) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties2.G());
        if (str != null) {
            SemanticsNode semanticsNode4 = semanticsNode2;
            while (true) {
                if (semanticsNode4 == null) {
                    z3 = false;
                    break;
                }
                SemanticsConfiguration w4 = semanticsNode4.w();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.f18141a;
                if (w4.h(semanticsPropertiesAndroid.a())) {
                    z3 = ((Boolean) semanticsNode4.w().n(semanticsPropertiesAndroid.a())).booleanValue();
                    break;
                }
                semanticsNode4 = semanticsNode4.r();
            }
            if (z3) {
                accessibilityNodeInfoCompat2.S0(str);
            }
        }
        SemanticsConfiguration w5 = semanticsNode.w();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.f18102a;
        if (((Unit) SemanticsConfigurationKt.a(w5, semanticsProperties3.j())) != null) {
            accessibilityNodeInfoCompat2.t0(true);
            Unit unit4 = Unit.f40552a;
        }
        accessibilityNodeInfoCompat2.D0(semanticsNode.w().h(semanticsProperties3.A()));
        accessibilityNodeInfoCompat2.o0(semanticsNode.w().h(semanticsProperties3.s()));
        Integer num = (Integer) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties3.y());
        accessibilityNodeInfoCompat2.x0(num != null ? num.intValue() : -1);
        accessibilityNodeInfoCompat2.p0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode));
        accessibilityNodeInfoCompat2.r0(semanticsNode.w().h(semanticsProperties3.i()));
        int i6 = 2;
        if (accessibilityNodeInfoCompat.K()) {
            accessibilityNodeInfoCompat2.s0(((Boolean) semanticsNode.w().n(semanticsProperties3.i())).booleanValue());
            if (accessibilityNodeInfoCompat.L()) {
                accessibilityNodeInfoCompat2.a(2);
                this.f17544p = i3;
            } else {
                accessibilityNodeInfoCompat2.a(1);
            }
        }
        accessibilityNodeInfoCompat2.T0(!SemanticsUtils_androidKt.f(semanticsNode));
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties3.x());
        if (liveRegionMode != null) {
            int i7 = liveRegionMode.i();
            LiveRegionMode.Companion companion2 = LiveRegionMode.f18031b;
            if (LiveRegionMode.f(i7, companion2.b()) || !LiveRegionMode.f(i7, companion2.a())) {
                i6 = 1;
            }
            accessibilityNodeInfoCompat2.v0(i6);
            Unit unit5 = Unit.f40552a;
        }
        accessibilityNodeInfoCompat2.j0(false);
        SemanticsConfiguration w6 = semanticsNode.w();
        SemanticsActions semanticsActions = SemanticsActions.f18056a;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(w6, semanticsActions.l());
        if (accessibilityAction != null) {
            boolean d2 = Intrinsics.d(SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties3.E()), Boolean.TRUE);
            Role.Companion companion3 = Role.f18040b;
            if (!(role == null ? false : Role.m(role.p(), companion3.h()))) {
                if (!(role == null ? false : Role.m(role.p(), companion3.f()))) {
                    z2 = false;
                    accessibilityNodeInfoCompat2.j0(z2 || (z2 && !d2));
                    if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode) && accessibilityNodeInfoCompat.H()) {
                        accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.b()));
                    }
                    Unit unit6 = Unit.f40552a;
                }
            }
            z2 = true;
            accessibilityNodeInfoCompat2.j0(z2 || (z2 && !d2));
            accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.b()));
            Unit unit62 = Unit.f40552a;
        }
        accessibilityNodeInfoCompat2.w0(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.n());
        if (accessibilityAction2 != null) {
            accessibilityNodeInfoCompat2.w0(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode)) {
                accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.b()));
            }
            Unit unit7 = Unit.f40552a;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.c());
        if (accessibilityAction3 != null) {
            accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.b()));
            Unit unit8 = Unit.f40552a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.z());
            if (accessibilityAction4 != null) {
                accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.b()));
                Unit unit9 = Unit.f40552a;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.m());
            if (accessibilityAction5 != null) {
                accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908372, accessibilityAction5.b()));
                Unit unit10 = Unit.f40552a;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.e());
            if (accessibilityAction6 != null) {
                accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.b()));
                Unit unit11 = Unit.f40552a;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.s());
            if (accessibilityAction7 != null) {
                if (accessibilityNodeInfoCompat.L() && this.f17532d.getClipboardManager().b()) {
                    accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.b()));
                }
                Unit unit12 = Unit.f40552a;
            }
        }
        String f0 = f0(semanticsNode2);
        if (!(f0 == null || f0.length() == 0)) {
            accessibilityNodeInfoCompat2.N0(Z(semanticsNode2), Y(semanticsNode2));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.y());
            accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.b() : null));
            accessibilityNodeInfoCompat2.a(256);
            accessibilityNodeInfoCompat2.a(512);
            accessibilityNodeInfoCompat2.y0(11);
            Collection collection = (List) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties3.d());
            if ((collection == null || collection.isEmpty()) && semanticsNode.w().h(semanticsActions.i()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode)) {
                accessibilityNodeInfoCompat2.y0(accessibilityNodeInfoCompat.v() | 20);
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList();
        arrayList.add("androidx.compose.ui.semantics.id");
        CharSequence y2 = accessibilityNodeInfoCompat.y();
        if (!(y2 == null || y2.length() == 0) && semanticsNode.w().h(semanticsActions.i())) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (semanticsNode.w().h(semanticsProperties3.G())) {
            arrayList.add("androidx.compose.ui.semantics.testTag");
        }
        accessibilityNodeInfoCompat2.b0(arrayList);
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties3.B());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.w().h(semanticsActions.x())) {
                accessibilityNodeInfoCompat2.i0("android.widget.SeekBar");
            } else {
                accessibilityNodeInfoCompat2.i0("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.f18035d.a()) {
                accessibilityNodeInfoCompat2.E0(AccessibilityNodeInfoCompat.RangeInfoCompat.a(1, ((Number) progressBarRangeInfo.c().e()).floatValue(), ((Number) progressBarRangeInfo.c().m()).floatValue(), progressBarRangeInfo.b()));
            }
            if (semanticsNode.w().h(semanticsActions.x()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode)) {
                if (progressBarRangeInfo.b() < RangesKt.d(((Number) progressBarRangeInfo.c().m()).floatValue(), ((Number) progressBarRangeInfo.c().e()).floatValue())) {
                    accessibilityNodeInfoCompat2.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20396q);
                }
                if (progressBarRangeInfo.b() > RangesKt.i(((Number) progressBarRangeInfo.c().e()).floatValue(), ((Number) progressBarRangeInfo.c().m()).floatValue())) {
                    accessibilityNodeInfoCompat2.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20397r);
                }
            }
        }
        Api24Impl.a(accessibilityNodeInfoCompat, semanticsNode);
        CollectionInfo_androidKt.d(semanticsNode2, accessibilityNodeInfoCompat2);
        CollectionInfo_androidKt.e(semanticsNode2, accessibilityNodeInfoCompat2);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties3.l());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.u());
        if (!(scrollAxisRange == null || accessibilityAction9 == null)) {
            if (!CollectionInfo_androidKt.b(semanticsNode)) {
                accessibilityNodeInfoCompat2.i0("android.widget.HorizontalScrollView");
            }
            if (((Number) scrollAxisRange.a().invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfoCompat2.H0(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode)) {
                if (w0(scrollAxisRange)) {
                    accessibilityNodeInfoCompat2.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20396q);
                    accessibilityNodeInfoCompat2.b(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.v(semanticsNode) ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.F : AccessibilityNodeInfoCompat.AccessibilityActionCompat.D);
                }
                if (v0(scrollAxisRange)) {
                    accessibilityNodeInfoCompat2.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20397r);
                    accessibilityNodeInfoCompat2.b(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.v(semanticsNode) ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.D : AccessibilityNodeInfoCompat.AccessibilityActionCompat.F);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties3.M());
        if (!(scrollAxisRange2 == null || accessibilityAction9 == null)) {
            if (!CollectionInfo_androidKt.b(semanticsNode)) {
                accessibilityNodeInfoCompat2.i0("android.widget.ScrollView");
            }
            if (((Number) scrollAxisRange2.a().invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfoCompat2.H0(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode)) {
                if (w0(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat2.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20396q);
                    accessibilityNodeInfoCompat2.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.E);
                }
                if (v0(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat2.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f20397r);
                    accessibilityNodeInfoCompat2.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.C);
                }
            }
        }
        if (i8 >= 29) {
            Api29Impl.a(accessibilityNodeInfoCompat, semanticsNode);
        }
        accessibilityNodeInfoCompat2.A0((CharSequence) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties3.z()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode)) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.g());
            if (accessibilityAction10 != null) {
                accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.b()));
                Unit unit13 = Unit.f40552a;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.b());
            if (accessibilityAction11 != null) {
                accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.b()));
                Unit unit14 = Unit.f40552a;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsActions.f());
            if (accessibilityAction12 != null) {
                accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.b()));
                Unit unit15 = Unit.f40552a;
            }
            if (semanticsNode.w().h(semanticsActions.d())) {
                List list2 = (List) semanticsNode.w().n(semanticsActions.d());
                int size2 = list2.size();
                IntList intList = S;
                if (size2 < intList.f1784b) {
                    SparseArrayCompat sparseArrayCompat = new SparseArrayCompat(0, 1, (DefaultConstructorMarker) null);
                    MutableObjectIntMap b2 = ObjectIntMapKt.b();
                    if (this.f17551w.f(i3)) {
                        MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) this.f17551w.g(i3);
                        MutableIntList mutableIntList = new MutableIntList(0, 1, (DefaultConstructorMarker) null);
                        int[] iArr = intList.f1783a;
                        int i9 = intList.f1784b;
                        for (int i10 = 0; i10 < i9; i10++) {
                            mutableIntList.k(iArr[i10]);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list2.size();
                        for (int i11 = 0; i11 < size3; i11++) {
                            CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list2.get(i11);
                            Intrinsics.f(mutableObjectIntMap);
                            if (mutableObjectIntMap.a(customAccessibilityAction.b())) {
                                int c2 = mutableObjectIntMap.c(customAccessibilityAction.b());
                                sparseArrayCompat.k(c2, customAccessibilityAction.b());
                                b2.u(customAccessibilityAction.b(), c2);
                                mutableIntList.n(c2);
                                accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(c2, customAccessibilityAction.b()));
                            } else {
                                arrayList2.add(customAccessibilityAction);
                            }
                        }
                        int size4 = arrayList2.size();
                        for (int i12 = 0; i12 < size4; i12++) {
                            CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i12);
                            int e2 = mutableIntList.e(i12);
                            sparseArrayCompat.k(e2, customAccessibilityAction2.b());
                            b2.u(customAccessibilityAction2.b(), e2);
                            accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(e2, customAccessibilityAction2.b()));
                        }
                    } else {
                        int size5 = list2.size();
                        for (int i13 = 0; i13 < size5; i13++) {
                            CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list2.get(i13);
                            int e3 = S.e(i13);
                            sparseArrayCompat.k(e3, customAccessibilityAction3.b());
                            b2.u(customAccessibilityAction3.b(), e3);
                            accessibilityNodeInfoCompat2.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(e3, customAccessibilityAction3.b()));
                        }
                    }
                    this.f17550v.k(i3, sparseArrayCompat);
                    this.f17551w.k(i3, b2);
                } else {
                    throw new IllegalStateException("Can't have more than " + intList.f1784b + " custom actions for one widget");
                }
            }
        }
        accessibilityNodeInfoCompat2.G0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.w(semanticsNode2, resources));
        int e4 = this.F.e(i3, -1);
        if (e4 != -1) {
            View h3 = SemanticsUtils_androidKt.h(this.f17532d.getAndroidViewsHandler$ui_release(), e4);
            if (h3 != null) {
                accessibilityNodeInfoCompat2.Q0(h3);
            } else {
                accessibilityNodeInfoCompat2.R0(this.f17532d, e4);
            }
            M(i3, accessibilityNodeInfoCompat2, this.H, (Bundle) null);
        }
        int e5 = this.G.e(i3, -1);
        if (e5 != -1 && (h2 = SemanticsUtils_androidKt.h(this.f17532d.getAndroidViewsHandler$ui_release(), e5)) != null) {
            accessibilityNodeInfoCompat2.O0(h2);
            M(i3, accessibilityNodeInfoCompat2, this.I, (Bundle) null);
        }
    }

    public final boolean x0(int i2, List list) {
        boolean z2;
        ScrollObservationScope a2 = SemanticsUtils_androidKt.a(list, i2);
        if (a2 != null) {
            z2 = false;
        } else {
            a2 = new ScrollObservationScope(i2, this.O, (Float) null, (Float) null, (ScrollAxisRange) null, (ScrollAxisRange) null);
            z2 = true;
        }
        this.O.add(a2);
        return z2;
    }

    public final boolean y0(int i2) {
        if (!n0() || k0(i2)) {
            return false;
        }
        int i3 = this.f17543o;
        if (i3 != Integer.MIN_VALUE) {
            F0(this, i3, 65536, (Integer) null, (List) null, 12, (Object) null);
        }
        this.f17543o = i2;
        this.f17532d.invalidate();
        F0(this, i2, 32768, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    public final void z0(ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.v0()) {
            this.f17532d.getSnapshotObserver().i(scrollObservationScope, this.P, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(scrollObservationScope, this));
        }
    }
}
