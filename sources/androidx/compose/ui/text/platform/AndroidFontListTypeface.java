package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontSynthesis_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Deprecated
public final class AndroidFontListTypeface implements AndroidTypeface {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f18945c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18946d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final FontMatcher f18947e = new FontMatcher();

    /* renamed from: a  reason: collision with root package name */
    public final FontMatcher f18948a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f18949b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public Typeface a(FontWeight fontWeight, int i2, int i3) {
        Font font = (Font) CollectionsKt.g0(this.f18948a.a(new ArrayList(this.f18949b.keySet()), fontWeight, i2));
        if (font != null) {
            Typeface typeface = (Typeface) this.f18949b.get(font);
            if (typeface != null) {
                Object a2 = FontSynthesis_androidKt.a(i3, typeface, font, fontWeight, i2);
                Intrinsics.g(a2, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) a2;
            }
            InlineClassHelperKt.d("Could not load typeface");
            throw new KotlinNothingValueException();
        }
        InlineClassHelperKt.d("Could not load font");
        throw new KotlinNothingValueException();
    }
}
