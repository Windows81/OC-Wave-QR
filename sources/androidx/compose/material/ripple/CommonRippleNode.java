package androidx.compose.material.ripple;

import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class CommonRippleNode extends RippleNode {
    public final MutableScatterMap Y;

    public void J2() {
        this.Y.k();
    }

    public void e3(PressInteraction.Press press, long j2, float f2) {
        PressInteraction.Press press2 = press;
        MutableScatterMap mutableScatterMap = this.Y;
        Object[] objArr = mutableScatterMap.f1960b;
        Object[] objArr2 = mutableScatterMap.f1961c;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j3) < 128) {
                            int i5 = (i2 << 3) + i4;
                            PressInteraction.Press press3 = (PressInteraction.Press) objArr[i5];
                            ((RippleAnimation) objArr2[i5]).h();
                        }
                        j3 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        RippleAnimation rippleAnimation = new RippleAnimation(g3() ? Offset.d(press.a()) : null, f2, g3(), (DefaultConstructorMarker) null);
        this.Y.x(press2, rippleAnimation);
        Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new CommonRippleNode$addRipple$2(rippleAnimation, this, press2, (Continuation) null), 3, (Object) null);
        DrawModifierNodeKt.a(this);
    }

    public void f3(DrawScope drawScope) {
        float f2;
        int i2;
        int i3;
        float f3;
        int i4;
        float d2 = ((RippleAlpha) h3().invoke()).d();
        if (d2 == 0.0f) {
            return;
        }
        MutableScatterMap mutableScatterMap = this.Y;
        Object[] objArr = mutableScatterMap.f1960b;
        Object[] objArr2 = mutableScatterMap.f1961c;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j2 = jArr[i5];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    long j3 = j2;
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & 255) < 128) {
                            int i9 = (i5 << 3) + i8;
                            PressInteraction.Press press = (PressInteraction.Press) objArr[i9];
                            float f4 = d2;
                            i3 = i8;
                            i2 = i7;
                            f3 = d2;
                            i4 = i6;
                            ((RippleAnimation) objArr2[i9]).e(drawScope, Color.l(i3(), f4, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                        } else {
                            DrawScope drawScope2 = drawScope;
                            f3 = d2;
                            i3 = i8;
                            i2 = i7;
                            i4 = i6;
                        }
                        j3 >>= i4;
                        i8 = i3 + 1;
                        i6 = i4;
                        d2 = f3;
                        i7 = i2;
                    }
                    DrawScope drawScope3 = drawScope;
                    f2 = d2;
                    if (i7 != i6) {
                        return;
                    }
                } else {
                    DrawScope drawScope4 = drawScope;
                    f2 = d2;
                }
                if (i5 != length) {
                    i5++;
                    d2 = f2;
                } else {
                    return;
                }
            }
        }
    }

    public void m3(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = (RippleAnimation) this.Y.e(press);
        if (rippleAnimation != null) {
            rippleAnimation.h();
        }
    }
}
