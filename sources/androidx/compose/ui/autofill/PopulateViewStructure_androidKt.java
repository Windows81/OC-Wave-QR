package androidx.compose.ui.autofill;

import kotlin.Metadata;

@Metadata
public final class PopulateViewStructure_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: androidx.compose.ui.text.AnnotatedString[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: androidx.compose.ui.text.AnnotatedString[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: androidx.compose.ui.state.ToggleableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v9, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: androidx.compose.ui.semantics.Role} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v9, resolved type: androidx.compose.ui.text.AnnotatedString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: androidx.compose.ui.autofill.ContentType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: androidx.compose.ui.text.AnnotatedString[]} */
    /* JADX WARNING: type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0268  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(android.view.ViewStructure r34, androidx.compose.ui.semantics.SemanticsInfo r35, android.view.autofill.AutofillId r36, java.lang.String r37, androidx.compose.ui.spatial.RectManager r38) {
        /*
            r6 = r34
            androidx.compose.ui.autofill.AutofillApi26Helper r7 = androidx.compose.ui.autofill.AutofillApi26Helper.f15576a
            androidx.compose.ui.semantics.SemanticsProperties r0 = androidx.compose.ui.semantics.SemanticsProperties.f18102a
            androidx.compose.ui.semantics.SemanticsActions r1 = androidx.compose.ui.semantics.SemanticsActions.f18056a
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r35.a0()
            r5 = 7
            r10 = 2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r2 == 0) goto L_0x01a8
            androidx.collection.MutableScatterMap r2 = r2.q()
            if (r2 == 0) goto L_0x01a8
            java.lang.Object[] r15 = r2.f1960b
            java.lang.Object[] r14 = r2.f1961c
            long[] r2 = r2.f1959a
            int r3 = r2.length
            int r3 = r3 - r10
            if (r3 < 0) goto L_0x0193
            r4 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x0038:
            r8 = r2[r4]
            r29 = r14
            long r13 = ~r8
            long r13 = r13 << r5
            long r13 = r13 & r8
            long r13 = r13 & r11
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0184
            int r13 = r4 - r3
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r14 = 0
        L_0x004e:
            if (r14 >= r13) goto L_0x0180
            r27 = 255(0xff, double:1.26E-321)
            long r30 = r8 & r27
            r16 = 128(0x80, double:6.32E-322)
            int r30 = (r30 > r16 ? 1 : (r30 == r16 ? 0 : -1))
            if (r30 >= 0) goto L_0x0172
            int r30 = r4 << 3
            int r30 = r30 + r14
            r31 = r15[r30]
            r11 = r29[r30]
            r12 = r31
            androidx.compose.ui.semantics.SemanticsPropertyKey r12 = (androidx.compose.ui.semantics.SemanticsPropertyKey) r12
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r0.c()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType"
            kotlin.jvm.internal.Intrinsics.g(r11, r5)
            r18 = r11
            androidx.compose.ui.autofill.ContentDataType r18 = (androidx.compose.ui.autofill.ContentDataType) r18
            goto L_0x0172
        L_0x007b:
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r0.d()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r5 == 0) goto L_0x0099
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            kotlin.jvm.internal.Intrinsics.g(r11, r5)
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r5 = kotlin.collections.CollectionsKt.g0(r11)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0172
            r7.p(r6, r5)
            goto L_0x0172
        L_0x0099:
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r0.e()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r5 == 0) goto L_0x00ae
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType"
            kotlin.jvm.internal.Intrinsics.g(r11, r5)
            r21 = r11
            androidx.compose.ui.autofill.ContentType r21 = (androidx.compose.ui.autofill.ContentType) r21
            goto L_0x0172
        L_0x00ae:
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r0.g()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r5 == 0) goto L_0x00c3
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString"
            kotlin.jvm.internal.Intrinsics.g(r11, r5)
            r26 = r11
            androidx.compose.ui.text.AnnotatedString r26 = (androidx.compose.ui.text.AnnotatedString) r26
            goto L_0x0172
        L_0x00c3:
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r0.i()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.Boolean"
            if (r5 == 0) goto L_0x00dd
            kotlin.jvm.internal.Intrinsics.g(r11, r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r5 = r11.booleanValue()
            r7.u(r6, r5)
            goto L_0x0172
        L_0x00dd:
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r0.y()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r5 == 0) goto L_0x00f2
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.Intrinsics.g(r11, r5)
            r25 = r11
            java.lang.Integer r25 = (java.lang.Integer) r25
            goto L_0x0172
        L_0x00f2:
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r0.A()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r5 == 0) goto L_0x0100
            r24 = 1
            goto L_0x0172
        L_0x0100:
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r0.C()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r5 == 0) goto L_0x0114
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.semantics.Role"
            kotlin.jvm.internal.Intrinsics.g(r11, r5)
            r23 = r11
            androidx.compose.ui.semantics.Role r23 = (androidx.compose.ui.semantics.Role) r23
            goto L_0x0172
        L_0x0114:
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r0.E()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r5 == 0) goto L_0x0126
            kotlin.jvm.internal.Intrinsics.g(r11, r10)
            r22 = r11
            java.lang.Boolean r22 = (java.lang.Boolean) r22
            goto L_0x0172
        L_0x0126:
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r0.K()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r5 == 0) goto L_0x013a
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState"
            kotlin.jvm.internal.Intrinsics.g(r11, r5)
            r20 = r11
            androidx.compose.ui.state.ToggleableState r20 = (androidx.compose.ui.state.ToggleableState) r20
            goto L_0x0172
        L_0x013a:
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r1.l()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r5 == 0) goto L_0x0149
            r5 = 1
            r7.o(r6, r5)
            goto L_0x0172
        L_0x0149:
            r5 = 1
            androidx.compose.ui.semantics.SemanticsPropertyKey r10 = r1.n()
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r12, r10)
            if (r10 == 0) goto L_0x0158
            r7.x(r6, r5)
            goto L_0x0172
        L_0x0158:
            androidx.compose.ui.semantics.SemanticsPropertyKey r10 = r1.t()
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r12, r10)
            if (r10 == 0) goto L_0x0166
            r7.t(r6, r5)
            goto L_0x0172
        L_0x0166:
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r1.z()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r12, r5)
            if (r5 == 0) goto L_0x0172
            r19 = 1
        L_0x0172:
            r5 = 8
            long r8 = r8 >> r5
            int r14 = r14 + 1
            r5 = 7
            r10 = 2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x004e
        L_0x0180:
            r5 = 8
            if (r13 != r5) goto L_0x01a5
        L_0x0184:
            if (r4 == r3) goto L_0x01a5
            int r4 = r4 + 1
            r14 = r29
            r5 = 7
            r10 = 2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x0038
        L_0x0193:
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x01a5:
            r8 = r20
            goto L_0x01b9
        L_0x01a8:
            r8 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x01b9:
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = androidx.compose.ui.semantics.SemanticsInfoKt.a(r35)
            if (r1 == 0) goto L_0x024e
            androidx.collection.MutableScatterMap r1 = r1.q()
            if (r1 == 0) goto L_0x024e
            java.lang.Object[] r2 = r1.f1960b
            java.lang.Object[] r3 = r1.f1961c
            long[] r1 = r1.f1959a
            int r4 = r1.length
            r5 = 2
            int r4 = r4 - r5
            if (r4 < 0) goto L_0x024e
            r5 = 0
            r9 = 0
        L_0x01d2:
            r10 = r1[r5]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r29 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r29
            int r12 = (r12 > r29 ? 1 : (r12 == r29 ? 0 : -1))
            if (r12 == 0) goto L_0x023f
            int r12 = r5 - r4
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r13 = 0
        L_0x01ed:
            if (r13 >= r12) goto L_0x0234
            r27 = 255(0xff, double:1.26E-321)
            long r32 = r10 & r27
            r16 = 128(0x80, double:6.32E-322)
            int r15 = (r32 > r16 ? 1 : (r32 == r16 ? 0 : -1))
            if (r15 >= 0) goto L_0x022a
            int r15 = r5 << 3
            int r15 = r15 + r13
            r20 = r2[r15]
            r15 = r3[r15]
            r14 = r20
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = (androidx.compose.ui.semantics.SemanticsPropertyKey) r14
            r20 = r1
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r0.f()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r14, r1)
            if (r1 == 0) goto L_0x0215
            r1 = 0
            r7.s(r6, r1)
            goto L_0x0227
        L_0x0215:
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r0.H()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r14, r1)
            if (r1 == 0) goto L_0x0227
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>"
            kotlin.jvm.internal.Intrinsics.g(r15, r1)
            r9 = r15
            java.util.List r9 = (java.util.List) r9
        L_0x0227:
            r1 = 8
            goto L_0x022d
        L_0x022a:
            r20 = r1
            goto L_0x0227
        L_0x022d:
            long r10 = r10 >> r1
            int r13 = r13 + 1
            r1 = r20
            r14 = 7
            goto L_0x01ed
        L_0x0234:
            r20 = r1
            r1 = 8
            r16 = 128(0x80, double:6.32E-322)
            r27 = 255(0xff, double:1.26E-321)
            if (r12 != r1) goto L_0x024f
            goto L_0x0247
        L_0x023f:
            r20 = r1
            r1 = 8
            r16 = 128(0x80, double:6.32E-322)
            r27 = 255(0xff, double:1.26E-321)
        L_0x0247:
            if (r5 == r4) goto L_0x024f
            int r5 = r5 + 1
            r1 = r20
            goto L_0x01d2
        L_0x024e:
            r9 = 0
        L_0x024f:
            int r0 = r35.v()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.compose.ui.semantics.SemanticsInfo r1 = r35.b0()
            if (r1 != 0) goto L_0x025e
            r0 = 0
        L_0x025e:
            if (r0 == 0) goto L_0x0268
            int r0 = r0.intValue()
        L_0x0264:
            r2 = r0
            r0 = r36
            goto L_0x026a
        L_0x0268:
            r0 = -1
            goto L_0x0264
        L_0x026a:
            r7.i(r6, r0, r2)
            r4 = 0
            r5 = 0
            r0 = r7
            r10 = 0
            r1 = r34
            r3 = r37
            r0.v(r1, r2, r3, r4, r5)
            if (r18 == 0) goto L_0x0283
            int r0 = androidx.compose.ui.autofill.ContentDataType_androidKt.b(r18)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            goto L_0x0294
        L_0x0283:
            if (r19 == 0) goto L_0x028b
            r0 = 1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            goto L_0x0294
        L_0x028b:
            if (r8 == 0) goto L_0x0293
            r0 = 2
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            goto L_0x0294
        L_0x0293:
            r15 = 0
        L_0x0294:
            if (r15 == 0) goto L_0x029d
            int r0 = r15.intValue()
            r7.j(r6, r0)
        L_0x029d:
            if (r21 == 0) goto L_0x02a8
            java.lang.String[] r0 = androidx.compose.ui.autofill.ContentType_androidKt.b(r21)
            if (r0 == 0) goto L_0x02a8
            r7.h(r6, r0)
        L_0x02a8:
            androidx.compose.ui.spatial.RectList r0 = r38.e()
            int r1 = r35.v()
            androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$5 r2 = new androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$5
            r2.<init>(r7, r6)
            r0.l(r1, r2)
            if (r22 == 0) goto L_0x02c1
            boolean r0 = r22.booleanValue()
            r7.y(r6, r0)
        L_0x02c1:
            if (r8 == 0) goto L_0x02d2
            r0 = 1
            r7.l(r6, r0)
            androidx.compose.ui.state.ToggleableState r0 = androidx.compose.ui.state.ToggleableState.On
            if (r8 != r0) goto L_0x02cd
            r0 = 1
            goto L_0x02ce
        L_0x02cd:
            r0 = r10
        L_0x02ce:
            r7.m(r6, r0)
            goto L_0x02f3
        L_0x02d2:
            if (r22 == 0) goto L_0x02f3
            androidx.compose.ui.semantics.Role$Companion r0 = androidx.compose.ui.semantics.Role.f18040b
            int r0 = r0.h()
            if (r23 != 0) goto L_0x02de
            r1 = r10
            goto L_0x02e6
        L_0x02de:
            int r1 = r23.p()
            boolean r1 = androidx.compose.ui.semantics.Role.m(r1, r0)
        L_0x02e6:
            if (r1 != 0) goto L_0x02f3
            r0 = 1
            r7.l(r6, r0)
            boolean r0 = r22.booleanValue()
            r7.m(r6, r0)
        L_0x02f3:
            androidx.compose.ui.autofill.ContentType$Companion r0 = androidx.compose.ui.autofill.ContentType.f15598a
            androidx.compose.ui.autofill.ContentType r0 = r0.h()
            java.lang.String[] r0 = androidx.compose.ui.autofill.ContentType_androidKt.b(r0)
            java.lang.Object r0 = kotlin.collections.ArraysKt.e0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r21 == 0) goto L_0x0314
            java.lang.String[] r1 = androidx.compose.ui.autofill.ContentType_androidKt.b(r21)
            if (r1 == 0) goto L_0x0314
            boolean r0 = kotlin.collections.ArraysKt.Y(r1, r0)
            r1 = 1
            if (r0 != r1) goto L_0x0314
            r5 = 1
            goto L_0x0315
        L_0x0314:
            r5 = r10
        L_0x0315:
            if (r24 != 0) goto L_0x031c
            if (r5 == 0) goto L_0x031a
            goto L_0x031c
        L_0x031a:
            r5 = r10
            goto L_0x031d
        L_0x031c:
            r5 = 1
        L_0x031d:
            if (r5 == 0) goto L_0x0323
            r0 = 1
            r7.q(r6, r0)
        L_0x0323:
            boolean r0 = r35.d0()
            if (r0 == 0) goto L_0x032b
            r1 = 4
            goto L_0x032c
        L_0x032b:
            r1 = r10
        L_0x032c:
            r7.A(r6, r1)
            if (r9 == 0) goto L_0x0366
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            java.lang.String r1 = ""
            r15 = r10
        L_0x033b:
            if (r15 >= r0) goto L_0x035e
            java.lang.Object r2 = r9.get(r15)
            androidx.compose.ui.text.AnnotatedString r2 = (androidx.compose.ui.text.AnnotatedString) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = r2.k()
            r3.append(r1)
            r1 = 10
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int r15 = r15 + 1
            goto L_0x033b
        L_0x035e:
            r7.z(r6, r1)
            java.lang.String r0 = "android.widget.TextView"
            r7.n(r6, r0)
        L_0x0366:
            java.util.List r0 = r35.c0()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x037f
            if (r23 == 0) goto L_0x037f
            int r0 = r23.p()
            java.lang.String r0 = androidx.compose.ui.platform.SemanticsUtils_androidKt.i(r0)
            if (r0 == 0) goto L_0x037f
            r7.n(r6, r0)
        L_0x037f:
            if (r19 == 0) goto L_0x03ab
            java.lang.String r0 = "android.widget.EditText"
            r7.n(r6, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0397
            if (r25 == 0) goto L_0x0397
            int r0 = r25.intValue()
            androidx.compose.ui.autofill.AutofillApi28Helper r1 = androidx.compose.ui.autofill.AutofillApi28Helper.f15578a
            r1.a(r6, r0)
        L_0x0397:
            if (r26 == 0) goto L_0x03a4
            java.lang.String r0 = r26.k()
            android.view.autofill.AutofillValue r0 = r7.b(r0)
            r7.k(r6, r0)
        L_0x03a4:
            if (r5 == 0) goto L_0x03ab
            r0 = 129(0x81, float:1.81E-43)
            r7.w(r6, r0)
        L_0x03ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.autofill.PopulateViewStructure_androidKt.a(android.view.ViewStructure, androidx.compose.ui.semantics.SemanticsInfo, android.view.autofill.AutofillId, java.lang.String, androidx.compose.ui.spatial.RectManager):void");
    }
}
