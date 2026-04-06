package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SpreadBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f40913a;

    public SpreadBuilder(int i2) {
        this.f40913a = new ArrayList(i2);
    }

    public void a(Object obj) {
        this.f40913a.add(obj);
    }

    public void b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList arrayList = this.f40913a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f40913a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f40913a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f40913a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f40913a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    public int c() {
        return this.f40913a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f40913a.toArray(objArr);
    }
}
