package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SurfaceKt$Surface$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shape f8517A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8518B;
    public final /* synthetic */ float C;
    public final /* synthetic */ BorderStroke D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Function2 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8519z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2  reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(PointerInputScope pointerInputScope, Continuation continuation) {
            return ((AnonymousClass2) s(pointerInputScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass2(continuation);
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$1(Modifier modifier, Shape shape, long j2, float f2, BorderStroke borderStroke, float f3, Function2 function2) {
        super(2);
        this.f8519z = modifier;
        this.f8517A = shape;
        this.f8518B = j2;
        this.C = f2;
        this.D = borderStroke;
        this.E = f3;
        this.F = function2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1822160838, i2, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:108)");
            }
            Modifier e2 = SemanticsModifierKt.c(SurfaceKt.g(this.f8519z, this.f8517A, SurfaceKt.h(this.f8518B, (ElevationOverlay) composer.C(ElevationOverlayKt.d()), this.C, composer, 0), this.D, this.E), false, AnonymousClass1.f8520z).o0(new SuspendPointerInputElement(Unit.f40552a, (Object) null, (Object[]) null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new AnonymousClass2((Continuation) null)), 6, (DefaultConstructorMarker) null));
            Function2 function2 = this.F;
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), true);
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer, e2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a3);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e3, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function2.m(composer, 0);
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
