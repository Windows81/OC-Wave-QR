package androidx.navigation.serialization;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InternalNavType$StringNonNullableType$1 extends NavType<String> {
    public InternalNavType$StringNonNullableType$1() {
        super(false);
    }

    public String b() {
        return "string_non_nullable";
    }

    /* renamed from: k */
    public String a(Bundle bundle, String str) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        String string = bundle.getString(str);
        return string == null ? "null" : string;
    }

    /* renamed from: l */
    public String f(String str) {
        Intrinsics.i(str, "value");
        return str;
    }

    /* renamed from: m */
    public void h(Bundle bundle, String str, String str2) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(str, "key");
        Intrinsics.i(str2, "value");
        bundle.putString(str, str2);
    }

    /* renamed from: n */
    public String i(String str) {
        Intrinsics.i(str, "value");
        String encode = Uri.encode(str);
        Intrinsics.h(encode, "encode(value)");
        return encode;
    }
}
