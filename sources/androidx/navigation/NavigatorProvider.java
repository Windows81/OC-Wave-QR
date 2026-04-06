package androidx.navigation;

import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class NavigatorProvider {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f22432b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final Map f22433c = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map f22434a = new LinkedHashMap();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class cls) {
            Intrinsics.i(cls, "navigatorClass");
            String str = (String) NavigatorProvider.f22433c.get(cls);
            if (str == null) {
                Navigator.Name name = (Navigator.Name) cls.getAnnotation(Navigator.Name.class);
                str = name != null ? name.value() : null;
                if (b(str)) {
                    NavigatorProvider.f22433c.put(cls, str);
                } else {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + cls.getSimpleName()).toString());
                }
            }
            Intrinsics.f(str);
            return str;
        }

        public final boolean b(String str) {
            return str != null && str.length() > 0;
        }

        public Companion() {
        }
    }

    public final Navigator b(Navigator navigator) {
        Intrinsics.i(navigator, "navigator");
        return c(f22432b.a(navigator.getClass()), navigator);
    }

    public Navigator c(String str, Navigator navigator) {
        Intrinsics.i(str, "name");
        Intrinsics.i(navigator, "navigator");
        if (f22432b.b(str)) {
            Navigator navigator2 = (Navigator) this.f22434a.get(str);
            if (Intrinsics.d(navigator2, navigator)) {
                return navigator;
            }
            boolean z2 = false;
            if (navigator2 != null && navigator2.c()) {
                z2 = true;
            }
            if (z2) {
                throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
            } else if (!navigator.c()) {
                return (Navigator) this.f22434a.put(str, navigator);
            } else {
                throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
            }
        } else {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
    }

    public final Navigator d(Class cls) {
        Intrinsics.i(cls, "navigatorClass");
        return e(f22432b.a(cls));
    }

    public Navigator e(String str) {
        Intrinsics.i(str, "name");
        if (f22432b.b(str)) {
            Navigator navigator = (Navigator) this.f22434a.get(str);
            if (navigator != null) {
                return navigator;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final Map f() {
        return MapsKt.s(this.f22434a);
    }
}
