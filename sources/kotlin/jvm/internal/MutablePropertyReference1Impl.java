package kotlin.jvm.internal;

public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i2) {
        super(CallableReference.F, cls, str, str2, i2);
    }

    public Object get(Object obj) {
        return a().k(obj);
    }
}
