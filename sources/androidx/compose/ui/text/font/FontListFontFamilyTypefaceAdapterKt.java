package androidx.compose.ui.text.font;

import kotlin.Metadata;

@Metadata
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Pair b(java.util.List r19, androidx.compose.ui.text.font.TypefaceRequest r20, androidx.compose.ui.text.font.AsyncTypefaceCache r21, androidx.compose.ui.text.font.PlatformFontLoader r22, kotlin.jvm.functions.Function1 r23) {
        /*
            r1 = r19
            r2 = r20
            r10 = r22
            r11 = r23
            r12 = 1
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            int r13 = r0.size()
            r8 = 0
            r9 = 0
        L_0x0012:
            if (r9 >= r13) goto L_0x019a
            java.lang.Object r0 = r1.get(r9)
            r7 = r0
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.ui.text.font.Font) r7
            int r0 = r7.b()
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r3 = androidx.compose.ui.text.font.FontLoadingStrategy.f18719b
            int r4 = r3.b()
            boolean r4 = androidx.compose.ui.text.font.FontLoadingStrategy.f(r0, r4)
            if (r4 == 0) goto L_0x0097
            androidx.compose.ui.text.platform.SynchronizedObject r1 = r21.f18680d
            monitor-enter(r1)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key     // Catch:{ all -> 0x0051 }
            java.lang.Object r3 = r22.a()     // Catch:{ all -> 0x0051 }
            r0.<init>(r7, r3)     // Catch:{ all -> 0x0051 }
            androidx.collection.LruCache r3 = r21.f18678b     // Catch:{ all -> 0x0051 }
            java.lang.Object r3 = r3.d(r0)     // Catch:{ all -> 0x0051 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r3 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r3     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x0053
            androidx.collection.MutableScatterMap r3 = r21.f18679c     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r3.e(r0)     // Catch:{ all -> 0x0051 }
            r3 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r3 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r3     // Catch:{ all -> 0x0051 }
            goto L_0x0053
        L_0x0051:
            r0 = move-exception
            goto L_0x0095
        L_0x0053:
            if (r3 == 0) goto L_0x005d
            java.lang.Object r0 = r3.g()     // Catch:{ all -> 0x0051 }
            monitor-exit(r1)
            r10 = r7
            r12 = r8
            goto L_0x007a
        L_0x005d:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0051 }
            monitor-exit(r1)
            java.lang.Object r0 = r10.b(r7)     // Catch:{ Exception -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            java.lang.Object r0 = r11.invoke(r2)
        L_0x0069:
            r1 = 8
            r9 = 0
            r12 = 0
            r3 = r21
            r4 = r7
            r5 = r22
            r6 = r0
            r10 = r7
            r7 = r12
            r12 = r8
            r8 = r1
            androidx.compose.ui.text.font.AsyncTypefaceCache.f(r3, r4, r5, r6, r7, r8, r9)
        L_0x007a:
            if (r0 != 0) goto L_0x0080
            java.lang.Object r0 = r11.invoke(r2)
        L_0x0080:
            int r1 = r20.e()
            androidx.compose.ui.text.font.FontWeight r3 = r20.f()
            int r2 = r20.d()
            java.lang.Object r0 = androidx.compose.ui.text.font.FontSynthesis_androidKt.a(r1, r0, r10, r3, r2)
            kotlin.Pair r0 = kotlin.TuplesKt.a(r12, r0)
            return r0
        L_0x0095:
            monitor-exit(r1)
            throw r0
        L_0x0097:
            int r4 = r3.c()
            boolean r4 = androidx.compose.ui.text.font.FontLoadingStrategy.f(r0, r4)
            if (r4 == 0) goto L_0x012c
            androidx.compose.ui.text.platform.SynchronizedObject r3 = r21.f18680d
            monitor-enter(r3)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key     // Catch:{ all -> 0x00c7 }
            java.lang.Object r4 = r22.a()     // Catch:{ all -> 0x00c7 }
            r0.<init>(r7, r4)     // Catch:{ all -> 0x00c7 }
            androidx.collection.LruCache r4 = r21.f18678b     // Catch:{ all -> 0x00c7 }
            java.lang.Object r4 = r4.d(r0)     // Catch:{ all -> 0x00c7 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r4 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r4     // Catch:{ all -> 0x00c7 }
            if (r4 != 0) goto L_0x00ca
            androidx.collection.MutableScatterMap r4 = r21.f18679c     // Catch:{ all -> 0x00c7 }
            java.lang.Object r0 = r4.e(r0)     // Catch:{ all -> 0x00c7 }
            r4 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r4 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r4     // Catch:{ all -> 0x00c7 }
            goto L_0x00ca
        L_0x00c7:
            r0 = move-exception
            goto L_0x012a
        L_0x00ca:
            if (r4 == 0) goto L_0x00d6
            java.lang.Object r0 = r4.g()     // Catch:{ all -> 0x00c7 }
            monitor-exit(r3)
            r14 = r7
            r15 = r8
            r16 = r9
            goto L_0x010f
        L_0x00d6:
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x00c7 }
            monitor-exit(r3)
            kotlin.Result$Companion r0 = kotlin.Result.f40519A     // Catch:{ all -> 0x00e4 }
            java.lang.Object r0 = r10.b(r7)     // Catch:{ all -> 0x00e4 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x00ef
        L_0x00e4:
            r0 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.f40519A
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x00ef:
            boolean r3 = kotlin.Result.g(r0)
            if (r3 == 0) goto L_0x00f6
            r0 = 0
        L_0x00f6:
            r16 = 8
            r17 = 0
            r18 = 0
            r3 = r21
            r4 = r7
            r5 = r22
            r6 = r0
            r14 = r7
            r7 = r18
            r15 = r8
            r8 = r16
            r16 = r9
            r9 = r17
            androidx.compose.ui.text.font.AsyncTypefaceCache.f(r3, r4, r5, r6, r7, r8, r9)
        L_0x010f:
            if (r0 == 0) goto L_0x0126
            int r1 = r20.e()
            androidx.compose.ui.text.font.FontWeight r3 = r20.f()
            int r2 = r20.d()
            java.lang.Object r0 = androidx.compose.ui.text.font.FontSynthesis_androidKt.a(r1, r0, r14, r3, r2)
            kotlin.Pair r0 = kotlin.TuplesKt.a(r15, r0)
            return r0
        L_0x0126:
            r3 = r21
            r4 = 0
            goto L_0x017e
        L_0x012a:
            monitor-exit(r3)
            throw r0
        L_0x012c:
            r14 = r7
            r15 = r8
            r16 = r9
            int r3 = r3.a()
            boolean r0 = androidx.compose.ui.text.font.FontLoadingStrategy.f(r0, r3)
            if (r0 == 0) goto L_0x0183
            r3 = r21
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r0 = r3.d(r14, r10)
            if (r0 != 0) goto L_0x0153
            if (r15 != 0) goto L_0x014e
            androidx.compose.ui.text.font.Font[] r0 = new androidx.compose.ui.text.font.Font[r12]
            r4 = 0
            r0[r4] = r14
            java.util.List r8 = kotlin.collections.CollectionsKt.s(r0)
            goto L_0x017f
        L_0x014e:
            r4 = 0
            r15.add(r14)
            goto L_0x017e
        L_0x0153:
            r4 = 0
            java.lang.Object r5 = r0.g()
            boolean r5 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.e(r5)
            if (r5 == 0) goto L_0x015f
            goto L_0x017e
        L_0x015f:
            java.lang.Object r5 = r0.g()
            if (r5 == 0) goto L_0x017e
            int r1 = r20.e()
            java.lang.Object r0 = r0.g()
            androidx.compose.ui.text.font.FontWeight r3 = r20.f()
            int r2 = r20.d()
            java.lang.Object r0 = androidx.compose.ui.text.font.FontSynthesis_androidKt.a(r1, r0, r14, r3, r2)
            kotlin.Pair r0 = kotlin.TuplesKt.a(r15, r0)
            return r0
        L_0x017e:
            r8 = r15
        L_0x017f:
            int r9 = r16 + 1
            goto L_0x0012
        L_0x0183:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown font type "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x019a:
            r15 = r8
            java.lang.Object r0 = r11.invoke(r2)
            kotlin.Pair r0 = kotlin.TuplesKt.a(r15, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapterKt.b(java.util.List, androidx.compose.ui.text.font.TypefaceRequest, androidx.compose.ui.text.font.AsyncTypefaceCache, androidx.compose.ui.text.font.PlatformFontLoader, kotlin.jvm.functions.Function1):kotlin.Pair");
    }
}
