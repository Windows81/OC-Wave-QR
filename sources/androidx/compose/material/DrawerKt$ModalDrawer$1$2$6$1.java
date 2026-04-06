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
public final class DrawerKt$ModalDrawer$1$2$6$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DrawerState f7759A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f7760B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f7761z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$6$1(String str, DrawerState drawerState, CoroutineScope coroutineScope) {
        super(1);
        this.f7761z = str;
        this.f7759A = drawerState;
        this.f7760B = coroutineScope;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.o0(semanticsPropertyReceiver, this.f7761z);
        if (this.f7759A.e()) {
            final DrawerState drawerState = this.f7759A;
            final CoroutineScope coroutineScope = this.f7760B;
            SemanticsPropertiesKt.n(semanticsPropertyReceiver, (String) null, new Function0<Boolean>() {

                @Metadata
                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", l = {534}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1  reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int D;

                    /* renamed from: A */
                    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        return new AnonymousClass1(drawerState, continuation);
                    }

                    public final Object x(Object obj) {
                        Object f2 = IntrinsicsKt.f();
                        int i2 = this.D;
                        if (i2 == 0) {
                            ResultKt.b(obj);
                            DrawerState drawerState = drawerState;
                            this.D = 1;
                            if (drawerState.b(this) == f2) {
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
                    if (((Boolean) drawerState.c().r().invoke(DrawerValue.Closed)).booleanValue()) {
                        CoroutineScope coroutineScope = coroutineScope;
                        final DrawerState drawerState = drawerState;
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
