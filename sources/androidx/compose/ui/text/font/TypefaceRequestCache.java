package androidx.compose.ui.text.font;

import androidx.collection.LruCache;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TypefaceRequestCache {

    /* renamed from: a  reason: collision with root package name */
    public final SynchronizedObject f18771a = new SynchronizedObject();

    /* renamed from: b  reason: collision with root package name */
    public final LruCache f18772b = new LruCache(16);

    public final SynchronizedObject b() {
        return this.f18771a;
    }

    public final void c(List list, Function1 function1) {
        TypefaceResult typefaceResult;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            TypefaceRequest typefaceRequest = (TypefaceRequest) list.get(i2);
            synchronized (this.f18771a) {
                typefaceResult = (TypefaceResult) this.f18772b.d(typefaceRequest);
            }
            if (typefaceResult == null) {
                try {
                    TypefaceResult typefaceResult2 = (TypefaceResult) function1.invoke(typefaceRequest);
                    if (!(typefaceResult2 instanceof TypefaceResult.Async)) {
                        synchronized (this.f18771a) {
                            TypefaceResult typefaceResult3 = (TypefaceResult) this.f18772b.f(typefaceRequest, typefaceResult2);
                        }
                    } else {
                        continue;
                    }
                } catch (Exception e2) {
                    throw new IllegalStateException("Could not load font", e2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5 = (androidx.compose.ui.text.font.TypefaceResult) r5.invoke(new androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r0 = r3.f18771a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r3.f18772b.d(r4) != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r5.f() == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r3.f18772b.f(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r4 = kotlin.Unit.f40552a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
        throw new java.lang.IllegalStateException("Could not load font", r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.State d(androidx.compose.ui.text.font.TypefaceRequest r4, kotlin.jvm.functions.Function1 r5) {
        /*
            r3 = this;
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r3.f18771a
            monitor-enter(r0)
            androidx.collection.LruCache r1 = r3.f18772b     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = r1.d(r4)     // Catch:{ all -> 0x001e }
            androidx.compose.ui.text.font.TypefaceResult r1 = (androidx.compose.ui.text.font.TypefaceResult) r1     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0020
            boolean r2 = r1.f()     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x0015
            monitor-exit(r0)
            return r1
        L_0x0015:
            androidx.collection.LruCache r1 = r3.f18772b     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = r1.g(r4)     // Catch:{ all -> 0x001e }
            androidx.compose.ui.text.font.TypefaceResult r1 = (androidx.compose.ui.text.font.TypefaceResult) r1     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r4 = move-exception
            goto L_0x0054
        L_0x0020:
            monitor-exit(r0)
            androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1 r0 = new androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1     // Catch:{ Exception -> 0x004b }
            r0.<init>(r3, r4)     // Catch:{ Exception -> 0x004b }
            java.lang.Object r5 = r5.invoke(r0)     // Catch:{ Exception -> 0x004b }
            androidx.compose.ui.text.font.TypefaceResult r5 = (androidx.compose.ui.text.font.TypefaceResult) r5     // Catch:{ Exception -> 0x004b }
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r3.f18771a
            monitor-enter(r0)
            androidx.collection.LruCache r1 = r3.f18772b     // Catch:{ all -> 0x0043 }
            java.lang.Object r1 = r1.d(r4)     // Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x0045
            boolean r1 = r5.f()     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0045
            androidx.collection.LruCache r1 = r3.f18772b     // Catch:{ all -> 0x0043 }
            r1.f(r4, r5)     // Catch:{ all -> 0x0043 }
            goto L_0x0045
        L_0x0043:
            r4 = move-exception
            goto L_0x0049
        L_0x0045:
            kotlin.Unit r4 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)
            return r5
        L_0x0049:
            monitor-exit(r0)
            throw r4
        L_0x004b:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r5.<init>(r0, r4)
            throw r5
        L_0x0054:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.TypefaceRequestCache.d(androidx.compose.ui.text.font.TypefaceRequest, kotlin.jvm.functions.Function1):androidx.compose.runtime.State");
    }
}
