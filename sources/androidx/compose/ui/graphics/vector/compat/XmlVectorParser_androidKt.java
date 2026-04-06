package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Metadata
public final class XmlVectorParser_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int f16725a = 0;

    public static final ImageVector.Builder a(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long f2;
        int z2;
        AndroidVectorParser androidVectorParser2 = androidVectorParser;
        Resources.Theme theme2 = theme;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.f16699a;
        TypedArray k2 = androidVectorParser2.k(resources, theme2, attributeSet, androidVectorResources.F());
        boolean d2 = androidVectorParser2.d(k2, "autoMirrored", androidVectorResources.a(), false);
        float g2 = androidVectorParser2.g(k2, "viewportWidth", androidVectorResources.H(), 0.0f);
        float g3 = androidVectorParser2.g(k2, "viewportHeight", androidVectorResources.G(), 0.0f);
        if (g2 <= 0.0f) {
            throw new XmlPullParserException(k2.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        } else if (g3 > 0.0f) {
            float a2 = androidVectorParser2.a(k2, androidVectorResources.I(), 0.0f);
            float a3 = androidVectorParser2.a(k2, androidVectorResources.n(), 0.0f);
            if (k2.hasValue(androidVectorResources.D())) {
                TypedValue typedValue = new TypedValue();
                k2.getValue(androidVectorResources.D(), typedValue);
                if (typedValue.type == 2) {
                    f2 = Color.f15975b.f();
                } else {
                    ColorStateList e2 = androidVectorParser2.e(k2, theme2, "tint", androidVectorResources.D());
                    f2 = e2 != null ? ColorKt.b(e2.getDefaultColor()) : Color.f15975b.f();
                }
            } else {
                f2 = Color.f15975b.f();
            }
            long j2 = f2;
            int c2 = androidVectorParser2.c(k2, androidVectorResources.E(), -1);
            if (c2 == -1) {
                z2 = BlendMode.f15926b.z();
            } else if (c2 == 3) {
                z2 = BlendMode.f15926b.B();
            } else if (c2 == 5) {
                z2 = BlendMode.f15926b.z();
            } else if (c2 != 9) {
                switch (c2) {
                    case 14:
                        z2 = BlendMode.f15926b.q();
                        break;
                    case 15:
                        z2 = BlendMode.f15926b.v();
                        break;
                    case 16:
                        z2 = BlendMode.f15926b.t();
                        break;
                    default:
                        z2 = BlendMode.f15926b.z();
                        break;
                }
            } else {
                z2 = BlendMode.f15926b.y();
            }
            int i2 = z2;
            float m2 = Dp.m(a2 / resources.getDisplayMetrics().density);
            float m3 = Dp.m(a3 / resources.getDisplayMetrics().density);
            k2.recycle();
            return new ImageVector.Builder((String) null, m2, m3, g2, g3, j2, i2, d2, 1, (DefaultConstructorMarker) null);
        } else {
            throw new XmlPullParserException(k2.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
    }

    public static final int b(int i2, int i3) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i3 : StrokeCap.f16130b.c() : StrokeCap.f16130b.b() : StrokeCap.f16130b.a();
    }

    public static final int c(int i2, int i3) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i3 : StrokeJoin.f16135b.a() : StrokeJoin.f16135b.c() : StrokeJoin.f16135b.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    public static final Brush e(ComplexColorCompat complexColorCompat) {
        if (!complexColorCompat.l()) {
            return null;
        }
        Shader f2 = complexColorCompat.f();
        return f2 != null ? BrushKt.a(f2) : new SolidColor(ColorKt.b(complexColorCompat.e()), (DefaultConstructorMarker) null);
    }

    public static final void f(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorParser androidVectorParser2 = androidVectorParser;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.f16699a;
        TypedArray k2 = androidVectorParser2.k(resources, theme, attributeSet, androidVectorResources.b());
        String i2 = androidVectorParser2.i(k2, androidVectorResources.c());
        if (i2 == null) {
            i2 = "";
        }
        String str = i2;
        String i3 = androidVectorParser2.i(k2, androidVectorResources.d());
        List d2 = i3 == null ? VectorKt.d() : PathParser.b(androidVectorParser2.f16696c, i3, (ArrayList) null, 2, (Object) null);
        k2.recycle();
        ImageVector.Builder.b(builder, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, d2, 254, (Object) null);
    }

    public static final int g(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i2) {
        int eventType = androidVectorParser.j().getEventType();
        if (eventType == 2) {
            String name = androidVectorParser.j().getName();
            if (name == null) {
                return i2;
            }
            int hashCode = name.hashCode();
            if (hashCode != -1649314686) {
                if (hashCode != 3433509) {
                    if (hashCode != 98629247 || !name.equals("group")) {
                        return i2;
                    }
                    h(androidVectorParser, resources, theme, attributeSet, builder);
                    return i2;
                } else if (!name.equals("path")) {
                    return i2;
                } else {
                    i(androidVectorParser, resources, theme, attributeSet, builder);
                    return i2;
                }
            } else if (!name.equals("clip-path")) {
                return i2;
            } else {
                f(androidVectorParser, resources, theme, attributeSet, builder);
                return i2 + 1;
            }
        } else if (eventType != 3 || !Intrinsics.d("group", androidVectorParser.j().getName())) {
            return i2;
        } else {
            int i3 = i2 + 1;
            for (int i4 = 0; i4 < i3; i4++) {
                builder.g();
            }
            return 0;
        }
    }

    public static final void h(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorParser androidVectorParser2 = androidVectorParser;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.f16699a;
        TypedArray k2 = androidVectorParser2.k(resources, theme, attributeSet, androidVectorResources.e());
        float g2 = androidVectorParser2.g(k2, "rotation", androidVectorResources.i(), 0.0f);
        float b2 = androidVectorParser2.b(k2, androidVectorResources.g(), 0.0f);
        float b3 = androidVectorParser2.b(k2, androidVectorResources.h(), 0.0f);
        float g3 = androidVectorParser2.g(k2, "scaleX", androidVectorResources.j(), 1.0f);
        float g4 = androidVectorParser2.g(k2, "scaleY", androidVectorResources.k(), 1.0f);
        float g5 = androidVectorParser2.g(k2, "translateX", androidVectorResources.l(), 0.0f);
        float g6 = androidVectorParser2.g(k2, "translateY", androidVectorResources.m(), 0.0f);
        String i2 = androidVectorParser2.i(k2, androidVectorResources.f());
        if (i2 == null) {
            i2 = "";
        }
        k2.recycle();
        builder.a(i2, g2, b2, b3, g3, g4, g5, g6, VectorKt.d());
    }

    public static final void i(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorParser androidVectorParser2 = androidVectorParser;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.f16699a;
        TypedArray k2 = androidVectorParser2.k(resources, theme, attributeSet, androidVectorResources.o());
        if (TypedArrayUtils.h(androidVectorParser.j(), "pathData")) {
            String i2 = androidVectorParser2.i(k2, androidVectorResources.r());
            if (i2 == null) {
                i2 = "";
            }
            String str = i2;
            String i3 = androidVectorParser2.i(k2, androidVectorResources.s());
            List d2 = i3 == null ? VectorKt.d() : PathParser.b(androidVectorParser2.f16696c, i3, (ArrayList) null, 2, (Object) null);
            ComplexColorCompat f2 = androidVectorParser.f(k2, theme, "fillColor", androidVectorResources.q(), 0);
            float g2 = androidVectorParser2.g(k2, "fillAlpha", androidVectorResources.p(), 1.0f);
            int b2 = b(androidVectorParser2.h(k2, "strokeLineCap", androidVectorResources.v(), -1), StrokeCap.f16130b.a());
            int c2 = c(androidVectorParser2.h(k2, "strokeLineJoin", androidVectorResources.w(), -1), StrokeJoin.f16135b.a());
            float g3 = androidVectorParser2.g(k2, "strokeMiterLimit", androidVectorResources.x(), 1.0f);
            ComplexColorCompat f3 = androidVectorParser.f(k2, theme, "strokeColor", androidVectorResources.u(), 0);
            float g4 = androidVectorParser2.g(k2, "strokeAlpha", androidVectorResources.t(), 1.0f);
            float g5 = androidVectorParser2.g(k2, "strokeWidth", androidVectorResources.y(), 1.0f);
            float g6 = androidVectorParser2.g(k2, "trimPathEnd", androidVectorResources.z(), 1.0f);
            float g7 = androidVectorParser2.g(k2, "trimPathOffset", androidVectorResources.B(), 0.0f);
            float g8 = androidVectorParser2.g(k2, "trimPathStart", androidVectorResources.C(), 0.0f);
            int h2 = androidVectorParser2.h(k2, "fillType", androidVectorResources.A(), f16725a);
            k2.recycle();
            Brush e2 = e(f2);
            Brush e3 = e(f3);
            PathFillType.Companion companion = PathFillType.f16071b;
            builder.c(d2, h2 == 0 ? companion.b() : companion.a(), str, e2, g2, e3, g4, g5, b2, c2, g3, g8, g6, g7);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
