package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public final Function2 N;
    public final Function1 O;
    public boolean P;
    public boolean Q;
    public FocusStateImpl R;
    public final boolean S;
    public int T;
    public int U;

    @Metadata
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {

        /* renamed from: z  reason: collision with root package name */
        public static final FocusTargetElement f15819z = new FocusTargetElement();

        private FocusTargetElement() {
        }

        /* renamed from: c */
        public FocusTargetNode a() {
            return new FocusTargetNode(0, (Function2) null, (Function1) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public void b(FocusTargetNode focusTargetNode) {
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        public int hashCode() {
            return 1739042953;
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15820a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f15821b;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        static {
            /*
                androidx.compose.ui.focus.CustomDestinationResult[] r0 = androidx.compose.ui.focus.CustomDestinationResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.compose.ui.focus.CustomDestinationResult r2 = androidx.compose.ui.focus.CustomDestinationResult.None     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.compose.ui.focus.CustomDestinationResult r3 = androidx.compose.ui.focus.CustomDestinationResult.Redirected     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                androidx.compose.ui.focus.CustomDestinationResult r4 = androidx.compose.ui.focus.CustomDestinationResult.Cancelled     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                androidx.compose.ui.focus.CustomDestinationResult r5 = androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f15820a = r0
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r5 = androidx.compose.ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f15821b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ FocusTargetNode(int i2, Function2 function2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, function2, function1);
    }

    public static final boolean l3(FocusTargetNode focusTargetNode) {
        int a2 = NodeKind.a(1024);
        if (!focusTargetNode.M().F2()) {
            InlineClassHelperKt.c("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusTargetNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector, focusTargetNode.M(), false);
        } else {
            mutableVector.d(w2);
        }
        while (mutableVector.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.y(mutableVector.p() - 1);
            if ((node.v2() & a2) != 0) {
                Modifier.Node node2 = node;
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.A2() & a2) != 0) {
                        Modifier.Node node3 = node2;
                        MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node3;
                                if (focusTargetNode2.q3()) {
                                    int i2 = WhenMappings.f15821b[focusTargetNode2.A0().ordinal()];
                                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                                        return true;
                                    }
                                    if (i2 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else if ((node3.A2() & a2) != 0 && (node3 instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node3).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node3 = a3;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                mutableVector2.d(node3);
                                                node3 = null;
                                            }
                                            mutableVector2.d(a3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.h(mutableVector2);
                        }
                        continue;
                    }
                    node2 = node2.w2();
                }
            }
            DelegatableNodeKt.c(mutableVector, node, false);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        r1 = r10.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m3(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r1 = r10.M()
            boolean r1 = r1.F2()
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r1)
        L_0x0015:
            androidx.compose.ui.Modifier$Node r1 = r10.M()
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            androidx.compose.ui.node.LayoutNode r10 = androidx.compose.ui.node.DelegatableNodeKt.o(r10)
        L_0x0021:
            r2 = 0
            if (r10 == 0) goto L_0x00cc
            androidx.compose.ui.node.NodeChain r3 = r10.u0()
            androidx.compose.ui.Modifier$Node r3 = r3.k()
            int r3 = r3.v2()
            r3 = r3 & r0
            r4 = 0
            if (r3 == 0) goto L_0x00b7
        L_0x0034:
            if (r1 == 0) goto L_0x00b7
            int r3 = r1.A2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00b1
            r3 = r1
            r5 = r4
        L_0x003f:
            if (r3 == 0) goto L_0x00b1
            boolean r6 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            r7 = 1
            if (r6 == 0) goto L_0x006e
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            boolean r6 = r3.q3()
            if (r6 == 0) goto L_0x00ac
            androidx.compose.ui.focus.FocusStateImpl r10 = r3.A0()
            int[] r0 = androidx.compose.ui.focus.FocusTargetNode.WhenMappings.f15821b
            int r10 = r10.ordinal()
            r10 = r0[r10]
            if (r10 == r7) goto L_0x006d
            r0 = 2
            if (r10 == r0) goto L_0x006d
            r0 = 3
            if (r10 == r0) goto L_0x006c
            r0 = 4
            if (r10 != r0) goto L_0x0066
            goto L_0x006d
        L_0x0066:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x006c:
            r2 = r7
        L_0x006d:
            return r2
        L_0x006e:
            int r6 = r3.A2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x00ac
            boolean r6 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto L_0x00ac
            r6 = r3
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.a3()
            r8 = r2
        L_0x0081:
            if (r6 == 0) goto L_0x00a9
            int r9 = r6.A2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x00a4
            int r8 = r8 + 1
            if (r8 != r7) goto L_0x0090
            r3 = r6
            goto L_0x00a4
        L_0x0090:
            if (r5 != 0) goto L_0x009b
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            r9 = 16
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r9]
            r5.<init>(r9, r2)
        L_0x009b:
            if (r3 == 0) goto L_0x00a1
            r5.d(r3)
            r3 = r4
        L_0x00a1:
            r5.d(r6)
        L_0x00a4:
            androidx.compose.ui.Modifier$Node r6 = r6.w2()
            goto L_0x0081
        L_0x00a9:
            if (r8 != r7) goto L_0x00ac
            goto L_0x003f
        L_0x00ac:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.h(r5)
            goto L_0x003f
        L_0x00b1:
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x0034
        L_0x00b7:
            androidx.compose.ui.node.LayoutNode r10 = r10.C0()
            if (r10 == 0) goto L_0x00c9
            androidx.compose.ui.node.NodeChain r1 = r10.u0()
            if (r1 == 0) goto L_0x00c9
            androidx.compose.ui.Modifier$Node r1 = r1.o()
            goto L_0x0021
        L_0x00c9:
            r1 = r4
            goto L_0x0021
        L_0x00cc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.m3(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static /* synthetic */ void o3(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            focusStateImpl = null;
        }
        focusTargetNode.n3(focusStateImpl);
    }

    public boolean D2() {
        return this.S;
    }

    public void I2() {
        if (!ComposeUiFlags.f15479g) {
            FocusTargetNodeKt.b(this);
        }
    }

    public void J2() {
        int i2 = WhenMappings.f15821b[A0().ordinal()];
        if (i2 == 1 || i2 == 2) {
            FocusOwner focusOwner = DelegatableNodeKt.p(this).getFocusOwner();
            focusOwner.i(true, true, false, FocusDirection.f15729b.c());
            if (ComposeUiFlags.f15479g) {
                focusOwner.c();
            } else {
                FocusTargetNodeKt.b(this);
            }
        } else if (i2 == 3 && !ComposeUiFlags.f15479g) {
            FocusTransactionManager c2 = FocusTargetNodeKt.c(this);
            try {
                if (c2.i()) {
                    c2.f();
                }
                c2.e();
                r3(FocusStateImpl.Inactive);
                Unit unit = Unit.f40552a;
                c2.g();
            } catch (Throwable th) {
                c2.g();
                throw th;
            }
        }
        this.R = null;
    }

    public void L1() {
        if (ComposeUiFlags.f15479g) {
            p3();
            return;
        }
        FocusStateImpl i3 = A0();
        p3();
        if (i3 != A0()) {
            e3();
        }
    }

    public boolean c0(int i2) {
        FocusTransactionManager c2;
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z2 = false;
            if (!g3().t()) {
                Trace.endSection();
                return false;
            }
            if (ComposeUiFlags.f15479g) {
                int i3 = WhenMappings.f15820a[FocusTransactionsKt.j(this, i2).ordinal()];
                if (i3 == 1) {
                    z2 = FocusTransactionsKt.k(this);
                } else if (i3 == 2) {
                    z2 = true;
                } else if (i3 != 3) {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                c2 = FocusTargetNodeKt.c(this);
                FocusTargetNode$requestFocus$1$1 focusTargetNode$requestFocus$1$1 = new FocusTargetNode$requestFocus$1$1(this);
                if (c2.i()) {
                    c2.f();
                }
                c2.e();
                c2.f15826b.d(focusTargetNode$requestFocus$1$1);
                int i4 = WhenMappings.f15820a[FocusTransactionsKt.j(this, i2).ordinal()];
                if (i4 == 1) {
                    z2 = FocusTransactionsKt.k(this);
                } else if (i4 == 2) {
                    z2 = true;
                } else if (i4 != 3) {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                c2.g();
            }
            Trace.endSection();
            return z2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void d3() {
        FocusStateImpl j2 = FocusTargetNodeKt.c(this).j(this);
        if (j2 != null) {
            this.R = j2;
        } else {
            InlineClassHelperKt.d("committing a node that was not updated in the current transaction");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cb, code lost:
        r4 = r5.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e3() {
        /*
            r14 = this;
            androidx.compose.ui.focus.FocusStateImpl r0 = r14.R
            if (r0 != 0) goto L_0x0006
            androidx.compose.ui.focus.FocusStateImpl r0 = androidx.compose.ui.focus.FocusStateImpl.Inactive
        L_0x0006:
            androidx.compose.ui.focus.FocusStateImpl r1 = r14.A0()
            if (r0 == r1) goto L_0x0013
            kotlin.jvm.functions.Function2 r2 = r14.N
            if (r2 == 0) goto L_0x0013
            r2.m(r0, r1)
        L_0x0013:
            r0 = 4096(0x1000, float:5.74E-42)
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            r1 = 1024(0x400, float:1.435E-42)
            int r1 = androidx.compose.ui.node.NodeKind.a(r1)
            androidx.compose.ui.Modifier$Node r2 = r14.M()
            r3 = r0 | r1
            androidx.compose.ui.Modifier$Node r4 = r14.M()
            boolean r4 = r4.F2()
            if (r4 != 0) goto L_0x0034
            java.lang.String r4 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r4)
        L_0x0034:
            androidx.compose.ui.Modifier$Node r4 = r14.M()
            androidx.compose.ui.node.LayoutNode r5 = androidx.compose.ui.node.DelegatableNodeKt.o(r14)
        L_0x003c:
            if (r5 == 0) goto L_0x00da
            androidx.compose.ui.node.NodeChain r6 = r5.u0()
            androidx.compose.ui.Modifier$Node r6 = r6.k()
            int r6 = r6.v2()
            r6 = r6 & r3
            r7 = 0
            if (r6 == 0) goto L_0x00c5
        L_0x004e:
            if (r4 == 0) goto L_0x00c5
            int r6 = r4.A2()
            r6 = r6 & r3
            if (r6 == 0) goto L_0x00c0
            if (r4 == r2) goto L_0x0062
            int r6 = r4.A2()
            r6 = r6 & r1
            if (r6 == 0) goto L_0x0062
            goto L_0x00da
        L_0x0062:
            int r6 = r4.A2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x00c0
            r6 = r4
            r8 = r7
        L_0x006b:
            if (r6 == 0) goto L_0x00c0
            boolean r9 = r6 instanceof androidx.compose.ui.focus.FocusEventModifierNode
            if (r9 == 0) goto L_0x007b
            androidx.compose.ui.focus.FocusEventModifierNode r6 = (androidx.compose.ui.focus.FocusEventModifierNode) r6
            androidx.compose.ui.focus.FocusState r9 = androidx.compose.ui.focus.FocusEventModifierNodeKt.a(r6)
            r6.X(r9)
            goto L_0x00bb
        L_0x007b:
            int r9 = r6.A2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x00bb
            boolean r9 = r6 instanceof androidx.compose.ui.node.DelegatingNode
            if (r9 == 0) goto L_0x00bb
            r9 = r6
            androidx.compose.ui.node.DelegatingNode r9 = (androidx.compose.ui.node.DelegatingNode) r9
            androidx.compose.ui.Modifier$Node r9 = r9.a3()
            r10 = 0
            r11 = r10
        L_0x008f:
            r12 = 1
            if (r9 == 0) goto L_0x00b8
            int r13 = r9.A2()
            r13 = r13 & r0
            if (r13 == 0) goto L_0x00b3
            int r11 = r11 + 1
            if (r11 != r12) goto L_0x009f
            r6 = r9
            goto L_0x00b3
        L_0x009f:
            if (r8 != 0) goto L_0x00aa
            androidx.compose.runtime.collection.MutableVector r8 = new androidx.compose.runtime.collection.MutableVector
            r12 = 16
            androidx.compose.ui.Modifier$Node[] r12 = new androidx.compose.ui.Modifier.Node[r12]
            r8.<init>(r12, r10)
        L_0x00aa:
            if (r6 == 0) goto L_0x00b0
            r8.d(r6)
            r6 = r7
        L_0x00b0:
            r8.d(r9)
        L_0x00b3:
            androidx.compose.ui.Modifier$Node r9 = r9.w2()
            goto L_0x008f
        L_0x00b8:
            if (r11 != r12) goto L_0x00bb
            goto L_0x006b
        L_0x00bb:
            androidx.compose.ui.Modifier$Node r6 = androidx.compose.ui.node.DelegatableNodeKt.h(r8)
            goto L_0x006b
        L_0x00c0:
            androidx.compose.ui.Modifier$Node r4 = r4.C2()
            goto L_0x004e
        L_0x00c5:
            androidx.compose.ui.node.LayoutNode r5 = r5.C0()
            if (r5 == 0) goto L_0x00d7
            androidx.compose.ui.node.NodeChain r4 = r5.u0()
            if (r4 == 0) goto L_0x00d7
            androidx.compose.ui.Modifier$Node r4 = r4.o()
            goto L_0x003c
        L_0x00d7:
            r4 = r7
            goto L_0x003c
        L_0x00da:
            kotlin.jvm.functions.Function1 r0 = r14.O
            if (r0 == 0) goto L_0x00e1
            r0.invoke(r14)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.e3():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00da, code lost:
        r8 = r9.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f3(androidx.compose.ui.focus.FocusState r18, androidx.compose.ui.focus.FocusState r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            androidx.compose.ui.node.Owner r2 = androidx.compose.ui.node.DelegatableNodeKt.p(r17)
            androidx.compose.ui.focus.FocusOwner r2 = r2.getFocusOwner()
            androidx.compose.ui.focus.FocusTargetNode r3 = r2.t()
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r18, r19)
            if (r4 != 0) goto L_0x001f
            kotlin.jvm.functions.Function2 r4 = r0.N
            if (r4 == 0) goto L_0x001f
            r5 = r18
            r4.m(r5, r1)
        L_0x001f:
            r4 = 4096(0x1000, float:5.74E-42)
            int r4 = androidx.compose.ui.node.NodeKind.a(r4)
            r5 = 1024(0x400, float:1.435E-42)
            int r5 = androidx.compose.ui.node.NodeKind.a(r5)
            androidx.compose.ui.Modifier$Node r6 = r17.M()
            r7 = r4 | r5
            androidx.compose.ui.Modifier$Node r8 = r17.M()
            boolean r8 = r8.F2()
            if (r8 != 0) goto L_0x0040
            java.lang.String r8 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r8)
        L_0x0040:
            androidx.compose.ui.Modifier$Node r8 = r17.M()
            androidx.compose.ui.node.LayoutNode r9 = androidx.compose.ui.node.DelegatableNodeKt.o(r17)
        L_0x0048:
            if (r9 == 0) goto L_0x00e9
            androidx.compose.ui.node.NodeChain r10 = r9.u0()
            androidx.compose.ui.Modifier$Node r10 = r10.k()
            int r10 = r10.v2()
            r10 = r10 & r7
            if (r10 == 0) goto L_0x00d4
        L_0x0059:
            if (r8 == 0) goto L_0x00d4
            int r10 = r8.A2()
            r10 = r10 & r7
            if (r10 == 0) goto L_0x00cf
            if (r8 == r6) goto L_0x006d
            int r10 = r8.A2()
            r10 = r10 & r5
            if (r10 == 0) goto L_0x006d
            goto L_0x00e9
        L_0x006d:
            int r10 = r8.A2()
            r10 = r10 & r4
            if (r10 == 0) goto L_0x00cf
            r10 = r8
            r12 = 0
        L_0x0076:
            if (r10 == 0) goto L_0x00cf
            boolean r13 = r10 instanceof androidx.compose.ui.focus.FocusEventModifierNode
            if (r13 == 0) goto L_0x0089
            androidx.compose.ui.focus.FocusEventModifierNode r10 = (androidx.compose.ui.focus.FocusEventModifierNode) r10
            androidx.compose.ui.focus.FocusTargetNode r13 = r2.t()
            if (r3 == r13) goto L_0x0085
            goto L_0x00ca
        L_0x0085:
            r10.X(r1)
            goto L_0x00ca
        L_0x0089:
            int r13 = r10.A2()
            r13 = r13 & r4
            if (r13 == 0) goto L_0x00ca
            boolean r13 = r10 instanceof androidx.compose.ui.node.DelegatingNode
            if (r13 == 0) goto L_0x00ca
            r13 = r10
            androidx.compose.ui.node.DelegatingNode r13 = (androidx.compose.ui.node.DelegatingNode) r13
            androidx.compose.ui.Modifier$Node r13 = r13.a3()
            r14 = 0
            r15 = r14
        L_0x009d:
            r11 = 1
            if (r13 == 0) goto L_0x00c7
            int r16 = r13.A2()
            r16 = r16 & r4
            if (r16 == 0) goto L_0x00c2
            int r15 = r15 + 1
            if (r15 != r11) goto L_0x00ae
            r10 = r13
            goto L_0x00c2
        L_0x00ae:
            if (r12 != 0) goto L_0x00b9
            androidx.compose.runtime.collection.MutableVector r12 = new androidx.compose.runtime.collection.MutableVector
            r11 = 16
            androidx.compose.ui.Modifier$Node[] r11 = new androidx.compose.ui.Modifier.Node[r11]
            r12.<init>(r11, r14)
        L_0x00b9:
            if (r10 == 0) goto L_0x00bf
            r12.d(r10)
            r10 = 0
        L_0x00bf:
            r12.d(r13)
        L_0x00c2:
            androidx.compose.ui.Modifier$Node r13 = r13.w2()
            goto L_0x009d
        L_0x00c7:
            if (r15 != r11) goto L_0x00ca
            goto L_0x0076
        L_0x00ca:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.h(r12)
            goto L_0x0076
        L_0x00cf:
            androidx.compose.ui.Modifier$Node r8 = r8.C2()
            goto L_0x0059
        L_0x00d4:
            androidx.compose.ui.node.LayoutNode r9 = r9.C0()
            if (r9 == 0) goto L_0x00e6
            androidx.compose.ui.node.NodeChain r8 = r9.u0()
            if (r8 == 0) goto L_0x00e6
            androidx.compose.ui.Modifier$Node r8 = r8.o()
            goto L_0x0048
        L_0x00e6:
            r8 = 0
            goto L_0x0048
        L_0x00e9:
            kotlin.jvm.functions.Function1 r1 = r0.O
            if (r1 == 0) goto L_0x00f0
            r1.invoke(r0)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.f3(androidx.compose.ui.focus.FocusState, androidx.compose.ui.focus.FocusState):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c4, code lost:
        r5 = r6.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.focus.FocusProperties g3() {
        /*
            r15 = this;
            androidx.compose.ui.focus.FocusPropertiesImpl r0 = new androidx.compose.ui.focus.FocusPropertiesImpl
            r0.<init>()
            int r1 = r15.j3()
            boolean r1 = androidx.compose.ui.focus.Focusability.d(r1, r15)
            r0.B(r1)
            r1 = 2048(0x800, float:2.87E-42)
            int r1 = androidx.compose.ui.node.NodeKind.a(r1)
            r2 = 1024(0x400, float:1.435E-42)
            int r2 = androidx.compose.ui.node.NodeKind.a(r2)
            androidx.compose.ui.Modifier$Node r3 = r15.M()
            r4 = r1 | r2
            androidx.compose.ui.Modifier$Node r5 = r15.M()
            boolean r5 = r5.F2()
            if (r5 != 0) goto L_0x0031
            java.lang.String r5 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r5)
        L_0x0031:
            androidx.compose.ui.Modifier$Node r5 = r15.M()
            androidx.compose.ui.node.LayoutNode r6 = androidx.compose.ui.node.DelegatableNodeKt.o(r15)
        L_0x0039:
            if (r6 == 0) goto L_0x00d3
            androidx.compose.ui.node.NodeChain r7 = r6.u0()
            androidx.compose.ui.Modifier$Node r7 = r7.k()
            int r7 = r7.v2()
            r7 = r7 & r4
            r8 = 0
            if (r7 == 0) goto L_0x00be
        L_0x004b:
            if (r5 == 0) goto L_0x00be
            int r7 = r5.A2()
            r7 = r7 & r4
            if (r7 == 0) goto L_0x00b9
            if (r5 == r3) goto L_0x005f
            int r7 = r5.A2()
            r7 = r7 & r2
            if (r7 == 0) goto L_0x005f
            goto L_0x00d3
        L_0x005f:
            int r7 = r5.A2()
            r7 = r7 & r1
            if (r7 == 0) goto L_0x00b9
            r7 = r5
            r9 = r8
        L_0x0068:
            if (r7 == 0) goto L_0x00b9
            boolean r10 = r7 instanceof androidx.compose.ui.focus.FocusPropertiesModifierNode
            if (r10 == 0) goto L_0x0074
            androidx.compose.ui.focus.FocusPropertiesModifierNode r7 = (androidx.compose.ui.focus.FocusPropertiesModifierNode) r7
            r7.E0(r0)
            goto L_0x00b4
        L_0x0074:
            int r10 = r7.A2()
            r10 = r10 & r1
            if (r10 == 0) goto L_0x00b4
            boolean r10 = r7 instanceof androidx.compose.ui.node.DelegatingNode
            if (r10 == 0) goto L_0x00b4
            r10 = r7
            androidx.compose.ui.node.DelegatingNode r10 = (androidx.compose.ui.node.DelegatingNode) r10
            androidx.compose.ui.Modifier$Node r10 = r10.a3()
            r11 = 0
            r12 = r11
        L_0x0088:
            r13 = 1
            if (r10 == 0) goto L_0x00b1
            int r14 = r10.A2()
            r14 = r14 & r1
            if (r14 == 0) goto L_0x00ac
            int r12 = r12 + 1
            if (r12 != r13) goto L_0x0098
            r7 = r10
            goto L_0x00ac
        L_0x0098:
            if (r9 != 0) goto L_0x00a3
            androidx.compose.runtime.collection.MutableVector r9 = new androidx.compose.runtime.collection.MutableVector
            r13 = 16
            androidx.compose.ui.Modifier$Node[] r13 = new androidx.compose.ui.Modifier.Node[r13]
            r9.<init>(r13, r11)
        L_0x00a3:
            if (r7 == 0) goto L_0x00a9
            r9.d(r7)
            r7 = r8
        L_0x00a9:
            r9.d(r10)
        L_0x00ac:
            androidx.compose.ui.Modifier$Node r10 = r10.w2()
            goto L_0x0088
        L_0x00b1:
            if (r12 != r13) goto L_0x00b4
            goto L_0x0068
        L_0x00b4:
            androidx.compose.ui.Modifier$Node r7 = androidx.compose.ui.node.DelegatableNodeKt.h(r9)
            goto L_0x0068
        L_0x00b9:
            androidx.compose.ui.Modifier$Node r5 = r5.C2()
            goto L_0x004b
        L_0x00be:
            androidx.compose.ui.node.LayoutNode r6 = r6.C0()
            if (r6 == 0) goto L_0x00d0
            androidx.compose.ui.node.NodeChain r5 = r6.u0()
            if (r5 == 0) goto L_0x00d0
            androidx.compose.ui.Modifier$Node r5 = r5.o()
            goto L_0x0039
        L_0x00d0:
            r5 = r8
            goto L_0x0039
        L_0x00d3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.g3():androidx.compose.ui.focus.FocusProperties");
    }

    public final BeyondBoundsLayout h3() {
        return (BeyondBoundsLayout) b(BeyondBoundsLayoutKt.a());
    }

    /* renamed from: i3 */
    public FocusStateImpl A0() {
        FocusStateImpl j2;
        NodeChain u0;
        if (!ComposeUiFlags.f15479g) {
            FocusTransactionManager a2 = FocusTargetNodeKt.a(this);
            if (a2 != null && (j2 = a2.j(this)) != null) {
                return j2;
            }
            FocusStateImpl focusStateImpl = this.R;
            return focusStateImpl == null ? FocusStateImpl.Inactive : focusStateImpl;
        } else if (!F2()) {
            return FocusStateImpl.Inactive;
        } else {
            FocusOwner focusOwner = DelegatableNodeKt.p(this).getFocusOwner();
            FocusTargetNode t2 = focusOwner.t();
            if (t2 == null) {
                return FocusStateImpl.Inactive;
            }
            if (this == t2) {
                return focusOwner.h() ? FocusStateImpl.Captured : FocusStateImpl.Active;
            }
            if (t2.F2()) {
                int a3 = NodeKind.a(1024);
                if (!t2.M().F2()) {
                    InlineClassHelperKt.c("visitAncestors called on an unattached node");
                }
                Modifier.Node C2 = t2.M().C2();
                LayoutNode o2 = DelegatableNodeKt.o(t2);
                while (o2 != null) {
                    if ((o2.u0().k().v2() & a3) != 0) {
                        while (C2 != null) {
                            if ((C2.A2() & a3) != 0) {
                                Modifier.Node node = C2;
                                MutableVector mutableVector = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        if (this == ((FocusTargetNode) node)) {
                                            return FocusStateImpl.ActiveParent;
                                        }
                                    } else if ((node.A2() & a3) != 0 && (node instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node a32 = ((DelegatingNode) node).a3(); a32 != null; a32 = a32.w2()) {
                                            if ((a32.A2() & a3) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    node = a32;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        mutableVector.d(node);
                                                        node = null;
                                                    }
                                                    mutableVector.d(a32);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    node = DelegatableNodeKt.h(mutableVector);
                                }
                                continue;
                            }
                            C2 = C2.C2();
                        }
                    }
                    o2 = o2.C0();
                    C2 = (o2 == null || (u0 = o2.u0()) == null) ? null : u0.o();
                }
            }
            return FocusStateImpl.Inactive;
        }
    }

    public int j3() {
        return this.T;
    }

    public final int k3() {
        return this.U;
    }

    public final void n3(FocusStateImpl focusStateImpl) {
        if (q3()) {
            throw new IllegalStateException("Re-initializing focus target node.");
        } else if (!ComposeUiFlags.f15479g) {
            FocusTransactionManager c2 = FocusTargetNodeKt.c(this);
            try {
                if (c2.i()) {
                    c2.f();
                }
                c2.e();
                if (focusStateImpl == null) {
                    focusStateImpl = (!m3(this) || !l3(this)) ? FocusStateImpl.Inactive : FocusStateImpl.ActiveParent;
                }
                r3(focusStateImpl);
                Unit unit = Unit.f40552a;
                c2.g();
            } catch (Throwable th) {
                c2.g();
                throw th;
            }
        }
    }

    public final void p3() {
        FocusProperties focusProperties = null;
        if (!q3()) {
            o3(this, (FocusStateImpl) null, 1, (Object) null);
        }
        int i2 = WhenMappings.f15821b[A0().ordinal()];
        if (i2 == 1 || i2 == 2) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ObserverModifierNodeKt.a(this, new FocusTargetNode$invalidateFocus$1(objectRef, this));
            Object obj = objectRef.f40908z;
            if (obj == null) {
                Intrinsics.y("focusProperties");
            } else {
                focusProperties = (FocusProperties) obj;
            }
            if (!focusProperties.t()) {
                DelegatableNodeKt.p(this).getFocusOwner().w(true);
            }
        }
    }

    public final boolean q3() {
        return ComposeUiFlags.f15479g || this.R != null;
    }

    public void r3(FocusStateImpl focusStateImpl) {
        if (!ComposeUiFlags.f15479g) {
            FocusTargetNodeKt.c(this).k(this, focusStateImpl);
        }
    }

    public final void s3(int i2) {
        this.U = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusTargetNode(int i2, Function2 function2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Focusability.f15833b.a() : i2, (i3 & 2) != 0 ? null : function2, (i3 & 4) != 0 ? null : function1, (DefaultConstructorMarker) null);
    }

    public FocusTargetNode(int i2, Function2 function2, Function1 function1) {
        this.N = function2;
        this.O = function1;
        this.T = i2;
    }
}
