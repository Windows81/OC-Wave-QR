package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Handler;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzbb extends zzix {

    /* renamed from: c  reason: collision with root package name */
    public long f26235c;

    /* renamed from: d  reason: collision with root package name */
    public String f26236d;

    /* renamed from: e  reason: collision with root package name */
    public AccountManager f26237e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f26238f;

    /* renamed from: g  reason: collision with root package name */
    public long f26239g;

    public zzbb(zzhw zzhw) {
        super(zzhw);
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ zzah d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ zzac e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ zzhp f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ zzbb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ zzgh h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ zzgu i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ zzop j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ zzgi m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final boolean t() {
        Calendar instance = Calendar.getInstance();
        this.f26235c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f26236d = lowerCase + "-" + lowerCase2;
        return false;
    }

    public final long u() {
        n();
        return this.f26239g;
    }

    public final long v() {
        p();
        return this.f26235c;
    }

    public final String w() {
        p();
        return this.f26236d;
    }

    public final void x() {
        n();
        this.f26238f = null;
        this.f26239g = 0;
    }

    public final boolean y() {
        n();
        long a2 = b().a();
        if (a2 - this.f26239g > 86400000) {
            this.f26238f = null;
        }
        Boolean bool = this.f26238f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ContextCompat.a(a(), "android.permission.GET_ACCOUNTS") != 0) {
            m().N().a("Permission error checking for dasher/unicorn accounts");
            this.f26239g = a2;
            this.f26238f = Boolean.FALSE;
            return false;
        }
        if (this.f26237e == null) {
            this.f26237e = AccountManager.get(a());
        }
        try {
            Account[] result = this.f26237e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f26237e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f26238f = Boolean.TRUE;
                    this.f26239g = a2;
                    return true;
                }
                this.f26239g = a2;
                this.f26238f = Boolean.FALSE;
                return false;
            }
            this.f26238f = Boolean.TRUE;
            this.f26239g = a2;
            return true;
        } catch (AuthenticatorException e2) {
            e = e2;
            m().I().b("Exception checking account types", e);
            this.f26239g = a2;
            this.f26238f = Boolean.FALSE;
            return false;
        } catch (IOException e3) {
            e = e3;
            m().I().b("Exception checking account types", e);
            this.f26239g = a2;
            this.f26238f = Boolean.FALSE;
            return false;
        } catch (OperationCanceledException e4) {
            e = e4;
            m().I().b("Exception checking account types", e);
            this.f26239g = a2;
            this.f26238f = Boolean.FALSE;
            return false;
        }
    }
}
