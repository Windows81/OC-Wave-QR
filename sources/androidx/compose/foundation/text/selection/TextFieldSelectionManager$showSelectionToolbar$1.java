package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1", f = "TextFieldSelectionManager.kt", l = {781}, m = "invokeSuspend")
public final class TextFieldSelectionManager$showSelectionToolbar$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public int F;
    public final /* synthetic */ TextFieldSelectionManager G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$showSelectionToolbar$1(TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
        super(2, continuation);
        this.G = textFieldSelectionManager;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TextFieldSelectionManager$showSelectionToolbar$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$showSelectionToolbar$1(this.G, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r12.F
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0022
            if (r1 != r3) goto L_0x001a
            java.lang.Object r0 = r12.E
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            java.lang.Object r1 = r12.D
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            kotlin.ResultKt.b(r13)
            goto L_0x00a2
        L_0x001a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0022:
            kotlin.ResultKt.b(r13)
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.G
            boolean r13 = r13.H()
            if (r13 == 0) goto L_0x011c
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.G
            androidx.compose.foundation.text.LegacyTextFieldState r13 = r13.P()
            if (r13 == 0) goto L_0x003d
            boolean r13 = r13.A()
            if (r13 != 0) goto L_0x003d
            goto L_0x011c
        L_0x003d:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.G
            androidx.compose.ui.text.input.VisualTransformation r13 = r13.V()
            boolean r13 = r13 instanceof androidx.compose.ui.text.input.PasswordVisualTransformation
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r1 = r12.G
            androidx.compose.ui.text.input.TextFieldValue r1 = r1.U()
            long r5 = r1.h()
            boolean r1 = androidx.compose.ui.text.TextRange.h(r5)
            if (r1 != 0) goto L_0x005f
            if (r13 != 0) goto L_0x005f
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1 r1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r5 = r12.G
            r1.<init>(r5)
            goto L_0x0060
        L_0x005f:
            r1 = r4
        L_0x0060:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r5 = r12.G
            androidx.compose.ui.text.input.TextFieldValue r5 = r5.U()
            long r5 = r5.h()
            boolean r5 = androidx.compose.ui.text.TextRange.h(r5)
            if (r5 != 0) goto L_0x0082
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r5 = r12.G
            boolean r5 = r5.G()
            if (r5 == 0) goto L_0x0082
            if (r13 != 0) goto L_0x0082
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1 r13 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r5 = r12.G
            r13.<init>(r5)
            goto L_0x0083
        L_0x0082:
            r13 = r4
        L_0x0083:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r5 = r12.G
            boolean r5 = r5.G()
            if (r5 == 0) goto L_0x00bd
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r5 = r12.G
            androidx.compose.ui.platform.Clipboard r5 = r5.A()
            if (r5 == 0) goto L_0x00b0
            r12.D = r1
            r12.E = r13
            r12.F = r3
            java.lang.Object r5 = r5.a(r12)
            if (r5 != r0) goto L_0x00a0
            return r0
        L_0x00a0:
            r0 = r13
            r13 = r5
        L_0x00a2:
            androidx.compose.ui.platform.ClipEntry r13 = (androidx.compose.ui.platform.ClipEntry) r13
            if (r13 == 0) goto L_0x00af
            boolean r13 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.c(r13)
            if (r13 != r3) goto L_0x00af
            r13 = r0
            r2 = r3
            goto L_0x00b0
        L_0x00af:
            r13 = r0
        L_0x00b0:
            if (r2 == 0) goto L_0x00bd
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r2 = r12.G
            r0.<init>(r2)
            r9 = r13
            r8 = r0
            r7 = r1
            goto L_0x00c0
        L_0x00bd:
            r9 = r13
            r7 = r1
            r8 = r4
        L_0x00c0:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.G
            androidx.compose.ui.text.input.TextFieldValue r13 = r13.U()
            long r0 = r13.h()
            int r13 = androidx.compose.ui.text.TextRange.j(r0)
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r12.G
            androidx.compose.ui.text.input.TextFieldValue r0 = r0.U()
            java.lang.String r0 = r0.i()
            int r0 = r0.length()
            if (r13 == r0) goto L_0x00e7
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$selectAll$1 r13 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$selectAll$1
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r12.G
            r13.<init>(r0)
            r10 = r13
            goto L_0x00e8
        L_0x00e7:
            r10 = r4
        L_0x00e8:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.G
            boolean r13 = r13.G()
            if (r13 == 0) goto L_0x0107
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.G
            androidx.compose.ui.text.input.TextFieldValue r13 = r13.U()
            long r0 = r13.h()
            boolean r13 = androidx.compose.ui.text.TextRange.h(r0)
            if (r13 == 0) goto L_0x0107
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$autofill$1 r4 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$autofill$1
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.G
            r4.<init>(r13)
        L_0x0107:
            r11 = r4
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.G
            androidx.compose.ui.platform.TextToolbar r5 = r13.Q()
            if (r5 == 0) goto L_0x0119
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.G
            androidx.compose.ui.geometry.Rect r6 = r13.B()
            r5.B(r6, r7, r8, r9, r10, r11)
        L_0x0119:
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        L_0x011c:
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1.x(java.lang.Object):java.lang.Object");
    }
}
