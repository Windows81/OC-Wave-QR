package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata
public final class MainDispatcherLoader {

    /* renamed from: a  reason: collision with root package name */
    public static final MainDispatcherLoader f41856a;

    /* renamed from: b  reason: collision with root package name */
    public static final MainCoroutineDispatcher f41857b;

    static {
        MainDispatcherLoader mainDispatcherLoader = new MainDispatcherLoader();
        f41856a = mainDispatcherLoader;
        SystemPropsKt.f("kotlinx.coroutines.fast.service.loader", true);
        f41857b = mainDispatcherLoader.a();
    }

    public final MainCoroutineDispatcher a() {
        Object obj;
        Class<MainDispatcherFactory> cls = MainDispatcherFactory.class;
        try {
            List D = SequencesKt.D(SequencesKt.e(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator it = D.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int c2 = ((MainDispatcherFactory) obj).c();
                    do {
                        Object next = it.next();
                        int c3 = ((MainDispatcherFactory) next).c();
                        if (c2 < c3) {
                            obj = next;
                            c2 = c3;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
            if (mainDispatcherFactory != null) {
                MainCoroutineDispatcher e2 = MainDispatchersKt.e(mainDispatcherFactory, D);
                if (e2 != null) {
                    return e2;
                }
            }
            return MainDispatchersKt.b((Throwable) null, (String) null, 3, (Object) null);
        } catch (Throwable th) {
            return MainDispatchersKt.b(th, (String) null, 2, (Object) null);
        }
    }
}
