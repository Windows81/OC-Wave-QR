package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.collection.ArraySet;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class ClientSettings {

    /* renamed from: a  reason: collision with root package name */
    public final Account f24865a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f24866b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f24867c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f24868d;

    /* renamed from: e  reason: collision with root package name */
    public final int f24869e;

    /* renamed from: f  reason: collision with root package name */
    public final View f24870f;

    /* renamed from: g  reason: collision with root package name */
    public final String f24871g;

    /* renamed from: h  reason: collision with root package name */
    public final String f24872h;

    /* renamed from: i  reason: collision with root package name */
    public final SignInOptions f24873i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f24874j;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Account f24875a;

        /* renamed from: b  reason: collision with root package name */
        public ArraySet f24876b;

        /* renamed from: c  reason: collision with root package name */
        public String f24877c;

        /* renamed from: d  reason: collision with root package name */
        public String f24878d;

        /* renamed from: e  reason: collision with root package name */
        public final SignInOptions f24879e = SignInOptions.I;

        public ClientSettings a() {
            return new ClientSettings(this.f24875a, this.f24876b, (Map) null, 0, (View) null, this.f24877c, this.f24878d, this.f24879e, false);
        }

        public Builder b(String str) {
            this.f24877c = str;
            return this;
        }

        public final Builder c(Collection collection) {
            if (this.f24876b == null) {
                this.f24876b = new ArraySet();
            }
            this.f24876b.addAll(collection);
            return this;
        }

        public final Builder d(Account account) {
            this.f24875a = account;
            return this;
        }

        public final Builder e(String str) {
            this.f24878d = str;
            return this;
        }
    }

    public ClientSettings(Account account, Set set, Map map, int i2, View view, String str, String str2, SignInOptions signInOptions, boolean z2) {
        this.f24865a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f24866b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f24868d = map;
        this.f24870f = view;
        this.f24869e = i2;
        this.f24871g = str;
        this.f24872h = str2;
        this.f24873i = signInOptions == null ? SignInOptions.I : signInOptions;
        HashSet hashSet = new HashSet(emptySet);
        for (zab zab : map.values()) {
            hashSet.addAll(zab.f24926a);
        }
        this.f24867c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f24865a;
    }

    public String b() {
        Account account = this.f24865a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f24865a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set d() {
        return this.f24867c;
    }

    public String e() {
        return this.f24871g;
    }

    public Set f() {
        return this.f24866b;
    }

    public final SignInOptions g() {
        return this.f24873i;
    }

    public final Integer h() {
        return this.f24874j;
    }

    public final String i() {
        return this.f24872h;
    }

    public final Map j() {
        return this.f24868d;
    }

    public final void k(Integer num) {
        this.f24874j = num;
    }
}
