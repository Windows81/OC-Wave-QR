package androidx.compose.ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.ComposeUiFlags;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FocusInvalidationManager {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f15743a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f15744b;

    /* renamed from: c  reason: collision with root package name */
    public final Function0 f15745c;

    /* renamed from: d  reason: collision with root package name */
    public final Function0 f15746d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableScatterSet f15747e = ScatterSetKt.a();

    /* renamed from: f  reason: collision with root package name */
    public final MutableScatterSet f15748f = ScatterSetKt.a();

    /* renamed from: g  reason: collision with root package name */
    public final List f15749g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List f15750h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final List f15751i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final List f15752j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public boolean f15753k;

    public FocusInvalidationManager(Function1 function1, Function0 function0, Function0 function02, Function0 function03) {
        this.f15743a = function1;
        this.f15744b = function0;
        this.f15745c = function02;
        this.f15746d = function03;
    }

    public final boolean b() {
        return ComposeUiFlags.f15479g ? this.f15753k : !this.f15749g.isEmpty() || !this.f15751i.isEmpty() || !this.f15750h.isEmpty();
    }

    public final void c() {
        if (ComposeUiFlags.f15479g) {
            e();
        } else {
            d();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v25, types: [int] */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r19 = this;
            r0 = r19
            kotlin.jvm.functions.Function0 r1 = r0.f15745c
            java.lang.Object r1 = r1.invoke()
            androidx.compose.ui.focus.FocusState r1 = (androidx.compose.ui.focus.FocusState) r1
            boolean r1 = r1.d()
            r2 = 0
            if (r1 != 0) goto L_0x006a
            java.util.List r1 = r0.f15750h
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = r2
        L_0x001b:
            if (r4 >= r3) goto L_0x002b
            java.lang.Object r5 = r1.get(r4)
            androidx.compose.ui.focus.FocusEventModifierNode r5 = (androidx.compose.ui.focus.FocusEventModifierNode) r5
            androidx.compose.ui.focus.FocusStateImpl r6 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r5.X(r6)
            int r4 = r4 + 1
            goto L_0x001b
        L_0x002b:
            java.util.List r1 = r0.f15749g
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
        L_0x0034:
            if (r2 >= r3) goto L_0x0050
            java.lang.Object r4 = r1.get(r2)
            androidx.compose.ui.focus.FocusTargetNode r4 = (androidx.compose.ui.focus.FocusTargetNode) r4
            boolean r5 = r4.F2()
            if (r5 == 0) goto L_0x004d
            boolean r5 = r4.q3()
            if (r5 != 0) goto L_0x004d
            androidx.compose.ui.focus.FocusStateImpl r5 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r4.n3(r5)
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0050:
            java.util.List r1 = r0.f15749g
            r1.clear()
            java.util.List r1 = r0.f15750h
            r1.clear()
            java.util.List r1 = r0.f15751i
            r1.clear()
            java.util.List r1 = r0.f15752j
            r1.clear()
            kotlin.jvm.functions.Function0 r1 = r0.f15744b
            r1.invoke()
            return
        L_0x006a:
            java.util.List r1 = r0.f15751i
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = r2
        L_0x0074:
            java.lang.String r5 = "visitChildren called on an unattached node"
            r6 = 1024(0x400, float:1.435E-42)
            r7 = 16
            r9 = 1
            if (r4 >= r3) goto L_0x018c
            java.lang.Object r10 = r1.get(r4)
            androidx.compose.ui.focus.FocusPropertiesModifierNode r10 = (androidx.compose.ui.focus.FocusPropertiesModifierNode) r10
            androidx.compose.ui.Modifier$Node r11 = r10.M()
            boolean r11 = r11.F2()
            if (r11 == 0) goto L_0x0188
            int r6 = androidx.compose.ui.node.NodeKind.a(r6)
            androidx.compose.ui.Modifier$Node r11 = r10.M()
            r12 = 0
        L_0x0096:
            if (r11 == 0) goto L_0x00e5
            boolean r13 = r11 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r13 == 0) goto L_0x00a4
            androidx.compose.ui.focus.FocusTargetNode r11 = (androidx.compose.ui.focus.FocusTargetNode) r11
            java.util.List r13 = r0.f15749g
            r13.add(r11)
            goto L_0x00e0
        L_0x00a4:
            int r13 = r11.A2()
            r13 = r13 & r6
            if (r13 == 0) goto L_0x00e0
            boolean r13 = r11 instanceof androidx.compose.ui.node.DelegatingNode
            if (r13 == 0) goto L_0x00e0
            r13 = r11
            androidx.compose.ui.node.DelegatingNode r13 = (androidx.compose.ui.node.DelegatingNode) r13
            androidx.compose.ui.Modifier$Node r13 = r13.a3()
            r14 = r2
        L_0x00b7:
            if (r13 == 0) goto L_0x00dd
            int r15 = r13.A2()
            r15 = r15 & r6
            if (r15 == 0) goto L_0x00d8
            int r14 = r14 + 1
            if (r14 != r9) goto L_0x00c6
            r11 = r13
            goto L_0x00d8
        L_0x00c6:
            if (r12 != 0) goto L_0x00cf
            androidx.compose.runtime.collection.MutableVector r12 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r15 = new androidx.compose.ui.Modifier.Node[r7]
            r12.<init>(r15, r2)
        L_0x00cf:
            if (r11 == 0) goto L_0x00d5
            r12.d(r11)
            r11 = 0
        L_0x00d5:
            r12.d(r13)
        L_0x00d8:
            androidx.compose.ui.Modifier$Node r13 = r13.w2()
            goto L_0x00b7
        L_0x00dd:
            if (r14 != r9) goto L_0x00e0
            goto L_0x0096
        L_0x00e0:
            androidx.compose.ui.Modifier$Node r11 = androidx.compose.ui.node.DelegatableNodeKt.h(r12)
            goto L_0x0096
        L_0x00e5:
            androidx.compose.ui.Modifier$Node r11 = r10.M()
            boolean r11 = r11.F2()
            if (r11 != 0) goto L_0x00f2
            androidx.compose.ui.internal.InlineClassHelperKt.c(r5)
        L_0x00f2:
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r11 = new androidx.compose.ui.Modifier.Node[r7]
            r5.<init>(r11, r2)
            androidx.compose.ui.Modifier$Node r11 = r10.M()
            androidx.compose.ui.Modifier$Node r11 = r11.w2()
            if (r11 != 0) goto L_0x010b
            androidx.compose.ui.Modifier$Node r10 = r10.M()
            androidx.compose.ui.node.DelegatableNodeKt.c(r5, r10, r2)
            goto L_0x010e
        L_0x010b:
            r5.d(r11)
        L_0x010e:
            int r10 = r5.p()
            if (r10 == 0) goto L_0x0188
            int r10 = r5.p()
            int r10 = r10 - r9
            java.lang.Object r10 = r5.y(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.ui.Modifier.Node) r10
            int r11 = r10.v2()
            r11 = r11 & r6
            if (r11 != 0) goto L_0x012a
            androidx.compose.ui.node.DelegatableNodeKt.c(r5, r10, r2)
            goto L_0x010e
        L_0x012a:
            if (r10 == 0) goto L_0x010e
            int r11 = r10.A2()
            r11 = r11 & r6
            if (r11 == 0) goto L_0x0183
            r11 = 0
        L_0x0134:
            if (r10 == 0) goto L_0x010e
            boolean r12 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r12 == 0) goto L_0x0142
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            java.util.List r12 = r0.f15749g
            r12.add(r10)
            goto L_0x017e
        L_0x0142:
            int r12 = r10.A2()
            r12 = r12 & r6
            if (r12 == 0) goto L_0x017e
            boolean r12 = r10 instanceof androidx.compose.ui.node.DelegatingNode
            if (r12 == 0) goto L_0x017e
            r12 = r10
            androidx.compose.ui.node.DelegatingNode r12 = (androidx.compose.ui.node.DelegatingNode) r12
            androidx.compose.ui.Modifier$Node r12 = r12.a3()
            r13 = r2
        L_0x0155:
            if (r12 == 0) goto L_0x017b
            int r14 = r12.A2()
            r14 = r14 & r6
            if (r14 == 0) goto L_0x0176
            int r13 = r13 + 1
            if (r13 != r9) goto L_0x0164
            r10 = r12
            goto L_0x0176
        L_0x0164:
            if (r11 != 0) goto L_0x016d
            androidx.compose.runtime.collection.MutableVector r11 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r14 = new androidx.compose.ui.Modifier.Node[r7]
            r11.<init>(r14, r2)
        L_0x016d:
            if (r10 == 0) goto L_0x0173
            r11.d(r10)
            r10 = 0
        L_0x0173:
            r11.d(r12)
        L_0x0176:
            androidx.compose.ui.Modifier$Node r12 = r12.w2()
            goto L_0x0155
        L_0x017b:
            if (r13 != r9) goto L_0x017e
            goto L_0x0134
        L_0x017e:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.h(r11)
            goto L_0x0134
        L_0x0183:
            androidx.compose.ui.Modifier$Node r10 = r10.w2()
            goto L_0x012a
        L_0x0188:
            int r4 = r4 + 1
            goto L_0x0074
        L_0x018c:
            java.util.List r1 = r0.f15751i
            r1.clear()
            java.util.List r1 = r0.f15750h
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = r2
        L_0x019b:
            if (r4 >= r3) goto L_0x0321
            java.lang.Object r10 = r1.get(r4)
            androidx.compose.ui.focus.FocusEventModifierNode r10 = (androidx.compose.ui.focus.FocusEventModifierNode) r10
            androidx.compose.ui.Modifier$Node r11 = r10.M()
            boolean r11 = r11.F2()
            if (r11 != 0) goto L_0x01b6
            androidx.compose.ui.focus.FocusStateImpl r11 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r10.X(r11)
            r7 = r2
            r2 = r9
            goto L_0x0317
        L_0x01b6:
            int r11 = androidx.compose.ui.node.NodeKind.a(r6)
            androidx.compose.ui.Modifier$Node r12 = r10.M()
            r16 = r2
            r15 = r9
            r13 = 0
            r14 = 0
        L_0x01c3:
            if (r12 == 0) goto L_0x0229
            boolean r6 = r12 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r6 == 0) goto L_0x01df
            androidx.compose.ui.focus.FocusTargetNode r12 = (androidx.compose.ui.focus.FocusTargetNode) r12
            if (r13 == 0) goto L_0x01cf
            r16 = r9
        L_0x01cf:
            java.util.List r6 = r0.f15749g
            boolean r6 = r6.contains(r12)
            if (r6 == 0) goto L_0x01dd
            java.util.List r6 = r0.f15752j
            r6.add(r12)
            r15 = r2
        L_0x01dd:
            r13 = r12
            goto L_0x0221
        L_0x01df:
            int r6 = r12.A2()
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0221
            boolean r6 = r12 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto L_0x0221
            r6 = r12
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.a3()
            r8 = r2
        L_0x01f2:
            if (r6 == 0) goto L_0x021a
            int r17 = r6.A2()
            r17 = r17 & r11
            if (r17 == 0) goto L_0x0214
            int r8 = r8 + 1
            if (r8 != r9) goto L_0x0202
            r12 = r6
            goto L_0x0214
        L_0x0202:
            if (r14 != 0) goto L_0x020b
            androidx.compose.runtime.collection.MutableVector r14 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r7]
            r14.<init>(r9, r2)
        L_0x020b:
            if (r12 == 0) goto L_0x0211
            r14.d(r12)
            r12 = 0
        L_0x0211:
            r14.d(r6)
        L_0x0214:
            androidx.compose.ui.Modifier$Node r6 = r6.w2()
            r9 = 1
            goto L_0x01f2
        L_0x021a:
            r6 = r9
            if (r8 != r6) goto L_0x0221
            r9 = r6
            r6 = 1024(0x400, float:1.435E-42)
            goto L_0x01c3
        L_0x0221:
            androidx.compose.ui.Modifier$Node r12 = androidx.compose.ui.node.DelegatableNodeKt.h(r14)
            r6 = 1024(0x400, float:1.435E-42)
            r9 = 1
            goto L_0x01c3
        L_0x0229:
            androidx.compose.ui.Modifier$Node r6 = r10.M()
            boolean r6 = r6.F2()
            if (r6 != 0) goto L_0x0236
            androidx.compose.ui.internal.InlineClassHelperKt.c(r5)
        L_0x0236:
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r7]
            r6.<init>(r8, r2)
            androidx.compose.ui.Modifier$Node r8 = r10.M()
            androidx.compose.ui.Modifier$Node r8 = r8.w2()
            if (r8 != 0) goto L_0x024f
            androidx.compose.ui.Modifier$Node r8 = r10.M()
            androidx.compose.ui.node.DelegatableNodeKt.c(r6, r8, r2)
            goto L_0x0252
        L_0x024f:
            r6.d(r8)
        L_0x0252:
            int r8 = r6.p()
            if (r8 == 0) goto L_0x02ff
            int r8 = r6.p()
            r9 = 1
            int r8 = r8 - r9
            java.lang.Object r8 = r6.y(r8)
            androidx.compose.ui.Modifier$Node r8 = (androidx.compose.ui.Modifier.Node) r8
            int r9 = r8.v2()
            r9 = r9 & r11
            if (r9 != 0) goto L_0x0272
            androidx.compose.ui.node.DelegatableNodeKt.c(r6, r8, r2)
        L_0x026e:
            r7 = r2
            r2 = 1
            goto L_0x02fd
        L_0x0272:
            if (r8 == 0) goto L_0x026e
            int r9 = r8.A2()
            r9 = r9 & r11
            if (r9 == 0) goto L_0x02f2
            r9 = 0
        L_0x027c:
            if (r8 == 0) goto L_0x02ed
            boolean r12 = r8 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r12 == 0) goto L_0x029a
            androidx.compose.ui.focus.FocusTargetNode r8 = (androidx.compose.ui.focus.FocusTargetNode) r8
            if (r13 == 0) goto L_0x0288
            r16 = 1
        L_0x0288:
            java.util.List r12 = r0.f15749g
            boolean r12 = r12.contains(r8)
            if (r12 == 0) goto L_0x0296
            java.util.List r12 = r0.f15752j
            r12.add(r8)
            r15 = r2
        L_0x0296:
            r7 = r2
            r13 = r8
        L_0x0298:
            r2 = 1
            goto L_0x02e8
        L_0x029a:
            int r12 = r8.A2()
            r12 = r12 & r11
            if (r12 == 0) goto L_0x02e6
            boolean r12 = r8 instanceof androidx.compose.ui.node.DelegatingNode
            if (r12 == 0) goto L_0x02e6
            r12 = r8
            androidx.compose.ui.node.DelegatingNode r12 = (androidx.compose.ui.node.DelegatingNode) r12
            androidx.compose.ui.Modifier$Node r12 = r12.a3()
            r14 = r2
        L_0x02ad:
            if (r12 == 0) goto L_0x02de
            int r18 = r12.A2()
            r18 = r18 & r11
            if (r18 == 0) goto L_0x02d5
            int r14 = r14 + 1
            r2 = 1
            if (r14 != r2) goto L_0x02bf
            r8 = r12
            r7 = 0
            goto L_0x02d6
        L_0x02bf:
            if (r9 != 0) goto L_0x02ca
            androidx.compose.runtime.collection.MutableVector r9 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r2 = new androidx.compose.ui.Modifier.Node[r7]
            r7 = 0
            r9.<init>(r2, r7)
            goto L_0x02cb
        L_0x02ca:
            r7 = 0
        L_0x02cb:
            if (r8 == 0) goto L_0x02d1
            r9.d(r8)
            r8 = 0
        L_0x02d1:
            r9.d(r12)
            goto L_0x02d6
        L_0x02d5:
            r7 = r2
        L_0x02d6:
            androidx.compose.ui.Modifier$Node r12 = r12.w2()
            r2 = r7
            r7 = 16
            goto L_0x02ad
        L_0x02de:
            r7 = r2
            r2 = 1
            if (r14 != r2) goto L_0x02e8
        L_0x02e2:
            r2 = r7
            r7 = 16
            goto L_0x027c
        L_0x02e6:
            r7 = r2
            goto L_0x0298
        L_0x02e8:
            androidx.compose.ui.Modifier$Node r8 = androidx.compose.ui.node.DelegatableNodeKt.h(r9)
            goto L_0x02e2
        L_0x02ed:
            r7 = r2
        L_0x02ee:
            r7 = 16
            goto L_0x0252
        L_0x02f2:
            r7 = r2
            r2 = 1
            androidx.compose.ui.Modifier$Node r8 = r8.w2()
            r2 = r7
            r7 = 16
            goto L_0x0272
        L_0x02fd:
            r2 = r7
            goto L_0x02ee
        L_0x02ff:
            r7 = r2
            r2 = 1
            if (r15 == 0) goto L_0x0317
            if (r16 == 0) goto L_0x030a
            androidx.compose.ui.focus.FocusState r6 = androidx.compose.ui.focus.FocusEventModifierNodeKt.a(r10)
            goto L_0x0314
        L_0x030a:
            if (r13 == 0) goto L_0x0312
            androidx.compose.ui.focus.FocusStateImpl r6 = r13.A0()
            if (r6 != 0) goto L_0x0314
        L_0x0312:
            androidx.compose.ui.focus.FocusStateImpl r6 = androidx.compose.ui.focus.FocusStateImpl.Inactive
        L_0x0314:
            r10.X(r6)
        L_0x0317:
            int r4 = r4 + 1
            r9 = r2
            r2 = r7
            r6 = 1024(0x400, float:1.435E-42)
            r7 = 16
            goto L_0x019b
        L_0x0321:
            r7 = r2
            java.util.List r1 = r0.f15750h
            r1.clear()
            java.util.List r1 = r0.f15749g
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L_0x0330:
            if (r7 >= r2) goto L_0x0359
            java.lang.Object r3 = r1.get(r7)
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            boolean r4 = r3.F2()
            if (r4 == 0) goto L_0x0356
            androidx.compose.ui.focus.FocusStateImpl r4 = r3.A0()
            r3.p3()
            androidx.compose.ui.focus.FocusStateImpl r5 = r3.A0()
            if (r4 != r5) goto L_0x0353
            java.util.List r4 = r0.f15752j
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0356
        L_0x0353:
            r3.e3()
        L_0x0356:
            int r7 = r7 + 1
            goto L_0x0330
        L_0x0359:
            java.util.List r1 = r0.f15749g
            r1.clear()
            java.util.List r1 = r0.f15752j
            r1.clear()
            kotlin.jvm.functions.Function0 r1 = r0.f15744b
            r1.invoke()
            java.util.List r1 = r0.f15751i
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0375
            java.lang.String r1 = "Unprocessed FocusProperties nodes"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r1)
        L_0x0375:
            java.util.List r1 = r0.f15750h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0382
            java.lang.String r1 = "Unprocessed FocusEvent nodes"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r1)
        L_0x0382:
            java.util.List r1 = r0.f15749g
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x038f
            java.lang.String r1 = "Unprocessed FocusTarget nodes"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r1)
        L_0x038f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusInvalidationManager.d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f0, code lost:
        r11 = r1.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r20 = this;
            r0 = r20
            kotlin.jvm.functions.Function0 r1 = r0.f15746d
            java.lang.Object r1 = r1.invoke()
            androidx.compose.ui.focus.FocusTargetNode r1 = (androidx.compose.ui.focus.FocusTargetNode) r1
            r2 = 128(0x80, double:6.32E-322)
            r4 = 255(0xff, double:1.26E-321)
            r6 = 7
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r9 = 8
            if (r1 != 0) goto L_0x0060
            androidx.collection.MutableScatterSet r1 = r0.f15748f
            java.lang.Object[] r11 = r1.f1967b
            long[] r1 = r1.f1966a
            int r12 = r1.length
            int r12 = r12 + -2
            if (r12 < 0) goto L_0x0145
            r13 = 0
        L_0x0024:
            r14 = r1[r13]
            r16 = r11
            long r10 = ~r14
            long r10 = r10 << r6
            long r10 = r10 & r14
            long r10 = r10 & r7
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0057
            int r10 = r13 - r12
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = 0
        L_0x0038:
            if (r11 >= r10) goto L_0x0055
            long r17 = r14 & r4
            int r17 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r17 >= 0) goto L_0x004f
            int r17 = r13 << 3
            int r17 = r17 + r11
            r17 = r16[r17]
            r2 = r17
            androidx.compose.ui.focus.FocusEventModifierNode r2 = (androidx.compose.ui.focus.FocusEventModifierNode) r2
            androidx.compose.ui.focus.FocusStateImpl r3 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r2.X(r3)
        L_0x004f:
            long r14 = r14 >> r9
            int r11 = r11 + 1
            r2 = 128(0x80, double:6.32E-322)
            goto L_0x0038
        L_0x0055:
            if (r10 != r9) goto L_0x0145
        L_0x0057:
            if (r13 == r12) goto L_0x0145
            int r13 = r13 + 1
            r11 = r16
            r2 = 128(0x80, double:6.32E-322)
            goto L_0x0024
        L_0x0060:
            boolean r2 = r1.F2()
            if (r2 == 0) goto L_0x0145
            androidx.collection.MutableScatterSet r2 = r0.f15747e
            boolean r2 = r2.a(r1)
            if (r2 == 0) goto L_0x0071
            r1.p3()
        L_0x0071:
            androidx.compose.ui.focus.FocusStateImpl r2 = r1.A0()
            r3 = 1024(0x400, float:1.435E-42)
            int r10 = androidx.compose.ui.node.NodeKind.a(r3)
            r11 = 4096(0x1000, float:5.74E-42)
            int r11 = androidx.compose.ui.node.NodeKind.a(r11)
            r10 = r10 | r11
            androidx.compose.ui.Modifier$Node r11 = r1.M()
            boolean r11 = r11.F2()
            if (r11 != 0) goto L_0x0091
            java.lang.String r11 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r11)
        L_0x0091:
            androidx.compose.ui.Modifier$Node r11 = r1.M()
            androidx.compose.ui.node.LayoutNode r1 = androidx.compose.ui.node.DelegatableNodeKt.o(r1)
            r12 = 0
        L_0x009a:
            if (r1 == 0) goto L_0x00fd
            androidx.compose.ui.node.NodeChain r13 = r1.u0()
            androidx.compose.ui.Modifier$Node r13 = r13.k()
            int r13 = r13.v2()
            r13 = r13 & r10
            if (r13 == 0) goto L_0x00ea
        L_0x00ab:
            if (r11 == 0) goto L_0x00ea
            int r13 = r11.A2()
            r13 = r13 & r10
            if (r13 == 0) goto L_0x00e5
            int r13 = androidx.compose.ui.node.NodeKind.a(r3)
            int r14 = r11.A2()
            r13 = r13 & r14
            if (r13 == 0) goto L_0x00c1
            int r12 = r12 + 1
        L_0x00c1:
            boolean r13 = r11 instanceof androidx.compose.ui.focus.FocusEventModifierNode
            if (r13 == 0) goto L_0x00e5
            androidx.collection.MutableScatterSet r13 = r0.f15748f
            boolean r13 = r13.a(r11)
            if (r13 != 0) goto L_0x00ce
            goto L_0x00e5
        L_0x00ce:
            r13 = 1
            if (r12 > r13) goto L_0x00d8
            r13 = r11
            androidx.compose.ui.focus.FocusEventModifierNode r13 = (androidx.compose.ui.focus.FocusEventModifierNode) r13
            r13.X(r2)
            goto L_0x00e0
        L_0x00d8:
            r13 = r11
            androidx.compose.ui.focus.FocusEventModifierNode r13 = (androidx.compose.ui.focus.FocusEventModifierNode) r13
            androidx.compose.ui.focus.FocusStateImpl r14 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent
            r13.X(r14)
        L_0x00e0:
            androidx.collection.MutableScatterSet r13 = r0.f15748f
            r13.y(r11)
        L_0x00e5:
            androidx.compose.ui.Modifier$Node r11 = r11.C2()
            goto L_0x00ab
        L_0x00ea:
            androidx.compose.ui.node.LayoutNode r1 = r1.C0()
            if (r1 == 0) goto L_0x00fb
            androidx.compose.ui.node.NodeChain r11 = r1.u0()
            if (r11 == 0) goto L_0x00fb
            androidx.compose.ui.Modifier$Node r11 = r11.o()
            goto L_0x009a
        L_0x00fb:
            r11 = 0
            goto L_0x009a
        L_0x00fd:
            androidx.collection.MutableScatterSet r1 = r0.f15748f
            java.lang.Object[] r2 = r1.f1967b
            long[] r1 = r1.f1966a
            int r3 = r1.length
            int r3 = r3 + -2
            if (r3 < 0) goto L_0x0145
            r10 = 0
        L_0x0109:
            r11 = r1[r10]
            long r13 = ~r11
            long r13 = r13 << r6
            long r13 = r13 & r11
            long r13 = r13 & r7
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 == 0) goto L_0x013c
            int r13 = r10 - r3
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = 0
        L_0x011b:
            if (r14 >= r13) goto L_0x0137
            long r16 = r11 & r4
            r18 = 128(0x80, double:6.32E-322)
            int r15 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r15 >= 0) goto L_0x0131
            int r15 = r10 << 3
            int r15 = r15 + r14
            r15 = r2[r15]
            androidx.compose.ui.focus.FocusEventModifierNode r15 = (androidx.compose.ui.focus.FocusEventModifierNode) r15
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r15.X(r4)
        L_0x0131:
            long r11 = r11 >> r9
            int r14 = r14 + 1
            r4 = 255(0xff, double:1.26E-321)
            goto L_0x011b
        L_0x0137:
            r18 = 128(0x80, double:6.32E-322)
            if (r13 != r9) goto L_0x0145
            goto L_0x013e
        L_0x013c:
            r18 = 128(0x80, double:6.32E-322)
        L_0x013e:
            if (r10 == r3) goto L_0x0145
            int r10 = r10 + 1
            r4 = 255(0xff, double:1.26E-321)
            goto L_0x0109
        L_0x0145:
            kotlin.jvm.functions.Function0 r1 = r0.f15744b
            r1.invoke()
            androidx.collection.MutableScatterSet r1 = r0.f15747e
            r1.m()
            androidx.collection.MutableScatterSet r1 = r0.f15748f
            r1.m()
            r1 = 0
            r0.f15753k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusInvalidationManager.e():void");
    }

    public final void f(MutableScatterSet mutableScatterSet, Object obj) {
        if (mutableScatterSet.h(obj)) {
            l();
        }
    }

    public final void g(FocusEventModifierNode focusEventModifierNode) {
        if (ComposeUiFlags.f15479g) {
            f(this.f15748f, focusEventModifierNode);
        } else {
            k(this.f15750h, focusEventModifierNode);
        }
    }

    public final void h(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        k(this.f15751i, focusPropertiesModifierNode);
    }

    public final void i(FocusTargetNode focusTargetNode) {
        if (ComposeUiFlags.f15479g) {
            f(this.f15747e, focusTargetNode);
        } else {
            k(this.f15749g, focusTargetNode);
        }
    }

    public final void j() {
        l();
    }

    public final void k(List list, Object obj) {
        if (list.add(obj) && this.f15749g.size() + this.f15750h.size() + this.f15751i.size() == 1) {
            this.f15743a.invoke(new FocusInvalidationManager$scheduleInvalidationLegacy$1(this));
        }
    }

    public final void l() {
        if (!this.f15753k) {
            this.f15743a.invoke(new FocusInvalidationManager$setUpOnRequestApplyChangesListener$1(this));
            this.f15753k = true;
        }
    }
}
