package retrofit2;

import java.lang.annotation.Annotation;

final class SkipCallbackExecutorImpl implements SkipCallbackExecutor {

    /* renamed from: a  reason: collision with root package name */
    public static final SkipCallbackExecutor f44296a = new SkipCallbackExecutorImpl();

    public static Annotation[] a(Annotation[] annotationArr) {
        if (Utils.l(annotationArr, SkipCallbackExecutor.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f44296a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class annotationType() {
        return SkipCallbackExecutor.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof SkipCallbackExecutor;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + SkipCallbackExecutor.class.getName() + "()";
    }
}
