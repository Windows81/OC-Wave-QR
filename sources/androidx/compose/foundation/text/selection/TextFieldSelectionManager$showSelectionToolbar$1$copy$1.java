package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class TextFieldSelectionManager$showSelectionToolbar$1$copy$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7000z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(textFieldSelectionManager, continuation);
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                TextFieldSelectionManager.r(textFieldSelectionManager, false, 1, (Object) null);
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$showSelectionToolbar$1$copy$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(0);
        this.f7000z = textFieldSelectionManager;
    }

    public final void invoke() {
        CoroutineScope C = this.f7000z.C();
        if (C != null) {
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            final TextFieldSelectionManager textFieldSelectionManager = this.f7000z;
            Job unused = BuildersKt__Builders_commonKt.d(C, (CoroutineContext) null, coroutineStart, new AnonymousClass1((Continuation) null), 1, (Object) null);
        }
        this.f7000z.X();
    }
}
