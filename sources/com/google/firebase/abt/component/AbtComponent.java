package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;

public class AbtComponent {

    /* renamed from: a  reason: collision with root package name */
    public final Map f29681a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f29682b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f29683c;

    public AbtComponent(Context context, Provider provider) {
        this.f29682b = context;
        this.f29683c = provider;
    }

    public FirebaseABTesting a(String str) {
        return new FirebaseABTesting(this.f29682b, this.f29683c, str);
    }

    public synchronized FirebaseABTesting b(String str) {
        try {
            if (!this.f29681a.containsKey(str)) {
                this.f29681a.put(str, a(str));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (FirebaseABTesting) this.f29681a.get(str);
    }
}
