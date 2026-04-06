package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

public final class FirebaseOptions {

    /* renamed from: a  reason: collision with root package name */
    public final String f29653a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29654b;

    /* renamed from: c  reason: collision with root package name */
    public final String f29655c;

    /* renamed from: d  reason: collision with root package name */
    public final String f29656d;

    /* renamed from: e  reason: collision with root package name */
    public final String f29657e;

    /* renamed from: f  reason: collision with root package name */
    public final String f29658f;

    /* renamed from: g  reason: collision with root package name */
    public final String f29659g;

    public static final class Builder {
    }

    public FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.r(!Strings.a(str), "ApplicationId must be set.");
        this.f29654b = str;
        this.f29653a = str2;
        this.f29655c = str3;
        this.f29656d = str4;
        this.f29657e = str5;
        this.f29658f = str6;
        this.f29659g = str7;
    }

    public static FirebaseOptions a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String a2 = stringResourceValueReader.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new FirebaseOptions(a2, stringResourceValueReader.a("google_api_key"), stringResourceValueReader.a("firebase_database_url"), stringResourceValueReader.a("ga_trackingId"), stringResourceValueReader.a("gcm_defaultSenderId"), stringResourceValueReader.a("google_storage_bucket"), stringResourceValueReader.a("project_id"));
    }

    public String b() {
        return this.f29653a;
    }

    public String c() {
        return this.f29654b;
    }

    public String d() {
        return this.f29657e;
    }

    public String e() {
        return this.f29659g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return Objects.a(this.f29654b, firebaseOptions.f29654b) && Objects.a(this.f29653a, firebaseOptions.f29653a) && Objects.a(this.f29655c, firebaseOptions.f29655c) && Objects.a(this.f29656d, firebaseOptions.f29656d) && Objects.a(this.f29657e, firebaseOptions.f29657e) && Objects.a(this.f29658f, firebaseOptions.f29658f) && Objects.a(this.f29659g, firebaseOptions.f29659g);
    }

    public int hashCode() {
        return Objects.b(this.f29654b, this.f29653a, this.f29655c, this.f29656d, this.f29657e, this.f29658f, this.f29659g);
    }

    public String toString() {
        return Objects.c(this).a("applicationId", this.f29654b).a("apiKey", this.f29653a).a("databaseUrl", this.f29655c).a("gcmSenderId", this.f29657e).a("storageBucket", this.f29658f).a("projectId", this.f29659g).toString();
    }
}
