package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {639, 641}, m = "invokeSuspend")
public final class AndroidViewHolder$onNestedFling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ AndroidViewHolder F;
    public final /* synthetic */ long G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedFling$1(boolean z2, AndroidViewHolder androidViewHolder, long j2, Continuation continuation) {
        super(2, continuation);
        this.E = z2;
        this.F = androidViewHolder;
        this.G = j2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidViewHolder$onNestedFling$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AndroidViewHolder$onNestedFling$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (!this.E) {
                NestedScrollDispatcher c2 = this.F.f19199A;
                long a2 = Velocity.f19186b.a();
                long j2 = this.G;
                this.D = 1;
                if (c2.a(a2, j2, this) == f2) {
                    return f2;
                }
            } else {
                NestedScrollDispatcher c3 = this.F.f19199A;
                long j3 = this.G;
                long a3 = Velocity.f19186b.a();
                this.D = 2;
                if (c3.a(j3, a3, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1 || i2 == 2) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
