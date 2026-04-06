package androidx.compose.material3;

import androidx.compose.ui.platform.AccessibilityManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {231}, m = "invokeSuspend")
public final class SnackbarHostKt$SnackbarHost$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ SnackbarData E;
    public final /* synthetic */ AccessibilityManager F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, Continuation continuation) {
        super(2, continuation);
        this.E = snackbarData;
        this.F = accessibilityManager;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SnackbarHostKt$SnackbarHost$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SnackbarHostKt$SnackbarHost$1$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            SnackbarData snackbarData = this.E;
            if (snackbarData != null) {
                long m2 = SnackbarHostKt.m(snackbarData.a().d(), this.E.a().c() != null, this.F);
                this.D = 1;
                if (DelayKt.b(m2, this) == f2) {
                    return f2;
                }
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.E.dismiss();
        return Unit.f40552a;
    }
}
