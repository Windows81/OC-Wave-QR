package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

public final class Api<O extends ApiOptions> {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractClientBuilder f24411a;

    /* renamed from: b  reason: collision with root package name */
    public final ClientKey f24412b;

    /* renamed from: c  reason: collision with root package name */
    public final String f24413c;

    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        public Client b(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return c(context, looper, clientSettings, obj, connectionCallbacks, onConnectionFailedListener);
        }

        public Client c(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface AnyClient {
    }

    public static class AnyClientKey<C extends AnyClient> {
    }

    public interface ApiOptions {

        /* renamed from: l  reason: collision with root package name */
        public static final NoOptions f24414l = new NoOptions((zaa) null);

        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            Account F();
        }

        public interface HasGoogleSignInAccountOptions extends HasOptions {
            GoogleSignInAccount D();
        }

        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
            public /* synthetic */ NoOptions(zaa zaa) {
            }
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
        public int a() {
            return Integer.MAX_VALUE;
        }
    }

    public interface Client extends AnyClient {
        boolean a();

        boolean c();

        Set d();

        void e(IAccountAccessor iAccountAccessor, Set set);

        void f(String str);

        boolean g();

        String h();

        void i(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        void j();

        void k(BaseGmsClient.SignOutCallbacks signOutCallbacks);

        void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        boolean m();

        int o();

        Feature[] p();

        String r();

        Intent s();

        boolean t();
    }

    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    public Api(String str, AbstractClientBuilder abstractClientBuilder, ClientKey clientKey) {
        Preconditions.n(abstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.n(clientKey, "Cannot construct an Api with a null ClientKey");
        this.f24413c = str;
        this.f24411a = abstractClientBuilder;
        this.f24412b = clientKey;
    }

    public final AbstractClientBuilder a() {
        return this.f24411a;
    }

    public final AnyClientKey b() {
        return this.f24412b;
    }

    public final BaseClientBuilder c() {
        return this.f24411a;
    }

    public final String d() {
        return this.f24413c;
    }
}
