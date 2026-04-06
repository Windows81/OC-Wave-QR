package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

@Metadata
public final class AndroidVectorParser {

    /* renamed from: a  reason: collision with root package name */
    public final XmlPullParser f16694a;

    /* renamed from: b  reason: collision with root package name */
    public int f16695b;

    /* renamed from: c  reason: collision with root package name */
    public final PathParser f16696c;

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i2) {
        this.f16694a = xmlPullParser;
        this.f16695b = i2;
        this.f16696c = new PathParser();
    }

    public final float a(TypedArray typedArray, int i2, float f2) {
        float dimension = typedArray.getDimension(i2, f2);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float b(TypedArray typedArray, int i2, float f2) {
        float f3 = typedArray.getFloat(i2, f2);
        l(typedArray.getChangingConfigurations());
        return f3;
    }

    public final int c(TypedArray typedArray, int i2, int i3) {
        int i4 = typedArray.getInt(i2, i3);
        l(typedArray.getChangingConfigurations());
        return i4;
    }

    public final boolean d(TypedArray typedArray, String str, int i2, boolean z2) {
        boolean a2 = TypedArrayUtils.a(typedArray, this.f16694a, str, i2, z2);
        l(typedArray.getChangingConfigurations());
        return a2;
    }

    public final ColorStateList e(TypedArray typedArray, Resources.Theme theme, String str, int i2) {
        ColorStateList c2 = TypedArrayUtils.c(typedArray, this.f16694a, theme, str, i2);
        l(typedArray.getChangingConfigurations());
        return c2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return Intrinsics.d(this.f16694a, androidVectorParser.f16694a) && this.f16695b == androidVectorParser.f16695b;
    }

    public final ComplexColorCompat f(TypedArray typedArray, Resources.Theme theme, String str, int i2, int i3) {
        ComplexColorCompat e2 = TypedArrayUtils.e(typedArray, this.f16694a, theme, str, i2, i3);
        l(typedArray.getChangingConfigurations());
        return e2;
    }

    public final float g(TypedArray typedArray, String str, int i2, float f2) {
        float f3 = TypedArrayUtils.f(typedArray, this.f16694a, str, i2, f2);
        l(typedArray.getChangingConfigurations());
        return f3;
    }

    public final int h(TypedArray typedArray, String str, int i2, int i3) {
        int g2 = TypedArrayUtils.g(typedArray, this.f16694a, str, i2, i3);
        l(typedArray.getChangingConfigurations());
        return g2;
    }

    public int hashCode() {
        return (this.f16694a.hashCode() * 31) + Integer.hashCode(this.f16695b);
    }

    public final String i(TypedArray typedArray, int i2) {
        String string = typedArray.getString(i2);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser j() {
        return this.f16694a;
    }

    public final TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray i2 = TypedArrayUtils.i(resources, theme, attributeSet, iArr);
        l(i2.getChangingConfigurations());
        return i2;
    }

    public final void l(int i2) {
        this.f16695b = i2 | this.f16695b;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f16694a + ", config=" + this.f16695b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i3 & 2) != 0 ? 0 : i2);
    }
}
