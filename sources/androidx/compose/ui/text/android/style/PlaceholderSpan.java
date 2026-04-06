package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.lang.annotation.RetentionPolicy;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PlaceholderSpan extends ReplacementSpan {

    /* renamed from: k  reason: collision with root package name */
    public static final Companion f18637k = new Companion((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f18638l = 8;

    /* renamed from: a  reason: collision with root package name */
    public final float f18639a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18640b;

    /* renamed from: c  reason: collision with root package name */
    public final float f18641c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18642d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18643e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18644f;

    /* renamed from: g  reason: collision with root package name */
    public Paint.FontMetricsInt f18645g;

    /* renamed from: h  reason: collision with root package name */
    public int f18646h;

    /* renamed from: i  reason: collision with root package name */
    public int f18647i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f18648j;

    @Metadata
    public static final class Companion {

        @Metadata
        @Retention
        @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
        public @interface Unit {
        }

        @Metadata
        @Retention
        @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
        public @interface VerticalAlign {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public PlaceholderSpan(float f2, int i2, float f3, int i3, float f4, int i4) {
        this.f18639a = f2;
        this.f18640b = i2;
        this.f18641c = f3;
        this.f18642d = i3;
        this.f18643e = f4;
        this.f18644f = i4;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f18645g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.y("fontMetrics");
        return null;
    }

    public final int b() {
        if (!this.f18648j) {
            InlineClassHelperKt.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f18647i;
    }

    public final int c() {
        return this.f18644f;
    }

    public final int d() {
        if (!this.f18648j) {
            InlineClassHelperKt.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f18646h;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        float f2;
        int i4;
        this.f18648j = true;
        float textSize = paint.getTextSize();
        this.f18645g = paint.getFontMetricsInt();
        if (!(a().descent > a().ascent)) {
            InlineClassHelperKt.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i5 = this.f18640b;
        if (i5 == 0) {
            f2 = this.f18639a * this.f18643e;
        } else if (i5 == 1) {
            f2 = this.f18639a * textSize;
        } else {
            InlineClassHelperKt.b("Unsupported unit.");
            throw new KotlinNothingValueException();
        }
        this.f18646h = PlaceholderSpan_androidKt.a(f2);
        int i6 = this.f18642d;
        if (i6 == 0) {
            i4 = PlaceholderSpan_androidKt.a(this.f18641c * this.f18643e);
        } else if (i6 == 1) {
            i4 = PlaceholderSpan_androidKt.a(this.f18641c * textSize);
        } else {
            InlineClassHelperKt.b("Unsupported unit.");
            throw new KotlinNothingValueException();
        }
        this.f18647i = i4;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f18644f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + b();
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int b2 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = b2;
                        fontMetricsInt.descent = b2 + b();
                        break;
                    }
                    break;
                default:
                    InlineClassHelperKt.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return d();
    }
}
