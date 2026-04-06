package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 implements TextToolbarHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextToolbar f5563a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f5564b;

    public BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1(TextToolbar textToolbar, CoroutineScope coroutineScope) {
        this.f5563a = textToolbar;
        this.f5564b = coroutineScope;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r17, androidx.compose.ui.geometry.Rect r18, kotlin.coroutines.Continuation r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            boolean r3 = r2 instanceof androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 r3 = (androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1) r3
            int r4 = r3.K
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.K = r4
            goto L_0x001e
        L_0x0019:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 r3 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.I
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.K
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0054
            if (r5 != r6) goto L_0x004c
            java.lang.Object r1 = r3.H
            androidx.compose.ui.platform.TextToolbar r1 = (androidx.compose.ui.platform.TextToolbar) r1
            java.lang.Object r4 = r3.G
            androidx.compose.ui.geometry.Rect r4 = (androidx.compose.ui.geometry.Rect) r4
            java.lang.Object r5 = r3.F
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r6 = r3.E
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r6
            java.lang.Object r8 = r3.D
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r8
            java.lang.Object r3 = r3.C
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.ResultKt.b(r2)
            r9 = r1
            r10 = r4
            r11 = r5
            r1 = r6
            goto L_0x0087
        L_0x004c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0054:
            kotlin.ResultKt.b(r2)
            androidx.compose.ui.platform.TextToolbar r2 = r0.f5563a
            kotlinx.coroutines.CoroutineScope r5 = r0.f5564b
            boolean r8 = r17.C()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r9 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r8 != 0) goto L_0x0065
            r8 = r7
            goto L_0x006a
        L_0x0065:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$1 r8 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$1
            r8.<init>(r1, r9, r5, r1)
        L_0x006a:
            r3.C = r5
            r3.D = r1
            r3.E = r1
            r3.F = r8
            r9 = r18
            r3.G = r9
            r3.H = r2
            r3.K = r6
            java.lang.Object r3 = r1.E(r3)
            if (r3 != r4) goto L_0x0081
            return r4
        L_0x0081:
            r11 = r8
            r10 = r9
            r8 = r1
            r9 = r2
            r2 = r3
            r3 = r5
        L_0x0087:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r4 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r2 != 0) goto L_0x0093
            r12 = r7
            goto L_0x0099
        L_0x0093:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$2 r2 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$2
            r2.<init>(r1, r4, r3, r8)
            r12 = r2
        L_0x0099:
            boolean r1 = r8.D()
            if (r1 != 0) goto L_0x00a1
            r13 = r7
            goto L_0x00a7
        L_0x00a1:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$3 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$3
            r1.<init>(r8, r4, r3, r8)
            r13 = r1
        L_0x00a7:
            boolean r1 = r8.F()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection
            if (r1 != 0) goto L_0x00b1
            r14 = r7
            goto L_0x00b7
        L_0x00b1:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$4 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$4
            r1.<init>(r8, r2, r8)
            r14 = r1
        L_0x00b7:
            boolean r1 = r8.B()
            if (r1 != 0) goto L_0x00bf
        L_0x00bd:
            r15 = r7
            goto L_0x00c5
        L_0x00bf:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$5 r7 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$5
            r7.<init>(r8, r4, r8)
            goto L_0x00bd
        L_0x00c5:
            r9.B(r10, r11, r12, r13, r14, r15)
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1.a(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.ui.geometry.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void b() {
        if (this.f5563a.A() == TextToolbarStatus.Shown) {
            this.f5563a.a();
        }
    }
}
