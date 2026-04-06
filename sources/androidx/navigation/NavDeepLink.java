package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata
public final class NavDeepLink {

    /* renamed from: q  reason: collision with root package name */
    public static final Companion f22267q = new Companion((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f22268r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f22269s = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: t  reason: collision with root package name */
    public static final String f22270t = "http[s]?://";

    /* renamed from: u  reason: collision with root package name */
    public static final String f22271u = ".*";

    /* renamed from: v  reason: collision with root package name */
    public static final String f22272v = ("\\E" + ".*" + "\\Q");

    /* renamed from: w  reason: collision with root package name */
    public static final String f22273w = "([^/]*?|)";

    /* renamed from: a  reason: collision with root package name */
    public final String f22274a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22275b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22276c;

    /* renamed from: d  reason: collision with root package name */
    public final List f22277d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public String f22278e;

    /* renamed from: f  reason: collision with root package name */
    public final Lazy f22279f = LazyKt.b(new NavDeepLink$pathPattern$2(this));

    /* renamed from: g  reason: collision with root package name */
    public final Lazy f22280g = LazyKt.b(new NavDeepLink$isParameterizedQuery$2(this));

    /* renamed from: h  reason: collision with root package name */
    public final Lazy f22281h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22282i;

    /* renamed from: j  reason: collision with root package name */
    public final Lazy f22283j;

    /* renamed from: k  reason: collision with root package name */
    public final Lazy f22284k;

    /* renamed from: l  reason: collision with root package name */
    public final Lazy f22285l;

    /* renamed from: m  reason: collision with root package name */
    public final Lazy f22286m;

    /* renamed from: n  reason: collision with root package name */
    public String f22287n;

    /* renamed from: o  reason: collision with root package name */
    public final Lazy f22288o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f22289p;

    @Metadata
    public static final class Builder {

        /* renamed from: d  reason: collision with root package name */
        public static final Companion f22290d = new Companion((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public String f22291a;

        /* renamed from: b  reason: collision with root package name */
        public String f22292b;

        /* renamed from: c  reason: collision with root package name */
        public String f22293c;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        public final NavDeepLink a() {
            return new NavDeepLink(this.f22291a, this.f22292b, this.f22293c);
        }

        public final Builder b(String str) {
            Intrinsics.i(str, "uriPattern");
            this.f22291a = str;
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class MimeType implements Comparable<MimeType> {

        /* renamed from: A  reason: collision with root package name */
        public String f22294A;

        /* renamed from: z  reason: collision with root package name */
        public String f22295z;

        public MimeType(String str) {
            List list;
            Intrinsics.i(str, "mimeType");
            List h2 = new Regex("/").h(str, 0);
            if (!h2.isEmpty()) {
                ListIterator listIterator = h2.listIterator(h2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = CollectionsKt.E0(h2, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            list = CollectionsKt.m();
            this.f22295z = (String) list.get(0);
            this.f22294A = (String) list.get(1);
        }

        /* renamed from: d */
        public int compareTo(MimeType mimeType) {
            Intrinsics.i(mimeType, "other");
            int i2 = Intrinsics.d(this.f22295z, mimeType.f22295z) ? 2 : 0;
            return Intrinsics.d(this.f22294A, mimeType.f22294A) ? i2 + 1 : i2;
        }

        public final String f() {
            return this.f22294A;
        }

        public final String h() {
            return this.f22295z;
        }
    }

    @Metadata
    public static final class ParamQuery {

        /* renamed from: a  reason: collision with root package name */
        public String f22296a;

        /* renamed from: b  reason: collision with root package name */
        public final List f22297b = new ArrayList();

        public final void a(String str) {
            Intrinsics.i(str, "name");
            this.f22297b.add(str);
        }

        public final List b() {
            return this.f22297b;
        }

        public final String c() {
            return this.f22296a;
        }

        public final void d(String str) {
            this.f22296a = str;
        }
    }

    public NavDeepLink(String str, String str2, String str3) {
        this.f22274a = str;
        this.f22275b = str2;
        this.f22276c = str3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f22281h = LazyKt.a(lazyThreadSafetyMode, new NavDeepLink$queryArgsMap$2(this));
        this.f22283j = LazyKt.a(lazyThreadSafetyMode, new NavDeepLink$fragArgsAndRegex$2(this));
        this.f22284k = LazyKt.a(lazyThreadSafetyMode, new NavDeepLink$fragArgs$2(this));
        this.f22285l = LazyKt.a(lazyThreadSafetyMode, new NavDeepLink$fragRegex$2(this));
        this.f22286m = LazyKt.b(new NavDeepLink$fragPattern$2(this));
        this.f22288o = LazyKt.b(new NavDeepLink$mimeTypePattern$2(this));
        K();
        J();
    }

    public final boolean A() {
        return ((Boolean) this.f22280g.getValue()).booleanValue();
    }

    public final boolean B(String str) {
        boolean z2 = str == null;
        String str2 = this.f22275b;
        return z2 != (str2 != null) && (str == null || Intrinsics.d(str2, str));
    }

    public final boolean C(String str) {
        if ((str == null) != (this.f22276c != null)) {
            if (str == null) {
                return true;
            }
            Pattern v2 = v();
            Intrinsics.f(v2);
            if (v2.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public final boolean D(Uri uri) {
        if ((uri == null) != (w() != null)) {
            if (uri == null) {
                return true;
            }
            Pattern w2 = w();
            Intrinsics.f(w2);
            if (w2.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    public final boolean E(NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.i(navDeepLinkRequest, "deepLinkRequest");
        if (D(navDeepLinkRequest.c()) && B(navDeepLinkRequest.a())) {
            return C(navDeepLinkRequest.b());
        }
        return false;
    }

    public final void F(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument != null) {
            navArgument.a().d(bundle, str, str2);
        } else {
            bundle.putString(str, str2);
        }
    }

    public final boolean G(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (navArgument == null) {
            return false;
        }
        NavType a2 = navArgument.a();
        a2.e(bundle, str, str2, a2.a(bundle, str));
        return false;
    }

    public final Pair H() {
        String str = this.f22274a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.f22274a).getFragment();
        StringBuilder sb = new StringBuilder();
        Intrinsics.f(fragment);
        g(fragment, arrayList, sb);
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "fragRegex.toString()");
        return TuplesKt.a(arrayList, sb2);
    }

    public final boolean I(List list, ParamQuery paramQuery, Bundle bundle, Map map) {
        Object obj;
        Bundle a2 = BundleKt.a(new Pair[0]);
        Iterator it = paramQuery.b().iterator();
        while (true) {
            NavType navType = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            NavArgument navArgument = (NavArgument) map.get(str);
            if (navArgument != null) {
                navType = navArgument.a();
            }
            if ((navType instanceof CollectionNavType) && !navArgument.b()) {
                navType.h(a2, str, ((CollectionNavType) navType).k());
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            String c2 = paramQuery.c();
            Matcher matcher = c2 != null ? Pattern.compile(c2, 32).matcher(str2) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            Iterable b2 = paramQuery.b();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(b2, 10));
            int i2 = 0;
            for (Object next : b2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.w();
                }
                String str3 = (String) next;
                String group = matcher.group(i3);
                if (group == null) {
                    group = "";
                } else {
                    Intrinsics.h(group, "argMatcher.group(index + 1) ?: \"\"");
                }
                NavArgument navArgument2 = (NavArgument) map.get(str3);
                try {
                    if (!a2.containsKey(str3)) {
                        F(a2, str3, group, navArgument2);
                        obj = Unit.f40552a;
                    } else {
                        obj = Boolean.valueOf(G(a2, str3, group, navArgument2));
                    }
                } catch (IllegalArgumentException unused) {
                    obj = Unit.f40552a;
                }
                arrayList.add(obj);
                i2 = i3;
            }
        }
        bundle.putAll(a2);
        return true;
    }

    public final void J() {
        if (this.f22276c != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f22276c).matches()) {
                MimeType mimeType = new MimeType(this.f22276c);
                this.f22287n = StringsKt.K("^(" + mimeType.h() + "|[*]+)/(" + mimeType.f() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
                return;
            }
            throw new IllegalArgumentException(("The given mimeType " + this.f22276c + " does not match to required \"type/subtype\" format").toString());
        }
    }

    public final void K() {
        if (this.f22274a != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!f22268r.matcher(this.f22274a).find()) {
                sb.append(f22270t);
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f22274a);
            matcher.find();
            boolean z2 = false;
            String substring = this.f22274a.substring(0, matcher.start());
            Intrinsics.h(substring, "substring(...)");
            g(substring, this.f22277d, sb);
            String str = f22271u;
            if (!StringsKt.W(sb, str, false, 2, (Object) null) && !StringsKt.W(sb, f22273w, false, 2, (Object) null)) {
                z2 = true;
            }
            this.f22289p = z2;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            String sb2 = sb.toString();
            Intrinsics.h(sb2, "uriRegex.toString()");
            this.f22278e = StringsKt.K(sb2, str, f22272v, false, 4, (Object) null);
        }
    }

    public final Map L() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!A()) {
            return linkedHashMap;
        }
        Uri parse = Uri.parse(this.f22274a);
        for (String next : parse.getQueryParameterNames()) {
            StringBuilder sb = new StringBuilder();
            List<String> queryParameters = parse.getQueryParameters(next);
            if (queryParameters.size() <= 1) {
                Intrinsics.h(queryParameters, "queryParams");
                String str = (String) CollectionsKt.g0(queryParameters);
                if (str == null) {
                    this.f22282i = true;
                    str = next;
                }
                Matcher matcher = f22269s.matcher(str);
                ParamQuery paramQuery = new ParamQuery();
                int i2 = 0;
                while (matcher.find()) {
                    String group = matcher.group(1);
                    Intrinsics.g(group, "null cannot be cast to non-null type kotlin.String");
                    paramQuery.a(group);
                    Intrinsics.h(str, "queryParam");
                    String substring = str.substring(i2, matcher.start());
                    Intrinsics.h(substring, "substring(...)");
                    sb.append(Pattern.quote(substring));
                    sb.append("(.+?)?");
                    i2 = matcher.end();
                }
                if (i2 < str.length()) {
                    Intrinsics.h(str, "queryParam");
                    String substring2 = str.substring(i2);
                    Intrinsics.h(substring2, "substring(...)");
                    sb.append(Pattern.quote(substring2));
                }
                String sb2 = sb.toString();
                Intrinsics.h(sb2, "argRegex.toString()");
                paramQuery.d(StringsKt.K(sb2, f22271u, f22272v, false, 4, (Object) null));
                Intrinsics.h(next, "paramName");
                linkedHashMap.put(next, paramQuery);
            } else {
                throw new IllegalArgumentException(("Query parameter " + next + " must only be present once in " + this.f22274a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
        }
        return linkedHashMap;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) obj;
        return Intrinsics.d(this.f22274a, navDeepLink.f22274a) && Intrinsics.d(this.f22275b, navDeepLink.f22275b) && Intrinsics.d(this.f22276c, navDeepLink.f22276c);
    }

    public final void g(String str, List list, StringBuilder sb) {
        Matcher matcher = f22269s.matcher(str);
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            Intrinsics.g(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i2) {
                String substring = str.substring(i2, matcher.start());
                Intrinsics.h(substring, "substring(...)");
                sb.append(Pattern.quote(substring));
            }
            sb.append(f22273w);
            i2 = matcher.end();
        }
        if (i2 < str.length()) {
            String substring2 = str.substring(i2);
            Intrinsics.h(substring2, "substring(...)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public final int h(Uri uri) {
        if (uri == null || this.f22274a == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(this.f22274a).getPathSegments();
        Intrinsics.h(pathSegments, "requestedPathSegments");
        Intrinsics.h(pathSegments2, "uriPathSegments");
        return CollectionsKt.j0(pathSegments, pathSegments2).size();
    }

    public int hashCode() {
        String str = this.f22274a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22275b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22276c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String i() {
        return this.f22275b;
    }

    public final List j() {
        Collection collection = this.f22277d;
        ArrayList arrayList = new ArrayList();
        for (ParamQuery b2 : x().values()) {
            CollectionsKt.B(arrayList, b2.b());
        }
        return CollectionsKt.x0(CollectionsKt.x0(collection, arrayList), k());
    }

    public final List k() {
        return (List) this.f22284k.getValue();
    }

    public final Pair l() {
        return (Pair) this.f22283j.getValue();
    }

    public final Pattern m() {
        return (Pattern) this.f22286m.getValue();
    }

    public final String n() {
        return (String) this.f22285l.getValue();
    }

    public final Bundle o(Uri uri, Map map) {
        Intrinsics.i(uri, "deepLink");
        Intrinsics.i(map, "arguments");
        Pattern w2 = w();
        Matcher matcher = w2 != null ? w2.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!q(matcher, bundle, map)) {
            return null;
        }
        if (A() && !r(uri, bundle, map)) {
            return null;
        }
        s(uri.getFragment(), bundle, map);
        if (!NavArgumentKt.a(map, new NavDeepLink$getMatchingArguments$missingRequiredArguments$1(bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    public final Bundle p(Uri uri, Map map) {
        Intrinsics.i(map, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern w2 = w();
        Matcher matcher = w2 != null ? w2.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        q(matcher, bundle, map);
        if (A()) {
            r(uri, bundle, map);
        }
        return bundle;
    }

    public final boolean q(Matcher matcher, Bundle bundle, Map map) {
        Iterable iterable = this.f22277d;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        int i2 = 0;
        for (Object next : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.w();
            }
            String str = (String) next;
            String decode = Uri.decode(matcher.group(i3));
            NavArgument navArgument = (NavArgument) map.get(str);
            try {
                Intrinsics.h(decode, "value");
                F(bundle, str, decode, navArgument);
                arrayList.add(Unit.f40552a);
                i2 = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : x().entrySet()) {
            ParamQuery paramQuery = (ParamQuery) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters((String) entry.getKey());
            if (this.f22282i && (query = uri.getQuery()) != null && !Intrinsics.d(query, uri.toString())) {
                queryParameters = CollectionsKt.e(query);
            }
            Intrinsics.h(queryParameters, "inputParams");
            if (!I(queryParameters, paramQuery, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    public final void s(String str, Bundle bundle, Map map) {
        Pattern m2 = m();
        Matcher matcher = m2 != null ? m2.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            Iterable k2 = k();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(k2, 10));
            int i2 = 0;
            for (Object next : k2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.w();
                }
                String str2 = (String) next;
                String decode = Uri.decode(matcher.group(i3));
                NavArgument navArgument = (NavArgument) map.get(str2);
                try {
                    Intrinsics.h(decode, "value");
                    F(bundle, str2, decode, navArgument);
                    arrayList.add(Unit.f40552a);
                    i2 = i3;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    public final String t() {
        return this.f22276c;
    }

    public final int u(String str) {
        Intrinsics.i(str, "mimeType");
        if (this.f22276c != null) {
            Pattern v2 = v();
            Intrinsics.f(v2);
            if (v2.matcher(str).matches()) {
                return new MimeType(this.f22276c).compareTo(new MimeType(str));
            }
        }
        return -1;
    }

    public final Pattern v() {
        return (Pattern) this.f22288o.getValue();
    }

    public final Pattern w() {
        return (Pattern) this.f22279f.getValue();
    }

    public final Map x() {
        return (Map) this.f22281h.getValue();
    }

    public final String y() {
        return this.f22274a;
    }

    public final boolean z() {
        return this.f22289p;
    }
}
