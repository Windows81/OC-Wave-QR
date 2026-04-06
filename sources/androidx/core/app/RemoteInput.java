package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

public final class RemoteInput {

    /* renamed from: a  reason: collision with root package name */
    public final String f19675a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f19676b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence[] f19677c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19678d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19679e;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f19680f;

    /* renamed from: g  reason: collision with root package name */
    public final Set f19681g;

    public static class Api20Impl {
        public static android.app.RemoteInput a(RemoteInput remoteInput) {
            RemoteInput.Builder addExtras = new RemoteInput.Builder(remoteInput.i()).setLabel(remoteInput.h()).setChoices(remoteInput.e()).setAllowFreeFormInput(remoteInput.c()).addExtras(remoteInput.g());
            Set<String> d2 = remoteInput.d();
            if (d2 != null) {
                for (String a2 : d2) {
                    Api26Impl.a(addExtras, a2, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.a(addExtras, remoteInput.f());
            }
            return addExtras.build();
        }
    }

    public static class Api26Impl {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z2) {
            return builder.setAllowDataType(str, z2);
        }
    }

    public static class Api28Impl {
    }

    public static class Api29Impl {
        public static RemoteInput.Builder a(RemoteInput.Builder builder, int i2) {
            return builder.setEditChoicesBeforeSending(i2);
        }
    }

    public static final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    public static android.app.RemoteInput a(RemoteInput remoteInput) {
        return Api20Impl.a(remoteInput);
    }

    public static android.app.RemoteInput[] b(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i2 = 0; i2 < remoteInputArr.length; i2++) {
            remoteInputArr2[i2] = a(remoteInputArr[i2]);
        }
        return remoteInputArr2;
    }

    public boolean c() {
        return this.f19678d;
    }

    public Set d() {
        return this.f19681g;
    }

    public CharSequence[] e() {
        return this.f19677c;
    }

    public int f() {
        return this.f19679e;
    }

    public Bundle g() {
        return this.f19680f;
    }

    public CharSequence h() {
        return this.f19676b;
    }

    public String i() {
        return this.f19675a;
    }

    public boolean j() {
        return !c() && (e() == null || e().length == 0) && d() != null && !d().isEmpty();
    }
}
