package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", l = {502, 510}, m = "invokeSuspend")
public final class TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ PressGestureScope F;
    public final /* synthetic */ TextFieldSelectionState G;
    public final /* synthetic */ long H;
    public final /* synthetic */ MutableInteractionSource I;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", l = {494, 499}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object D;
        public int E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(textFieldSelectionState, j2, mutableInteractionSource, continuation);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.E
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0027
                if (r1 == r4) goto L_0x001f
                if (r1 != r3) goto L_0x0017
                java.lang.Object r0 = r7.D
                androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                kotlin.ResultKt.b(r8)
                goto L_0x005f
            L_0x0017:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001f:
                java.lang.Object r1 = r7.D
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r1
                kotlin.ResultKt.b(r8)
                goto L_0x0047
            L_0x0027:
                kotlin.ResultKt.b(r8)
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = r6
                androidx.compose.foundation.interaction.PressInteraction$Press r8 = r8.f6484v
                if (r8 == 0) goto L_0x004a
                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r9
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5 = r6
                androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                r6.<init>(r8)
                r7.D = r5
                r7.E = r4
                java.lang.Object r8 = r1.a(r6, r7)
                if (r8 != r0) goto L_0x0046
                return r0
            L_0x0046:
                r1 = r5
            L_0x0047:
                r1.f6484v = r2
            L_0x004a:
                androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                long r4 = r7
                r8.<init>(r4, r2)
                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r9
                r7.D = r8
                r7.E = r3
                java.lang.Object r1 = r1.a(r8, r7)
                if (r1 != r0) goto L_0x005e
                return r0
            L_0x005e:
                r0 = r8
            L_0x005f:
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = r6
                r8.f6484v = r0
                kotlin.Unit r8 = kotlin.Unit.f40552a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(PressGestureScope pressGestureScope, TextFieldSelectionState textFieldSelectionState, long j2, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
        super(2, continuation);
        this.F = pressGestureScope;
        this.G = textFieldSelectionState;
        this.H = j2;
        this.I = mutableInteractionSource;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TextFieldSelectionState$detectTextFieldTapGestures$2$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(this.F, this.G, this.H, this.I, continuation);
        textFieldSelectionState$detectTextFieldTapGestures$2$1$1.E = obj;
        return textFieldSelectionState$detectTextFieldTapGestures$2$1$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final TextFieldSelectionState textFieldSelectionState = this.G;
            final long j2 = this.H;
            final MutableInteractionSource mutableInteractionSource = this.I;
            Job unused = BuildersKt__Builders_commonKt.d((CoroutineScope) this.E, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
            PressGestureScope pressGestureScope = this.F;
            this.D = 1;
            obj = pressGestureScope.U1(this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
            this.G.f6484v = null;
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PressInteraction.Press i3 = this.G.f6484v;
        if (i3 != null) {
            MutableInteractionSource mutableInteractionSource2 = this.I;
            Interaction release = booleanValue ? new PressInteraction.Release(i3) : new PressInteraction.Cancel(i3);
            this.D = 2;
            if (mutableInteractionSource2.a(release, this) == f2) {
                return f2;
            }
        }
        this.G.f6484v = null;
        return Unit.f40552a;
    }
}
