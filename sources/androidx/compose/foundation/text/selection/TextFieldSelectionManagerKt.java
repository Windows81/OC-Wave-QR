package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextFieldSelectionManagerKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7011a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.Handle[] r0 = androidx.compose.foundation.text.Handle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.Cursor     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionStart     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionEnd     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f7011a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: androidx.compose.foundation.text.selection.OffsetProvider} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r16, androidx.compose.ui.text.style.ResolvedTextDirection r17, androidx.compose.foundation.text.selection.TextFieldSelectionManager r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            r11 = r16
            r12 = r17
            r13 = r18
            r14 = r20
            r0 = -1344558920(0xffffffffafdba8b8, float:-3.995575E-10)
            r1 = r19
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r14 & 6
            r2 = 4
            if (r1 != 0) goto L_0x0021
            boolean r1 = r15.d(r11)
            if (r1 == 0) goto L_0x001e
            r1 = r2
            goto L_0x001f
        L_0x001e:
            r1 = 2
        L_0x001f:
            r1 = r1 | r14
            goto L_0x0022
        L_0x0021:
            r1 = r14
        L_0x0022:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x0032
            boolean r3 = r15.W(r12)
            if (r3 == 0) goto L_0x002f
            r3 = 32
            goto L_0x0031
        L_0x002f:
            r3 = 16
        L_0x0031:
            r1 = r1 | r3
        L_0x0032:
            r3 = r14 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0042
            boolean r3 = r15.l(r13)
            if (r3 == 0) goto L_0x003f
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0041
        L_0x003f:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r1 = r1 | r3
        L_0x0042:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x004c
            r3 = r6
            goto L_0x004d
        L_0x004c:
            r3 = r5
        L_0x004d:
            r4 = r1 & 1
            boolean r3 = r15.E(r3, r4)
            if (r3 == 0) goto L_0x00f2
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0061
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1029)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r3, r4)
        L_0x0061:
            r0 = r1 & 14
            if (r0 != r2) goto L_0x0067
            r3 = r6
            goto L_0x0068
        L_0x0067:
            r3 = r5
        L_0x0068:
            boolean r4 = r15.W(r13)
            r3 = r3 | r4
            java.lang.Object r4 = r15.g()
            if (r3 != 0) goto L_0x007b
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0082
        L_0x007b:
            androidx.compose.foundation.text.TextDragObserver r4 = r13.W(r11)
            r15.N(r4)
        L_0x0082:
            androidx.compose.foundation.text.TextDragObserver r4 = (androidx.compose.foundation.text.TextDragObserver) r4
            boolean r3 = r15.l(r13)
            if (r0 != r2) goto L_0x008b
            r5 = r6
        L_0x008b:
            r0 = r3 | r5
            java.lang.Object r2 = r15.g()
            if (r0 != 0) goto L_0x009b
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00a3
        L_0x009b:
            androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1 r2 = new androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1
            r2.<init>(r13, r11)
            r15.N(r2)
        L_0x00a3:
            r0 = r2
            androidx.compose.foundation.text.selection.OffsetProvider r0 = (androidx.compose.foundation.text.selection.OffsetProvider) r0
            androidx.compose.ui.text.input.TextFieldValue r2 = r18.U()
            long r2 = r2.h()
            boolean r3 = androidx.compose.ui.text.TextRange.m(r2)
            float r6 = r13.J(r11)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            boolean r5 = r15.l(r4)
            java.lang.Object r7 = r15.g()
            if (r5 != 0) goto L_0x00ca
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x00d2
        L_0x00ca:
            androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1 r7 = new androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1
            r7.<init>(r4)
            r15.N(r7)
        L_0x00d2:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r7 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r7
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.c(r2, r4, r7)
            int r1 = r1 << 3
            r9 = r1 & 1008(0x3f0, float:1.413E-42)
            r10 = 16
            r4 = 0
            r1 = r16
            r2 = r17
            r8 = r15
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.b(r0, r1, r2, r3, r4, r6, r7, r8, r9, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00f5
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00f5
        L_0x00f2:
            r15.B()
        L_0x00f5:
            androidx.compose.runtime.ScopeUpdateScope r0 = r15.x()
            if (r0 == 0) goto L_0x0103
            androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$3 r1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$3
            r1.<init>(r11, r12, r13, r14)
            r0.a(r1)
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.a(boolean, androidx.compose.ui.text.style.ResolvedTextDirection, androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.runtime.Composer, int):void");
    }

    public static final long b(TextFieldSelectionManager textFieldSelectionManager, long j2) {
        int i2;
        TextLayoutResultProxy l2;
        TextDelegate x2;
        AnnotatedString k2;
        Offset D = textFieldSelectionManager.D();
        if (D == null) {
            return Offset.f15855b.b();
        }
        long t2 = D.t();
        AnnotatedString S = textFieldSelectionManager.S();
        if (S == null || S.length() == 0) {
            return Offset.f15855b.b();
        }
        Handle F = textFieldSelectionManager.F();
        int i3 = F == null ? -1 : WhenMappings.f7011a[F.ordinal()];
        if (i3 == -1) {
            return Offset.f15855b.b();
        }
        if (i3 == 1 || i3 == 2) {
            i2 = TextRange.n(textFieldSelectionManager.U().h());
        } else if (i3 == 3) {
            i2 = TextRange.i(textFieldSelectionManager.U().h());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        LegacyTextFieldState P = textFieldSelectionManager.P();
        if (P == null || (l2 = P.l()) == null) {
            return Offset.f15855b.b();
        }
        LegacyTextFieldState P2 = textFieldSelectionManager.P();
        if (P2 == null || (x2 = P2.x()) == null || (k2 = x2.k()) == null) {
            return Offset.f15855b.b();
        }
        int o2 = RangesKt.o(textFieldSelectionManager.N().b(i2), 0, k2.length());
        float intBitsToFloat = Float.intBitsToFloat((int) (l2.j(t2) >> 32));
        TextLayoutResult f2 = l2.f();
        int q2 = f2.q(o2);
        float s2 = f2.s(q2);
        float t3 = f2.t(q2);
        float n2 = RangesKt.n(intBitsToFloat, Math.min(s2, t3), Math.max(s2, t3));
        if (!IntSize.e(j2, IntSize.f19170b.a()) && Math.abs(intBitsToFloat - n2) > ((float) (((int) (j2 >> 32)) / 2))) {
            return Offset.f15855b.b();
        }
        float v2 = f2.v(q2);
        return Offset.e((((long) Float.floatToRawIntBits(n2)) << 32) | (((long) Float.floatToRawIntBits(((f2.m(q2) - v2) / ((float) 2)) + v2)) & 4294967295L));
    }

    public static final boolean c(TextFieldSelectionManager textFieldSelectionManager, boolean z2) {
        LayoutCoordinates k2;
        Rect i2;
        LegacyTextFieldState P = textFieldSelectionManager.P();
        if (P == null || (k2 = P.k()) == null || (i2 = SelectionManagerKt.i(k2)) == null) {
            return false;
        }
        return SelectionManagerKt.d(i2, textFieldSelectionManager.K(z2));
    }
}
