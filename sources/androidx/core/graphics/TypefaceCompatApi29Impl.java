package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TypefaceCompatApi29Impl extends TypefaceCompatBaseImpl {
    public static FontFamily m(CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(fontInfo.d(), "r", cancellationSignal);
                if (openFileDescriptor != null) {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(fontInfo.e()).setSlant(fontInfo.f() ? 1 : 0).setTtcIndex(fontInfo.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            } catch (IOException e2) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
        throw th;
    }

    public static int n(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d A[SYNTHETIC, Splitter:B:16:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000a A[Catch:{ Exception -> 0x0042 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r7, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r8, android.content.res.Resources r9, int r10) {
        /*
            r6 = this;
            r7 = 0
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r8 = r8.a()     // Catch:{ Exception -> 0x0042 }
            int r0 = r8.length     // Catch:{ Exception -> 0x0042 }
            r1 = 0
            r2 = r7
        L_0x0008:
            if (r1 >= r0) goto L_0x004a
            r3 = r8[r1]     // Catch:{ Exception -> 0x0042 }
            android.graphics.fonts.Font$Builder r4 = new android.graphics.fonts.Font$Builder     // Catch:{ IOException -> 0x0047 }
            int r5 = r3.b()     // Catch:{ IOException -> 0x0047 }
            r4.<init>(r9, r5)     // Catch:{ IOException -> 0x0047 }
            int r5 = r3.e()     // Catch:{ IOException -> 0x0047 }
            android.graphics.fonts.Font$Builder r4 = r4.setWeight(r5)     // Catch:{ IOException -> 0x0047 }
            boolean r5 = r3.f()     // Catch:{ IOException -> 0x0047 }
            android.graphics.fonts.Font$Builder r4 = r4.setSlant(r5)     // Catch:{ IOException -> 0x0047 }
            int r5 = r3.c()     // Catch:{ IOException -> 0x0047 }
            android.graphics.fonts.Font$Builder r4 = r4.setTtcIndex(r5)     // Catch:{ IOException -> 0x0047 }
            java.lang.String r3 = r3.d()     // Catch:{ IOException -> 0x0047 }
            android.graphics.fonts.Font$Builder r3 = r4.setFontVariationSettings(r3)     // Catch:{ IOException -> 0x0047 }
            android.graphics.fonts.Font r3 = r3.build()     // Catch:{ IOException -> 0x0047 }
            if (r2 != 0) goto L_0x0044
            android.graphics.fonts.FontFamily$Builder r4 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ IOException -> 0x0047 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0047 }
            r2 = r4
            goto L_0x0047
        L_0x0042:
            r8 = move-exception
            goto L_0x0067
        L_0x0044:
            r2.addFont(r3)     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x004a:
            if (r2 != 0) goto L_0x004d
            return r7
        L_0x004d:
            android.graphics.fonts.FontFamily r8 = r2.build()     // Catch:{ Exception -> 0x0042 }
            android.graphics.Typeface$CustomFallbackBuilder r9 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x0042 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x0042 }
            android.graphics.fonts.Font r8 = r6.l(r8, r10)     // Catch:{ Exception -> 0x0042 }
            android.graphics.fonts.FontStyle r8 = r8.getStyle()     // Catch:{ Exception -> 0x0042 }
            android.graphics.Typeface$CustomFallbackBuilder r8 = r9.setStyle(r8)     // Catch:{ Exception -> 0x0042 }
            android.graphics.Typeface r7 = r8.build()     // Catch:{ Exception -> 0x0042 }
            return r7
        L_0x0067:
            java.lang.String r9 = "TypefaceCompatApi29Impl"
            java.lang.String r10 = "Font load failed"
            android.util.Log.w(r9, r10, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.TypefaceCompatApi29Impl.b(android.content.Context, androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        try {
            FontFamily m2 = m(cancellationSignal, fontInfoArr, context.getContentResolver());
            if (m2 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(m2).setStyle(l(m2, i2).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    public Typeface d(Context context, CancellationSignal cancellationSignal, List list, int i2) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily m2 = m(cancellationSignal, (FontsContractCompat.FontInfo[]) list.get(0), contentResolver);
            if (m2 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(m2);
            for (int i3 = 1; i3 < list.size(); i3++) {
                FontFamily m3 = m(cancellationSignal, (FontsContractCompat.FontInfo[]) list.get(i3), contentResolver);
                if (m3 != null) {
                    customFallbackBuilder.addCustomFallback(m3);
                }
            }
            return customFallbackBuilder.setStyle(l(m2, i2).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    public Typeface e(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public Typeface f(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    public FontsContractCompat.FontInfo j(FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Font l(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int n2 = n(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int n3 = n(fontStyle, font2.getStyle());
            if (n3 < n2) {
                font = font2;
                n2 = n3;
            }
        }
        return font;
    }
}
