package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", l = {245, 251, 1061, 1101, 278, 1148, 1190, 1202}, m = "invokeSuspend")
public final class DragGestureDetectorKt$detectDragGestures$9 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f3470B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public boolean H;
    public float I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ Function0 L;
    public final /* synthetic */ Ref.LongRef M;
    public final /* synthetic */ Orientation N;
    public final /* synthetic */ Function3 O;
    public final /* synthetic */ Function2 P;
    public final /* synthetic */ Function0 Q;
    public final /* synthetic */ Function1 R;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$9(Function0 function0, Ref.LongRef longRef, Orientation orientation, Function3 function3, Function2 function2, Function0 function02, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.L = function0;
        this.M = longRef;
        this.N = orientation;
        this.O = function3;
        this.P = function2;
        this.Q = function02;
        this.R = function1;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectDragGestures$9 dragGestureDetectorKt$detectDragGestures$9 = new DragGestureDetectorKt$detectDragGestures$9(this.L, this.M, this.N, this.O, this.P, this.Q, this.R, continuation);
        dragGestureDetectorKt$detectDragGestures$9.K = obj;
        return dragGestureDetectorKt$detectDragGestures$9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: kotlin.jvm.internal.DefaultConstructorMarker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: kotlin.jvm.internal.DefaultConstructorMarker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: kotlin.jvm.internal.DefaultConstructorMarker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: androidx.compose.ui.input.pointer.PointerInputChange} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0334, code lost:
        r3 = androidx.compose.ui.geometry.Offset.f15855b.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x033a, code lost:
        r3 = androidx.compose.ui.geometry.Offset.p(r3, r1.h());
        r8 = r1.f();
        r0 = r1.n();
        r5 = r6.N;
        r10 = r6.M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0356, code lost:
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.s(r2.l0(), r8) == false) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0358, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0359, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0366, code lost:
        r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.t(r2.getViewConfiguration(), r0);
        r11 = new kotlin.jvm.internal.Ref.LongRef();
        r11.f40907z = r8;
        r9 = null;
        r8 = new androidx.compose.foundation.gestures.TouchSlopDetector(r5, r3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x037c, code lost:
        r6.K = r3;
        r6.f3470B = r1;
        r6.C = r2;
        r6.D = r10;
        r6.E = r11;
        r6.F = r8;
        r6.G = r9;
        r6.I = r0;
        r6.J = 6;
        r5 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r2, r9, r6, 1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0394, code lost:
        if (r5 != r7) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0396, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0397, code lost:
        r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5;
        r4 = r5.c();
        r9 = r4.size();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03a5, code lost:
        if (r12 >= r9) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03a7, code lost:
        r13 = r4.get(r12);
        r16 = r1;
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03bc, code lost:
        if (androidx.compose.ui.input.pointer.PointerId.c(r13.f(), r11.f40907z) == false) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03be, code lost:
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03c0, code lost:
        r12 = r12 + 1;
        r1 = r16;
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03c7, code lost:
        r16 = r1;
        r18 = r2;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03cc, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03cf, code lost:
        if (r1 != null) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03d1, code lost:
        r2 = r3;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03d9, code lost:
        if (r1.p() == false) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03e0, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.d(r1) == false) goto L_0x0419;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03e2, code lost:
        r1 = r5.c();
        r2 = r1.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03ee, code lost:
        if (r4 >= r2) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03f0, code lost:
        r5 = r1.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03fb, code lost:
        if (r5.i() == false) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03fd, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03ff, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0402, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0114, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0403, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0405, code lost:
        if (r4 != null) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0408, code lost:
        r11.f40907z = r4.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x042a, code lost:
        if ((r8.a(r1, r0) & 9223372034707292159L) == 9205357640488583168L) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x042c, code lost:
        r1.a();
        r10.f40907z = androidx.compose.ui.input.pointer.PointerEventKt.g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0439, code lost:
        if (r1.p() == false) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x043b, code lost:
        r2 = r3;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0440, code lost:
        r8.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0443, code lost:
        r1 = r16;
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0447, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x044a, code lost:
        r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r6.K = r3;
        r5 = r16;
        r6.f3470B = r5;
        r4 = r18;
        r6.C = r4;
        r6.D = r10;
        r6.E = r11;
        r6.F = r8;
        r6.G = r1;
        r6.I = r0;
        r6.J = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0467, code lost:
        if (r4.k0(r2, r6) != r7) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0469, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x046a, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x046f, code lost:
        if (r1.p() == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0471, code lost:
        r2 = r3;
        r0 = r5;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0476, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0478, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0486, code lost:
        r20 = r1;
        r1 = r0;
        r0 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x048d, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x049b, code lost:
        if (r1 == null) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x049d, code lost:
        r6.O.d(r0, r1, androidx.compose.ui.geometry.Offset.d(r6.M.f40907z));
        r6.P.m(r1, androidx.compose.ui.geometry.Offset.d(r6.M.f40907z));
        r0 = r1.f();
        r3 = r6.P;
        r4 = r6.N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04c7, code lost:
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.s(r2.l0(), r0) == false) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04c9, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04cc, code lost:
        r5 = new kotlin.jvm.internal.Ref.LongRef();
        r5.f40907z = r0;
        r1 = r2;
        r0 = r5;
        r2 = r4;
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04d7, code lost:
        r6.K = r4;
        r6.f3470B = r3;
        r6.C = r2;
        r6.D = r1;
        r6.E = r0;
        r6.F = null;
        r6.G = null;
        r6.J = 8;
        r8 = true;
        r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r1, (androidx.compose.ui.input.pointer.PointerEventPass) null, r6, 1, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04ef, code lost:
        if (r9 != r7) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04f1, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04f2, code lost:
        r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9;
        r10 = r9.c();
        r11 = r10.size();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0500, code lost:
        if (r12 >= r11) goto L_0x051c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0502, code lost:
        r13 = r10.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0513, code lost:
        if (androidx.compose.ui.input.pointer.PointerId.c(((androidx.compose.ui.input.pointer.PointerInputChange) r13).f(), r0.f40907z) == false) goto L_0x0516;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0516, code lost:
        r12 = r12 + 1;
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x051c, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x051d, code lost:
        r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0520, code lost:
        if (r5 != null) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0522, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x012a, code lost:
        r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r1;
        r15 = ((java.lang.Boolean) r6.L.invoke()).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0528, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.d(r5) == false) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x052a, code lost:
        r6 = r9.c();
        r9 = r6.size();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0536, code lost:
        if (r10 >= r9) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0538, code lost:
        r11 = r6.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0543, code lost:
        if (((androidx.compose.ui.input.pointer.PointerInputChange) r11).i() == false) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0546, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0549, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x054a, code lost:
        r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x054c, code lost:
        if (r11 != null) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x054f, code lost:
        r0.f40907z = r11.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0139, code lost:
        if (r15 != false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0555, code lost:
        r6 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0559, code lost:
        r9 = androidx.compose.ui.input.pointer.PointerEventKt.h(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x055d, code lost:
        if (r2 != null) goto L_0x0564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x055f, code lost:
        r6 = androidx.compose.ui.geometry.Offset.k(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0566, code lost:
        if (r2 != androidx.compose.foundation.gestures.Orientation.Vertical) goto L_0x0574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0568, code lost:
        r9 = r9 & 4294967295L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x056e, code lost:
        r6 = java.lang.Float.intBitsToFloat((int) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0574, code lost:
        r9 = r9 >> 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x013b, code lost:
        r9.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x057b, code lost:
        if (r6 != 0.0f) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x057d, code lost:
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x057f, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0580, code lost:
        if (r6 != false) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0582, code lost:
        if (r5 != null) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x058a, code lost:
        if (r5.p() == false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0592, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.d(r5) == false) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0594, code lost:
        r14 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x013e, code lost:
        r6.K = r8;
        r6.f3470B = r9;
        r6.H = r15;
        r6.J = 2;
        r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r8, false, (androidx.compose.ui.input.pointer.PointerEventPass) null, r22, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0595, code lost:
        if (r14 != null) goto L_0x059f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0597, code lost:
        r22.Q.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x059f, code lost:
        r22.R.invoke(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05a7, code lost:
        r6 = r22;
        r3.m(r5, androidx.compose.ui.geometry.Offset.d(androidx.compose.ui.input.pointer.PointerEventKt.g(r5)));
        r5.a();
        r0 = r5.f();
        r20 = r4;
        r4 = r2;
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05c4, code lost:
        return kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x01e3, code lost:
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0152, code lost:
        if (r0 != r7) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0154, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0155, code lost:
        r2 = r8;
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0157, code lost:
        r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0;
        r6.M.f40907z = androidx.compose.ui.geometry.Offset.f15855b.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0163, code lost:
        if (r15 == false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0165, code lost:
        r3 = r0.f();
        r1 = r0.n();
        r5 = r6.N;
        r8 = r6.M;
        r10 = androidx.compose.ui.geometry.Offset.f15855b.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x017f, code lost:
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.s(r2.l0(), r3) == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0181, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0184, code lost:
        r1 = androidx.compose.foundation.gestures.DragGestureDetectorKt.t(r2.getViewConfiguration(), r1);
        r9 = new kotlin.jvm.internal.Ref.LongRef();
        r9.f40907z = r3;
        r4 = new androidx.compose.foundation.gestures.TouchSlopDetector(r5, r10, r14);
        r3 = r2;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x019a, code lost:
        r6.K = r3;
        r6.f3470B = r0;
        r6.C = r2;
        r6.D = r8;
        r6.E = r9;
        r6.F = r4;
        r6.G = r14;
        r6.I = r1;
        r6.J = 3;
        r5 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r2, r14, r6, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01b1, code lost:
        if (r5 != r7) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01b3, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01b4, code lost:
        r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5;
        r10 = r5.c();
        r11 = r10.size();
        r15 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01c2, code lost:
        if (r15 >= r11) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01c4, code lost:
        r16 = r10.get(r15);
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01d8, code lost:
        if (androidx.compose.ui.input.pointer.PointerId.c(r16.f(), r9.f40907z) == false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01db, code lost:
        r15 = r23 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01e1, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01e3, code lost:
        r10 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01e7, code lost:
        if (r10 != null) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01e9, code lost:
        r2 = r3;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01f1, code lost:
        if (r10.p() == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01f8, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.d(r10) == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01fa, code lost:
        r5 = r5.c();
        r10 = r5.size();
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0206, code lost:
        if (r11 >= r10) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0208, code lost:
        r12 = r5.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0213, code lost:
        if (((androidx.compose.ui.input.pointer.PointerInputChange) r12).i() == false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0216, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0219, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x021a, code lost:
        r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x021c, code lost:
        if (r12 != null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x021f, code lost:
        r9.f40907z = r12.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0226, code lost:
        r11 = r4.a(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0238, code lost:
        if ((r11 & 9223372034707292159L) == 9205357640488583168L) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x023a, code lost:
        r10.a();
        r8.f40907z = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0243, code lost:
        if (r10.p() == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0245, code lost:
        r2 = r3;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0248, code lost:
        r4.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x024b, code lost:
        r12 = 0;
        r13 = 1;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0250, code lost:
        r5 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r6.K = r3;
        r6.f3470B = r0;
        r6.C = r2;
        r6.D = r8;
        r6.E = r9;
        r6.F = r4;
        r6.G = r10;
        r6.I = r1;
        r6.J = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0269, code lost:
        if (r2.k0(r5, r6) != r7) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x026b, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x026c, code lost:
        r5 = r2;
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0273, code lost:
        if (r1.p() == false) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0277, code lost:
        if (r1 == null) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x027d, code lost:
        if (r1.p() == false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0280, code lost:
        r12 = 0;
        r13 = 1;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0285, code lost:
        r1 = r2;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x028a, code lost:
        if (androidx.compose.foundation.ComposeFoundationFlags.f3045c == false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x028c, code lost:
        if (r1 != null) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x028e, code lost:
        r3 = r2.l0().c();
        r4 = r3.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x029e, code lost:
        if (r5 >= r4) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02aa, code lost:
        if (((androidx.compose.ui.input.pointer.PointerInputChange) r3.get(r5)).i() == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02ac, code lost:
        r20 = r1;
        r1 = r0;
        r0 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02b1, code lost:
        r3 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r6.K = r2;
        r6.f3470B = r1;
        r6.C = r0;
        r6.D = null;
        r6.E = null;
        r6.F = null;
        r6.G = null;
        r6.J = 5;
        r3 = r2.k0(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02c9, code lost:
        if (r3 != r7) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02cb, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02cc, code lost:
        r3 = (androidx.compose.ui.input.pointer.PointerEvent) r3;
        r4 = r3.c();
        r5 = r4.size();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02da, code lost:
        if (r8 >= r5) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02e6, code lost:
        if (((androidx.compose.ui.input.pointer.PointerInputChange) r4.get(r8)).p() == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02e8, code lost:
        r4 = r3.c();
        r5 = r4.size();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02f4, code lost:
        if (r8 >= r5) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0300, code lost:
        if (((androidx.compose.ui.input.pointer.PointerInputChange) r4.get(r8)).i() == false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0303, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0306, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0309, code lost:
        r4 = r3.c();
        r5 = r4.size();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0315, code lost:
        if (r8 >= r5) goto L_0x0486;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0321, code lost:
        if (((androidx.compose.ui.input.pointer.PointerInputChange) r4.get(r8)).i() == false) goto L_0x0478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0323, code lost:
        r0 = (androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.g0(r3.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x032d, code lost:
        if (r0 == null) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x032f, code lost:
        r3 = r0.h();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r23) {
        /*
            r22 = this;
            r6 = r22
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r0 = r6.J
            r12 = 0
            r13 = 1
            r14 = 0
            switch(r0) {
                case 0: goto L_0x0116;
                case 1: goto L_0x010b;
                case 2: goto L_0x00fa;
                case 3: goto L_0x00cf;
                case 4: goto L_0x00a0;
                case 5: goto L_0x008d;
                case 6: goto L_0x0066;
                case 7: goto L_0x0033;
                case 8: goto L_0x0016;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0016:
            java.lang.Object r0 = r6.E
            kotlin.jvm.internal.Ref$LongRef r0 = (kotlin.jvm.internal.Ref.LongRef) r0
            java.lang.Object r1 = r6.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            java.lang.Object r2 = r6.C
            androidx.compose.foundation.gestures.Orientation r2 = (androidx.compose.foundation.gestures.Orientation) r2
            java.lang.Object r3 = r6.f3470B
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            java.lang.Object r4 = r6.K
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
            kotlin.ResultKt.b(r23)
            r9 = r23
            r8 = r13
            r5 = r14
            goto L_0x04f2
        L_0x0033:
            float r0 = r6.I
            java.lang.Object r1 = r6.G
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r2 = r6.F
            androidx.compose.foundation.gestures.TouchSlopDetector r2 = (androidx.compose.foundation.gestures.TouchSlopDetector) r2
            java.lang.Object r3 = r6.E
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            java.lang.Object r4 = r6.D
            kotlin.jvm.internal.Ref$LongRef r4 = (kotlin.jvm.internal.Ref.LongRef) r4
            java.lang.Object r5 = r6.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            java.lang.Object r15 = r6.f3470B
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.ui.input.pointer.PointerInputChange) r15
            java.lang.Object r8 = r6.K
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r23)
            r11 = r3
            r10 = r4
            r3 = r8
            r12 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r8 = r2
            r2 = r5
            r5 = r15
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L_0x046b
        L_0x0066:
            float r0 = r6.I
            java.lang.Object r1 = r6.F
            androidx.compose.foundation.gestures.TouchSlopDetector r1 = (androidx.compose.foundation.gestures.TouchSlopDetector) r1
            java.lang.Object r2 = r6.E
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref.LongRef) r2
            java.lang.Object r3 = r6.D
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            java.lang.Object r4 = r6.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
            java.lang.Object r5 = r6.f3470B
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            java.lang.Object r8 = r6.K
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r23)
            r11 = r2
            r10 = r3
            r2 = r4
            r3 = r8
            r8 = r1
            r1 = r5
            r5 = r23
            goto L_0x0397
        L_0x008d:
            java.lang.Object r0 = r6.C
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
            java.lang.Object r1 = r6.f3470B
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r2 = r6.K
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
            kotlin.ResultKt.b(r23)
            r3 = r23
            goto L_0x02cc
        L_0x00a0:
            float r0 = r6.I
            java.lang.Object r1 = r6.G
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r2 = r6.F
            androidx.compose.foundation.gestures.TouchSlopDetector r2 = (androidx.compose.foundation.gestures.TouchSlopDetector) r2
            java.lang.Object r3 = r6.E
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            java.lang.Object r4 = r6.D
            kotlin.jvm.internal.Ref$LongRef r4 = (kotlin.jvm.internal.Ref.LongRef) r4
            java.lang.Object r5 = r6.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            java.lang.Object r8 = r6.f3470B
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r6.K
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.ResultKt.b(r23)
            r20 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            r4 = r20
            r21 = r9
            r9 = r3
            r3 = r21
            goto L_0x026f
        L_0x00cf:
            float r0 = r6.I
            java.lang.Object r1 = r6.F
            androidx.compose.foundation.gestures.TouchSlopDetector r1 = (androidx.compose.foundation.gestures.TouchSlopDetector) r1
            java.lang.Object r2 = r6.E
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref.LongRef) r2
            java.lang.Object r3 = r6.D
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref.LongRef) r3
            java.lang.Object r4 = r6.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
            java.lang.Object r5 = r6.f3470B
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            java.lang.Object r8 = r6.K
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r23)
            r9 = r2
            r2 = r4
            r4 = r1
            r1 = r0
            r0 = r5
            r5 = r23
            r20 = r8
            r8 = r3
            r3 = r20
            goto L_0x01b4
        L_0x00fa:
            boolean r0 = r6.H
            java.lang.Object r1 = r6.f3470B
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            java.lang.Object r2 = r6.K
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
            kotlin.ResultKt.b(r23)
            r15 = r0
            r0 = r23
            goto L_0x0157
        L_0x010b:
            java.lang.Object r0 = r6.K
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
            kotlin.ResultKt.b(r23)
            r1 = r23
        L_0x0114:
            r8 = r0
            goto L_0x012a
        L_0x0116:
            kotlin.ResultKt.b(r23)
            java.lang.Object r0 = r6.K
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r6.K = r0
            r6.J = r13
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.e(r0, r12, r1, r6)
            if (r1 != r7) goto L_0x0114
            return r7
        L_0x012a:
            r9 = r1
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            kotlin.jvm.functions.Function0 r0 = r6.L
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            if (r15 != 0) goto L_0x013e
            r9.a()
        L_0x013e:
            r6.K = r8
            r6.f3470B = r9
            r6.H = r15
            r0 = 2
            r6.J = r0
            r1 = 0
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r8
            r3 = r22
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x0155
            return r7
        L_0x0155:
            r2 = r8
            r1 = r9
        L_0x0157:
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
            kotlin.jvm.internal.Ref$LongRef r3 = r6.M
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.ui.geometry.Offset.f15855b
            long r4 = r4.c()
            r3.f40907z = r4
            if (r15 == 0) goto L_0x0288
        L_0x0165:
            long r3 = r0.f()
            int r1 = r0.n()
            androidx.compose.foundation.gestures.Orientation r5 = r6.N
            kotlin.jvm.internal.Ref$LongRef r8 = r6.M
            androidx.compose.ui.geometry.Offset$Companion r9 = androidx.compose.ui.geometry.Offset.f15855b
            long r10 = r9.c()
            androidx.compose.ui.input.pointer.PointerEvent r9 = r2.l0()
            boolean r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.s(r9, r3)
            if (r9 == 0) goto L_0x0184
            r1 = r14
            goto L_0x0277
        L_0x0184:
            androidx.compose.ui.platform.ViewConfiguration r9 = r2.getViewConfiguration()
            float r1 = androidx.compose.foundation.gestures.DragGestureDetectorKt.t(r9, r1)
            kotlin.jvm.internal.Ref$LongRef r9 = new kotlin.jvm.internal.Ref$LongRef
            r9.<init>()
            r9.f40907z = r3
            androidx.compose.foundation.gestures.TouchSlopDetector r3 = new androidx.compose.foundation.gestures.TouchSlopDetector
            r3.<init>(r5, r10, r14)
            r4 = r3
            r3 = r2
        L_0x019a:
            r6.K = r3
            r6.f3470B = r0
            r6.C = r2
            r6.D = r8
            r6.E = r9
            r6.F = r4
            r6.G = r14
            r6.I = r1
            r5 = 3
            r6.J = r5
            java.lang.Object r5 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r2, r14, r6, r13, r14)
            if (r5 != r7) goto L_0x01b4
            return r7
        L_0x01b4:
            androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
            java.util.List r10 = r5.c()
            r11 = r10
            java.util.Collection r11 = (java.util.Collection) r11
            int r11 = r11.size()
            r15 = r12
        L_0x01c2:
            if (r15 >= r11) goto L_0x01e1
            java.lang.Object r16 = r10.get(r15)
            r17 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r17 = (androidx.compose.ui.input.pointer.PointerInputChange) r17
            long r12 = r17.f()
            r23 = r15
            long r14 = r9.f40907z
            boolean r12 = androidx.compose.ui.input.pointer.PointerId.c(r12, r14)
            if (r12 == 0) goto L_0x01db
            goto L_0x01e3
        L_0x01db:
            int r15 = r23 + 1
            r12 = 0
            r13 = 1
            r14 = 0
            goto L_0x01c2
        L_0x01e1:
            r16 = 0
        L_0x01e3:
            r10 = r16
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L_0x01ed
        L_0x01e9:
            r2 = r3
            r1 = 0
            goto L_0x0277
        L_0x01ed:
            boolean r11 = r10.p()
            if (r11 == 0) goto L_0x01f4
            goto L_0x01e9
        L_0x01f4:
            boolean r11 = androidx.compose.ui.input.pointer.PointerEventKt.d(r10)
            if (r11 == 0) goto L_0x0226
            java.util.List r5 = r5.c()
            r10 = r5
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r11 = 0
        L_0x0206:
            if (r11 >= r10) goto L_0x0219
            java.lang.Object r12 = r5.get(r11)
            r13 = r12
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            boolean r13 = r13.i()
            if (r13 == 0) goto L_0x0216
            goto L_0x021a
        L_0x0216:
            int r11 = r11 + 1
            goto L_0x0206
        L_0x0219:
            r12 = 0
        L_0x021a:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 != 0) goto L_0x021f
            goto L_0x01e9
        L_0x021f:
            long r10 = r12.f()
            r9.f40907z = r10
            goto L_0x024b
        L_0x0226:
            long r11 = r4.a(r10, r1)
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r18 = r11 & r13
            r13 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x0250
            r10.a()
            r8.f40907z = r11
            boolean r5 = r10.p()
            if (r5 == 0) goto L_0x0248
            r2 = r3
            r1 = r10
            goto L_0x0277
        L_0x0248:
            r4.e()
        L_0x024b:
            r12 = 0
            r13 = 1
            r14 = 0
            goto L_0x019a
        L_0x0250:
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r6.K = r3
            r6.f3470B = r0
            r6.C = r2
            r6.D = r8
            r6.E = r9
            r6.F = r4
            r6.G = r10
            r6.I = r1
            r11 = 4
            r6.J = r11
            java.lang.Object r5 = r2.k0(r5, r6)
            if (r5 != r7) goto L_0x026c
            return r7
        L_0x026c:
            r5 = r2
            r2 = r1
            r1 = r10
        L_0x026f:
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x0285
            goto L_0x01e9
        L_0x0277:
            if (r1 == 0) goto L_0x0288
            boolean r3 = r1.p()
            if (r3 == 0) goto L_0x0280
            goto L_0x0288
        L_0x0280:
            r12 = 0
            r13 = 1
            r14 = 0
            goto L_0x0165
        L_0x0285:
            r1 = r2
            r2 = r5
            goto L_0x024b
        L_0x0288:
            boolean r3 = androidx.compose.foundation.ComposeFoundationFlags.f3045c
            if (r3 == 0) goto L_0x049b
            if (r1 != 0) goto L_0x049b
            androidx.compose.ui.input.pointer.PointerEvent r3 = r2.l0()
            java.util.List r3 = r3.c()
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L_0x029e:
            if (r5 >= r4) goto L_0x049b
            java.lang.Object r8 = r3.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            boolean r8 = r8.i()
            if (r8 == 0) goto L_0x048d
            r20 = r1
            r1 = r0
            r0 = r20
        L_0x02b1:
            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r6.K = r2
            r6.f3470B = r1
            r6.C = r0
            r4 = 0
            r6.D = r4
            r6.E = r4
            r6.F = r4
            r6.G = r4
            r4 = 5
            r6.J = r4
            java.lang.Object r3 = r2.k0(r3, r6)
            if (r3 != r7) goto L_0x02cc
            return r7
        L_0x02cc:
            androidx.compose.ui.input.pointer.PointerEvent r3 = (androidx.compose.ui.input.pointer.PointerEvent) r3
            java.util.List r4 = r3.c()
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r8 = 0
        L_0x02da:
            if (r8 >= r5) goto L_0x0309
            java.lang.Object r9 = r4.get(r8)
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            boolean r9 = r9.p()
            if (r9 == 0) goto L_0x0306
            java.util.List r4 = r3.c()
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r8 = 0
        L_0x02f4:
            if (r8 >= r5) goto L_0x0309
            java.lang.Object r9 = r4.get(r8)
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            boolean r9 = r9.i()
            if (r9 == 0) goto L_0x0303
            goto L_0x02b1
        L_0x0303:
            int r8 = r8 + 1
            goto L_0x02f4
        L_0x0306:
            int r8 = r8 + 1
            goto L_0x02da
        L_0x0309:
            java.util.List r4 = r3.c()
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r8 = 0
        L_0x0315:
            if (r8 >= r5) goto L_0x0486
            java.lang.Object r9 = r4.get(r8)
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            boolean r9 = r9.i()
            if (r9 == 0) goto L_0x0478
            java.util.List r0 = r3.c()
            java.lang.Object r0 = kotlin.collections.CollectionsKt.g0(r0)
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
            if (r0 == 0) goto L_0x0334
            long r3 = r0.h()
            goto L_0x033a
        L_0x0334:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.f15855b
            long r3 = r0.c()
        L_0x033a:
            long r8 = r1.h()
            long r3 = androidx.compose.ui.geometry.Offset.p(r3, r8)
            long r8 = r1.f()
            int r0 = r1.n()
            androidx.compose.foundation.gestures.Orientation r5 = r6.N
            kotlin.jvm.internal.Ref$LongRef r10 = r6.M
            androidx.compose.ui.input.pointer.PointerEvent r11 = r2.l0()
            boolean r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.s(r11, r8)
            if (r11 == 0) goto L_0x0366
            r0 = r1
        L_0x0359:
            r1 = 0
            r12 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L_0x0288
        L_0x0366:
            androidx.compose.ui.platform.ViewConfiguration r11 = r2.getViewConfiguration()
            float r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.t(r11, r0)
            kotlin.jvm.internal.Ref$LongRef r11 = new kotlin.jvm.internal.Ref$LongRef
            r11.<init>()
            r11.f40907z = r8
            androidx.compose.foundation.gestures.TouchSlopDetector r8 = new androidx.compose.foundation.gestures.TouchSlopDetector
            r9 = 0
            r8.<init>(r5, r3, r9)
            r3 = r2
        L_0x037c:
            r6.K = r3
            r6.f3470B = r1
            r6.C = r2
            r6.D = r10
            r6.E = r11
            r6.F = r8
            r6.G = r9
            r6.I = r0
            r4 = 6
            r6.J = r4
            r4 = 1
            java.lang.Object r5 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r2, r9, r6, r4, r9)
            if (r5 != r7) goto L_0x0397
            return r7
        L_0x0397:
            androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
            java.util.List r4 = r5.c()
            r9 = r4
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r12 = 0
        L_0x03a5:
            if (r12 >= r9) goto L_0x03c7
            java.lang.Object r13 = r4.get(r12)
            r14 = r13
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            long r14 = r14.f()
            r16 = r1
            r18 = r2
            long r1 = r11.f40907z
            boolean r1 = androidx.compose.ui.input.pointer.PointerId.c(r14, r1)
            if (r1 == 0) goto L_0x03c0
            r4 = r13
            goto L_0x03cc
        L_0x03c0:
            int r12 = r12 + 1
            r1 = r16
            r2 = r18
            goto L_0x03a5
        L_0x03c7:
            r16 = r1
            r18 = r2
            r4 = 0
        L_0x03cc:
            r1 = r4
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            if (r1 != 0) goto L_0x03d5
        L_0x03d1:
            r2 = r3
            r0 = r16
            goto L_0x0359
        L_0x03d5:
            boolean r2 = r1.p()
            if (r2 == 0) goto L_0x03dc
            goto L_0x03d1
        L_0x03dc:
            boolean r2 = androidx.compose.ui.input.pointer.PointerEventKt.d(r1)
            if (r2 == 0) goto L_0x0419
            java.util.List r1 = r5.c()
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
        L_0x03ee:
            if (r4 >= r2) goto L_0x0402
            java.lang.Object r5 = r1.get(r4)
            r9 = r5
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            boolean r9 = r9.i()
            if (r9 == 0) goto L_0x03ff
            r4 = r5
            goto L_0x0403
        L_0x03ff:
            int r4 = r4 + 1
            goto L_0x03ee
        L_0x0402:
            r4 = 0
        L_0x0403:
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            if (r4 != 0) goto L_0x0408
            goto L_0x03d1
        L_0x0408:
            long r1 = r4.f()
            r11.f40907z = r1
            r12 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L_0x0443
        L_0x0419:
            long r4 = r8.a(r1, r0)
            r12 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r4 = r4 & r12
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x044a
            r1.a()
            long r4 = androidx.compose.ui.input.pointer.PointerEventKt.g(r1)
            r10.f40907z = r4
            boolean r2 = r1.p()
            if (r2 == 0) goto L_0x0440
            r2 = r3
            r0 = r16
            goto L_0x0288
        L_0x0440:
            r8.e()
        L_0x0443:
            r1 = r16
            r2 = r18
        L_0x0447:
            r9 = 0
            goto L_0x037c
        L_0x044a:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r6.K = r3
            r5 = r16
            r6.f3470B = r5
            r4 = r18
            r6.C = r4
            r6.D = r10
            r6.E = r11
            r6.F = r8
            r6.G = r1
            r6.I = r0
            r9 = 7
            r6.J = r9
            java.lang.Object r2 = r4.k0(r2, r6)
            if (r2 != r7) goto L_0x046a
            return r7
        L_0x046a:
            r2 = r4
        L_0x046b:
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x0476
            r2 = r3
            r0 = r5
            r1 = 0
            goto L_0x0288
        L_0x0476:
            r1 = r5
            goto L_0x0447
        L_0x0478:
            r12 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r8 = r8 + 1
            goto L_0x0315
        L_0x0486:
            r20 = r1
            r1 = r0
            r0 = r20
            goto L_0x0288
        L_0x048d:
            r12 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = r5 + 1
            goto L_0x029e
        L_0x049b:
            if (r1 == 0) goto L_0x05c2
            kotlin.jvm.functions.Function3 r3 = r6.O
            kotlin.jvm.internal.Ref$LongRef r4 = r6.M
            long r4 = r4.f40907z
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.d(r4)
            r3.d(r0, r1, r4)
            kotlin.jvm.functions.Function2 r0 = r6.P
            kotlin.jvm.internal.Ref$LongRef r3 = r6.M
            long r3 = r3.f40907z
            androidx.compose.ui.geometry.Offset r3 = androidx.compose.ui.geometry.Offset.d(r3)
            r0.m(r1, r3)
            long r0 = r1.f()
            kotlin.jvm.functions.Function2 r3 = r6.P
            androidx.compose.foundation.gestures.Orientation r4 = r6.N
            androidx.compose.ui.input.pointer.PointerEvent r5 = r2.l0()
            boolean r5 = androidx.compose.foundation.gestures.DragGestureDetectorKt.s(r5, r0)
            if (r5 == 0) goto L_0x04cc
        L_0x04c9:
            r14 = 0
            goto L_0x0595
        L_0x04cc:
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.f40907z = r0
            r1 = r2
            r0 = r5
            r2 = r4
            r4 = r1
        L_0x04d7:
            r6.K = r4
            r6.f3470B = r3
            r6.C = r2
            r6.D = r1
            r6.E = r0
            r5 = 0
            r6.F = r5
            r6.G = r5
            r8 = 8
            r6.J = r8
            r8 = 1
            java.lang.Object r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r1, r5, r6, r8, r5)
            if (r9 != r7) goto L_0x04f2
            return r7
        L_0x04f2:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r10 = r9.c()
            r11 = r10
            java.util.Collection r11 = (java.util.Collection) r11
            int r11 = r11.size()
            r12 = 0
        L_0x0500:
            if (r12 >= r11) goto L_0x051c
            java.lang.Object r13 = r10.get(r12)
            r14 = r13
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            long r14 = r14.f()
            long r5 = r0.f40907z
            boolean r5 = androidx.compose.ui.input.pointer.PointerId.c(r14, r5)
            if (r5 == 0) goto L_0x0516
            goto L_0x051d
        L_0x0516:
            int r12 = r12 + 1
            r5 = 0
            r6 = r22
            goto L_0x0500
        L_0x051c:
            r13 = 0
        L_0x051d:
            r5 = r13
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            if (r5 != 0) goto L_0x0524
            r5 = 0
            goto L_0x0582
        L_0x0524:
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.d(r5)
            if (r6 == 0) goto L_0x0559
            java.util.List r6 = r9.c()
            r9 = r6
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r10 = 0
        L_0x0536:
            if (r10 >= r9) goto L_0x0549
            java.lang.Object r11 = r6.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            boolean r12 = r12.i()
            if (r12 == 0) goto L_0x0546
            goto L_0x054a
        L_0x0546:
            int r10 = r10 + 1
            goto L_0x0536
        L_0x0549:
            r11 = 0
        L_0x054a:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L_0x054f
            goto L_0x0582
        L_0x054f:
            long r5 = r11.f()
            r0.f40907z = r5
        L_0x0555:
            r6 = r22
            goto L_0x04d7
        L_0x0559:
            long r9 = androidx.compose.ui.input.pointer.PointerEventKt.h(r5)
            if (r2 != 0) goto L_0x0564
            float r6 = androidx.compose.ui.geometry.Offset.k(r9)
            goto L_0x0578
        L_0x0564:
            androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r2 != r6) goto L_0x0574
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
        L_0x056e:
            int r6 = (int) r9
            float r6 = java.lang.Float.intBitsToFloat(r6)
            goto L_0x0578
        L_0x0574:
            r6 = 32
            long r9 = r9 >> r6
            goto L_0x056e
        L_0x0578:
            r9 = 0
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x057f
            r6 = r8
            goto L_0x0580
        L_0x057f:
            r6 = 0
        L_0x0580:
            if (r6 != 0) goto L_0x0555
        L_0x0582:
            if (r5 != 0) goto L_0x0586
            goto L_0x04c9
        L_0x0586:
            boolean r0 = r5.p()
            if (r0 == 0) goto L_0x058e
            goto L_0x04c9
        L_0x058e:
            boolean r0 = androidx.compose.ui.input.pointer.PointerEventKt.d(r5)
            if (r0 == 0) goto L_0x05a7
            r14 = r5
        L_0x0595:
            if (r14 != 0) goto L_0x059f
            r6 = r22
            kotlin.jvm.functions.Function0 r0 = r6.Q
            r0.invoke()
            goto L_0x05c2
        L_0x059f:
            r6 = r22
            kotlin.jvm.functions.Function1 r0 = r6.R
            r0.invoke(r14)
            goto L_0x05c2
        L_0x05a7:
            r6 = r22
            long r0 = androidx.compose.ui.input.pointer.PointerEventKt.g(r5)
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.d(r0)
            r3.m(r5, r0)
            r5.a()
            long r0 = r5.f()
            r20 = r4
            r4 = r2
            r2 = r20
            goto L_0x04cc
        L_0x05c2:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((DragGestureDetectorKt$detectDragGestures$9) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
