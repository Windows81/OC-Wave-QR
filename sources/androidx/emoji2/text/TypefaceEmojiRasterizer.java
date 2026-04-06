package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TypefaceEmojiRasterizer {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f21348d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final int f21349a;

    /* renamed from: b  reason: collision with root package name */
    public final MetadataRepo f21350b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f21351c = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    public TypefaceEmojiRasterizer(MetadataRepo metadataRepo, int i2) {
        this.f21350b = metadataRepo;
        this.f21349a = i2;
    }

    public void a(Canvas canvas, float f2, float f3, Paint paint) {
        Typeface g2 = this.f21350b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g2);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f21350b.c(), this.f21349a * 2, 2, f2, f3, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i2) {
        return g().i(i2);
    }

    public int c() {
        return g().j();
    }

    public int d() {
        return this.f21351c & 3;
    }

    public int e() {
        return g().l();
    }

    public int f() {
        return g().m();
    }

    public final MetadataItem g() {
        ThreadLocal threadLocal = f21348d;
        MetadataItem metadataItem = (MetadataItem) threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        this.f21350b.d().k(metadataItem, this.f21349a);
        return metadataItem;
    }

    public short h() {
        return g().n();
    }

    public int i() {
        return g().o();
    }

    public boolean j() {
        return g().k();
    }

    public boolean k() {
        return (this.f21351c & 4) > 0;
    }

    public void l(boolean z2) {
        int d2 = d();
        if (z2) {
            this.f21351c = d2 | 4;
        } else {
            this.f21351c = d2;
        }
    }

    public void m(boolean z2) {
        int i2 = this.f21351c & 4;
        this.f21351c = z2 ? i2 | 2 : i2 | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c2 = c();
        for (int i2 = 0; i2 < c2; i2++) {
            sb.append(Integer.toHexString(b(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
