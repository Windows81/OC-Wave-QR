package androidx.datastore.core;

import android.os.FileObserver;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class MulticastFileObserver extends FileObserver {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f20615c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final Object f20616d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final Map f20617e = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f20618a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f20619b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void f(String str, Function1 function1) {
            Intrinsics.i(function1, "$observer");
            synchronized (MulticastFileObserver.f20616d) {
                try {
                    Companion companion = MulticastFileObserver.f20615c;
                    MulticastFileObserver multicastFileObserver = (MulticastFileObserver) companion.c().get(str);
                    if (multicastFileObserver != null) {
                        multicastFileObserver.f20619b.remove(function1);
                        if (multicastFileObserver.f20619b.isEmpty()) {
                            companion.c().remove(str);
                            multicastFileObserver.stopWatching();
                        }
                    }
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final Map c() {
            return MulticastFileObserver.f20617e;
        }

        public final DisposableHandle d(File file, Function1 function1) {
            String path = file.getCanonicalFile().getPath();
            synchronized (MulticastFileObserver.f20616d) {
                try {
                    Map c2 = MulticastFileObserver.f20615c.c();
                    Intrinsics.h(path, "key");
                    Object obj = c2.get(path);
                    if (obj == null) {
                        obj = new MulticastFileObserver(path, (DefaultConstructorMarker) null);
                        c2.put(path, obj);
                    }
                    MulticastFileObserver multicastFileObserver = (MulticastFileObserver) obj;
                    multicastFileObserver.f20619b.add(function1);
                    if (multicastFileObserver.f20619b.size() == 1) {
                        multicastFileObserver.startWatching();
                    }
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new a(path, function1);
        }

        public final Flow e(File file) {
            Intrinsics.i(file, "file");
            return FlowKt.j(new MulticastFileObserver$Companion$observe$1(file, (Continuation) null));
        }

        public Companion() {
        }
    }

    public /* synthetic */ MulticastFileObserver(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public void onEvent(int i2, String str) {
        for (Function1 invoke : this.f20619b) {
            invoke.invoke(str);
        }
    }

    public MulticastFileObserver(String str) {
        super(str, 128);
        this.f20618a = str;
        this.f20619b = new CopyOnWriteArrayList();
    }
}
