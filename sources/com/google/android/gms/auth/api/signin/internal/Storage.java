package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class Storage {

    /* renamed from: c  reason: collision with root package name */
    public static final Lock f24342c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public static Storage f24343d;

    /* renamed from: a  reason: collision with root package name */
    public final Lock f24344a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f24345b;

    public Storage(Context context) {
        this.f24345b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static Storage a(Context context) {
        Preconditions.m(context);
        Lock lock = f24342c;
        lock.lock();
        try {
            if (f24343d == null) {
                f24343d = new Storage(context.getApplicationContext());
            }
            Storage storage = f24343d;
            lock.unlock();
            return storage;
        } catch (Throwable th) {
            f24342c.unlock();
            throw th;
        }
    }

    public static final String f(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String c2;
        String c3 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c3) || (c2 = c(f("googleSignInAccount", c3))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.U0(c2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String c(String str) {
        this.f24344a.lock();
        try {
            return this.f24345b.getString(str, (String) null);
        } finally {
            this.f24344a.unlock();
        }
    }

    public final void d(String str) {
        this.f24344a.lock();
        try {
            this.f24345b.edit().remove(str).apply();
        } finally {
            this.f24344a.unlock();
        }
    }

    public final void e() {
        String c2 = c("defaultGoogleSignInAccount");
        d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c2)) {
            d(f("googleSignInAccount", c2));
            d(f("googleSignInOptions", c2));
        }
    }
}
