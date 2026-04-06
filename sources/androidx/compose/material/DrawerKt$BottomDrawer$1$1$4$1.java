package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class DrawerKt$BottomDrawer$1$1$4$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BottomDrawerState f7724A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f7725B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f7726z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1$1$4$1(String str, BottomDrawerState bottomDrawerState, CoroutineScope coroutineScope) {
        super(1);
        this.f7726z = str;
        this.f7724A = bottomDrawerState;
        this.f7725B = coroutineScope;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.o0(semanticsPropertyReceiver, this.f7726z);
        if (this.f7724A.g()) {
            final BottomDrawerState bottomDrawerState = this.f7724A;
            final CoroutineScope coroutineScope = this.f7725B;
            SemanticsPropertiesKt.n(semanticsPropertyReceiver, (String) null, new Function0<Boolean>() {

                @Metadata
                @DebugMetadata(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1$1", f = "Drawer.kt", l = {681}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1$1  reason: invalid class name */
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

                /* renamed from: b */
                public final Boolean invoke() {
                    if (bottomDrawerState.b(BottomDrawerValue.Closed)) {
                        CoroutineScope coroutineScope = coroutineScope;
                        final BottomDrawerState bottomDrawerState = bottomDrawerState;
                        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
                    }
                    return Boolean.TRUE;
                }
            }, 1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
