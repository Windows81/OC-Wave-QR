package coil.compose;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.size.Precision;
import coil.transition.CrossfadeTransition;
import coil.transition.Transition;
import com.google.accompanist.drawablepainter.DrawablePainter;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata
public final class AsyncImagePainter extends Painter implements RememberObserver {
    public static final Companion U = new Companion((DefaultConstructorMarker) null);
    public static final Function1 V = AsyncImagePainter$Companion$DefaultTransform$1.f23284z;
    public CoroutineScope F;
    public final MutableStateFlow G = StateFlowKt.a(Size.c(Size.f15876b.b()));
    public final MutableState H = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
    public final MutableFloatState I = PrimitiveSnapshotStateKt.a(1.0f);
    public final MutableState J = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
    public State K;
    public Painter L;
    public Function1 M;
    public Function1 N;
    public ContentScale O;
    public int P;
    public boolean Q;
    public final MutableState R;
    public final MutableState S;
    public final MutableState T;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1 a() {
            return AsyncImagePainter.V;
        }

        public Companion() {
        }
    }

    @Metadata
    public static abstract class State {

        @Metadata
        public static final class Empty extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final Empty f23285a = new Empty();

            public Empty() {
                super((DefaultConstructorMarker) null);
            }

            public Painter a() {
                return null;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            public int hashCode() {
                return -1515560141;
            }

            public String toString() {
                return "Empty";
            }
        }

        @Metadata
        public static final class Error extends State {

            /* renamed from: a  reason: collision with root package name */
            public final Painter f23286a;

            /* renamed from: b  reason: collision with root package name */
            public final ErrorResult f23287b;

            public Error(Painter painter, ErrorResult errorResult) {
                super((DefaultConstructorMarker) null);
                this.f23286a = painter;
                this.f23287b = errorResult;
            }

            public static /* synthetic */ Error c(Error error, Painter painter, ErrorResult errorResult, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    painter = error.f23286a;
                }
                if ((i2 & 2) != 0) {
                    errorResult = error.f23287b;
                }
                return error.b(painter, errorResult);
            }

            public Painter a() {
                return this.f23286a;
            }

            public final Error b(Painter painter, ErrorResult errorResult) {
                return new Error(painter, errorResult);
            }

            public final ErrorResult d() {
                return this.f23287b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.d(this.f23286a, error.f23286a) && Intrinsics.d(this.f23287b, error.f23287b);
            }

            public int hashCode() {
                Painter painter = this.f23286a;
                return ((painter == null ? 0 : painter.hashCode()) * 31) + this.f23287b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.f23286a + ", result=" + this.f23287b + ')';
            }
        }

        @Metadata
        public static final class Loading extends State {

            /* renamed from: a  reason: collision with root package name */
            public final Painter f23288a;

            public Loading(Painter painter) {
                super((DefaultConstructorMarker) null);
                this.f23288a = painter;
            }

            public Painter a() {
                return this.f23288a;
            }

            public final Loading b(Painter painter) {
                return new Loading(painter);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && Intrinsics.d(this.f23288a, ((Loading) obj).f23288a);
            }

            public int hashCode() {
                Painter painter = this.f23288a;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.f23288a + ')';
            }
        }

        @Metadata
        public static final class Success extends State {

            /* renamed from: a  reason: collision with root package name */
            public final Painter f23289a;

            /* renamed from: b  reason: collision with root package name */
            public final SuccessResult f23290b;

            public Success(Painter painter, SuccessResult successResult) {
                super((DefaultConstructorMarker) null);
                this.f23289a = painter;
                this.f23290b = successResult;
            }

            public Painter a() {
                return this.f23289a;
            }

            public final SuccessResult b() {
                return this.f23290b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.d(this.f23289a, success.f23289a) && Intrinsics.d(this.f23290b, success.f23290b);
            }

            public int hashCode() {
                return (this.f23289a.hashCode() * 31) + this.f23290b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.f23289a + ", result=" + this.f23290b + ')';
            }
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Painter a();

        public State() {
        }
    }

    public AsyncImagePainter(ImageRequest imageRequest, ImageLoader imageLoader) {
        State.Empty empty = State.Empty.f23285a;
        this.K = empty;
        this.M = V;
        this.O = ContentScale.f17026a.d();
        this.P = DrawScope.f16288g.b();
        this.R = SnapshotStateKt__SnapshotStateKt.e(empty, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.S = SnapshotStateKt__SnapshotStateKt.e(imageRequest, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.T = SnapshotStateKt__SnapshotStateKt.e(imageLoader, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    private final void B(float f2) {
        this.I.j(f2);
    }

    private final void C(ColorFilter colorFilter) {
        this.J.setValue(colorFilter);
    }

    private final void H(Painter painter) {
        this.H.setValue(painter);
    }

    private final void t() {
        CoroutineScope coroutineScope = this.F;
        if (coroutineScope != null) {
            CoroutineScopeKt.e(coroutineScope, (CancellationException) null, 1, (Object) null);
        }
        this.F = null;
    }

    private final float u() {
        return this.I.c();
    }

    private final Painter x() {
        return (Painter) this.H.getValue();
    }

    public final CrossfadePainter A(State state, State state2) {
        ImageResult imageResult;
        if (state2 instanceof State.Success) {
            imageResult = ((State.Success) state2).b();
        } else {
            if (state2 instanceof State.Error) {
                imageResult = ((State.Error) state2).d();
            }
            return null;
        }
        Transition a2 = imageResult.b().P().a(AsyncImagePainterKt.f23294a, imageResult);
        if (a2 instanceof CrossfadeTransition) {
            CrossfadeTransition crossfadeTransition = (CrossfadeTransition) a2;
            return new CrossfadePainter(state instanceof State.Loading ? state.a() : null, state2.a(), this.O, crossfadeTransition.b(), !(imageResult instanceof SuccessResult) || !((SuccessResult) imageResult).d(), crossfadeTransition.c());
        }
        return null;
    }

    public final void D(ContentScale contentScale) {
        this.O = contentScale;
    }

    public final void E(int i2) {
        this.P = i2;
    }

    public final void F(ImageLoader imageLoader) {
        this.T.setValue(imageLoader);
    }

    public final void G(Function1 function1) {
        this.N = function1;
    }

    public final void I(boolean z2) {
        this.Q = z2;
    }

    public final void J(ImageRequest imageRequest) {
        this.S.setValue(imageRequest);
    }

    public final void K(State state) {
        this.R.setValue(state);
    }

    public final void L(Function1 function1) {
        this.M = function1;
    }

    public final void M(Painter painter) {
        this.L = painter;
        H(painter);
    }

    public final void N(State state) {
        this.K = state;
        K(state);
    }

    public final Painter O(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? BitmapPainterKt.b(AndroidImageBitmap_androidKt.c(((BitmapDrawable) drawable).getBitmap()), 0, 0, this.P, 6, (Object) null) : new DrawablePainter(drawable.mutate());
    }

    public final State P(ImageResult imageResult) {
        if (imageResult instanceof SuccessResult) {
            SuccessResult successResult = (SuccessResult) imageResult;
            return new State.Success(O(successResult.a()), successResult);
        } else if (imageResult instanceof ErrorResult) {
            Drawable a2 = imageResult.a();
            return new State.Error(a2 != null ? O(a2) : null, (ErrorResult) imageResult);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final ImageRequest Q(ImageRequest imageRequest) {
        ImageRequest.Builder l2 = ImageRequest.R(imageRequest, (Context) null, 1, (Object) null).l(new AsyncImagePainter$updateRequest$$inlined$target$default$1(this));
        if (imageRequest.q().m() == null) {
            l2.k(new AsyncImagePainter$updateRequest$2$1(this));
        }
        if (imageRequest.q().l() == null) {
            l2.j(UtilsKt.i(this.O));
        }
        if (imageRequest.q().k() != Precision.EXACT) {
            l2.d(Precision.INEXACT);
        }
        return l2.a();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.compose.ui.graphics.painter.Painter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(coil.compose.AsyncImagePainter.State r4) {
        /*
            r3 = this;
            coil.compose.AsyncImagePainter$State r0 = r3.K
            kotlin.jvm.functions.Function1 r1 = r3.M
            java.lang.Object r4 = r1.invoke(r4)
            coil.compose.AsyncImagePainter$State r4 = (coil.compose.AsyncImagePainter.State) r4
            r3.N(r4)
            coil.compose.CrossfadePainter r1 = r3.A(r0, r4)
            if (r1 == 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            androidx.compose.ui.graphics.painter.Painter r1 = r4.a()
        L_0x0018:
            r3.M(r1)
            kotlinx.coroutines.CoroutineScope r1 = r3.F
            if (r1 == 0) goto L_0x004b
            androidx.compose.ui.graphics.painter.Painter r1 = r0.a()
            androidx.compose.ui.graphics.painter.Painter r2 = r4.a()
            if (r1 == r2) goto L_0x004b
            androidx.compose.ui.graphics.painter.Painter r0 = r0.a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            r2 = 0
            if (r1 == 0) goto L_0x0035
            androidx.compose.runtime.RememberObserver r0 = (androidx.compose.runtime.RememberObserver) r0
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.f()
        L_0x003b:
            androidx.compose.ui.graphics.painter.Painter r0 = r4.a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            if (r1 == 0) goto L_0x0046
            r2 = r0
            androidx.compose.runtime.RememberObserver r2 = (androidx.compose.runtime.RememberObserver) r2
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            r2.h()
        L_0x004b:
            kotlin.jvm.functions.Function1 r0 = r3.N
            if (r0 == 0) goto L_0x0052
            r0.invoke(r4)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.AsyncImagePainter.R(coil.compose.AsyncImagePainter$State):void");
    }

    public boolean a(float f2) {
        B(f2);
        return true;
    }

    public boolean b(ColorFilter colorFilter) {
        C(colorFilter);
        return true;
    }

    public void e() {
        t();
        Painter painter = this.L;
        RememberObserver rememberObserver = painter instanceof RememberObserver ? (RememberObserver) painter : null;
        if (rememberObserver != null) {
            rememberObserver.e();
        }
    }

    public void f() {
        t();
        Painter painter = this.L;
        RememberObserver rememberObserver = painter instanceof RememberObserver ? (RememberObserver) painter : null;
        if (rememberObserver != null) {
            rememberObserver.f();
        }
    }

    public void h() {
        if (this.F == null) {
            Painter painter = null;
            CoroutineScope a2 = CoroutineScopeKt.a(SupervisorKt.b((Job) null, 1, (Object) null).y(Dispatchers.c().H0()));
            this.F = a2;
            Painter painter2 = this.L;
            RememberObserver rememberObserver = painter2 instanceof RememberObserver ? (RememberObserver) painter2 : null;
            if (rememberObserver != null) {
                rememberObserver.h();
            }
            if (this.Q) {
                Drawable F2 = ImageRequest.R(y(), (Context) null, 1, (Object) null).c(w().a()).a().F();
                if (F2 != null) {
                    painter = O(F2);
                }
                R(new State.Loading(painter));
                return;
            }
            Job unused = BuildersKt__Builders_commonKt.d(a2, (CoroutineContext) null, (CoroutineStart) null, new AsyncImagePainter$onRemembered$1(this, (Continuation) null), 3, (Object) null);
        }
    }

    public long k() {
        Painter x2 = x();
        return x2 != null ? x2.k() : Size.f15876b.a();
    }

    public void m(DrawScope drawScope) {
        this.G.setValue(Size.c(drawScope.c()));
        Painter x2 = x();
        if (x2 != null) {
            x2.j(drawScope, drawScope.c(), u(), v());
        }
    }

    public final ColorFilter v() {
        return (ColorFilter) this.J.getValue();
    }

    public final ImageLoader w() {
        return (ImageLoader) this.T.getValue();
    }

    public final ImageRequest y() {
        return (ImageRequest) this.S.getValue();
    }

    public final State z() {
        return (State) this.R.getValue();
    }
}
