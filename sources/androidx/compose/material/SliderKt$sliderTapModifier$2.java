package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class SliderKt$sliderTapModifier$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DraggableState f8422A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8423B;
    public final /* synthetic */ float C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ MutableState E;
    public final /* synthetic */ State F;
    public final /* synthetic */ State G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8424z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderTapModifier$2(boolean z2, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f2, boolean z3, MutableState mutableState, State state, State state2) {
        super(3);
        this.f8424z = z2;
        this.f8422A = draggableState;
        this.f8423B = mutableInteractionSource;
        this.C = f2;
        this.D = z3;
        this.E = mutableState;
        this.F = state;
        this.G = state2;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(1945228890);
        if (ComposerKt.P()) {
            ComposerKt.Y(1945228890, i2, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:1002)");
        }
        if (this.f8424z) {
            composer.X(-394118969);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, composer);
                composer.N(g2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) g2;
            Object[] objArr = {this.f8422A, this.f8423B, Float.valueOf(this.C), Boolean.valueOf(this.D)};
            boolean d2 = composer.d(this.D) | composer.h(this.C) | composer.W(this.E) | composer.W(this.F) | composer.l(coroutineScope) | composer.l(this.f8422A) | composer.W(this.G);
            boolean z2 = this.D;
            float f2 = this.C;
            MutableState mutableState = this.E;
            State state = this.F;
            DraggableState draggableState = this.f8422A;
            State state2 = this.G;
            Object g3 = composer.g();
            if (d2 || g3 == companion.a()) {
                SliderKt$sliderTapModifier$2$1$1 sliderKt$sliderTapModifier$2$1$1 = new SliderKt$sliderTapModifier$2$1$1(z2, f2, mutableState, state, coroutineScope, draggableState, state2, (Continuation) null);
                composer.N(sliderKt$sliderTapModifier$2$1$1);
                g3 = sliderKt$sliderTapModifier$2$1$1;
            }
            modifier = modifier.o0(new SuspendPointerInputElement((Object) null, (Object) null, objArr, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) g3), 3, (DefaultConstructorMarker) null));
            composer.M();
        } else {
            composer.X(-393026932);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return modifier;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
