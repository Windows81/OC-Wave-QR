package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SkipToLookaheadNodeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function0 f2401a = SkipToLookaheadNodeKt$DefaultEnabled$1.f2402z;

    public static final Modifier a(Modifier modifier, ScaleToBoundsImpl scaleToBoundsImpl, Function0 function0) {
        return modifier.o0(Intrinsics.d(scaleToBoundsImpl.b(), ContentScale.f17026a.a()) ? GraphicsLayerModifierKt.a(Modifier.f15489d, new SkipToLookaheadNodeKt$createContentScaleModifier$1(function0)) : Modifier.f15489d).o0(new SkipToLookaheadElement(scaleToBoundsImpl, function0));
    }
}
