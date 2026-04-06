package androidx.navigation.serialization;

import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

@Metadata
public final class RouteBuilder<T> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f22606a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22607b;

    /* renamed from: c  reason: collision with root package name */
    public String f22608c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f22609d = "";

    @Metadata
    public enum ParamType {
        PATH,
        QUERY
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22613a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.navigation.serialization.RouteBuilder$ParamType[] r0 = androidx.navigation.serialization.RouteBuilder.ParamType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.navigation.serialization.RouteBuilder$ParamType r1 = androidx.navigation.serialization.RouteBuilder.ParamType.PATH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.navigation.serialization.RouteBuilder$ParamType r1 = androidx.navigation.serialization.RouteBuilder.ParamType.QUERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f22613a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.RouteBuilder.WhenMappings.<clinit>():void");
        }
    }

    public RouteBuilder(KSerializer kSerializer) {
        Intrinsics.i(kSerializer, "serializer");
        this.f22606a = kSerializer;
        this.f22607b = kSerializer.a().a();
    }

    public final void a(String str) {
        this.f22608c += '/' + str;
    }

    public final void b(String str, String str2) {
        this.f22609d += (this.f22609d.length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    public final void c(int i2, String str, NavType navType, List list) {
        Intrinsics.i(str, "name");
        Intrinsics.i(navType, "type");
        Intrinsics.i(list, "value");
        int i3 = WhenMappings.f22613a[f(i2, navType).ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b(str, (String) it.next());
                }
            }
        } else if (list.size() == 1) {
            a((String) CollectionsKt.e0(list));
        } else {
            throw new IllegalArgumentException(("Expected one value for argument " + str + ", found " + list.size() + "values instead.").toString());
        }
    }

    public final void d(int i2, String str, NavType navType) {
        Intrinsics.i(str, "name");
        Intrinsics.i(navType, "type");
        int i3 = WhenMappings.f22613a[f(i2, navType).ordinal()];
        if (i3 == 1) {
            a('{' + str + '}');
        } else if (i3 == 2) {
            b(str, '{' + str + '}');
        }
    }

    public final String e() {
        return this.f22607b + this.f22608c + this.f22609d;
    }

    public final ParamType f(int i2, NavType navType) {
        return ((navType instanceof CollectionNavType) || this.f22606a.a().k(i2)) ? ParamType.QUERY : ParamType.PATH;
    }

    public RouteBuilder(String str, KSerializer kSerializer) {
        Intrinsics.i(str, "path");
        Intrinsics.i(kSerializer, "serializer");
        this.f22606a = kSerializer;
        this.f22607b = str;
    }
}
