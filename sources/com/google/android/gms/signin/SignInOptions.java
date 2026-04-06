package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

public final class SignInOptions implements Api.ApiOptions.Optional {
    public static final SignInOptions I = new SignInOptions(false, false, (String) null, false, (String) null, (String) null, false, (Long) null, (Long) null, (zaf) null);

    /* renamed from: A  reason: collision with root package name */
    public final boolean f27143A = false;

    /* renamed from: B  reason: collision with root package name */
    public final String f27144B = null;
    public final boolean C = false;
    public final String D = null;
    public final String E = null;
    public final boolean F = false;
    public final Long G = null;
    public final Long H = null;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f27145z = false;

    public /* synthetic */ SignInOptions(boolean z2, boolean z3, String str, boolean z4, String str2, String str3, boolean z5, Long l2, Long l3, zaf zaf) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        boolean z2 = ((SignInOptions) obj).f27145z;
        return Objects.a((Object) null, (Object) null) && Objects.a((Object) null, (Object) null) && Objects.a((Object) null, (Object) null) && Objects.a((Object) null, (Object) null) && Objects.a((Object) null, (Object) null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.b(bool, bool, null, bool, bool, null, null, null, null);
    }
}
