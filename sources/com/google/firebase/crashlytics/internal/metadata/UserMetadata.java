package com.google.firebase.crashlytics.internal.metadata;

import androidx.compose.animation.core.h;
import com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class UserMetadata {

    /* renamed from: a  reason: collision with root package name */
    public final MetaDataStore f30161a;

    /* renamed from: b  reason: collision with root package name */
    public final CrashlyticsBackgroundWorker f30162b;

    /* renamed from: c  reason: collision with root package name */
    public String f30163c;

    /* renamed from: d  reason: collision with root package name */
    public final SerializeableKeysMap f30164d = new SerializeableKeysMap(false);

    /* renamed from: e  reason: collision with root package name */
    public final SerializeableKeysMap f30165e = new SerializeableKeysMap(true);

    /* renamed from: f  reason: collision with root package name */
    public final RolloutAssignmentList f30166f = new RolloutAssignmentList(128);

    /* renamed from: g  reason: collision with root package name */
    public final AtomicMarkableReference f30167g = new AtomicMarkableReference((Object) null, false);

    public class SerializeableKeysMap {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicMarkableReference f30168a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReference f30169b = new AtomicReference((Object) null);

        /* renamed from: c  reason: collision with root package name */
        public final boolean f30170c;

        public SerializeableKeysMap(boolean z2) {
            this.f30170c = z2;
            this.f30168a = new AtomicMarkableReference(new KeysMap(64, z2 ? 8192 : 1024), false);
        }

        public Map b() {
            return ((KeysMap) this.f30168a.getReference()).a();
        }

        public final /* synthetic */ Void c() {
            this.f30169b.set((Object) null);
            e();
            return null;
        }

        public final void d() {
            b bVar = new b(this);
            if (h.a(this.f30169b, (Object) null, bVar)) {
                UserMetadata.this.f30162b.h(bVar);
            }
        }

        public final void e() {
            Map map;
            synchronized (this) {
                try {
                    if (this.f30168a.isMarked()) {
                        map = ((KeysMap) this.f30168a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f30168a;
                        atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (map != null) {
                UserMetadata.this.f30161a.q(UserMetadata.this.f30163c, map, this.f30170c);
            }
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((KeysMap) this.f30168a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f30168a;
                    atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        this.f30163c = str;
        this.f30161a = new MetaDataStore(fileStore);
        this.f30162b = crashlyticsBackgroundWorker;
    }

    public static UserMetadata j(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsBackgroundWorker);
        ((KeysMap) userMetadata.f30164d.f30168a.getReference()).e(metaDataStore.i(str, false));
        ((KeysMap) userMetadata.f30165e.f30168a.getReference()).e(metaDataStore.i(str, true));
        userMetadata.f30167g.set(metaDataStore.k(str), false);
        userMetadata.f30166f.c(metaDataStore.j(str));
        return userMetadata;
    }

    public static String k(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).k(str);
    }

    public Map e() {
        return this.f30164d.b();
    }

    public Map f() {
        return this.f30165e.b();
    }

    public List g() {
        return this.f30166f.a();
    }

    public String h() {
        return (String) this.f30167g.getReference();
    }

    public final /* synthetic */ Object i(List list) {
        this.f30161a.r(this.f30163c, list);
        return null;
    }

    public boolean l(String str, String str2) {
        return this.f30165e.f(str, str2);
    }

    public void m(String str) {
        synchronized (this.f30163c) {
            try {
                this.f30163c = str;
                Map b2 = this.f30164d.b();
                List b3 = this.f30166f.b();
                if (h() != null) {
                    this.f30161a.s(str, h());
                }
                if (!b2.isEmpty()) {
                    this.f30161a.p(str, b2);
                }
                if (!b3.isEmpty()) {
                    this.f30161a.r(str, b3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean n(List list) {
        synchronized (this.f30166f) {
            try {
                if (!this.f30166f.c(list)) {
                    return false;
                }
                this.f30162b.h(new a(this, this.f30166f.b()));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
