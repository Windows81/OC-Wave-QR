package coil.compose;

import androidx.compose.runtime.SnapshotStateKt;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", l = {307}, m = "invokeSuspend")
public final class AsyncImagePainter$onRemembered$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AsyncImagePainter E;

    @Metadata
    @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", l = {306}, m = "invokeSuspend")
    /* renamed from: coil.compose.AsyncImagePainter$onRemembered$1$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<ImageRequest, Continuation<? super AsyncImagePainter.State>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(ImageRequest imageRequest, Continuation continuation) {
            return ((AnonymousClass2) s(imageRequest, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass2 r0 = new AnonymousClass2(asyncImagePainter2, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            AsyncImagePainter asyncImagePainter;
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                AsyncImagePainter asyncImagePainter2 = asyncImagePainter2;
                ImageLoader w2 = asyncImagePainter2.w();
                ImageRequest r2 = asyncImagePainter2.Q((ImageRequest) this.E);
                this.E = asyncImagePainter2;
                this.D = 1;
                obj = w2.c(r2, this);
                if (obj == f2) {
                    return f2;
                }
                asyncImagePainter = asyncImagePainter2;
            } else if (i2 == 1) {
                asyncImagePainter = (AsyncImagePainter) this.E;
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return asyncImagePainter.P((ImageResult) obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$onRemembered$1(AsyncImagePainter asyncImagePainter, Continuation continuation) {
        super(2, continuation);
        this.E = asyncImagePainter;
    }

    /* renamed from: B */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AsyncImagePainter$onRemembered$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AsyncImagePainter$onRemembered$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final AsyncImagePainter asyncImagePainter = this.E;
            Flow q2 = SnapshotStateKt.q(new Function0<ImageRequest>() {
                /* renamed from: b */
                public final ImageRequest invoke() {
                    return asyncImagePainter.y();
                }
            });
            final AsyncImagePainter asyncImagePainter2 = this.E;
            Flow Q = FlowKt.Q(q2, new AnonymousClass2((Continuation) null));
            final AsyncImagePainter asyncImagePainter3 = this.E;
            AnonymousClass3 r3 = new Object() {
                /* renamed from: a */
                public final Object c(AsyncImagePainter.State state, Continuation continuation) {
                    Object A2 = AsyncImagePainter.this.R(state);
                    return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
                }

                public final Function d() {
                    return new AdaptedFunctionReference(2, AsyncImagePainter.this, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof FlowCollector) || !(obj instanceof FunctionAdapter)) {
                        return false;
                    }
                    return Intrinsics.d(d(), ((FunctionAdapter) obj).d());
                }

                public final int hashCode() {
                    return d().hashCode();
                }
            };
            this.D = 1;
            if (Q.a(r3, this) == f2) {
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
