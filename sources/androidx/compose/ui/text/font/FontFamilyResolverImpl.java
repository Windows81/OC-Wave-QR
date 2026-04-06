package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FontFamilyResolverImpl implements FontFamily.Resolver {

    /* renamed from: a  reason: collision with root package name */
    public final PlatformFontLoader f18698a;

    /* renamed from: b  reason: collision with root package name */
    public final PlatformResolveInterceptor f18699b;

    /* renamed from: c  reason: collision with root package name */
    public final TypefaceRequestCache f18700c;

    /* renamed from: d  reason: collision with root package name */
    public final FontListFontFamilyTypefaceAdapter f18701d;

    /* renamed from: e  reason: collision with root package name */
    public final PlatformFontFamilyTypefaceAdapter f18702e;

    /* renamed from: f  reason: collision with root package name */
    public final Function1 f18703f;

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter) {
        this.f18698a = platformFontLoader;
        this.f18699b = platformResolveInterceptor;
        this.f18700c = typefaceRequestCache;
        this.f18701d = fontListFontFamilyTypefaceAdapter;
        this.f18702e = platformFontFamilyTypefaceAdapter;
        this.f18703f = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    public State a(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3) {
        return i(new TypefaceRequest(this.f18699b.d(fontFamily), this.f18699b.a(fontWeight), this.f18699b.b(i2), this.f18699b.c(i3), this.f18698a.a(), (DefaultConstructorMarker) null));
    }

    public final PlatformFontLoader g() {
        return this.f18698a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f A[LOOP:0: B:21:0x006d->B:22:0x006f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(androidx.compose.ui.text.font.FontFamily r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = (androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r14 = r0.D
            androidx.compose.ui.text.font.FontFamily r14 = (androidx.compose.ui.text.font.FontFamily) r14
            java.lang.Object r0 = r0.C
            androidx.compose.ui.text.font.FontFamilyResolverImpl r0 = (androidx.compose.ui.text.font.FontFamilyResolverImpl) r0
            kotlin.ResultKt.b(r15)
            goto L_0x0055
        L_0x0031:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0039:
            kotlin.ResultKt.b(r15)
            boolean r15 = r14 instanceof androidx.compose.ui.text.font.FontListFontFamily
            if (r15 != 0) goto L_0x0043
            kotlin.Unit r14 = kotlin.Unit.f40552a
            return r14
        L_0x0043:
            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter r15 = r13.f18701d
            androidx.compose.ui.text.font.PlatformFontLoader r2 = r13.f18698a
            r0.C = r13
            r0.D = r14
            r0.G = r3
            java.lang.Object r15 = r15.b(r14, r2, r0)
            if (r15 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r13
        L_0x0055:
            r15 = r14
            androidx.compose.ui.text.font.FontListFontFamily r15 = (androidx.compose.ui.text.font.FontListFontFamily) r15
            java.util.List r15 = r15.p()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r15.size()
            r1.<init>(r2)
            r2 = r15
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r3 = 0
        L_0x006d:
            if (r3 >= r2) goto L_0x00a8
            java.lang.Object r4 = r15.get(r3)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.ui.text.font.Font) r4
            androidx.compose.ui.text.font.TypefaceRequest r12 = new androidx.compose.ui.text.font.TypefaceRequest
            androidx.compose.ui.text.font.PlatformResolveInterceptor r5 = r0.f18699b
            androidx.compose.ui.text.font.FontFamily r6 = r5.d(r14)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r5 = r0.f18699b
            androidx.compose.ui.text.font.FontWeight r7 = r4.a()
            androidx.compose.ui.text.font.FontWeight r7 = r5.a(r7)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r5 = r0.f18699b
            int r4 = r4.c()
            int r8 = r5.b(r4)
            androidx.compose.ui.text.font.FontSynthesis$Companion r4 = androidx.compose.ui.text.font.FontSynthesis.f18728b
            int r9 = r4.a()
            androidx.compose.ui.text.font.PlatformFontLoader r4 = r0.f18698a
            java.lang.Object r10 = r4.a()
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r12)
            int r3 = r3 + 1
            goto L_0x006d
        L_0x00a8:
            androidx.compose.ui.text.font.TypefaceRequestCache r14 = r0.f18700c
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2 r15 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            r15.<init>(r0)
            r14.c(r1, r15)
            kotlin.Unit r14 = kotlin.Unit.f40552a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontFamilyResolverImpl.h(androidx.compose.ui.text.font.FontFamily, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final State i(TypefaceRequest typefaceRequest) {
        return this.f18700c.d(typefaceRequest, new FontFamilyResolverImpl$resolve$result$1(this, typefaceRequest));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(platformFontLoader, (i2 & 2) != 0 ? PlatformResolveInterceptor.f18753a.a() : platformResolveInterceptor, (i2 & 4) != 0 ? FontFamilyResolverKt.b() : typefaceRequestCache, (i2 & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.a(), (CoroutineContext) null, 2, (DefaultConstructorMarker) null) : fontListFontFamilyTypefaceAdapter, (i2 & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }
}
