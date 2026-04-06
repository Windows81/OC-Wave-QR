package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class StateLayer {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9096a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f9097b;

    /* renamed from: c  reason: collision with root package name */
    public final Animatable f9098c = AnimatableKt.b(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public final List f9099d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public Interaction f9100e;

    public StateLayer(boolean z2, Function0 function0) {
        this.f9096a = z2;
        this.f9097b = function0;
    }

    public final void b(DrawScope drawScope, float f2, long j2) {
        long j3;
        float floatValue = ((Number) this.f9098c.m()).floatValue();
        if (floatValue > 0.0f) {
            long l2 = Color.l(j2, floatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            if (this.f9096a) {
                float i2 = Size.i(drawScope.c());
                float g2 = Size.g(drawScope.c());
                int b2 = ClipOp.f15971b.b();
                DrawContext G1 = drawScope.G1();
                long c2 = G1.c();
                G1.j().o();
                try {
                    G1.e().b(0.0f, 0.0f, i2, g2, b2);
                    j3 = c2;
                    try {
                        DrawScope.k2(drawScope, l2, f2, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 124, (Object) null);
                        G1.j().t();
                        G1.f(j3);
                    } catch (Throwable th) {
                        th = th;
                        G1.j().t();
                        G1.f(j3);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j3 = c2;
                    G1.j().t();
                    G1.f(j3);
                    throw th;
                }
            } else {
                DrawScope.k2(drawScope, l2, f2, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 124, (Object) null);
            }
        }
    }

    public final void c(Interaction interaction, CoroutineScope coroutineScope) {
        boolean z2 = interaction instanceof HoverInteraction.Enter;
        if (z2) {
            this.f9099d.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.f9099d.remove(((HoverInteraction.Exit) interaction).a());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.f9099d.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.f9099d.remove(((FocusInteraction.Unfocus) interaction).a());
        } else if (interaction instanceof DragInteraction.Start) {
            this.f9099d.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.f9099d.remove(((DragInteraction.Stop) interaction).a());
        } else if (interaction instanceof DragInteraction.Cancel) {
            this.f9099d.remove(((DragInteraction.Cancel) interaction).a());
        } else {
            return;
        }
        Interaction interaction2 = (Interaction) CollectionsKt.q0(this.f9099d);
        if (!Intrinsics.d(this.f9100e, interaction2)) {
            if (interaction2 != null) {
                RippleAlpha rippleAlpha = (RippleAlpha) this.f9097b.invoke();
                Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new StateLayer$handleInteraction$1(this, z2 ? rippleAlpha.c() : interaction instanceof FocusInteraction.Focus ? rippleAlpha.b() : interaction instanceof DragInteraction.Start ? rippleAlpha.a() : 0.0f, RippleKt.d(interaction2), (Continuation) null), 3, (Object) null);
            } else {
                Job unused2 = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new StateLayer$handleInteraction$2(this, RippleKt.e(this.f9100e), (Continuation) null), 3, (Object) null);
            }
            this.f9100e = interaction2;
        }
    }
}
