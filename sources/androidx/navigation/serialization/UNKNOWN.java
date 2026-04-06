package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class UNKNOWN extends NavType<String> {

    /* renamed from: t  reason: collision with root package name */
    public static final UNKNOWN f22633t = new UNKNOWN();

    public UNKNOWN() {
        super(false);
    }

    public String b() {
        return "unknown";
    }

    /* renamed from: k */
    public String a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        return null;
    }

    /* renamed from: l */
    public String f(String str) {
        Intrinsics.i(str, "value");
        return "null";
    }

    /* renamed from: m */
    public void h(Bundle bundle, String str, String str2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Intrinsics.i(str2, "value");
    }
}
