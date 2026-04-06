package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.c;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public class FontsContractCompat {

    public static final class Columns implements BaseColumns {
    }

    public static class FontInfo {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f20019a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20020b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20021c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f20022d;

        /* renamed from: e  reason: collision with root package name */
        public final int f20023e;

        public FontInfo(Uri uri, int i2, int i3, boolean z2, int i4) {
            this.f20019a = (Uri) Preconditions.f(uri);
            this.f20020b = i2;
            this.f20021c = i3;
            this.f20022d = z2;
            this.f20023e = i4;
        }

        public static FontInfo a(Uri uri, int i2, int i3, boolean z2, int i4) {
            return new FontInfo(uri, i2, i3, z2, i4);
        }

        public int b() {
            return this.f20023e;
        }

        public int c() {
            return this.f20020b;
        }

        public Uri d() {
            return this.f20019a;
        }

        public int e() {
            return this.f20021c;
        }

        public boolean f() {
            return this.f20022d;
        }
    }

    public static class FontRequestCallback {

        @Retention(RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }

        public void a(int i2) {
        }

        public void b(Typeface typeface) {
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, FontInfo[] fontInfoArr) {
        return TypefaceCompat.b(context, cancellationSignal, fontInfoArr, 0);
    }

    public static FontFamilyResult b(Context context, CancellationSignal cancellationSignal, FontRequest fontRequest) {
        return FontProvider.e(context, c.a(new Object[]{fontRequest}), cancellationSignal);
    }

    public static Typeface c(Context context, List list, int i2, boolean z2, int i3, Handler handler, FontRequestCallback fontRequestCallback) {
        CallbackWrapper callbackWrapper = new CallbackWrapper(fontRequestCallback, RequestExecutor.b(handler));
        if (!z2) {
            return FontRequestWorker.d(context, list, i2, (Executor) null, callbackWrapper);
        }
        if (list.size() <= 1) {
            return FontRequestWorker.e(context, (FontRequest) list.get(0), callbackWrapper, i2, i3);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class FontFamilyResult {

        /* renamed from: a  reason: collision with root package name */
        public final int f20017a;

        /* renamed from: b  reason: collision with root package name */
        public final List f20018b;

        public FontFamilyResult(int i2, FontInfo[] fontInfoArr) {
            this.f20017a = i2;
            this.f20018b = Collections.singletonList(fontInfoArr);
        }

        public static FontFamilyResult a(int i2, List list) {
            return new FontFamilyResult(i2, list);
        }

        public static FontFamilyResult b(int i2, FontInfo[] fontInfoArr) {
            return new FontFamilyResult(i2, fontInfoArr);
        }

        public FontInfo[] c() {
            return (FontInfo[]) this.f20018b.get(0);
        }

        public List d() {
            return this.f20018b;
        }

        public int e() {
            return this.f20017a;
        }

        public boolean f() {
            return this.f20018b.size() > 1;
        }

        public FontFamilyResult(int i2, List list) {
            this.f20017a = i2;
            this.f20018b = list;
        }
    }
}
