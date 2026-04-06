package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

@Metadata
public final class AndroidFontLoader implements PlatformFontLoader {

    /* renamed from: a  reason: collision with root package name */
    public final Context f18664a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f18665b;

    public AndroidFontLoader(Context context) {
        this.f18664a = context.getApplicationContext();
    }

    public Object a() {
        return this.f18665b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(androidx.compose.ui.text.font.Font r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r6 = r0.D
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            java.lang.Object r0 = r0.C
            androidx.compose.ui.text.font.AndroidFontLoader r0 = (androidx.compose.ui.text.font.AndroidFontLoader) r0
            kotlin.ResultKt.b(r7)
            goto L_0x0070
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003c:
            kotlin.ResultKt.b(r7)
            goto L_0x0058
        L_0x0040:
            kotlin.ResultKt.b(r7)
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.AndroidFont
            if (r7 == 0) goto L_0x0059
            androidx.compose.ui.text.font.AndroidFont r6 = (androidx.compose.ui.text.font.AndroidFont) r6
            androidx.compose.ui.text.font.AndroidFont$TypefaceLoader r7 = r6.d()
            android.content.Context r2 = r5.f18664a
            r0.G = r4
            java.lang.Object r7 = r7.b(r2, r6, r0)
            if (r7 != r1) goto L_0x0058
            return r1
        L_0x0058:
            return r7
        L_0x0059:
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.ResourceFont
            if (r7 == 0) goto L_0x007f
            r7 = r6
            androidx.compose.ui.text.font.ResourceFont r7 = (androidx.compose.ui.text.font.ResourceFont) r7
            android.content.Context r2 = r5.f18664a
            r0.C = r5
            r0.D = r6
            r0.G = r3
            java.lang.Object r7 = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.d(r7, r2, r0)
            if (r7 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r0 = r5
        L_0x0070:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            androidx.compose.ui.text.font.ResourceFont r6 = (androidx.compose.ui.text.font.ResourceFont) r6
            androidx.compose.ui.text.font.FontVariation$Settings r6 = r6.e()
            android.content.Context r0 = r0.f18664a
            android.graphics.Typeface r6 = androidx.compose.ui.text.font.PlatformTypefaces_androidKt.c(r7, r6, r0)
            return r6
        L_0x007f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.c(androidx.compose.ui.text.font.Font, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: d */
    public Typeface b(Font font) {
        Typeface typeface;
        Object obj;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.d().a(this.f18664a, androidFont);
        }
        Object obj2 = null;
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int b2 = font.b();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.f18719b;
        if (FontLoadingStrategy.f(b2, companion.b())) {
            typeface = AndroidFontLoader_androidKt.c((ResourceFont) font, this.f18664a);
        } else if (FontLoadingStrategy.f(b2, companion.c())) {
            try {
                Result.Companion companion2 = Result.f40519A;
                obj = Result.b(AndroidFontLoader_androidKt.c((ResourceFont) font, this.f18664a));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.f40519A;
                obj = Result.b(ResultKt.a(th));
            }
            if (!Result.g(obj)) {
                obj2 = obj;
            }
            typeface = (Typeface) obj2;
        } else if (FontLoadingStrategy.f(b2, companion.a())) {
            throw new UnsupportedOperationException("Unsupported Async font load path");
        } else {
            throw new IllegalArgumentException("Unknown loading type " + FontLoadingStrategy.h(font.b()));
        }
        return PlatformTypefaces_androidKt.c(typeface, ((ResourceFont) font).e(), this.f18664a);
    }
}
