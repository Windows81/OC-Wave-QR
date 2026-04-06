package kotlin.jvm.internal;

public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i2, Class cls, String str, String str2, int i3) {
        super(i2, CallableReference.F, cls, str, str2, i3);
    }

    public FunctionReferenceImpl(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(i2, obj, cls, str, str2, i3);
    }
}
