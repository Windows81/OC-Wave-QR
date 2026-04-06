package androidx.compose.material;

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
public final class DrawerKt$BottomDrawer$1$1$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BottomDrawerState f7713A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f7714B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7715z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1$1", f = "Drawer.kt", l = {628}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(bottomDrawerState, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                BottomDrawerState bottomDrawerState = bottomDrawerState;
                this.D = 1;
                if (bottomDrawerState.a(this) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1$1$1$1(boolean z2, BottomDrawerState bottomDrawerState, CoroutineScope coroutineScope) {
        super(0);
        this.f7715z = z2;
        this.f7713A = bottomDrawerState;
        this.f7714B = coroutineScope;
    }

    public final void invoke() {
        if (this.f7715z && this.f7713A.b(BottomDrawerValue.Closed)) {
            CoroutineScope coroutineScope = this.f7714B;
            final BottomDrawerState bottomDrawerState = this.f7713A;
            Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
        }
    }
}
