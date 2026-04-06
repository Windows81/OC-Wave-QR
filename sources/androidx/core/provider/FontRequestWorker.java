package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.c;
import androidx.core.provider.FontsContractCompat;
import com.lokalise.sdk.api.Params;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

class FontRequestWorker {

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache f20001a = new LruCache(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f20002b = RequestExecutor.a("fonts-androidx", 10, Params.Timeout.CONNECT_LONG);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f20003c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final SimpleArrayMap f20004d = new SimpleArrayMap();

    public static String a(List list, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < list.size(); i3++) {
            sb.append(((FontRequest) list.get(i3)).d());
            sb.append("-");
            sb.append(i2);
            if (i3 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static int b(FontsContractCompat.FontFamilyResult fontFamilyResult) {
        int i2 = 1;
        if (fontFamilyResult.e() != 0) {
            return fontFamilyResult.e() != 1 ? -3 : -2;
        }
        FontsContractCompat.FontInfo[] c2 = fontFamilyResult.c();
        if (!(c2 == null || c2.length == 0)) {
            int length = c2.length;
            i2 = 0;
            int i3 = 0;
            while (i3 < length) {
                int b2 = c2[i3].b();
                if (b2 == 0) {
                    i3++;
                } else if (b2 < 0) {
                    return -3;
                } else {
                    return b2;
                }
            }
        }
        return i2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r4 = new androidx.core.provider.FontRequestWorker.TypefaceResult(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        androidx.tracing.Trace.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        return r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.provider.FontRequestWorker.TypefaceResult c(java.lang.String r4, android.content.Context r5, java.util.List r6, int r7) {
        /*
            java.lang.String r0 = "getFontSync"
            androidx.tracing.Trace.a(r0)
            androidx.collection.LruCache r0 = f20001a     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r0.d(r4)     // Catch:{ all -> 0x0018 }
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            androidx.core.provider.FontRequestWorker$TypefaceResult r4 = new androidx.core.provider.FontRequestWorker$TypefaceResult     // Catch:{ all -> 0x0018 }
            r4.<init>((android.graphics.Typeface) r1)     // Catch:{ all -> 0x0018 }
            androidx.tracing.Trace.b()
            return r4
        L_0x0018:
            r4 = move-exception
            goto L_0x006d
        L_0x001a:
            r1 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r6 = androidx.core.provider.FontProvider.e(r5, r6, r1)     // Catch:{ NameNotFoundException -> 0x0063 }
            int r2 = b(r6)     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x002e
            androidx.core.provider.FontRequestWorker$TypefaceResult r4 = new androidx.core.provider.FontRequestWorker$TypefaceResult     // Catch:{ all -> 0x0018 }
            r4.<init>((int) r2)     // Catch:{ all -> 0x0018 }
            androidx.tracing.Trace.b()
            return r4
        L_0x002e:
            boolean r2 = r6.f()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0043
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 29
            if (r2 < r3) goto L_0x0043
            java.util.List r6 = r6.d()     // Catch:{ all -> 0x0018 }
            android.graphics.Typeface r5 = androidx.core.graphics.TypefaceCompat.c(r5, r1, r6, r7)     // Catch:{ all -> 0x0018 }
            goto L_0x004b
        L_0x0043:
            androidx.core.provider.FontsContractCompat$FontInfo[] r6 = r6.c()     // Catch:{ all -> 0x0018 }
            android.graphics.Typeface r5 = androidx.core.graphics.TypefaceCompat.b(r5, r1, r6, r7)     // Catch:{ all -> 0x0018 }
        L_0x004b:
            if (r5 == 0) goto L_0x0059
            r0.f(r4, r5)     // Catch:{ all -> 0x0018 }
            androidx.core.provider.FontRequestWorker$TypefaceResult r4 = new androidx.core.provider.FontRequestWorker$TypefaceResult     // Catch:{ all -> 0x0018 }
            r4.<init>((android.graphics.Typeface) r5)     // Catch:{ all -> 0x0018 }
            androidx.tracing.Trace.b()
            return r4
        L_0x0059:
            androidx.core.provider.FontRequestWorker$TypefaceResult r4 = new androidx.core.provider.FontRequestWorker$TypefaceResult     // Catch:{ all -> 0x0018 }
            r5 = -3
            r4.<init>((int) r5)     // Catch:{ all -> 0x0018 }
            androidx.tracing.Trace.b()
            return r4
        L_0x0063:
            androidx.core.provider.FontRequestWorker$TypefaceResult r4 = new androidx.core.provider.FontRequestWorker$TypefaceResult     // Catch:{ all -> 0x0018 }
            r5 = -1
            r4.<init>((int) r5)     // Catch:{ all -> 0x0018 }
            androidx.tracing.Trace.b()
            return r4
        L_0x006d:
            androidx.tracing.Trace.b()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.FontRequestWorker.c(java.lang.String, android.content.Context, java.util.List, int):androidx.core.provider.FontRequestWorker$TypefaceResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r9 = new androidx.core.provider.FontRequestWorker.AnonymousClass3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r8 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r8 = f20002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        androidx.core.provider.RequestExecutor.c(r8, r9, new androidx.core.provider.FontRequestWorker.AnonymousClass4());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface d(final android.content.Context r5, final java.util.List r6, final int r7, java.util.concurrent.Executor r8, final androidx.core.provider.CallbackWrapper r9) {
        /*
            java.lang.String r0 = a(r6, r7)
            androidx.collection.LruCache r1 = f20001a
            java.lang.Object r1 = r1.d(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            androidx.core.provider.FontRequestWorker$TypefaceResult r5 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r5.<init>((android.graphics.Typeface) r1)
            r9.b(r5)
            return r1
        L_0x0017:
            androidx.core.provider.FontRequestWorker$2 r1 = new androidx.core.provider.FontRequestWorker$2
            r1.<init>()
            java.lang.Object r9 = f20003c
            monitor-enter(r9)
            androidx.collection.SimpleArrayMap r2 = f20004d     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x002f }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x002f }
            r4 = 0
            if (r3 == 0) goto L_0x0031
            r3.add(r1)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            return r4
        L_0x002f:
            r5 = move-exception
            goto L_0x004f
        L_0x0031:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            r3.<init>()     // Catch:{ all -> 0x002f }
            r3.add(r1)     // Catch:{ all -> 0x002f }
            r2.put(r0, r3)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            androidx.core.provider.FontRequestWorker$3 r9 = new androidx.core.provider.FontRequestWorker$3
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0046
            java.util.concurrent.ExecutorService r8 = f20002b
        L_0x0046:
            androidx.core.provider.FontRequestWorker$4 r5 = new androidx.core.provider.FontRequestWorker$4
            r5.<init>(r0)
            androidx.core.provider.RequestExecutor.c(r8, r9, r5)
            return r4
        L_0x004f:
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.FontRequestWorker.d(android.content.Context, java.util.List, int, java.util.concurrent.Executor, androidx.core.provider.CallbackWrapper):android.graphics.Typeface");
    }

    public static Typeface e(final Context context, final FontRequest fontRequest, CallbackWrapper callbackWrapper, final int i2, int i3) {
        final String a2 = a(c.a(new Object[]{fontRequest}), i2);
        Typeface typeface = (Typeface) f20001a.d(a2);
        if (typeface != null) {
            callbackWrapper.b(new TypefaceResult(typeface));
            return typeface;
        } else if (i3 == -1) {
            TypefaceResult c2 = c(a2, context, c.a(new Object[]{fontRequest}), i2);
            callbackWrapper.b(c2);
            return c2.f20015a;
        } else {
            try {
                TypefaceResult typefaceResult = (TypefaceResult) RequestExecutor.d(f20002b, new Callable<TypefaceResult>() {
                    /* renamed from: a */
                    public TypefaceResult call() {
                        return FontRequestWorker.c(a2, context, c.a(new Object[]{fontRequest}), i2);
                    }
                }, i3);
                callbackWrapper.b(typefaceResult);
                return typefaceResult.f20015a;
            } catch (InterruptedException unused) {
                callbackWrapper.b(new TypefaceResult(-3));
                return null;
            }
        }
    }

    public static final class TypefaceResult {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f20015a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20016b;

        public TypefaceResult(int i2) {
            this.f20015a = null;
            this.f20016b = i2;
        }

        public boolean a() {
            return this.f20016b == 0;
        }

        public TypefaceResult(Typeface typeface) {
            this.f20015a = typeface;
            this.f20016b = 0;
        }
    }
}
