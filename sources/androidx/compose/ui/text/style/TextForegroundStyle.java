package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface TextForegroundStyle {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f19102a = Companion.f19103a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f19103a = new Companion();

        public final TextForegroundStyle a(Brush brush, float f2) {
            if (brush == null) {
                return Unspecified.f19104b;
            }
            if (brush instanceof SolidColor) {
                return b(TextDrawStyleKt.c(((SolidColor) brush).c(), f2));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f2);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final TextForegroundStyle b(long j2) {
            return j2 != 16 ? new ColorStyle(j2, (DefaultConstructorMarker) null) : Unspecified.f19104b;
        }
    }

    @Metadata
    public static final class Unspecified implements TextForegroundStyle {

        /* renamed from: b  reason: collision with root package name */
        public static final Unspecified f19104b = new Unspecified();

        public float c() {
            return Float.NaN;
        }

        public Brush d() {
            return null;
        }

        public long g() {
            return Color.f15975b.f();
        }
    }

    TextForegroundStyle a(Function0 function0) {
        return !Intrinsics.d(this, Unspecified.f19104b) ? this : (TextForegroundStyle) function0.invoke();
    }

    TextForegroundStyle b(TextForegroundStyle textForegroundStyle) {
        boolean z2 = textForegroundStyle instanceof BrushStyle;
        return (!z2 || !(this instanceof BrushStyle)) ? (!z2 || (this instanceof BrushStyle)) ? (z2 || !(this instanceof BrushStyle)) ? textForegroundStyle.a(new TextForegroundStyle$merge$2(this)) : this : textForegroundStyle : new BrushStyle(((BrushStyle) textForegroundStyle).e(), TextDrawStyleKt.d(textForegroundStyle.c(), new TextForegroundStyle$merge$1(this)));
    }

    float c();

    Brush d();

    long g();
}
