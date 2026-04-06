package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", f = "TextFieldSelectionState.kt", l = {453}, m = "invokeSuspend")
public final class TextFieldSelectionState$detectTouchMode$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f6538B;
    public /* synthetic */ Object C;
    public final /* synthetic */ TextFieldSelectionState D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTouchMode$2(TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(2, continuation);
        this.D = textFieldSelectionState;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TextFieldSelectionState$detectTouchMode$2 textFieldSelectionState$detectTouchMode$2 = new TextFieldSelectionState$detectTouchMode$2(this.D, continuation);
        textFieldSelectionState$detectTouchMode$2.C = obj;
        return textFieldSelectionState$detectTouchMode$2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f A[RETURN] */
    public final java.lang.Object x(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.f6538B
            r2 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.lang.Object r1 = r4.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r5)
            goto L_0x0030
        L_0x0013:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001b:
            kotlin.ResultKt.b(r5)
            java.lang.Object r5 = r4.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            r1 = r5
        L_0x0023:
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r4.C = r1
            r4.f6538B = r2
            java.lang.Object r5 = r1.k0(r5, r4)
            if (r5 != r0) goto L_0x0030
            return r0
        L_0x0030:
            androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r3 = r4.D
            boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.j(r5)
            r5 = r5 ^ r2
            r3.y0(r5)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((TextFieldSelectionState$detectTouchMode$2) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
