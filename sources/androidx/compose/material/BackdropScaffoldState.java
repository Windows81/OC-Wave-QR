package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BackdropScaffoldState {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f7264f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f7265a;

    /* renamed from: b  reason: collision with root package name */
    public final SnackbarHostState f7266b;

    /* renamed from: c  reason: collision with root package name */
    public final AnchoredDraggableState f7267c;

    /* renamed from: d  reason: collision with root package name */
    public Density f7268d;

    /* renamed from: e  reason: collision with root package name */
    public final NestedScrollConnection f7269e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a(AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState, Density density) {
            return SaverKt.e(BackdropScaffoldState$Companion$Saver$1.f7271z, new BackdropScaffoldState$Companion$Saver$2(density, animationSpec, function1, snackbarHostState));
        }

        public Companion() {
        }
    }

    public BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState) {
        this.f7265a = function1;
        this.f7266b = snackbarHostState;
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(backdropValue, new BackdropScaffoldState$anchoredDraggableState$1(this), new BackdropScaffoldState$anchoredDraggableState$2(this), animationSpec, function1);
        this.f7267c = anchoredDraggableState;
        this.f7269e = BackdropScaffoldKt.f(anchoredDraggableState, Orientation.Vertical);
    }

    public final Object b(Continuation continuation) {
        Object g2 = AnchoredDraggableKt.g(this.f7267c, BackdropValue.Concealed, 0.0f, continuation, 2, (Object) null);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    public final AnchoredDraggableState c() {
        return this.f7267c;
    }

    public final Function1 d() {
        return this.f7265a;
    }

    public final NestedScrollConnection e() {
        return this.f7269e;
    }

    public final SnackbarHostState f() {
        return this.f7266b;
    }

    public final BackdropValue g() {
        return (BackdropValue) this.f7267c.x();
    }

    public final boolean h() {
        return this.f7267c.s() == BackdropValue.Concealed;
    }

    public final boolean i() {
        return this.f7267c.s() == BackdropValue.Revealed;
    }

    public final Density j() {
        Density density = this.f7268d;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BackdropScaffoldState (" + this + ") was not set. Did you use BackdropScaffoldState with the BackdropScaffold composable?").toString());
    }

    public final Object k(Continuation continuation) {
        Object g2 = AnchoredDraggableKt.g(this.f7267c, BackdropValue.Revealed, 0.0f, continuation, 2, (Object) null);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    public final void l(Density density) {
        this.f7268d = density;
    }
}
