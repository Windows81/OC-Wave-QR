package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FocusOwnerImpl implements FocusOwner {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f15760a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f15761b;

    /* renamed from: c  reason: collision with root package name */
    public final Function0 f15762c;

    /* renamed from: d  reason: collision with root package name */
    public final Function0 f15763d;

    /* renamed from: e  reason: collision with root package name */
    public final Function0 f15764e;

    /* renamed from: f  reason: collision with root package name */
    public FocusTargetNode f15765f = new FocusTargetNode(Focusability.f15833b.b(), (Function2) null, (Function1) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public final FocusInvalidationManager f15766g;

    /* renamed from: h  reason: collision with root package name */
    public final FocusTransactionManager f15767h;

    /* renamed from: i  reason: collision with root package name */
    public final Modifier f15768i;

    /* renamed from: j  reason: collision with root package name */
    public MutableLongSet f15769j;

    /* renamed from: k  reason: collision with root package name */
    public final MutableObjectList f15770k;

    /* renamed from: l  reason: collision with root package name */
    public FocusTargetNode f15771l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15772m;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15773a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.focus.CustomDestinationResult[] r0 = androidx.compose.ui.focus.CustomDestinationResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.CustomDestinationResult r1 = androidx.compose.ui.focus.CustomDestinationResult.Redirected     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.CustomDestinationResult r1 = androidx.compose.ui.focus.CustomDestinationResult.Cancelled     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.CustomDestinationResult r1 = androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.focus.CustomDestinationResult r1 = androidx.compose.ui.focus.CustomDestinationResult.None     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f15773a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.<clinit>():void");
        }
    }

    public FocusOwnerImpl(Function1 function1, Function2 function2, Function1 function12, Function0 function0, Function0 function02, Function0 function03) {
        this.f15760a = function2;
        this.f15761b = function12;
        this.f15762c = function0;
        this.f15763d = function02;
        this.f15764e = function03;
        this.f15766g = new FocusInvalidationManager(function1, new FocusOwnerImpl$focusInvalidationManager$1(this), new FocusOwnerImpl$focusInvalidationManager$2(this), new FocusOwnerImpl$focusInvalidationManager$3(this));
        this.f15767h = new FocusTransactionManager();
        this.f15768i = new FocusOwnerImpl$modifier$1(this);
        this.f15770k = new MutableObjectList(1);
    }

    public final FocusTargetNode A() {
        return FocusTraversalKt.b(this.f15765f);
    }

    public final FocusTargetNode B() {
        return this.f15765f;
    }

    public final void C() {
        if ((ComposeUiFlags.f15479g && t() == null) || this.f15765f.A0() == FocusStateImpl.Inactive) {
            this.f15762c.invoke();
        }
    }

    public final Modifier.Node D(DelegatableNode delegatableNode) {
        int a2 = NodeKind.a(1024) | NodeKind.a(8192);
        if (!delegatableNode.M().F2()) {
            InlineClassHelperKt.c("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node M = delegatableNode.M();
        Modifier.Node node = null;
        if ((M.v2() & a2) != 0) {
            for (Modifier.Node w2 = M.w2(); w2 != null; w2 = w2.w2()) {
                if ((w2.A2() & a2) != 0) {
                    if ((NodeKind.a(1024) & w2.A2()) != 0) {
                        return node;
                    }
                    node = w2;
                }
            }
        }
        return node;
    }

    public boolean E(int i2, Rect rect) {
        Boolean x2 = x(i2, rect, new FocusOwnerImpl$takeFocus$1(i2));
        if (x2 != null) {
            return x2.booleanValue();
        }
        return false;
    }

    public final boolean F(KeyEvent keyEvent) {
        long a2 = KeyEvent_androidKt.a(keyEvent);
        int b2 = KeyEvent_androidKt.b(keyEvent);
        KeyEventType.Companion companion = KeyEventType.f16777b;
        if (KeyEventType.f(b2, companion.a())) {
            MutableLongSet mutableLongSet = this.f15769j;
            if (mutableLongSet == null) {
                mutableLongSet = new MutableLongSet(3);
                this.f15769j = mutableLongSet;
            }
            mutableLongSet.l(a2);
        } else if (KeyEventType.f(b2, companion.b())) {
            MutableLongSet mutableLongSet2 = this.f15769j;
            if (mutableLongSet2 == null || !mutableLongSet2.a(a2)) {
                return false;
            }
            MutableLongSet mutableLongSet3 = this.f15769j;
            if (mutableLongSet3 != null) {
                mutableLongSet3.m(a2);
            }
        }
        return true;
    }

    public void a(FocusEventModifierNode focusEventModifierNode) {
        this.f15766g.g(focusEventModifierNode);
    }

    public void b(FocusTargetNode focusTargetNode) {
        this.f15766g.i(focusTargetNode);
    }

    public void c() {
        this.f15766g.j();
    }

    public Modifier d() {
        return this.f15768i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r9 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x02d7, code lost:
        if (((java.lang.Boolean) r18.invoke()).booleanValue() == false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x02d9, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x02dc, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        r5 = r9.M();
        r6 = new kotlin.jvm.internal.Ref.ObjectRef();
        r9 = new kotlin.jvm.internal.Ref.ObjectRef();
        r9.f40908z = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x02ed, code lost:
        r5 = r9.f40908z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x02ef, code lost:
        if (r5 == null) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x02f3, code lost:
        if ((r5 instanceof androidx.compose.ui.input.key.KeyInputModifierNode) == false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x02fb, code lost:
        if (((androidx.compose.ui.input.key.KeyInputModifierNode) r5).L0(r0) == false) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x02fd, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0300, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0308, code lost:
        if ((((androidx.compose.ui.Modifier.Node) r5).A2() & r3) == 0) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x030a, code lost:
        r5 = r9.f40908z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x030e, code lost:
        if ((r5 instanceof androidx.compose.ui.node.DelegatingNode) == false) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0310, code lost:
        r5 = ((androidx.compose.ui.node.DelegatingNode) r5).a3();
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0317, code lost:
        if (r5 == null) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x031e, code lost:
        if ((r5.A2() & r3) == 0) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0320, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0321, code lost:
        if (r11 != 1) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0323, code lost:
        r9.f40908z = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0326, code lost:
        r12 = (androidx.compose.runtime.collection.MutableVector) r6.f40908z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x032a, code lost:
        if (r12 != null) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x032c, code lost:
        r12 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0333, code lost:
        r6.f40908z = r12;
        r13 = (androidx.compose.ui.Modifier.Node) r9.f40908z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0339, code lost:
        if (r13 == null) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x033b, code lost:
        r12.d(r13);
        r9.f40908z = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0340, code lost:
        r12 = (androidx.compose.runtime.collection.MutableVector) r6.f40908z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0344, code lost:
        if (r12 == null) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0346, code lost:
        r12.d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0349, code lost:
        r5 = r5.w2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x034e, code lost:
        if (r11 != 1) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0351, code lost:
        r9.f40908z = androidx.compose.ui.node.DelegatableNodeKt.h((androidx.compose.runtime.collection.MutableVector) r6.f40908z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x035c, code lost:
        if (r10 == null) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x035e, code lost:
        r3 = r10.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0363, code lost:
        if (r5 >= r3) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x036f, code lost:
        if (((androidx.compose.ui.input.key.KeyInputModifierNode) r10.get(r5)).L0(r0) == false) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0371, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0374, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0375, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        r0 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0379, code lost:
        r0 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c7, code lost:
        r10 = r3.u0();
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0186 A[Catch:{ all -> 0x001e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.KeyEvent r17, kotlin.jvm.functions.Function0 r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = 1
            java.lang.String r3 = "FocusOwnerImpl:dispatchKeyEvent"
            android.os.Trace.beginSection(r3)
            androidx.compose.ui.focus.FocusInvalidationManager r3 = r1.f15766g     // Catch:{ all -> 0x001e }
            boolean r3 = r3.b()     // Catch:{ all -> 0x001e }
            r4 = 0
            if (r3 == 0) goto L_0x0021
            java.lang.String r0 = "FocusRelatedWarning: Dispatching key event while focus system is invalidated."
            java.io.PrintStream r2 = java.lang.System.out     // Catch:{ all -> 0x001e }
            r2.println(r0)     // Catch:{ all -> 0x001e }
            android.os.Trace.endSection()
            return r4
        L_0x001e:
            r0 = move-exception
            goto L_0x037f
        L_0x0021:
            boolean r3 = r16.F(r17)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x002b
            android.os.Trace.endSection()
            return r4
        L_0x002b:
            androidx.compose.ui.focus.FocusTargetNode r3 = r16.A()     // Catch:{ all -> 0x001e }
            java.lang.String r5 = "visitAncestors called on an unattached node"
            r6 = 8192(0x2000, float:1.14794E-41)
            r7 = 16
            r8 = 0
            if (r3 == 0) goto L_0x003e
            androidx.compose.ui.Modifier$Node r9 = r1.D(r3)     // Catch:{ all -> 0x001e }
            if (r9 != 0) goto L_0x0184
        L_0x003e:
            if (r3 == 0) goto L_0x00df
            int r9 = androidx.compose.ui.node.NodeKind.a(r6)     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r10 = r3.M()     // Catch:{ all -> 0x001e }
            boolean r10 = r10.F2()     // Catch:{ all -> 0x001e }
            if (r10 != 0) goto L_0x0051
            androidx.compose.ui.internal.InlineClassHelperKt.c(r5)     // Catch:{ all -> 0x001e }
        L_0x0051:
            androidx.compose.ui.Modifier$Node r10 = r3.M()     // Catch:{ all -> 0x001e }
            androidx.compose.ui.node.LayoutNode r3 = androidx.compose.ui.node.DelegatableNodeKt.o(r3)     // Catch:{ all -> 0x001e }
        L_0x0059:
            if (r3 == 0) goto L_0x00d4
            androidx.compose.ui.node.NodeChain r11 = r3.u0()     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r11 = r11.k()     // Catch:{ all -> 0x001e }
            int r11 = r11.v2()     // Catch:{ all -> 0x001e }
            r11 = r11 & r9
            if (r11 == 0) goto L_0x00c1
        L_0x006a:
            if (r10 == 0) goto L_0x00c1
            int r11 = r10.A2()     // Catch:{ all -> 0x001e }
            r11 = r11 & r9
            if (r11 == 0) goto L_0x00bc
            r12 = r8
            r11 = r10
        L_0x0075:
            if (r11 == 0) goto L_0x00bc
            boolean r13 = r11 instanceof androidx.compose.ui.input.key.KeyInputModifierNode     // Catch:{ all -> 0x001e }
            if (r13 == 0) goto L_0x007c
            goto L_0x00d5
        L_0x007c:
            int r13 = r11.A2()     // Catch:{ all -> 0x001e }
            r13 = r13 & r9
            if (r13 == 0) goto L_0x00b7
            boolean r13 = r11 instanceof androidx.compose.ui.node.DelegatingNode     // Catch:{ all -> 0x001e }
            if (r13 == 0) goto L_0x00b7
            r13 = r11
            androidx.compose.ui.node.DelegatingNode r13 = (androidx.compose.ui.node.DelegatingNode) r13     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r13 = r13.a3()     // Catch:{ all -> 0x001e }
            r14 = r4
        L_0x008f:
            if (r13 == 0) goto L_0x00b4
            int r15 = r13.A2()     // Catch:{ all -> 0x001e }
            r15 = r15 & r9
            if (r15 == 0) goto L_0x00af
            int r14 = r14 + r2
            if (r14 != r2) goto L_0x009d
            r11 = r13
            goto L_0x00af
        L_0x009d:
            if (r12 != 0) goto L_0x00a6
            androidx.compose.runtime.collection.MutableVector r12 = new androidx.compose.runtime.collection.MutableVector     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node[] r15 = new androidx.compose.ui.Modifier.Node[r7]     // Catch:{ all -> 0x001e }
            r12.<init>(r15, r4)     // Catch:{ all -> 0x001e }
        L_0x00a6:
            if (r11 == 0) goto L_0x00ac
            r12.d(r11)     // Catch:{ all -> 0x001e }
            r11 = r8
        L_0x00ac:
            r12.d(r13)     // Catch:{ all -> 0x001e }
        L_0x00af:
            androidx.compose.ui.Modifier$Node r13 = r13.w2()     // Catch:{ all -> 0x001e }
            goto L_0x008f
        L_0x00b4:
            if (r14 != r2) goto L_0x00b7
            goto L_0x0075
        L_0x00b7:
            androidx.compose.ui.Modifier$Node r11 = androidx.compose.ui.node.DelegatableNodeKt.h(r12)     // Catch:{ all -> 0x001e }
            goto L_0x0075
        L_0x00bc:
            androidx.compose.ui.Modifier$Node r10 = r10.C2()     // Catch:{ all -> 0x001e }
            goto L_0x006a
        L_0x00c1:
            androidx.compose.ui.node.LayoutNode r3 = r3.C0()     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x00d2
            androidx.compose.ui.node.NodeChain r10 = r3.u0()     // Catch:{ all -> 0x001e }
            if (r10 == 0) goto L_0x00d2
            androidx.compose.ui.Modifier$Node r10 = r10.o()     // Catch:{ all -> 0x001e }
            goto L_0x0059
        L_0x00d2:
            r10 = r8
            goto L_0x0059
        L_0x00d4:
            r11 = r8
        L_0x00d5:
            androidx.compose.ui.input.key.KeyInputModifierNode r11 = (androidx.compose.ui.input.key.KeyInputModifierNode) r11     // Catch:{ all -> 0x001e }
            if (r11 == 0) goto L_0x00df
            androidx.compose.ui.Modifier$Node r9 = r11.M()     // Catch:{ all -> 0x001e }
            goto L_0x0184
        L_0x00df:
            androidx.compose.ui.focus.FocusTargetNode r3 = r1.f15765f     // Catch:{ all -> 0x001e }
            int r9 = androidx.compose.ui.node.NodeKind.a(r6)     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r10 = r3.M()     // Catch:{ all -> 0x001e }
            boolean r10 = r10.F2()     // Catch:{ all -> 0x001e }
            if (r10 != 0) goto L_0x00f2
            androidx.compose.ui.internal.InlineClassHelperKt.c(r5)     // Catch:{ all -> 0x001e }
        L_0x00f2:
            androidx.compose.ui.Modifier$Node r10 = r3.M()     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r10 = r10.C2()     // Catch:{ all -> 0x001e }
            androidx.compose.ui.node.LayoutNode r3 = androidx.compose.ui.node.DelegatableNodeKt.o(r3)     // Catch:{ all -> 0x001e }
        L_0x00fe:
            if (r3 == 0) goto L_0x0179
            androidx.compose.ui.node.NodeChain r11 = r3.u0()     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r11 = r11.k()     // Catch:{ all -> 0x001e }
            int r11 = r11.v2()     // Catch:{ all -> 0x001e }
            r11 = r11 & r9
            if (r11 == 0) goto L_0x0166
        L_0x010f:
            if (r10 == 0) goto L_0x0166
            int r11 = r10.A2()     // Catch:{ all -> 0x001e }
            r11 = r11 & r9
            if (r11 == 0) goto L_0x0161
            r12 = r8
            r11 = r10
        L_0x011a:
            if (r11 == 0) goto L_0x0161
            boolean r13 = r11 instanceof androidx.compose.ui.input.key.KeyInputModifierNode     // Catch:{ all -> 0x001e }
            if (r13 == 0) goto L_0x0121
            goto L_0x017a
        L_0x0121:
            int r13 = r11.A2()     // Catch:{ all -> 0x001e }
            r13 = r13 & r9
            if (r13 == 0) goto L_0x015c
            boolean r13 = r11 instanceof androidx.compose.ui.node.DelegatingNode     // Catch:{ all -> 0x001e }
            if (r13 == 0) goto L_0x015c
            r13 = r11
            androidx.compose.ui.node.DelegatingNode r13 = (androidx.compose.ui.node.DelegatingNode) r13     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r13 = r13.a3()     // Catch:{ all -> 0x001e }
            r14 = r4
        L_0x0134:
            if (r13 == 0) goto L_0x0159
            int r15 = r13.A2()     // Catch:{ all -> 0x001e }
            r15 = r15 & r9
            if (r15 == 0) goto L_0x0154
            int r14 = r14 + r2
            if (r14 != r2) goto L_0x0142
            r11 = r13
            goto L_0x0154
        L_0x0142:
            if (r12 != 0) goto L_0x014b
            androidx.compose.runtime.collection.MutableVector r12 = new androidx.compose.runtime.collection.MutableVector     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node[] r15 = new androidx.compose.ui.Modifier.Node[r7]     // Catch:{ all -> 0x001e }
            r12.<init>(r15, r4)     // Catch:{ all -> 0x001e }
        L_0x014b:
            if (r11 == 0) goto L_0x0151
            r12.d(r11)     // Catch:{ all -> 0x001e }
            r11 = r8
        L_0x0151:
            r12.d(r13)     // Catch:{ all -> 0x001e }
        L_0x0154:
            androidx.compose.ui.Modifier$Node r13 = r13.w2()     // Catch:{ all -> 0x001e }
            goto L_0x0134
        L_0x0159:
            if (r14 != r2) goto L_0x015c
            goto L_0x011a
        L_0x015c:
            androidx.compose.ui.Modifier$Node r11 = androidx.compose.ui.node.DelegatableNodeKt.h(r12)     // Catch:{ all -> 0x001e }
            goto L_0x011a
        L_0x0161:
            androidx.compose.ui.Modifier$Node r10 = r10.C2()     // Catch:{ all -> 0x001e }
            goto L_0x010f
        L_0x0166:
            androidx.compose.ui.node.LayoutNode r3 = r3.C0()     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x0177
            androidx.compose.ui.node.NodeChain r10 = r3.u0()     // Catch:{ all -> 0x001e }
            if (r10 == 0) goto L_0x0177
            androidx.compose.ui.Modifier$Node r10 = r10.o()     // Catch:{ all -> 0x001e }
            goto L_0x00fe
        L_0x0177:
            r10 = r8
            goto L_0x00fe
        L_0x0179:
            r11 = r8
        L_0x017a:
            androidx.compose.ui.input.key.KeyInputModifierNode r11 = (androidx.compose.ui.input.key.KeyInputModifierNode) r11     // Catch:{ all -> 0x001e }
            if (r11 == 0) goto L_0x0183
            androidx.compose.ui.Modifier$Node r9 = r11.M()     // Catch:{ all -> 0x001e }
            goto L_0x0184
        L_0x0183:
            r9 = r8
        L_0x0184:
            if (r9 == 0) goto L_0x037b
            int r3 = androidx.compose.ui.node.NodeKind.a(r6)     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r6 = r9.M()     // Catch:{ all -> 0x001e }
            boolean r6 = r6.F2()     // Catch:{ all -> 0x001e }
            if (r6 != 0) goto L_0x0197
            androidx.compose.ui.internal.InlineClassHelperKt.c(r5)     // Catch:{ all -> 0x001e }
        L_0x0197:
            androidx.compose.ui.Modifier$Node r5 = r9.M()     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r5 = r5.C2()     // Catch:{ all -> 0x001e }
            androidx.compose.ui.node.LayoutNode r6 = androidx.compose.ui.node.DelegatableNodeKt.o(r9)     // Catch:{ all -> 0x001e }
            r10 = r8
        L_0x01a4:
            if (r6 == 0) goto L_0x022b
            androidx.compose.ui.node.NodeChain r11 = r6.u0()     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r11 = r11.k()     // Catch:{ all -> 0x001e }
            int r11 = r11.v2()     // Catch:{ all -> 0x001e }
            r11 = r11 & r3
            if (r11 == 0) goto L_0x0216
        L_0x01b5:
            if (r5 == 0) goto L_0x0216
            int r11 = r5.A2()     // Catch:{ all -> 0x001e }
            r11 = r11 & r3
            if (r11 == 0) goto L_0x0211
            r11 = r5
            r12 = r8
        L_0x01c0:
            if (r11 == 0) goto L_0x0211
            boolean r13 = r11 instanceof androidx.compose.ui.input.key.KeyInputModifierNode     // Catch:{ all -> 0x001e }
            if (r13 == 0) goto L_0x01d1
            if (r10 != 0) goto L_0x01cd
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x001e }
            r10.<init>()     // Catch:{ all -> 0x001e }
        L_0x01cd:
            r10.add(r11)     // Catch:{ all -> 0x001e }
            goto L_0x020c
        L_0x01d1:
            int r13 = r11.A2()     // Catch:{ all -> 0x001e }
            r13 = r13 & r3
            if (r13 == 0) goto L_0x020c
            boolean r13 = r11 instanceof androidx.compose.ui.node.DelegatingNode     // Catch:{ all -> 0x001e }
            if (r13 == 0) goto L_0x020c
            r13 = r11
            androidx.compose.ui.node.DelegatingNode r13 = (androidx.compose.ui.node.DelegatingNode) r13     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r13 = r13.a3()     // Catch:{ all -> 0x001e }
            r14 = r4
        L_0x01e4:
            if (r13 == 0) goto L_0x0209
            int r15 = r13.A2()     // Catch:{ all -> 0x001e }
            r15 = r15 & r3
            if (r15 == 0) goto L_0x0204
            int r14 = r14 + r2
            if (r14 != r2) goto L_0x01f2
            r11 = r13
            goto L_0x0204
        L_0x01f2:
            if (r12 != 0) goto L_0x01fb
            androidx.compose.runtime.collection.MutableVector r12 = new androidx.compose.runtime.collection.MutableVector     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node[] r15 = new androidx.compose.ui.Modifier.Node[r7]     // Catch:{ all -> 0x001e }
            r12.<init>(r15, r4)     // Catch:{ all -> 0x001e }
        L_0x01fb:
            if (r11 == 0) goto L_0x0201
            r12.d(r11)     // Catch:{ all -> 0x001e }
            r11 = r8
        L_0x0201:
            r12.d(r13)     // Catch:{ all -> 0x001e }
        L_0x0204:
            androidx.compose.ui.Modifier$Node r13 = r13.w2()     // Catch:{ all -> 0x001e }
            goto L_0x01e4
        L_0x0209:
            if (r14 != r2) goto L_0x020c
            goto L_0x01c0
        L_0x020c:
            androidx.compose.ui.Modifier$Node r11 = androidx.compose.ui.node.DelegatableNodeKt.h(r12)     // Catch:{ all -> 0x001e }
            goto L_0x01c0
        L_0x0211:
            androidx.compose.ui.Modifier$Node r5 = r5.C2()     // Catch:{ all -> 0x001e }
            goto L_0x01b5
        L_0x0216:
            androidx.compose.ui.node.LayoutNode r6 = r6.C0()     // Catch:{ all -> 0x001e }
            if (r6 == 0) goto L_0x0228
            androidx.compose.ui.node.NodeChain r5 = r6.u0()     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x0228
            androidx.compose.ui.Modifier$Node r5 = r5.o()     // Catch:{ all -> 0x001e }
            goto L_0x01a4
        L_0x0228:
            r5 = r8
            goto L_0x01a4
        L_0x022b:
            if (r10 == 0) goto L_0x024e
            int r5 = r10.size()     // Catch:{ all -> 0x001e }
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x024c
        L_0x0235:
            int r6 = r5 + -1
            java.lang.Object r5 = r10.get(r5)     // Catch:{ all -> 0x001e }
            androidx.compose.ui.input.key.KeyInputModifierNode r5 = (androidx.compose.ui.input.key.KeyInputModifierNode) r5     // Catch:{ all -> 0x001e }
            boolean r5 = r5.e0(r0)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x0247
            android.os.Trace.endSection()
            return r2
        L_0x0247:
            if (r6 >= 0) goto L_0x024a
            goto L_0x024c
        L_0x024a:
            r5 = r6
            goto L_0x0235
        L_0x024c:
            kotlin.Unit r5 = kotlin.Unit.f40552a     // Catch:{ all -> 0x001e }
        L_0x024e:
            androidx.compose.ui.Modifier$Node r5 = r9.M()     // Catch:{ all -> 0x001e }
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x001e }
            r6.<init>()     // Catch:{ all -> 0x001e }
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x001e }
            r11.<init>()     // Catch:{ all -> 0x001e }
            r11.f40908z = r5     // Catch:{ all -> 0x001e }
        L_0x025e:
            java.lang.Object r5 = r11.f40908z     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x02cd
            boolean r12 = r5 instanceof androidx.compose.ui.input.key.KeyInputModifierNode     // Catch:{ all -> 0x001e }
            if (r12 == 0) goto L_0x0272
            androidx.compose.ui.input.key.KeyInputModifierNode r5 = (androidx.compose.ui.input.key.KeyInputModifierNode) r5     // Catch:{ all -> 0x001e }
            boolean r5 = r5.e0(r0)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x02c2
            android.os.Trace.endSection()
            return r2
        L_0x0272:
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5     // Catch:{ all -> 0x001e }
            int r5 = r5.A2()     // Catch:{ all -> 0x001e }
            r5 = r5 & r3
            if (r5 == 0) goto L_0x02c2
            java.lang.Object r5 = r11.f40908z     // Catch:{ all -> 0x001e }
            boolean r12 = r5 instanceof androidx.compose.ui.node.DelegatingNode     // Catch:{ all -> 0x001e }
            if (r12 == 0) goto L_0x02c2
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r5 = r5.a3()     // Catch:{ all -> 0x001e }
            r12 = r4
        L_0x0288:
            if (r5 == 0) goto L_0x02bf
            int r13 = r5.A2()     // Catch:{ all -> 0x001e }
            r13 = r13 & r3
            if (r13 == 0) goto L_0x02ba
            int r12 = r12 + r2
            if (r12 != r2) goto L_0x0297
            r11.f40908z = r5     // Catch:{ all -> 0x001e }
            goto L_0x02ba
        L_0x0297:
            java.lang.Object r13 = r6.f40908z     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.collection.MutableVector r13 = (androidx.compose.runtime.collection.MutableVector) r13     // Catch:{ all -> 0x001e }
            if (r13 != 0) goto L_0x02a4
            androidx.compose.runtime.collection.MutableVector r13 = new androidx.compose.runtime.collection.MutableVector     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node[] r14 = new androidx.compose.ui.Modifier.Node[r7]     // Catch:{ all -> 0x001e }
            r13.<init>(r14, r4)     // Catch:{ all -> 0x001e }
        L_0x02a4:
            r6.f40908z = r13     // Catch:{ all -> 0x001e }
            java.lang.Object r14 = r11.f40908z     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r14 = (androidx.compose.ui.Modifier.Node) r14     // Catch:{ all -> 0x001e }
            if (r14 == 0) goto L_0x02b1
            r13.d(r14)     // Catch:{ all -> 0x001e }
            r11.f40908z = r8     // Catch:{ all -> 0x001e }
        L_0x02b1:
            java.lang.Object r13 = r6.f40908z     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.collection.MutableVector r13 = (androidx.compose.runtime.collection.MutableVector) r13     // Catch:{ all -> 0x001e }
            if (r13 == 0) goto L_0x02ba
            r13.d(r5)     // Catch:{ all -> 0x001e }
        L_0x02ba:
            androidx.compose.ui.Modifier$Node r5 = r5.w2()     // Catch:{ all -> 0x001e }
            goto L_0x0288
        L_0x02bf:
            if (r12 != r2) goto L_0x02c2
            goto L_0x025e
        L_0x02c2:
            java.lang.Object r5 = r6.f40908z     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.collection.MutableVector r5 = (androidx.compose.runtime.collection.MutableVector) r5     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.ui.node.DelegatableNodeKt.h(r5)     // Catch:{ all -> 0x001e }
            r11.f40908z = r5     // Catch:{ all -> 0x001e }
            goto L_0x025e
        L_0x02cd:
            java.lang.Object r5 = r18.invoke()     // Catch:{ all -> 0x001e }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x001e }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x02dd
            android.os.Trace.endSection()
            return r2
        L_0x02dd:
            androidx.compose.ui.Modifier$Node r5 = r9.M()     // Catch:{ all -> 0x001e }
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x001e }
            r6.<init>()     // Catch:{ all -> 0x001e }
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x001e }
            r9.<init>()     // Catch:{ all -> 0x001e }
            r9.f40908z = r5     // Catch:{ all -> 0x001e }
        L_0x02ed:
            java.lang.Object r5 = r9.f40908z     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x035c
            boolean r11 = r5 instanceof androidx.compose.ui.input.key.KeyInputModifierNode     // Catch:{ all -> 0x001e }
            if (r11 == 0) goto L_0x0301
            androidx.compose.ui.input.key.KeyInputModifierNode r5 = (androidx.compose.ui.input.key.KeyInputModifierNode) r5     // Catch:{ all -> 0x001e }
            boolean r5 = r5.L0(r0)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x0351
            android.os.Trace.endSection()
            return r2
        L_0x0301:
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5     // Catch:{ all -> 0x001e }
            int r5 = r5.A2()     // Catch:{ all -> 0x001e }
            r5 = r5 & r3
            if (r5 == 0) goto L_0x0351
            java.lang.Object r5 = r9.f40908z     // Catch:{ all -> 0x001e }
            boolean r11 = r5 instanceof androidx.compose.ui.node.DelegatingNode     // Catch:{ all -> 0x001e }
            if (r11 == 0) goto L_0x0351
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r5 = r5.a3()     // Catch:{ all -> 0x001e }
            r11 = r4
        L_0x0317:
            if (r5 == 0) goto L_0x034e
            int r12 = r5.A2()     // Catch:{ all -> 0x001e }
            r12 = r12 & r3
            if (r12 == 0) goto L_0x0349
            int r11 = r11 + r2
            if (r11 != r2) goto L_0x0326
            r9.f40908z = r5     // Catch:{ all -> 0x001e }
            goto L_0x0349
        L_0x0326:
            java.lang.Object r12 = r6.f40908z     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.collection.MutableVector r12 = (androidx.compose.runtime.collection.MutableVector) r12     // Catch:{ all -> 0x001e }
            if (r12 != 0) goto L_0x0333
            androidx.compose.runtime.collection.MutableVector r12 = new androidx.compose.runtime.collection.MutableVector     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node[] r13 = new androidx.compose.ui.Modifier.Node[r7]     // Catch:{ all -> 0x001e }
            r12.<init>(r13, r4)     // Catch:{ all -> 0x001e }
        L_0x0333:
            r6.f40908z = r12     // Catch:{ all -> 0x001e }
            java.lang.Object r13 = r9.f40908z     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r13 = (androidx.compose.ui.Modifier.Node) r13     // Catch:{ all -> 0x001e }
            if (r13 == 0) goto L_0x0340
            r12.d(r13)     // Catch:{ all -> 0x001e }
            r9.f40908z = r8     // Catch:{ all -> 0x001e }
        L_0x0340:
            java.lang.Object r12 = r6.f40908z     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.collection.MutableVector r12 = (androidx.compose.runtime.collection.MutableVector) r12     // Catch:{ all -> 0x001e }
            if (r12 == 0) goto L_0x0349
            r12.d(r5)     // Catch:{ all -> 0x001e }
        L_0x0349:
            androidx.compose.ui.Modifier$Node r5 = r5.w2()     // Catch:{ all -> 0x001e }
            goto L_0x0317
        L_0x034e:
            if (r11 != r2) goto L_0x0351
            goto L_0x02ed
        L_0x0351:
            java.lang.Object r5 = r6.f40908z     // Catch:{ all -> 0x001e }
            androidx.compose.runtime.collection.MutableVector r5 = (androidx.compose.runtime.collection.MutableVector) r5     // Catch:{ all -> 0x001e }
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.ui.node.DelegatableNodeKt.h(r5)     // Catch:{ all -> 0x001e }
            r9.f40908z = r5     // Catch:{ all -> 0x001e }
            goto L_0x02ed
        L_0x035c:
            if (r10 == 0) goto L_0x0379
            int r3 = r10.size()     // Catch:{ all -> 0x001e }
            r5 = r4
        L_0x0363:
            if (r5 >= r3) goto L_0x0377
            java.lang.Object r6 = r10.get(r5)     // Catch:{ all -> 0x001e }
            androidx.compose.ui.input.key.KeyInputModifierNode r6 = (androidx.compose.ui.input.key.KeyInputModifierNode) r6     // Catch:{ all -> 0x001e }
            boolean r6 = r6.L0(r0)     // Catch:{ all -> 0x001e }
            if (r6 == 0) goto L_0x0375
            android.os.Trace.endSection()
            return r2
        L_0x0375:
            int r5 = r5 + r2
            goto L_0x0363
        L_0x0377:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x001e }
        L_0x0379:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x001e }
        L_0x037b:
            android.os.Trace.endSection()
            return r4
        L_0x037f:
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.e(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        r10 = r2.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(androidx.compose.ui.input.rotary.RotaryScrollEvent r17, kotlin.jvm.functions.Function0 r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r16
            androidx.compose.ui.focus.FocusInvalidationManager r2 = r1.f15766g
            boolean r2 = r2.b()
            r3 = 0
            if (r2 == 0) goto L_0x0015
            java.lang.String r0 = "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
            return r3
        L_0x0015:
            androidx.compose.ui.focus.FocusTargetNode r2 = r16.A()
            java.lang.String r4 = "visitAncestors called on an unattached node"
            r5 = 16384(0x4000, float:2.2959E-41)
            r6 = 16
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x00bc
            int r9 = androidx.compose.ui.node.NodeKind.a(r5)
            androidx.compose.ui.Modifier$Node r10 = r2.M()
            boolean r10 = r10.F2()
            if (r10 != 0) goto L_0x0034
            androidx.compose.ui.internal.InlineClassHelperKt.c(r4)
        L_0x0034:
            androidx.compose.ui.Modifier$Node r10 = r2.M()
            androidx.compose.ui.node.LayoutNode r2 = androidx.compose.ui.node.DelegatableNodeKt.o(r2)
        L_0x003c:
            if (r2 == 0) goto L_0x00b8
            androidx.compose.ui.node.NodeChain r11 = r2.u0()
            androidx.compose.ui.Modifier$Node r11 = r11.k()
            int r11 = r11.v2()
            r11 = r11 & r9
            if (r11 == 0) goto L_0x00a5
        L_0x004d:
            if (r10 == 0) goto L_0x00a5
            int r11 = r10.A2()
            r11 = r11 & r9
            if (r11 == 0) goto L_0x00a0
            r12 = r7
            r11 = r10
        L_0x0058:
            if (r11 == 0) goto L_0x00a0
            boolean r13 = r11 instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode
            if (r13 == 0) goto L_0x005f
            goto L_0x00b9
        L_0x005f:
            int r13 = r11.A2()
            r13 = r13 & r9
            if (r13 == 0) goto L_0x009b
            boolean r13 = r11 instanceof androidx.compose.ui.node.DelegatingNode
            if (r13 == 0) goto L_0x009b
            r13 = r11
            androidx.compose.ui.node.DelegatingNode r13 = (androidx.compose.ui.node.DelegatingNode) r13
            androidx.compose.ui.Modifier$Node r13 = r13.a3()
            r14 = r3
        L_0x0072:
            if (r13 == 0) goto L_0x0098
            int r15 = r13.A2()
            r15 = r15 & r9
            if (r15 == 0) goto L_0x0093
            int r14 = r14 + 1
            if (r14 != r8) goto L_0x0081
            r11 = r13
            goto L_0x0093
        L_0x0081:
            if (r12 != 0) goto L_0x008a
            androidx.compose.runtime.collection.MutableVector r12 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r15 = new androidx.compose.ui.Modifier.Node[r6]
            r12.<init>(r15, r3)
        L_0x008a:
            if (r11 == 0) goto L_0x0090
            r12.d(r11)
            r11 = r7
        L_0x0090:
            r12.d(r13)
        L_0x0093:
            androidx.compose.ui.Modifier$Node r13 = r13.w2()
            goto L_0x0072
        L_0x0098:
            if (r14 != r8) goto L_0x009b
            goto L_0x0058
        L_0x009b:
            androidx.compose.ui.Modifier$Node r11 = androidx.compose.ui.node.DelegatableNodeKt.h(r12)
            goto L_0x0058
        L_0x00a0:
            androidx.compose.ui.Modifier$Node r10 = r10.C2()
            goto L_0x004d
        L_0x00a5:
            androidx.compose.ui.node.LayoutNode r2 = r2.C0()
            if (r2 == 0) goto L_0x00b6
            androidx.compose.ui.node.NodeChain r10 = r2.u0()
            if (r10 == 0) goto L_0x00b6
            androidx.compose.ui.Modifier$Node r10 = r10.o()
            goto L_0x003c
        L_0x00b6:
            r10 = r7
            goto L_0x003c
        L_0x00b8:
            r11 = r7
        L_0x00b9:
            androidx.compose.ui.input.rotary.RotaryInputModifierNode r11 = (androidx.compose.ui.input.rotary.RotaryInputModifierNode) r11
            goto L_0x00bd
        L_0x00bc:
            r11 = r7
        L_0x00bd:
            if (r11 == 0) goto L_0x0253
            int r2 = androidx.compose.ui.node.NodeKind.a(r5)
            androidx.compose.ui.Modifier$Node r5 = r11.M()
            boolean r5 = r5.F2()
            if (r5 != 0) goto L_0x00d0
            androidx.compose.ui.internal.InlineClassHelperKt.c(r4)
        L_0x00d0:
            androidx.compose.ui.Modifier$Node r4 = r11.M()
            androidx.compose.ui.Modifier$Node r4 = r4.C2()
            androidx.compose.ui.node.LayoutNode r5 = androidx.compose.ui.node.DelegatableNodeKt.o(r11)
            r9 = r7
        L_0x00dd:
            if (r5 == 0) goto L_0x0165
            androidx.compose.ui.node.NodeChain r10 = r5.u0()
            androidx.compose.ui.Modifier$Node r10 = r10.k()
            int r10 = r10.v2()
            r10 = r10 & r2
            if (r10 == 0) goto L_0x0150
        L_0x00ee:
            if (r4 == 0) goto L_0x0150
            int r10 = r4.A2()
            r10 = r10 & r2
            if (r10 == 0) goto L_0x014b
            r10 = r4
            r12 = r7
        L_0x00f9:
            if (r10 == 0) goto L_0x014b
            boolean r13 = r10 instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode
            if (r13 == 0) goto L_0x010a
            if (r9 != 0) goto L_0x0106
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0106:
            r9.add(r10)
            goto L_0x0146
        L_0x010a:
            int r13 = r10.A2()
            r13 = r13 & r2
            if (r13 == 0) goto L_0x0146
            boolean r13 = r10 instanceof androidx.compose.ui.node.DelegatingNode
            if (r13 == 0) goto L_0x0146
            r13 = r10
            androidx.compose.ui.node.DelegatingNode r13 = (androidx.compose.ui.node.DelegatingNode) r13
            androidx.compose.ui.Modifier$Node r13 = r13.a3()
            r14 = r3
        L_0x011d:
            if (r13 == 0) goto L_0x0143
            int r15 = r13.A2()
            r15 = r15 & r2
            if (r15 == 0) goto L_0x013e
            int r14 = r14 + 1
            if (r14 != r8) goto L_0x012c
            r10 = r13
            goto L_0x013e
        L_0x012c:
            if (r12 != 0) goto L_0x0135
            androidx.compose.runtime.collection.MutableVector r12 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r15 = new androidx.compose.ui.Modifier.Node[r6]
            r12.<init>(r15, r3)
        L_0x0135:
            if (r10 == 0) goto L_0x013b
            r12.d(r10)
            r10 = r7
        L_0x013b:
            r12.d(r13)
        L_0x013e:
            androidx.compose.ui.Modifier$Node r13 = r13.w2()
            goto L_0x011d
        L_0x0143:
            if (r14 != r8) goto L_0x0146
            goto L_0x00f9
        L_0x0146:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.h(r12)
            goto L_0x00f9
        L_0x014b:
            androidx.compose.ui.Modifier$Node r4 = r4.C2()
            goto L_0x00ee
        L_0x0150:
            androidx.compose.ui.node.LayoutNode r5 = r5.C0()
            if (r5 == 0) goto L_0x0162
            androidx.compose.ui.node.NodeChain r4 = r5.u0()
            if (r4 == 0) goto L_0x0162
            androidx.compose.ui.Modifier$Node r4 = r4.o()
            goto L_0x00dd
        L_0x0162:
            r4 = r7
            goto L_0x00dd
        L_0x0165:
            if (r9 == 0) goto L_0x0183
            int r4 = r9.size()
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0183
        L_0x016f:
            int r5 = r4 + -1
            java.lang.Object r4 = r9.get(r4)
            androidx.compose.ui.input.rotary.RotaryInputModifierNode r4 = (androidx.compose.ui.input.rotary.RotaryInputModifierNode) r4
            boolean r4 = r4.R0(r0)
            if (r4 == 0) goto L_0x017e
            return r8
        L_0x017e:
            if (r5 >= 0) goto L_0x0181
            goto L_0x0183
        L_0x0181:
            r4 = r5
            goto L_0x016f
        L_0x0183:
            androidx.compose.ui.Modifier$Node r4 = r11.M()
            r5 = r7
        L_0x0188:
            if (r4 == 0) goto L_0x01d8
            boolean r10 = r4 instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode
            if (r10 == 0) goto L_0x0197
            androidx.compose.ui.input.rotary.RotaryInputModifierNode r4 = (androidx.compose.ui.input.rotary.RotaryInputModifierNode) r4
            boolean r4 = r4.R0(r0)
            if (r4 == 0) goto L_0x01d3
            return r8
        L_0x0197:
            int r10 = r4.A2()
            r10 = r10 & r2
            if (r10 == 0) goto L_0x01d3
            boolean r10 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r10 == 0) goto L_0x01d3
            r10 = r4
            androidx.compose.ui.node.DelegatingNode r10 = (androidx.compose.ui.node.DelegatingNode) r10
            androidx.compose.ui.Modifier$Node r10 = r10.a3()
            r12 = r3
        L_0x01aa:
            if (r10 == 0) goto L_0x01d0
            int r13 = r10.A2()
            r13 = r13 & r2
            if (r13 == 0) goto L_0x01cb
            int r12 = r12 + 1
            if (r12 != r8) goto L_0x01b9
            r4 = r10
            goto L_0x01cb
        L_0x01b9:
            if (r5 != 0) goto L_0x01c2
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r13 = new androidx.compose.ui.Modifier.Node[r6]
            r5.<init>(r13, r3)
        L_0x01c2:
            if (r4 == 0) goto L_0x01c8
            r5.d(r4)
            r4 = r7
        L_0x01c8:
            r5.d(r10)
        L_0x01cb:
            androidx.compose.ui.Modifier$Node r10 = r10.w2()
            goto L_0x01aa
        L_0x01d0:
            if (r12 != r8) goto L_0x01d3
            goto L_0x0188
        L_0x01d3:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.h(r5)
            goto L_0x0188
        L_0x01d8:
            java.lang.Object r4 = r18.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01e5
            return r8
        L_0x01e5:
            androidx.compose.ui.Modifier$Node r4 = r11.M()
            r5 = r7
        L_0x01ea:
            if (r4 == 0) goto L_0x023a
            boolean r10 = r4 instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode
            if (r10 == 0) goto L_0x01f9
            androidx.compose.ui.input.rotary.RotaryInputModifierNode r4 = (androidx.compose.ui.input.rotary.RotaryInputModifierNode) r4
            boolean r4 = r4.Q0(r0)
            if (r4 == 0) goto L_0x0235
            return r8
        L_0x01f9:
            int r10 = r4.A2()
            r10 = r10 & r2
            if (r10 == 0) goto L_0x0235
            boolean r10 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r10 == 0) goto L_0x0235
            r10 = r4
            androidx.compose.ui.node.DelegatingNode r10 = (androidx.compose.ui.node.DelegatingNode) r10
            androidx.compose.ui.Modifier$Node r10 = r10.a3()
            r11 = r3
        L_0x020c:
            if (r10 == 0) goto L_0x0232
            int r12 = r10.A2()
            r12 = r12 & r2
            if (r12 == 0) goto L_0x022d
            int r11 = r11 + 1
            if (r11 != r8) goto L_0x021b
            r4 = r10
            goto L_0x022d
        L_0x021b:
            if (r5 != 0) goto L_0x0224
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r12 = new androidx.compose.ui.Modifier.Node[r6]
            r5.<init>(r12, r3)
        L_0x0224:
            if (r4 == 0) goto L_0x022a
            r5.d(r4)
            r4 = r7
        L_0x022a:
            r5.d(r10)
        L_0x022d:
            androidx.compose.ui.Modifier$Node r10 = r10.w2()
            goto L_0x020c
        L_0x0232:
            if (r11 != r8) goto L_0x0235
            goto L_0x01ea
        L_0x0235:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.h(r5)
            goto L_0x01ea
        L_0x023a:
            if (r9 == 0) goto L_0x0253
            int r2 = r9.size()
            r4 = r3
        L_0x0241:
            if (r4 >= r2) goto L_0x0253
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.rotary.RotaryInputModifierNode r5 = (androidx.compose.ui.input.rotary.RotaryInputModifierNode) r5
            boolean r5 = r5.Q0(r0)
            if (r5 == 0) goto L_0x0250
            return r8
        L_0x0250:
            int r4 = r4 + 1
            goto L_0x0241
        L_0x0253:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.f(androidx.compose.ui.input.rotary.RotaryScrollEvent, kotlin.jvm.functions.Function0):boolean");
    }

    public boolean h() {
        return this.f15772m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r11 != 3) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i(boolean r8, boolean r9, boolean r10, int r11) {
        /*
            r7 = this;
            boolean r0 = androidx.compose.ui.ComposeUiFlags.f15479g
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0031
            if (r8 != 0) goto L_0x002c
            androidx.compose.ui.focus.FocusTargetNode r0 = r7.f15765f
            androidx.compose.ui.focus.CustomDestinationResult r11 = androidx.compose.ui.focus.FocusTransactionsKt.g(r0, r11)
            int[] r0 = androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.f15773a
            int r11 = r11.ordinal()
            r11 = r0[r11]
            if (r11 == r4) goto L_0x006e
            if (r11 == r3) goto L_0x006e
            if (r11 == r2) goto L_0x006e
            r0 = 4
            if (r11 != r0) goto L_0x0026
            boolean r1 = r7.z(r8, r9)
            goto L_0x006e
        L_0x0026:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x002c:
            boolean r1 = r7.z(r8, r9)
            goto L_0x006e
        L_0x0031:
            androidx.compose.ui.focus.FocusTransactionManager r0 = r7.l()
            androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 r5 = androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.f15774z
            boolean r6 = r0.i()     // Catch:{ all -> 0x0041 }
            if (r6 == 0) goto L_0x0043
            r0.f()     // Catch:{ all -> 0x0041 }
            goto L_0x0043
        L_0x0041:
            r8 = move-exception
            goto L_0x0078
        L_0x0043:
            r0.e()     // Catch:{ all -> 0x0041 }
            if (r5 == 0) goto L_0x004f
            androidx.compose.runtime.collection.MutableVector r6 = r0.f15826b     // Catch:{ all -> 0x0041 }
            r6.d(r5)     // Catch:{ all -> 0x0041 }
        L_0x004f:
            if (r8 != 0) goto L_0x0065
            androidx.compose.ui.focus.FocusTargetNode r5 = r7.f15765f     // Catch:{ all -> 0x0041 }
            androidx.compose.ui.focus.CustomDestinationResult r11 = androidx.compose.ui.focus.FocusTransactionsKt.g(r5, r11)     // Catch:{ all -> 0x0041 }
            int[] r5 = androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.f15773a     // Catch:{ all -> 0x0041 }
            int r11 = r11.ordinal()     // Catch:{ all -> 0x0041 }
            r11 = r5[r11]     // Catch:{ all -> 0x0041 }
            if (r11 == r4) goto L_0x006b
            if (r11 == r3) goto L_0x006b
            if (r11 == r2) goto L_0x006b
        L_0x0065:
            androidx.compose.ui.focus.FocusTargetNode r11 = r7.f15765f     // Catch:{ all -> 0x0041 }
            boolean r1 = androidx.compose.ui.focus.FocusTransactionsKt.c(r11, r8, r9)     // Catch:{ all -> 0x0041 }
        L_0x006b:
            r0.g()
        L_0x006e:
            if (r1 == 0) goto L_0x0077
            if (r10 == 0) goto L_0x0077
            kotlin.jvm.functions.Function0 r8 = r7.f15762c
            r8.invoke()
        L_0x0077:
            return r1
        L_0x0078:
            r0.g()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.i(boolean, boolean, boolean, int):boolean");
    }

    public FocusState j() {
        return this.f15765f.A0();
    }

    public void k(boolean z2) {
        if (!(!z2 || t() != null)) {
            InlineClassHelperKt.a("Cannot capture focus when the active focus target node is unset");
        }
        this.f15772m = z2;
    }

    public FocusTransactionManager l() {
        return this.f15767h;
    }

    public void m(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        this.f15766g.h(focusPropertiesModifierNode);
    }

    public Rect n() {
        FocusTargetNode A2 = A();
        if (A2 != null) {
            return FocusTraversalKt.d(A2);
        }
        return null;
    }

    public void o(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.f15771l;
        this.f15771l = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            k(false);
        }
        if (ComposeUiFlags.f15476d) {
            MutableObjectList u2 = u();
            Object[] objArr = u2.f1937a;
            int i2 = u2.f1938b;
            for (int i3 = 0; i3 < i2; i3++) {
                ((FocusListener) objArr[i3]).a(focusTargetNode2, focusTargetNode);
            }
        }
    }

    public boolean p(int i2) {
        if (ComposeUiFlags.f15477e && ((Boolean) this.f15761b.invoke(FocusDirection.i(i2))).booleanValue()) {
            return true;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f40908z = Boolean.FALSE;
        int h2 = l().h();
        FocusTargetNode t2 = t();
        Boolean x2 = x(i2, (Rect) this.f15763d.invoke(), new FocusOwnerImpl$moveFocus$focusSearchSuccess$1(objectRef, i2));
        int h3 = l().h();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.d(x2, bool) && (h2 != h3 || (ComposeUiFlags.f15479g && t2 != t()))) {
            return true;
        }
        if (x2 == null || objectRef.f40908z == null) {
            return false;
        }
        if (!Intrinsics.d(x2, bool) || !Intrinsics.d(objectRef.f40908z, bool)) {
            return FocusOwnerImplKt.a(i2) ? i(false, true, false, i2) && E(i2, (Rect) null) : !ComposeUiFlags.f15477e && ((Boolean) this.f15761b.invoke(FocusDirection.i(i2))).booleanValue();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        r8 = r0.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean r(android.view.KeyEvent r15) {
        /*
            r14 = this;
            androidx.compose.ui.focus.FocusInvalidationManager r0 = r14.f15766g
            boolean r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r15 = "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r15)
            return r1
        L_0x0011:
            androidx.compose.ui.focus.FocusTargetNode r0 = r14.f15765f
            androidx.compose.ui.focus.FocusTargetNode r0 = androidx.compose.ui.focus.FocusTraversalKt.b(r0)
            java.lang.String r2 = "visitAncestors called on an unattached node"
            r3 = 131072(0x20000, float:1.83671E-40)
            r4 = 16
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00ba
            int r7 = androidx.compose.ui.node.NodeKind.a(r3)
            androidx.compose.ui.Modifier$Node r8 = r0.M()
            boolean r8 = r8.F2()
            if (r8 != 0) goto L_0x0032
            androidx.compose.ui.internal.InlineClassHelperKt.c(r2)
        L_0x0032:
            androidx.compose.ui.Modifier$Node r8 = r0.M()
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.DelegatableNodeKt.o(r0)
        L_0x003a:
            if (r0 == 0) goto L_0x00b6
            androidx.compose.ui.node.NodeChain r9 = r0.u0()
            androidx.compose.ui.Modifier$Node r9 = r9.k()
            int r9 = r9.v2()
            r9 = r9 & r7
            if (r9 == 0) goto L_0x00a3
        L_0x004b:
            if (r8 == 0) goto L_0x00a3
            int r9 = r8.A2()
            r9 = r9 & r7
            if (r9 == 0) goto L_0x009e
            r10 = r5
            r9 = r8
        L_0x0056:
            if (r9 == 0) goto L_0x009e
            boolean r11 = r9 instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
            if (r11 == 0) goto L_0x005d
            goto L_0x00b7
        L_0x005d:
            int r11 = r9.A2()
            r11 = r11 & r7
            if (r11 == 0) goto L_0x0099
            boolean r11 = r9 instanceof androidx.compose.ui.node.DelegatingNode
            if (r11 == 0) goto L_0x0099
            r11 = r9
            androidx.compose.ui.node.DelegatingNode r11 = (androidx.compose.ui.node.DelegatingNode) r11
            androidx.compose.ui.Modifier$Node r11 = r11.a3()
            r12 = r1
        L_0x0070:
            if (r11 == 0) goto L_0x0096
            int r13 = r11.A2()
            r13 = r13 & r7
            if (r13 == 0) goto L_0x0091
            int r12 = r12 + 1
            if (r12 != r6) goto L_0x007f
            r9 = r11
            goto L_0x0091
        L_0x007f:
            if (r10 != 0) goto L_0x0088
            androidx.compose.runtime.collection.MutableVector r10 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r13 = new androidx.compose.ui.Modifier.Node[r4]
            r10.<init>(r13, r1)
        L_0x0088:
            if (r9 == 0) goto L_0x008e
            r10.d(r9)
            r9 = r5
        L_0x008e:
            r10.d(r11)
        L_0x0091:
            androidx.compose.ui.Modifier$Node r11 = r11.w2()
            goto L_0x0070
        L_0x0096:
            if (r12 != r6) goto L_0x0099
            goto L_0x0056
        L_0x0099:
            androidx.compose.ui.Modifier$Node r9 = androidx.compose.ui.node.DelegatableNodeKt.h(r10)
            goto L_0x0056
        L_0x009e:
            androidx.compose.ui.Modifier$Node r8 = r8.C2()
            goto L_0x004b
        L_0x00a3:
            androidx.compose.ui.node.LayoutNode r0 = r0.C0()
            if (r0 == 0) goto L_0x00b4
            androidx.compose.ui.node.NodeChain r8 = r0.u0()
            if (r8 == 0) goto L_0x00b4
            androidx.compose.ui.Modifier$Node r8 = r8.o()
            goto L_0x003a
        L_0x00b4:
            r8 = r5
            goto L_0x003a
        L_0x00b6:
            r9 = r5
        L_0x00b7:
            androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode r9 = (androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) r9
            goto L_0x00bb
        L_0x00ba:
            r9 = r5
        L_0x00bb:
            if (r9 == 0) goto L_0x0244
            int r0 = androidx.compose.ui.node.NodeKind.a(r3)
            androidx.compose.ui.Modifier$Node r3 = r9.M()
            boolean r3 = r3.F2()
            if (r3 != 0) goto L_0x00ce
            androidx.compose.ui.internal.InlineClassHelperKt.c(r2)
        L_0x00ce:
            androidx.compose.ui.Modifier$Node r2 = r9.M()
            androidx.compose.ui.Modifier$Node r2 = r2.C2()
            androidx.compose.ui.node.LayoutNode r3 = androidx.compose.ui.node.DelegatableNodeKt.o(r9)
            r7 = r5
        L_0x00db:
            if (r3 == 0) goto L_0x0163
            androidx.compose.ui.node.NodeChain r8 = r3.u0()
            androidx.compose.ui.Modifier$Node r8 = r8.k()
            int r8 = r8.v2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x014e
        L_0x00ec:
            if (r2 == 0) goto L_0x014e
            int r8 = r2.A2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x0149
            r8 = r2
            r10 = r5
        L_0x00f7:
            if (r8 == 0) goto L_0x0149
            boolean r11 = r8 instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
            if (r11 == 0) goto L_0x0108
            if (r7 != 0) goto L_0x0104
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0104:
            r7.add(r8)
            goto L_0x0144
        L_0x0108:
            int r11 = r8.A2()
            r11 = r11 & r0
            if (r11 == 0) goto L_0x0144
            boolean r11 = r8 instanceof androidx.compose.ui.node.DelegatingNode
            if (r11 == 0) goto L_0x0144
            r11 = r8
            androidx.compose.ui.node.DelegatingNode r11 = (androidx.compose.ui.node.DelegatingNode) r11
            androidx.compose.ui.Modifier$Node r11 = r11.a3()
            r12 = r1
        L_0x011b:
            if (r11 == 0) goto L_0x0141
            int r13 = r11.A2()
            r13 = r13 & r0
            if (r13 == 0) goto L_0x013c
            int r12 = r12 + 1
            if (r12 != r6) goto L_0x012a
            r8 = r11
            goto L_0x013c
        L_0x012a:
            if (r10 != 0) goto L_0x0133
            androidx.compose.runtime.collection.MutableVector r10 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r13 = new androidx.compose.ui.Modifier.Node[r4]
            r10.<init>(r13, r1)
        L_0x0133:
            if (r8 == 0) goto L_0x0139
            r10.d(r8)
            r8 = r5
        L_0x0139:
            r10.d(r11)
        L_0x013c:
            androidx.compose.ui.Modifier$Node r11 = r11.w2()
            goto L_0x011b
        L_0x0141:
            if (r12 != r6) goto L_0x0144
            goto L_0x00f7
        L_0x0144:
            androidx.compose.ui.Modifier$Node r8 = androidx.compose.ui.node.DelegatableNodeKt.h(r10)
            goto L_0x00f7
        L_0x0149:
            androidx.compose.ui.Modifier$Node r2 = r2.C2()
            goto L_0x00ec
        L_0x014e:
            androidx.compose.ui.node.LayoutNode r3 = r3.C0()
            if (r3 == 0) goto L_0x0160
            androidx.compose.ui.node.NodeChain r2 = r3.u0()
            if (r2 == 0) goto L_0x0160
            androidx.compose.ui.Modifier$Node r2 = r2.o()
            goto L_0x00db
        L_0x0160:
            r2 = r5
            goto L_0x00db
        L_0x0163:
            if (r7 == 0) goto L_0x0181
            int r2 = r7.size()
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0181
        L_0x016d:
            int r3 = r2 + -1
            java.lang.Object r2 = r7.get(r2)
            androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode r2 = (androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) r2
            boolean r2 = r2.p0(r15)
            if (r2 == 0) goto L_0x017c
            return r6
        L_0x017c:
            if (r3 >= 0) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r2 = r3
            goto L_0x016d
        L_0x0181:
            androidx.compose.ui.Modifier$Node r2 = r9.M()
            r3 = r5
        L_0x0186:
            if (r2 == 0) goto L_0x01d6
            boolean r8 = r2 instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
            if (r8 == 0) goto L_0x0195
            androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode r2 = (androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) r2
            boolean r2 = r2.p0(r15)
            if (r2 == 0) goto L_0x01d1
            return r6
        L_0x0195:
            int r8 = r2.A2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x01d1
            boolean r8 = r2 instanceof androidx.compose.ui.node.DelegatingNode
            if (r8 == 0) goto L_0x01d1
            r8 = r2
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.a3()
            r10 = r1
        L_0x01a8:
            if (r8 == 0) goto L_0x01ce
            int r11 = r8.A2()
            r11 = r11 & r0
            if (r11 == 0) goto L_0x01c9
            int r10 = r10 + 1
            if (r10 != r6) goto L_0x01b7
            r2 = r8
            goto L_0x01c9
        L_0x01b7:
            if (r3 != 0) goto L_0x01c0
            androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r11 = new androidx.compose.ui.Modifier.Node[r4]
            r3.<init>(r11, r1)
        L_0x01c0:
            if (r2 == 0) goto L_0x01c6
            r3.d(r2)
            r2 = r5
        L_0x01c6:
            r3.d(r8)
        L_0x01c9:
            androidx.compose.ui.Modifier$Node r8 = r8.w2()
            goto L_0x01a8
        L_0x01ce:
            if (r10 != r6) goto L_0x01d1
            goto L_0x0186
        L_0x01d1:
            androidx.compose.ui.Modifier$Node r2 = androidx.compose.ui.node.DelegatableNodeKt.h(r3)
            goto L_0x0186
        L_0x01d6:
            androidx.compose.ui.Modifier$Node r2 = r9.M()
            r3 = r5
        L_0x01db:
            if (r2 == 0) goto L_0x022b
            boolean r8 = r2 instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
            if (r8 == 0) goto L_0x01ea
            androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode r2 = (androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) r2
            boolean r2 = r2.x1(r15)
            if (r2 == 0) goto L_0x0226
            return r6
        L_0x01ea:
            int r8 = r2.A2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x0226
            boolean r8 = r2 instanceof androidx.compose.ui.node.DelegatingNode
            if (r8 == 0) goto L_0x0226
            r8 = r2
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.a3()
            r9 = r1
        L_0x01fd:
            if (r8 == 0) goto L_0x0223
            int r10 = r8.A2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x021e
            int r9 = r9 + 1
            if (r9 != r6) goto L_0x020c
            r2 = r8
            goto L_0x021e
        L_0x020c:
            if (r3 != 0) goto L_0x0215
            androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r4]
            r3.<init>(r10, r1)
        L_0x0215:
            if (r2 == 0) goto L_0x021b
            r3.d(r2)
            r2 = r5
        L_0x021b:
            r3.d(r8)
        L_0x021e:
            androidx.compose.ui.Modifier$Node r8 = r8.w2()
            goto L_0x01fd
        L_0x0223:
            if (r9 != r6) goto L_0x0226
            goto L_0x01db
        L_0x0226:
            androidx.compose.ui.Modifier$Node r2 = androidx.compose.ui.node.DelegatableNodeKt.h(r3)
            goto L_0x01db
        L_0x022b:
            if (r7 == 0) goto L_0x0244
            int r0 = r7.size()
            r2 = r1
        L_0x0232:
            if (r2 >= r0) goto L_0x0244
            java.lang.Object r3 = r7.get(r2)
            androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode r3 = (androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) r3
            boolean r3 = r3.x1(r15)
            if (r3 == 0) goto L_0x0241
            return r6
        L_0x0241:
            int r2 = r2 + 1
            goto L_0x0232
        L_0x0244:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.r(android.view.KeyEvent):boolean");
    }

    public void s() {
        if (ComposeUiFlags.f15479g) {
            FocusTransactionsKt.c(this.f15765f, true, true);
            return;
        }
        FocusTransactionManager l2 = l();
        if (l2.i()) {
            FocusTransactionsKt.c(this.f15765f, true, true);
            return;
        }
        try {
            l2.e();
            FocusTransactionsKt.c(this.f15765f, true, true);
        } finally {
            l2.g();
        }
    }

    public FocusTargetNode t() {
        return this.f15771l;
    }

    public MutableObjectList u() {
        return this.f15770k;
    }

    public boolean v(FocusDirection focusDirection, Rect rect) {
        return ((Boolean) this.f15760a.m(focusDirection, rect)).booleanValue();
    }

    public void w(boolean z2) {
        i(z2, true, true, FocusDirection.f15729b.c());
    }

    public Boolean x(int i2, Rect rect, Function1 function1) {
        FocusTargetNode A2 = A();
        if (A2 != null) {
            FocusRequester a2 = FocusTraversalKt.a(A2, i2, (LayoutDirection) this.f15764e.invoke());
            FocusRequester.Companion companion = FocusRequester.f15802b;
            if (Intrinsics.d(a2, companion.a())) {
                return null;
            }
            if (Intrinsics.d(a2, companion.c())) {
                FocusTargetNode A3 = A();
                if (A3 != null) {
                    return (Boolean) function1.invoke(A3);
                }
                return null;
            } else if (!Intrinsics.d(a2, companion.b())) {
                return Boolean.valueOf(a2.d(function1));
            }
        } else {
            A2 = null;
        }
        return FocusTraversalKt.e(this.f15765f, i2, (LayoutDirection) this.f15764e.invoke(), rect, new FocusOwnerImpl$focusSearch$1(A2, this, function1));
    }

    public final boolean z(boolean z2, boolean z3) {
        NodeChain u0;
        if (t() == null) {
            return true;
        }
        if (h() && !z2) {
            return false;
        }
        FocusTargetNode t2 = t();
        o((FocusTargetNode) null);
        if (z3 && t2 != null) {
            t2.f3(h() ? FocusStateImpl.Captured : FocusStateImpl.Active, FocusStateImpl.Inactive);
            int a2 = NodeKind.a(1024);
            if (!t2.M().F2()) {
                InlineClassHelperKt.c("visitAncestors called on an unattached node");
            }
            Modifier.Node C2 = t2.M().C2();
            LayoutNode o2 = DelegatableNodeKt.o(t2);
            while (o2 != null) {
                if ((o2.u0().k().v2() & a2) != 0) {
                    while (C2 != null) {
                        if ((C2.A2() & a2) != 0) {
                            MutableVector mutableVector = null;
                            Modifier.Node node = C2;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    ((FocusTargetNode) node).f3(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                        if ((a3.A2() & a2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node = a3;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector.d(node);
                                                    node = null;
                                                }
                                                mutableVector.d(a3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.h(mutableVector);
                            }
                        }
                        C2 = C2.C2();
                    }
                }
                o2 = o2.C0();
                C2 = (o2 == null || (u0 = o2.u0()) == null) ? null : u0.o();
            }
        }
        return true;
    }
}
