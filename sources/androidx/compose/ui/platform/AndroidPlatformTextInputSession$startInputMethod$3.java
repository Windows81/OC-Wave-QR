package androidx.compose.ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend")
public final class AndroidPlatformTextInputSession$startInputMethod$3 extends SuspendLambda implements Function2<InputMethodSession, Continuation<?>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ AndroidPlatformTextInputSession G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(AndroidPlatformTextInputSession androidPlatformTextInputSession, Continuation continuation) {
        super(2, continuation);
        this.G = androidPlatformTextInputSession;
    }

    /* renamed from: A */
    public final Object m(InputMethodSession inputMethodSession, Continuation continuation) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) s(inputMethodSession, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.G, continuation);
        androidPlatformTextInputSession$startInputMethod$3.F = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            InputMethodSession inputMethodSession = (InputMethodSession) this.F;
            AndroidPlatformTextInputSession androidPlatformTextInputSession = this.G;
            this.F = inputMethodSession;
            this.D = androidPlatformTextInputSession;
            this.E = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(this), 1);
            cancellableContinuationImpl.G();
            androidPlatformTextInputSession.f17626A.e();
            cancellableContinuationImpl.u(new AndroidPlatformTextInputSession$startInputMethod$3$1$1(inputMethodSession, androidPlatformTextInputSession));
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(this);
            }
            if (A2 == f2) {
                return f2;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            AndroidPlatformTextInputSession androidPlatformTextInputSession2 = (AndroidPlatformTextInputSession) this.D;
            InputMethodSession inputMethodSession2 = (InputMethodSession) this.F;
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
