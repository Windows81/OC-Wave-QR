package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24426a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24427b;

    /* renamed from: c  reason: collision with root package name */
    public final Api f24428c;

    /* renamed from: d  reason: collision with root package name */
    public final Api.ApiOptions f24429d;

    /* renamed from: e  reason: collision with root package name */
    public final ApiKey f24430e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f24431f;

    /* renamed from: g  reason: collision with root package name */
    public final int f24432g;

    /* renamed from: h  reason: collision with root package name */
    public final GoogleApiClient f24433h;

    /* renamed from: i  reason: collision with root package name */
    public final StatusExceptionMapper f24434i;

    /* renamed from: j  reason: collision with root package name */
    public final GoogleApiManager f24435j;

    public static class Settings {

        /* renamed from: c  reason: collision with root package name */
        public static final Settings f24436c = new Builder().a();

        /* renamed from: a  reason: collision with root package name */
        public final StatusExceptionMapper f24437a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f24438b;

        public static class Builder {

            /* renamed from: a  reason: collision with root package name */
            public StatusExceptionMapper f24439a;

            /* renamed from: b  reason: collision with root package name */
            public Looper f24440b;

            public Settings a() {
                if (this.f24439a == null) {
                    this.f24439a = new ApiExceptionMapper();
                }
                if (this.f24440b == null) {
                    this.f24440b = Looper.getMainLooper();
                }
                return new Settings(this.f24439a, this.f24440b);
            }
        }

        public Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.f24437a = statusExceptionMapper;
            this.f24438b = looper;
        }
    }

    public GoogleApi(Context context, Activity activity, Api api, Api.ApiOptions apiOptions, Settings settings) {
        String str;
        Preconditions.n(context, "Null context is not permitted.");
        Preconditions.n(api, "Api must not be null.");
        Preconditions.n(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) Preconditions.n(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f24426a = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = j(context);
        }
        this.f24427b = str;
        this.f24428c = api;
        this.f24429d = apiOptions;
        this.f24431f = settings.f24438b;
        ApiKey a2 = ApiKey.a(api, apiOptions, str);
        this.f24430e = a2;
        this.f24433h = new zabv(this);
        GoogleApiManager t2 = GoogleApiManager.t(context2);
        this.f24435j = t2;
        this.f24432g = t2.k();
        this.f24434i = settings.f24437a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.u(activity, t2, a2);
        }
        t2.F(this);
    }

    public ClientSettings.Builder d() {
        Account account;
        Set set;
        GoogleSignInAccount D;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.f24429d;
        if (!(apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (D = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).D()) == null) {
            Api.ApiOptions apiOptions2 = this.f24429d;
            account = apiOptions2 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) apiOptions2).F() : null;
        } else {
            account = D.F();
        }
        builder.d(account);
        Api.ApiOptions apiOptions3 = this.f24429d;
        if (apiOptions3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) {
            GoogleSignInAccount D2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions3).D();
            set = D2 == null ? Collections.emptySet() : D2.o0();
        } else {
            set = Collections.emptySet();
        }
        builder.c(set);
        builder.e(this.f24426a.getClass().getName());
        builder.b(this.f24426a.getPackageName());
        return builder;
    }

    public Task e(TaskApiCall taskApiCall) {
        return r(2, taskApiCall);
    }

    public Task f(TaskApiCall taskApiCall) {
        return r(0, taskApiCall);
    }

    public Task g(ListenerHolder.ListenerKey listenerKey, int i2) {
        Preconditions.n(listenerKey, "Listener key cannot be null.");
        return this.f24435j.v(this, listenerKey, i2);
    }

    public BaseImplementation.ApiMethodImpl h(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        q(1, apiMethodImpl);
        return apiMethodImpl;
    }

    public Task i(TaskApiCall taskApiCall) {
        return r(1, taskApiCall);
    }

    public String j(Context context) {
        return null;
    }

    public final ApiKey k() {
        return this.f24430e;
    }

    public String l() {
        return this.f24427b;
    }

    public Looper m() {
        return this.f24431f;
    }

    public final int n() {
        return this.f24432g;
    }

    public final Api.Client o(Looper looper, zabq zabq) {
        Api.Client b2 = ((Api.AbstractClientBuilder) Preconditions.m(this.f24428c.a())).b(this.f24426a, looper, d().a(), this.f24429d, zabq, zabq);
        String l2 = l();
        if (l2 != null && (b2 instanceof BaseGmsClient)) {
            ((BaseGmsClient) b2).U(l2);
        }
        if (l2 != null && (b2 instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) b2).w(l2);
        }
        return b2;
    }

    public final zact p(Context context, Handler handler) {
        return new zact(context, handler, d().a());
    }

    public final BaseImplementation.ApiMethodImpl q(int i2, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.n();
        this.f24435j.A(this, i2, apiMethodImpl);
        return apiMethodImpl;
    }

    public final Task r(int i2, TaskApiCall taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f24435j.B(this, i2, taskApiCall, taskCompletionSource, this.f24434i);
        return taskCompletionSource.a();
    }

    public GoogleApi(Context context, Api api, Api.ApiOptions apiOptions, Settings settings) {
        this(context, (Activity) null, api, apiOptions, settings);
    }
}
