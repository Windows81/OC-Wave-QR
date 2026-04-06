package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.R;
import androidx.core.provider.FontRequest;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class FontResourcesParserCompat {

    public static class Api21Impl {
        public static int a(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }

    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {

        /* renamed from: a  reason: collision with root package name */
        public final FontFileResourceEntry[] f19725a;

        public FontFamilyFilesResourceEntry(FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.f19725a = fontFileResourceEntryArr;
        }

        public FontFileResourceEntry[] a() {
            return this.f19725a;
        }
    }

    public static final class FontFileResourceEntry {

        /* renamed from: a  reason: collision with root package name */
        public final String f19726a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19727b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f19728c;

        /* renamed from: d  reason: collision with root package name */
        public final String f19729d;

        /* renamed from: e  reason: collision with root package name */
        public final int f19730e;

        /* renamed from: f  reason: collision with root package name */
        public final int f19731f;

        public FontFileResourceEntry(String str, int i2, boolean z2, String str2, int i3, int i4) {
            this.f19726a = str;
            this.f19727b = i2;
            this.f19728c = z2;
            this.f19729d = str2;
            this.f19730e = i3;
            this.f19731f = i4;
        }

        public String a() {
            return this.f19726a;
        }

        public int b() {
            return this.f19731f;
        }

        public int c() {
            return this.f19730e;
        }

        public String d() {
            return this.f19729d;
        }

        public int e() {
            return this.f19727b;
        }

        public boolean f() {
            return this.f19728c;
        }
    }

    public static final class ProviderResourceEntry implements FamilyResourceEntry {

        /* renamed from: a  reason: collision with root package name */
        public final FontRequest f19732a;

        /* renamed from: b  reason: collision with root package name */
        public final FontRequest f19733b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19734c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19735d;

        /* renamed from: e  reason: collision with root package name */
        public final String f19736e;

        public ProviderResourceEntry(FontRequest fontRequest, FontRequest fontRequest2, int i2, int i3, String str) {
            this.f19732a = fontRequest;
            this.f19733b = fontRequest2;
            this.f19735d = i2;
            this.f19734c = i3;
            this.f19736e = str;
        }

        public FontRequest a() {
            return this.f19733b;
        }

        public int b() {
            return this.f19735d;
        }

        public FontRequest c() {
            return this.f19732a;
        }

        public String d() {
            return this.f19736e;
        }

        public int e() {
            return this.f19734c;
        }
    }

    public static int a(TypedArray typedArray, int i2) {
        return Api21Impl.a(typedArray, i2);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r3 = d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.FontResourcesParserCompat.b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry");
    }

    public static List c(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i2)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static FamilyResourceEntry d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static FamilyResourceEntry e(XmlPullParser xmlPullParser, Resources resources) {
        Resources resources2 = resources;
        TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19428h);
        String string = obtainAttributes.getString(R.styleable.f19429i);
        String string2 = obtainAttributes.getString(R.styleable.f19434n);
        String string3 = obtainAttributes.getString(R.styleable.f19435o);
        String string4 = obtainAttributes.getString(R.styleable.f19431k);
        int resourceId = obtainAttributes.getResourceId(R.styleable.f19430j, 0);
        int integer = obtainAttributes.getInteger(R.styleable.f19432l, 1);
        int integer2 = obtainAttributes.getInteger(R.styleable.f19433m, 500);
        String string5 = obtainAttributes.getString(R.styleable.f19436p);
        obtainAttributes.recycle();
        FontRequest fontRequest = null;
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) arrayList.toArray(new FontFileResourceEntry[0]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        List c2 = c(resources2, resourceId);
        if (string4 != null) {
            fontRequest = new FontRequest(string, string2, string4, c2);
        }
        return new ProviderResourceEntry(new FontRequest(string, string2, string3, c2), fontRequest, integer, integer2, string5);
    }

    public static FontFileResourceEntry f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.f19437q);
        int i2 = obtainAttributes.getInt(obtainAttributes.hasValue(R.styleable.f19446z) ? R.styleable.f19446z : R.styleable.f19439s, 400);
        boolean z2 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(R.styleable.f19444x) ? R.styleable.f19444x : R.styleable.f19440t, 0);
        int i3 = obtainAttributes.hasValue(R.styleable.f19419A) ? R.styleable.f19419A : R.styleable.f19441u;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(R.styleable.f19445y) ? R.styleable.f19445y : R.styleable.f19442v);
        int i4 = obtainAttributes.getInt(i3, 0);
        int i5 = obtainAttributes.hasValue(R.styleable.f19443w) ? R.styleable.f19443w : R.styleable.f19438r;
        int resourceId = obtainAttributes.getResourceId(i5, 0);
        String string2 = obtainAttributes.getString(i5);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new FontFileResourceEntry(string2, i2, z2, string, i4, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
