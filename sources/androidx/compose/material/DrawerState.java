package androidx.compose.material;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DrawerState {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f7784c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final AnchoredDraggableState f7785a;

    /* renamed from: b  reason: collision with root package name */
    public Density f7786b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a(Function1 function1) {
            return SaverKt.e(DrawerState$Companion$Saver$1.f7788z, new DrawerState$Companion$Saver$2(function1));
        }

        public Companion() {
        }
    }

    public DrawerState(DrawerValue drawerValue, Function1 function1) {
        DrawerValue drawerValue2 = drawerValue;
        this.f7785a = new AnchoredDraggableState(drawerValue2, new DrawerState$anchoredDraggableState$1(this), new DrawerState$anchoredDraggableState$2(this), DrawerKt.f7709d, function1);
    }

    public final Object b(Continuation continuation) {
        Object g2 = AnchoredDraggableKt.g(this.f7785a, DrawerValue.Closed, 0.0f, continuation, 2, (Object) null);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    public final AnchoredDraggableState c() {
        return this.f7785a;
    }

    public final DrawerValue d() {
        return (DrawerValue) this.f7785a.s();
    }

    public final boolean e() {
        return d() == DrawerValue.Open;
    }

    public final Density f() {
        Density density = this.f7786b;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    public final float g() {
        return this.f7785a.A();
    }

    public final void h(Density density) {
        this.f7786b = density;
    }
}
