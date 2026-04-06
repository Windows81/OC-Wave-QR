package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
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
public final class ContextMenu_androidKt$ContextMenuArea$2$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f5643A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5644B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f5645z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", f = "ContextMenu.android.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object D;
        public int E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(mutableState, textFieldSelectionManager, continuation);
        }

        public final Object x(Object obj) {
            MutableState mutableState;
            Object f2 = IntrinsicsKt.f();
            int i2 = this.E;
            if (i2 == 0) {
                ResultKt.b(obj);
                MutableState mutableState2 = mutableState;
                TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                this.D = mutableState2;
                this.E = 1;
                Object e2 = ContextMenu_androidKt.e(textFieldSelectionManager, this);
                if (e2 == f2) {
                    return f2;
                }
                mutableState = mutableState2;
                obj = e2;
            } else if (i2 == 1) {
                mutableState = (MutableState) this.D;
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState.setValue(obj);
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$ContextMenuArea$2$1(CoroutineScope coroutineScope, MutableState mutableState, TextFieldSelectionManager textFieldSelectionManager) {
        super(0);
        this.f5645z = coroutineScope;
        this.f5643A = mutableState;
        this.f5644B = textFieldSelectionManager;
    }

    public final void invoke() {
        CoroutineScope coroutineScope = this.f5645z;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        final MutableState mutableState = this.f5643A;
        final TextFieldSelectionManager textFieldSelectionManager = this.f5644B;
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, coroutineStart, new AnonymousClass1((Continuation) null), 1, (Object) null);
    }
}
